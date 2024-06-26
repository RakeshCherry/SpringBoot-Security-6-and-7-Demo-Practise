package com.springsecurity.springbootsecurity.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

    @GetMapping("/myCards")
    public String getMyCards(){
        return "Here is my Card Details";

    }
}
