package com.vanquish.health_buddy.service;

import com.vanquish.health_buddy.model.nutrients.Nutrients;
import com.vanquish.health_buddy.repository.NutrientsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NutrientService {
    private final NutrientsRepository nutrientsRepository;

    public NutrientService(NutrientsRepository nutrientsRepository){this.nutrientsRepository=nutrientsRepository;}

    public Nutrients createNutrient(Nutrients nutrient){return nutrientsRepository.save(nutrient);}

    public List<Nutrients> getAllNutrients(){return nutrientsRepository.findAll();}
}
