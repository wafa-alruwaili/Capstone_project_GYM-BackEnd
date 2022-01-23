package com.example.GYM.Jasmine.model.service;

import com.example.GYM.Jasmine.model.Entities.Lessons;
import com.example.GYM.Jasmine.model.Repository.LessonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class LessonsService {

    private LessonsRepository lessonsRepository;

    @Autowired
    public LessonsService(LessonsRepository lessonsRepository) {
        this.lessonsRepository = lessonsRepository;
    }


    public List<Lessons> getLesson() {
        return lessonsRepository.findAll();
    }

    public Optional<Lessons> getLessons(Integer lessonsId) {
        return lessonsRepository.findById(lessonsId);

    }

    public void addNewLessons(Lessons lessons) {
        lessonsRepository.save(lessons );
    }

    public void deleteLessons(Integer lessonsId) {
        lessonsRepository.deleteById(lessonsId);

    }



}