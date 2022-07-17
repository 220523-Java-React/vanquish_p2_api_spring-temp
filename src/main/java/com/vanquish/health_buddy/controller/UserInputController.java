package com.vanquish.health_buddy.controller;

import com.vanquish.health_buddy.model.userInput.UserInput;
import com.vanquish.health_buddy.service.UserInputService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userinput")
public class UserInputController {
    private final UserInputService userInputService;

    public UserInputController(UserInputService userInputService){
        this.userInputService = userInputService;
    }

    @GetMapping
    public List<UserInput> getAllUserInputs(){return userInputService.getAllUserInput();}

    @PostMapping
    public UserInput createUserInput(@RequestBody UserInput userInput){
        return userInputService.createUserInput(userInput);
    }

    @GetMapping("/id/{id}")
    public UserInput getUserInputById(@PathVariable Integer userInputId){
        return userInputService.getUserInputById(userInputId);
    }




}
