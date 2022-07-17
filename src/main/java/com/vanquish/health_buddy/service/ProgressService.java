package com.vanquish.health_buddy.service;

import com.vanquish.health_buddy.model.progress.Progress;
import com.vanquish.health_buddy.repository.ProgressRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgressService {
    private final ProgressRepository progressRepository;
    public ProgressService(ProgressRepository progressRepository){this.progressRepository = progressRepository;}
    public Progress createProgress(Progress progress) {return progressRepository.save(progress);}
    public List<Progress> getAllProgress() {return progressRepository.findAll();}
}
