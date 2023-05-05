package com.javaCode.springBootFirstApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to spring boot world, by Hamza, And Zainab and zaraaaa and CHowi SAHB, Zainab is stupid" ;
        
    }
}
