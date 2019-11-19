package com.sovannarith.mixer.controller;

import com.sovannarith.mixer.service.impl.HTMLService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HTMLController {

    private final HTMLService htmlService;

    public HTMLController(HTMLService htmlService) {
        this.htmlService = htmlService;
    }

    @GetMapping("/html")
    public String getUsers() {
        return htmlService.getHTML();
    }

}