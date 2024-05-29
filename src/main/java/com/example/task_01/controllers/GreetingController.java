package com.example.task_01.controllers;

import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "greeting")
public class GreetingController {

    @GetMapping()
    public Greeting greeting(
            @RequestParam(defaultValue = "Adil") String name,
            @RequestParam(defaultValue = "afternoon") String timeOfDay
    ) {
        String nameVar = String.format("%s",name);
        String timeOfDayVar = String.format("%s",timeOfDay);
        Greeting greeting = new Greeting(nameVar,timeOfDayVar);
        return greeting;
    }

    @GetMapping(value = "summer")
    public Celebration summerGreeting(@RequestParam(defaultValue = "Happy summer solstice!") String summerGreetingMessage) {
        String summerGreeting = String.format("%s", summerGreetingMessage);
        Celebration celebration = new Celebration(summerGreeting);
        return celebration;
    }

}
