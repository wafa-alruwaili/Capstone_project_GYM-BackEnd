package com.example.GYM.Jasmine.model.Repository;

import com.example.GYM.Jasmine.model.Entities.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Integer>{
// @Query("SELECT password FROM Employees WHERE user_name= :user_name")
//    String findByUser_name(@Param("user_name") String user_name);
//
//    @Query("select case when count(user_name) > 0 then true else false end from Employees where user_name = :user_name")
//    Boolean existsByUsername(@Param("user_name") String user_name);
}



