package com.dszpiczakowska.doodies.controller;

import com.dszpiczakowska.doodies.domain.model.Activity;
import com.dszpiczakowska.doodies.domain.service.GetRandomActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activities") //nadanie ścieżki
public class GetRandomActivityController {
    @Autowired
    private GetRandomActivityService activityService;

    @GetMapping("/random")
    Activity getRandomActivity() {
        return activityService.getRandomActivity();
    }
}
