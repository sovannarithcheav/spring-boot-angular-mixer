package com.sovannarith.mixer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.stream.Collectors;

@SpringBootTest
class MixerApplicationTests {

    @Test
    void contextLoads() {
        String[] arr = new String[]{"A", "B"};
        System.out.println(Arrays.toString(arr).replace("//[", "{").replace("//]", "}"));
        System.out.println(
                Arrays.stream(arr).collect(Collectors.joining(", ", "{", "}")));
    }

}
