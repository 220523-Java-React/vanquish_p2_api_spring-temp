package com.vanquish.health_buddy.controller;

import com.vanquish.health_buddy.model.user.User;
import com.vanquish.health_buddy.security.RegRequest;
import com.vanquish.health_buddy.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController{
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping()
    public User createUser(@RequestBody RegRequest regRequest){
        return userService.createUser(regRequest);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping({"{userId}"})
    public User getUserById(@PathVariable Integer userId){
        return userService.getUserById(userId);
    }

    @GetMapping("/username/{username}")
    public User getUserByUsername(@PathVariable String username){
        return userService.getUserByUsername(username);
    }

    @PatchMapping
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/{userId}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteUserById(@PathVariable Integer userId){
        userService.deleteUserById(userId);
    }


}


/*@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/username/{username}")
    public User getUserByUsername(@PathVariable String username){
        return userService.getUserByUsername(username);
    }
}
 */
