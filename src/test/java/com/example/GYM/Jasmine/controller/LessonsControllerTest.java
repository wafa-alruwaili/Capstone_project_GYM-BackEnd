package com.example.GYM.Jasmine.controller;

import com.example.GYM.Jasmine.model.Entities.*;
import com.example.GYM.Jasmine.model.service.LessonsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

class LessonsControllerTest {
    @Mock
    LessonsService lessonsService;
    @InjectMocks
    LessonsController lessonsController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetLessons() {
        when(lessonsService.getLesson()).thenReturn(Arrays.<Lessons>asList(new Lessons(0, "l_name", "l_type", "l_description", "l_date_time", Arrays.<Member>asList(new Member(0, "name", "gender", 0, "address", 0, 0, "renewal", "start_date", "end_date", "username", "password", new Users("username", "password", "role", new Employees(0, "full_name", "type", "username", "password", null, Arrays.<Plan>asList(new Plan(0, "p_name", "p_description", "amount", "active", Arrays.<Lessons>asList(null), null))), null), Arrays.<Lessons>asList(null))), new Plan(0, "p_name", "p_description", "amount", "active", Arrays.<Lessons>asList(null), new Employees(0, "full_name", "type", "username", "password", new Users("username", "password", "role", null, new Member(0, "name", "gender", 0, "address", 0, 0, "renewal", "start_date", "end_date", "username", "password", null, Arrays.<Lessons>asList(null))), Arrays.<Plan>asList(null))))));

        List<Lessons> result = lessonsController.getLessons();
        Assertions.assertEquals(Arrays.<Lessons>asList(new Lessons(0, "l_name", "l_type", "l_description", "l_date_time", Arrays.<Member>asList(new Member(0, "name", "gender", 0, "address", 0, 0, "renewal", "start_date", "end_date", "username", "password", new Users("username", "password", "role", new Employees(0, "full_name", "type", "username", "password", null, Arrays.<Plan>asList(new Plan(0, "p_name", "p_description", "amount", "active", Arrays.<Lessons>asList(null), null))), null), Arrays.<Lessons>asList(null))), new Plan(0, "p_name", "p_description", "amount", "active", Arrays.<Lessons>asList(null), new Employees(0, "full_name", "type", "username", "password", new Users("username", "password", "role", null, new Member(0, "name", "gender", 0, "address", 0, 0, "renewal", "start_date", "end_date", "username", "password", null, Arrays.<Lessons>asList(null))), Arrays.<Plan>asList(null))))), result);
    }

    @Test
    void testGetLessons2() {
        when(lessonsService.getLessons(anyInt())).thenReturn(null);

        Optional<Lessons> result = lessonsController.getLessons(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testRegisterNewLessons() {
        lessonsController.registerNewLessons(new Lessons(0, "l_name", "l_type", "l_description", "l_date_time", Arrays.<Member>asList(new Member(0, "name", "gender", 0, "address", 0, 0, "renewal", "start_date", "end_date", "username", "password", new Users("username", "password", "role", new Employees(0, "full_name", "type", "username", "password", null, Arrays.<Plan>asList(new Plan(0, "p_name", "p_description", "amount", "active", Arrays.<Lessons>asList(null), null))), null), Arrays.<Lessons>asList(null))), new Plan(0, "p_name", "p_description", "amount", "active", Arrays.<Lessons>asList(null), new Employees(0, "full_name", "type", "username", "password", new Users("username", "password", "role", null, new Member(0, "name", "gender", 0, "address", 0, 0, "renewal", "start_date", "end_date", "username", "password", null, Arrays.<Lessons>asList(null))), Arrays.<Plan>asList(null)))));
    }

    @Test
    void testDeleteLessons() {
        lessonsController.deleteLessons(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme