package com.vanquish.health_buddy.service;

import com.vanquish.health_buddy.model.user.User;
import com.vanquish.health_buddy.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;

import java.util.List;

import static java.util.Arrays.asList;

class UserServiceTest {

    private UserRepository userRepository;

    private UserService userService;

    @BeforeEach
    void setUp() {
        userRepository = Mockito.mock(UserRepository.class);
        userService = new UserService(userRepository);
    }
    @Test
    void returnsListWithTwoUsersWhenGivenTwoUsers(){
        User user1 = new User();
        User user2 = new User();
        BDDMockito.given(userRepository.findAll()).willReturn(asList(user1, user2));

        List<User> userList = userService.getAllUsers();

        Assertions.assertThat(userList).hasSize(2);
    }
}