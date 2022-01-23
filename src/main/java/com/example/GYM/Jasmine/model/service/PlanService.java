package com.example.GYM.Jasmine.model.service;

import com.example.GYM.Jasmine.model.Entities.Plan;
import com.example.GYM.Jasmine.model.Repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class PlanService {

    private PlanRepository planRepository;

    @Autowired
    public PlanService(PlanRepository planRepository) {
        this.planRepository = planRepository;
    }


    public List<Plan> getPlans() {
        return planRepository.findAll();
    }

    public Optional<Plan> getPlan(Integer planId) {
        return planRepository.findById(planId);

    }

    public void addNewPlan(Plan plan) {
        planRepository.save(plan);
    }

    public void deletePlan(Integer planId) {
        planRepository.deleteById(planId);

    }



}