package com.vanquish.health_buddy.service;

import com.vanquish.health_buddy.model.bodyInfo.BodyInfo;
import com.vanquish.health_buddy.repository.BodyInfoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BodyInfoService {
    private final BodyInfoRepository bodyInfoRepository;
    public BodyInfoService(BodyInfoRepository bodyInfoRepository){this.bodyInfoRepository=bodyInfoRepository;}

    public BodyInfo createBodyInfo(BodyInfo bodyInfo){
        return bodyInfoRepository.save(bodyInfo);
    }

    public List<BodyInfo> getAllBodyInfo() {return bodyInfoRepository.findAll();}
}
