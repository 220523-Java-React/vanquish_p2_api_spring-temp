package com.vanquish.health_buddy.service;

import com.vanquish.health_buddy.exception.UserNotFoundException;
import com.vanquish.health_buddy.model.userInput.UserInput;
import com.vanquish.health_buddy.repository.UserInputRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInputService {
    private final UserInputRepository userInputRepository;

    public UserInputService(UserInputRepository userInputRepository){
        this.userInputRepository = userInputRepository;
    }

    public UserInput createUserInput(UserInput userInput) {
        return userInputRepository.save(userInput);
    }

    public List<UserInput> getAllUserInput() {return userInputRepository.findAll();}

    public UserInput getUserInputById(Integer id){
        return userInputRepository.findById(id).orElseThrow(() -> new UserNotFoundException());
    }



}
