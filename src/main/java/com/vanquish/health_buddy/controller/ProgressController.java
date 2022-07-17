package com.vanquish.health_buddy.controller;

import com.vanquish.health_buddy.model.progress.Progress;
import com.vanquish.health_buddy.service.ProgressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/progress")
public class ProgressController {
    private final ProgressService progressService;
    public ProgressController(ProgressService progressService){this.progressService=progressService;}

    @GetMapping
    public List<Progress> getAllProgress(){return progressService.getAllProgress();}

    @PostMapping
    public Progress createProgress(@RequestBody Progress progress) {return progressService.createProgress(progress);}

}
