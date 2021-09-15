package com.kav.learn.resttemplate.demo.service;

import com.datastax.oss.driver.api.core.uuid.Uuids;
import com.kav.learn.resttemplate.demo.entities.Tutorial;
import com.kav.learn.resttemplate.demo.repository.TutorialRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class TutorialService {

    Logger logger = LoggerFactory.getLogger(TutorialService.class);

    private final TutorialRepository tutorialRepository;

    public TutorialService(TutorialRepository tutorialRepository) {
        this.tutorialRepository = tutorialRepository;
    }

    public List<Tutorial> getAllTutorials() {
        logger.info("get all tutorials");
            List<Tutorial> tutorials = new ArrayList<Tutorial>();
            tutorialRepository.findAll().forEach(tutorials::add);
            return tutorials;
    }

    public Tutorial createTutorial(Tutorial tutorial){
        logger.info("creating new tutorial titled: " + tutorial.getTitle());
        return tutorialRepository.save(new Tutorial(Uuids.timeBased(), tutorial.getTitle(), tutorial.getDescription(), false));

    }

}
