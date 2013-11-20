package com.martin

import com.martin.config.GroovyAppConfiguration
import com.martin.core.Message
import com.martin.health.GroovyAppHealthCheck
import com.martin.resources.MessageResource
import com.yammer.dropwizard.Service
import com.yammer.dropwizard.config.Bootstrap
import com.yammer.dropwizard.config.Environment
import com.yammer.dropwizard.assets.AssetsBundle
import groovy.util.logging.Slf4j

@Slf4j
class MainService extends Service<GroovyAppConfiguration> {

    public static void main(String[] args) throws Exception {
        new MainService().run(args)
    }

    @Override
    void initialize(Bootstrap<GroovyAppConfiguration> bootstrap) {
	// NOTE: logger isn't ready to be used yet
        bootstrap.name = "groovyApp"
        bootstrap.addBundle(new AssetsBundle("/assets/", "/", 'index.html'))
    }

    @Override
    void run(GroovyAppConfiguration configuration, Environment environment) throws Exception {
        log.trace "Enter run"

        def message = new Message(saying: configuration.saying)
        log.debug "read message configuration $message"

        environment.addResource(new MessageResource(message: message))
        environment.addHealthCheck(new GroovyAppHealthCheck('groovyApp'))
        log.trace "Exit run"
    }
}
