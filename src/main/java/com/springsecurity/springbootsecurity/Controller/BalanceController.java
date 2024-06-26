package com.springsecurity.springbootsecurity.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping("/myBalance")
    public String getMyBalance(){
        return "Here is my Balance";
    }
}
