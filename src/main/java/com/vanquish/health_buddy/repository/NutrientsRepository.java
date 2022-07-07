package com.vanquish.health_buddy.repository;

import com.vanquish.health_buddy.model.Nutrients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NutrientsRepository extends JpaRepository<Nutrients, Integer> {
}
