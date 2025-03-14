package ru.itgirl.first_spring_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/dayOfWeek")
    public String dayOfWeek(@RequestParam(value = "name") DayOfWeek dayOfWeek) {
        return String.format("Сегодня %s!", DayOfWeek.MONDAY.getRusName());
    }

}