package com.vanquish.health_buddy.controller;

import com.vanquish.health_buddy.model.nutrients.Nutrients;
import com.vanquish.health_buddy.service.NutrientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/nutrients")
public class NutrientController {

    private final NutrientService nutrientService;

    public NutrientController(NutrientService nutrientService){this.nutrientService=nutrientService;}

    @GetMapping
    public List<Nutrients> getAllNutrients() {return nutrientService.getAllNutrients();}

    @PostMapping
    public Nutrients createNutrient(@RequestBody Nutrients nutrients){return nutrientService.createNutrient(nutrients);}
}
