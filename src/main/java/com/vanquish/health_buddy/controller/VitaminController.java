package com.vanquish.health_buddy.controller;

import com.vanquish.health_buddy.model.vitamin.Vitamin;
import org.springframework.web.bind.annotation.*;
import com.vanquish.health_buddy.service.VitaminService;

import java.util.List;

@RestController
@RequestMapping("/vitamins")
public class VitaminController {

    private final VitaminService vitaminService;

    public VitaminController(VitaminService vitaminService){this.vitaminService = vitaminService;}

    @GetMapping
    public List<Vitamin> getAllVitamins(){ return vitaminService.getAllVitamins();}

    @PostMapping
    public Vitamin createVitamin(@RequestBody Vitamin vitamin) { return vitaminService.createVitamin(vitamin);}

}
