package com.vanquish.health_buddy.service;

import com.vanquish.health_buddy.model.Mineral;
import com.vanquish.health_buddy.repository.MineralRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MineralService {

    private final MineralRepository mineralRepository;

    public MineralService(MineralRepository mineralRepository){this.mineralRepository = mineralRepository;}

    public Mineral createMineral(Mineral mineral){
        return mineralRepository.save(mineral);
    }

    public List<Mineral> getAllMinerals(){return mineralRepository.findAll();}


}
