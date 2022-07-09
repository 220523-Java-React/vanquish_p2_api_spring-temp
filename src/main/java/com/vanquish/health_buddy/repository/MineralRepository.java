package com.vanquish.health_buddy.repository;
import com.vanquish.health_buddy.model.mineral.Mineral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MineralRepository extends JpaRepository<Mineral, Double> {

}