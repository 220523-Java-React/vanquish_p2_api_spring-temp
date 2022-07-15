package com.vanquish.health_buddy.service;

import com.vanquish.health_buddy.model.vitamin.Vitamin;
import com.vanquish.health_buddy.repository.VitaminRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VitaminService {

    private final VitaminRepository vitaminRepository;

    public VitaminService(VitaminRepository vitaminRepository){this.vitaminRepository = vitaminRepository;}

    public Vitamin createVitamin(Vitamin vitamin){
        return vitaminRepository.save(vitamin);
    }

    public List<Vitamin> getAllVitamins(){return vitaminRepository.findAll();}


}