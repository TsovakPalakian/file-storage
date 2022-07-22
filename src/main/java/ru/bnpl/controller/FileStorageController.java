package ru.bnpl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileStorageController {

    @GetMapping
    public String welcome() {
        return "Welcome to heaven";
    }

    @GetMapping("/welcome")
    public String sayHello() {
        return "Hi Tsovak! How are you?";
    }
}
