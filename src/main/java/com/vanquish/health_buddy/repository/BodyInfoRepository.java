package com.vanquish.health_buddy.repository;

import com.vanquish.health_buddy.model.bodyInfo.BodyInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BodyInfoRepository extends JpaRepository<BodyInfo, Integer> {
}
