package com.vanquish.health_buddy.repository;
import com.vanquish.health_buddy.model.vitamin.Vitamin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VitaminRepository extends JpaRepository<Vitamin, Double> {

}
