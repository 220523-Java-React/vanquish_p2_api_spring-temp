package com.vanquish.health_buddy.repository;

import com.vanquish.health_buddy.model.bodyFeedback.BodyFeedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BodyFeedbackRepository extends JpaRepository<BodyFeedback, Integer> {

}
