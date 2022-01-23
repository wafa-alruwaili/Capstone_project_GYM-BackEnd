package com.example.GYM.Jasmine.model.service;

import com.example.GYM.Jasmine.model.Entities.Employees;
import com.example.GYM.Jasmine.model.Repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class EmployeesService {

    private EmployeesRepository employeesRepository;

    @Autowired
    public EmployeesService(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }


    public List<Employees> getEmployees() {
        return employeesRepository.findAll();
    }

    public Optional<Employees> getEmployees(Integer employeesId) {
        return employeesRepository.findById(employeesId);

    }

//    public String getCheck(String user_name ,String password) {
//        if( employeesRepository.existsByUsername(user_name) ){
//            String Employees = employeesRepository.findByUser_name(user_name);
//            if (Employees.equals(password)){
//                return "authenticated" ;
//            }
//            else {
//                return "Password does not match"; }
//        }
//
//        return "Username not found";
//    }



    public void addNewEmployees(Employees employees) {
       employeesRepository.save(employees);
    }

    public void deleteEmployees(Integer employeesId) {
        employeesRepository.deleteById(employeesId);

    }
}


