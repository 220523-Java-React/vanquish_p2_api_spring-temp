package com.vanquish.health_buddy.repository;

import com.vanquish.health_buddy.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
    User getByUsername(String username);

    Boolean existByUsername(String username);

    Long deleteByUserId(Integer userId);
}
