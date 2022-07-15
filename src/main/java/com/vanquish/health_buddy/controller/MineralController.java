package com.vanquish.health_buddy.controller;

import com.vanquish.health_buddy.model.mineral.Mineral;
import com.vanquish.health_buddy.service.MineralService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/minerals")
public class MineralController {

    private final MineralService mineralService;

    public MineralController(MineralService mineralService){this.mineralService = mineralService;}

    @GetMapping
    public List<Mineral> getAllMinerals(){ return mineralService.getAllMinerals();}

    @PostMapping
    public Mineral createMineral(@RequestBody Mineral mineral) { return mineralService.createMineral(mineral);}


}
