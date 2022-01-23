package com.example.GYM.Jasmine.model.Repository;

import com.example.GYM.Jasmine.model.Entities.Lessons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




public interface LessonsRepository extends JpaRepository<Lessons, Integer>{
}