package com.martin.core

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.validator.constraints.*
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@EqualsAndHashCode
@ToString(includeNames=true)
class Message {

    @JsonProperty
    @NotBlank
    String saying

    /**
     * jackson has an issue with boolean properties. Here is how to
     * handle a boolean
     */
    @JsonProperty
    boolean privateMessage = false
    def getPrivateMessage() {
        privateMessage
    }

}
