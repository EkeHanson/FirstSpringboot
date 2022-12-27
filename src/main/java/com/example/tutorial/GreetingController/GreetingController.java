package com.example.tutorial.GreetingController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    //localhost:9090/greeting
    public List<String> getGreeting(){

        return List.of("Welcome","Abraham",
                "Ekene-onwon",
                "Hanson");
    }
}
