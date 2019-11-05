package com.sovannarith.mixer.model.resource;

import com.google.gson.annotations.SerializedName;
import com.mixer.api.resource.channel.CachedMessage;
import com.mixer.api.resource.channel.MixerResource;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.Map;

public class MixerChannel implements Serializable {
    public int id;
    public String token;
    public boolean online;
    public boolean featured;
    public boolean partnered;
    public boolean transcodingEnabled;
    public boolean suspended;
    public boolean interactive;
    public boolean hasVod;
    public String name;
    public com.mixer.api.resource.channel.MixerChannel.AudienceRating audience;
    public String streamKey;
    public int viewersTotal;
    public int viewersCurrent;
    public int numFollowers;
    public int numSubscribers;
    public String description;
    public int typeId;
    public Date createdAt;
    public Date updatedAt;
    public int userId;
    public int coverId;
    public int thumbnailId;
    public int badgeId;
    public int interactiveGameId;
    public MixerResource thumbnail;
    public MixerResource cover;
    public MixerResource badge;
    public com.mixer.api.resource.channel.MixerChannel.Type type;
    public Map<String, Object> preferences;
    /**
     * @deprecated
     */
    @Deprecated
    @SerializedName("cache")
    public ArrayDeque<CachedMessage> messageCache;
    public MixerUser user;

    public MixerChannel() {
    }

    public static enum AudienceRating {
        @SerializedName("family")
        FAMILY,
        @SerializedName("teen")
        TEEN,
        @SerializedName("18+")
        ADULT;

        private AudienceRating() {
        }
    }

    public static enum CostreamPreference {
        @SerializedName("all")
        ALL,
        @SerializedName("following")
        FOLLOWING,
        @SerializedName("none")
        NONE;

        private CostreamPreference() {
        }
    }

    public static class Type implements Serializable {
        public int id;
        public String name;
        public String parent;
        public String description;
        public String source;
        public int viewersCurrent;
        public int online;
        public String coverUrl;

        public Type() {
        }
    }

}
