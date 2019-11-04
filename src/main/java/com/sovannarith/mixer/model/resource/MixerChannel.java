package com.sovannarith.mixer.model.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Transient;

import static java.util.Objects.requireNonNull;

@JsonIgnoreProperties(value = "user")
public class MixerChannel extends com.mixer.api.resource.channel.MixerChannel {


    @JsonProperty("user")
    private MixerUser userr;
    private String languageId;
    private String bannerUrl;

    public MixerChannel() {
        super();
    }

    @JsonProperty("user")
    public MixerUser getUserr() {
        return userr;
    }

    @JsonProperty("user")
    public void setUserr(MixerUser userr) {
        this.userr = userr;
    }

    public String getLanguageId() {
        return languageId;
    }

    public void setLanguageId(String languageId) {
        this.languageId = languageId;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }
}
