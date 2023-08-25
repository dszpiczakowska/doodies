package com.dszpiczakowska.doodies.domain.service;

import com.dszpiczakowska.doodies.domain.model.Activity;
import com.dszpiczakowska.doodies.domain.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GetRandomActivityService {
    @Autowired //adnotacja Spring
    private ActivityRepository activityRepository; //deklaruję zmienną a Spring sam decyduje jaki obiekt przypisać tej zmiennej

    public Activity getRandomActivity() {
        return activityRepository.findRandom();
    }
}
