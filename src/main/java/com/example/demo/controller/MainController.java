package com.example.demo.controller;

import com.example.demo.model.BeameryInternalContact;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @PostMapping("/contact")
    public void addResource(@RequestBody BeameryInternalContact contact) {
        System.out.println(contact);
    }
}
