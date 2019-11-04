package com.sovannarith.mixer.model.resource;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;

public class MixerChannel extends com.mixer.api.resource.channel.MixerChannel {

    @JsonProperty("user")
    @JsonSubTypes.Type(value = MixerUser.class)
    public static MixerUser user;
    public String languageId;

}
