package com.martin.resources

import com.yammer.dropwizard.jersey.caching.CacheControl
import com.yammer.metrics.annotation.Timed
import groovy.util.logging.Slf4j

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Slf4j
@Path("/v1/message")
@Produces(MediaType.APPLICATION_JSON)
class MessageResource {

    def message

    @GET
    @Timed
    @Path("/hello")
    @CacheControl(isPrivate = true, noCache = true)
    public String sayHello() {
        log.trace "Enter"
        log.trace "Exit"

        def saying
        if (message.privateMessage) {
            saying = "private message"
        } else {
            saying = message.saying
        }
        saying
    }


}
