package com.example.demo.controller;

import com.example.demo.model.InternalContact;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @PostMapping("/contact")
    public void addResource(@RequestBody InternalContact contact) {
        System.out.println(contact);
    }
}
