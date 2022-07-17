package com.vanquish.health_buddy.controller;

import com.vanquish.health_buddy.model.bodyFeedback.BodyFeedback;
import com.vanquish.health_buddy.service.BodyFeedbackService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bodyfeedback")
public class BodyFeedbackController {

    private final BodyFeedbackService bodyFeedbackService;

    public BodyFeedbackController(BodyFeedbackService bodyFeedbackService){this.bodyFeedbackService = bodyFeedbackService;}

    @GetMapping
    public List<BodyFeedback> getAllBodyFeedback(){ return bodyFeedbackService.getAllBodyFeedback();}

    @PostMapping
    public BodyFeedback createBodyFeedback(@RequestBody BodyFeedback bodyFeedback) { return bodyFeedbackService.createBodyFeedback(bodyFeedback);}


}

