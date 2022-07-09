package com.vanquish.health_buddy.repository;

import com.vanquish.health_buddy.model.userInput.UserInput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInputRepository extends JpaRepository<UserInput, Integer> {

}
