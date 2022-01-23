package com.example.GYM.Jasmine.model.service;

import com.example.GYM.Jasmine.model.Entities.*;
import com.example.GYM.Jasmine.model.Repository.UsersRepository;
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

class UsersServicesTest {
    @Mock
    UsersRepository usersRepository;
    @InjectMocks
    UsersServices usersServices;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetUsers() {
        List<Users> result = usersServices.getUsers();
        Assertions.assertEquals(Arrays.<Users>asList(new Users("username", "password", "role", new Employees(0, "full_name", "type", "username", "password", null, Arrays.<Plan>asList(new Plan(0, "p_name", "p_description", "amount", "active", Arrays.<Lessons>asList(new Lessons(0, "l_name", "l_type", "l_description", "l_date_time", Arrays.<Member>asList(new Member(0, "name", "gender", 0, "address", 0, 0, "renewal", "start_date", "end_date", "username", "password", null, Arrays.<Lessons>asList(null))), null)), null))), new Member(0, "name", "gender", 0, "address", 0, 0, "renewal", "start_date", "end_date", "username", "password", null, Arrays.<Lessons>asList(new Lessons(0, "l_name", "l_type", "l_description", "l_date_time", Arrays.<Member>asList(null), new Plan(0, "p_name", "p_description", "amount", "active", Arrays.<Lessons>asList(null), new Employees(0, "full_name", "type", "username", "password", null, Arrays.<Plan>asList(null)))))))), result);
    }

    @Test
    void testGetUser() {
        Optional<Users> result = usersServices.getUser("username");
        Assertions.assertEquals(null, result);
    }

    @Test
    void testGetCheck() {
        when(usersRepository.findByUsername(anyString())).thenReturn("findByUsernameResponse");
        when(usersRepository.findRole(anyString())).thenReturn("findRoleResponse");

        String result = usersServices.getCheck("username", "password");
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }

    @Test
    void testAddNewUser() {
        usersServices.addNewUser(new Users("username", "password", "role", new Employees(0, "full_name", "type", "username", "password", null, Arrays.<Plan>asList(new Plan(0, "p_name", "p_description", "amount", "active", Arrays.<Lessons>asList(new Lessons(0, "l_name", "l_type", "l_description", "l_date_time", Arrays.<Member>asList(new Member(0, "name", "gender", 0, "address", 0, 0, "renewal", "start_date", "end_date", "username", "password", null, Arrays.<Lessons>asList(null))), null)), null))), new Member(0, "name", "gender", 0, "address", 0, 0, "renewal", "start_date", "end_date", "username", "password", null, Arrays.<Lessons>asList(new Lessons(0, "l_name", "l_type", "l_description", "l_date_time", Arrays.<Member>asList(null), new Plan(0, "p_name", "p_description", "amount", "active", Arrays.<Lessons>asList(null), new Employees(0, "full_name", "type", "username", "password", null, Arrays.<Plan>asList(null))))))));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme