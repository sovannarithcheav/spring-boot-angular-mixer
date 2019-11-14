package com.sovannarith.mixer.controller;

import com.mixer.api.MixerAPI;
import com.mixer.api.http.SortOrderMap;
import com.sovannarith.mixer.model.User;
import com.sovannarith.mixer.model.resource.MixerChannel;
import com.sovannarith.mixer.model.response.channels.ShowChannelsResponse;
import com.sovannarith.mixer.repository.UserRepository;
import com.sovannarith.mixer.service.impl.ChannelsService;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    private final UserRepository userRepository;
    private MixerAPI mixer = new MixerAPI("");
    private final ChannelsService channelsService = new ChannelsService(mixer);

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

/*        @GetMapping("/users")
        public MixerChannel getUsers() throws ExecutionException, InterruptedException {
            return channelsService.findOneByToken("ninja").get();
        }*/
    @GetMapping("/users")
    public ShowChannelsResponse getUsers() throws ExecutionException, InterruptedException {
        SortOrderMap<ShowChannelsResponse.Attributes, ShowChannelsResponse.Ordering> ordering = new SortOrderMap<>();
        ordering.put(ShowChannelsResponse.Attributes.VIEWERS_TOTAL, ShowChannelsResponse.Ordering.DESCENDING);
        return channelsService.show(ordering, 0, 50).get();
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}