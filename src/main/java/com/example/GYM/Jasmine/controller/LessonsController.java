package com.example.GYM.Jasmine.controller;

import com.example.GYM.Jasmine.model.service.LessonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.GYM.Jasmine.model.Entities.Lessons;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "https://w-gym-the-lion-frontend.herokuapp.com/")
@RestController
@RequestMapping(path = "api/lessons")
public class LessonsController<lessonsService> {

    private LessonsService lessonsService;

    @Autowired
    public LessonsController(LessonsService lessonsService) {
        this.lessonsService = lessonsService;
    }

    @GetMapping
    public List<Lessons> getLessons() {
        return lessonsService.getLesson();
    }

    @GetMapping(path = "{lessonsId}")
    public Optional<Lessons> getLessons(@PathVariable(name = "lessonsId") Integer lessonsId) {
        return lessonsService.getLessons(lessonsId);
    }

    @PostMapping(path = "add")
    public void registerNewLessons(@RequestBody Lessons lessons) {
        lessonsService.addNewLessons(lessons);
    }

    @DeleteMapping(path = "delete/{lessonsId}")
    public void deleteLessons(@PathVariable ("lessonsId") Integer lessonsId){
        lessonsService.deleteLessons(lessonsId);

    }
}
