package com.kav.learn.resttemplate.demo.service;

import com.kav.learn.resttemplate.demo.entities.Tutorial;
import com.kav.learn.resttemplate.demo.repository.TutorialRepository;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class TutorialService {

    private final TutorialRepository tutorialRepository;

    public TutorialService(TutorialRepository tutorialRepository) {
        this.tutorialRepository = tutorialRepository;
    }

    public List<Tutorial> getAllTutorials( ) {
            List<Tutorial> tutorials = new ArrayList<Tutorial>();
            tutorialRepository.findAll().forEach(tutorials::add);
            return tutorials;
    }
}
