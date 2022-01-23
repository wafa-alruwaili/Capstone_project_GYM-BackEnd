package com.example.GYM.Jasmine.model.Repository;

import com.example.GYM.Jasmine.model.Entities.Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




public interface PlanRepository extends JpaRepository<Plan, Integer>{
}
