package com.sovannarith.mixer.controller;

import com.mixer.api.MixerAPI;
import com.sovannarith.mixer.model.User;
import com.sovannarith.mixer.model.resource.MixerChannel;
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

    @GetMapping("/users")
    public MixerChannel getUsers() throws ExecutionException, InterruptedException {
        return channelsService.findOneByToken("JaredFPS").get();
    }
/*
    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }*/

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}