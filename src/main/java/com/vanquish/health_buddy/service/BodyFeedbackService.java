package com.vanquish.health_buddy.service;

import com.vanquish.health_buddy.model.bodyFeedback.BodyFeedback;
import com.vanquish.health_buddy.repository.BodyFeedbackRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BodyFeedbackService {

    private final BodyFeedbackRepository bodyFeedbackRepository;

    public BodyFeedbackService(BodyFeedbackRepository bodyFeedbackRepository){this.bodyFeedbackRepository = bodyFeedbackRepository;}

    public BodyFeedback createBodyFeedback(BodyFeedback bodyFeedback){
        return bodyFeedbackRepository.save(bodyFeedback);
    }

    public List<BodyFeedback> getAllBodyFeedback(){return bodyFeedbackRepository.findAll();}


}
