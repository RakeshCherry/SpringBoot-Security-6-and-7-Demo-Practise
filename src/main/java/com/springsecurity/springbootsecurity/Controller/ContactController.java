package com.springsecurity.springbootsecurity.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/contact")
    public String getContacts() {
        return "Inquire for Information Contact";
    }
}
