package com.vanquish.health_buddy.repository;
import com.vanquish.health_buddy.model.Mineral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface MineralRepository extends JpaRepository<Mineral, Double> {

}