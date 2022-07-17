package com.vanquish.health_buddy.controller;

import com.vanquish.health_buddy.model.bodyInfo.BodyInfo;
import com.vanquish.health_buddy.service.BodyInfoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bodyinfo")
public class BodyInfoController {

    private final BodyInfoService bodyInfoService;

    public BodyInfoController(BodyInfoService bodyInfoService){this.bodyInfoService=bodyInfoService;}

    @GetMapping
    public List<BodyInfo> getAllBodyInfo() {return bodyInfoService.getAllBodyInfo();}

    @PostMapping
    public BodyInfo createBodyInfo(@RequestBody BodyInfo bodyInfo){return bodyInfoService.createBodyInfo(bodyInfo);}
}
