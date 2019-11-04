package com.sovannarith.mixer.model.resource;

import com.google.gson.annotations.SerializedName;
import com.mixer.api.resource.channel.MixerChannel;
import com.mixer.api.resource.channel.MixerResource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class MixerUser implements Serializable {
    public Date createdAt;
    public String email;
    public int id;
    public MixerChannel channel;
    public int points;
    public int experience;
    public int sparks;
    public Date resetTime;
    public com.mixer.api.resource.MixerUser.Social social;
    public Date updatedAt;
    public String username;
    public boolean verified;
    public ArrayList<MixerResource> avatars;

    public MixerUser() {
    }

    public class Social implements Serializable {
        public String facebook;
        public String twitter;
        public String youtube;
        public String discord;

        public Social() {
        }
    }

    public static enum Role {
        @SerializedName("Banned")
        BANNED,
        @SerializedName("Muted")
        MUTED,
        @SerializedName("User")
        USER,
        @SerializedName("Pro")
        PRO,
        @SerializedName("Subscriber")
        SUBSCRIBER,
        @SerializedName("Mod")
        MOD,
        @SerializedName("Global Mod")
        GLOBAL_MOD,
        @SerializedName("Founder")
        FOUNDER,
        @SerializedName("Staff")
        STAFF,
        @SerializedName("Owner")
        OWNER;

        private Role() {
        }
    }
}
