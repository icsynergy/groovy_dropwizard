package com.martin.config

import com.fasterxml.jackson.annotation.JsonProperty
import com.yammer.dropwizard.config.Configuration

import javax.validation.Valid
import javax.validation.constraints.NotNull

class GroovyAppConfiguration extends Configuration {

    @Valid
    @NotNull
    @JsonProperty
    def saying
}
