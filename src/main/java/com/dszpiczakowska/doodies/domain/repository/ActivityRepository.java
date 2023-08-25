package com.dszpiczakowska.doodies.domain.repository;

import com.dszpiczakowska.doodies.domain.model.Activity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends CrudRepository<Activity, Long> {
    @Query(value = "SELECT * FROM activity ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    Activity findRandom();
}
