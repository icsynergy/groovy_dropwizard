package com.martin.health

import com.yammer.metrics.core.HealthCheck
import com.yammer.metrics.core.HealthCheck.Result
import groovy.util.logging.Slf4j

@Slf4j
class GroovyAppHealthCheck extends HealthCheck {

    protected GroovyAppHealthCheck(String name) {
        super(name)
    }

    @Override
    protected Result check() throws Exception {
        log.debug "health check"
        return Result.healthy()
    }
}
