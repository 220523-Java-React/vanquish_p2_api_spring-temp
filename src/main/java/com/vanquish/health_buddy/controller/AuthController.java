package com.vanquish.health_buddy.controller;

import com.vanquish.health_buddy.security.AuthRequest;
import com.vanquish.health_buddy.security.AuthResponse;
import com.vanquish.health_buddy.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authenticate")
public class AuthController {
    private final UserService userService;
    public AuthController (UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public AuthResponse authentication(@RequestBody AuthRequest request){
        return userService.authenticate(request);
    }

}
