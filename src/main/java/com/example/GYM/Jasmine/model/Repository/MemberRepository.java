package com.example.GYM.Jasmine.model.Repository;

import com.example.GYM.Jasmine.model.Entities.Employees;
import com.example.GYM.Jasmine.model.Entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface MemberRepository extends JpaRepository<Member, Integer>{
//    @Query("SELECT password FROM Member WHERE username= :username")
//    String findByName(@Param("username") String username);
//
//    @Query("select case when count(username) > 0 then true else false end from Member where username = :username")
//    Boolean existsByName(@Param("username") String username);
}
