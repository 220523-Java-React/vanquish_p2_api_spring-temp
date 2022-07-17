package com.vanquish.health_buddy.repository;


import com.vanquish.health_buddy.model.progress.Progress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgressRepository extends JpaRepository<Progress, Integer> {
}
