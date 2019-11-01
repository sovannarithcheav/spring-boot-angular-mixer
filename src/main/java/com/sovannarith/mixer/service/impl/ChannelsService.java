package com.sovannarith.mixer.service.impl;

import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;
import com.mixer.api.MixerAPI;
import com.mixer.api.http.MixerHttpClient;
import com.mixer.api.http.SortOrderMap;
import com.mixer.api.services.AbstractHTTPService;
import com.sovannarith.mixer.model.resource.MixerChannel;
import com.sovannarith.mixer.model.response.channels.ShowChannelsResponse;

public class ChannelsService extends AbstractHTTPService {

    public ChannelsService(MixerAPI mixer) {
        super(mixer, "channels");
    }

    public ListenableFuture<ShowChannelsResponse> show(SortOrderMap<ShowChannelsResponse.Attributes,
            ShowChannelsResponse.Ordering> ordering, int page, int limit) {
        ImmutableMap.Builder<String, Object> options = MixerHttpClient.getArgumentsBuilder();

        if (ordering != null) {
            options.put("order", ordering.build());
        }

        options.put("page", Math.max(0, page));
        options.put("limit", Math.max(0, limit));
        options.put("noCount", 1);

        return this.get("", ShowChannelsResponse.class, options.build());
    }
    /**
     * Finds a single MixerChannel by searching its token.
     *
     * @param token The token of the channel to return. Example: "ttaylorr".
     * @return A MixerChannel, if found, or null.
     */
    public ListenableFuture<MixerChannel> findOneByToken(String token) {
        return this.get(token, MixerChannel.class);
    }

}
