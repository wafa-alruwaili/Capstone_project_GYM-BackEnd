package com.example.GYM.Jasmine.controller;

import com.example.GYM.Jasmine.model.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.GYM.Jasmine.model.Entities.Plan;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "api/plan")
public class PlanController<planService> {

    private PlanService planService;

    @Autowired
    public PlanController(PlanService planService) {
        this.planService = planService;
    }

    @GetMapping
    public List<Plan> getPlans() {
        return planService.getPlans();
    }

    @GetMapping(path = "{planId}")
    public Optional<Plan> getPlan(@PathVariable(name = "planId") Integer planId) {
        return planService.getPlan(planId);
    }

    @PostMapping(path = "add")
    public void registerNewPlan(@RequestBody Plan plan) {
        planService.addNewPlan(plan);
    }

    @DeleteMapping(path = "delete/{planId}")
    public void deletePlan(@PathVariable ("planId") Integer planId){

        planService.deletePlan(planId);

    }
}