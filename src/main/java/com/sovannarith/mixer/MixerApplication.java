package com.sovannarith.mixer;

import com.mixer.api.MixerAPI;
import com.sovannarith.mixer.model.User;
import com.sovannarith.mixer.repository.UserRepository;
import com.sovannarith.mixer.service.impl.ChannelsService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class MixerApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(MixerApplication.class, args);
    }

    private MixerAPI mixer = new MixerAPI("");

    @Override
    public void run(ApplicationArguments args) throws Exception {
        ChannelsService channelsService = new ChannelsService(mixer);
        channelsService.findOneByToken("JaredFPS");
    }

    @Bean
    CommandLineRunner init(UserRepository userRepository) {
        return args -> {
            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
                User user = new User(name, name.toLowerCase() + "@domain.com");
                userRepository.save(user);
            });
            userRepository.findAll().forEach(System.out::println);
        };
    }
}
