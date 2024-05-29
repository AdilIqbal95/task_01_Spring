package com.example.task_01.controllers;

import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "greeting")
public class GreetingController {

    @GetMapping
    public Greeting greeting(@RequestParam(defaultValue = "afternoon") String timeOfDay) {
        String timeOfDayVar = String.format("%s",timeOfDay);
        Greeting greeting = new Greeting("Adil",timeOfDayVar);
        return greeting;
    }

}
