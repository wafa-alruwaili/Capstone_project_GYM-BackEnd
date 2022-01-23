package com.example.GYM.Jasmine.model.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Users {
    @Id
    private String username;
    private String password;
    private String role;

  @OneToOne(cascade =CascadeType.ALL)
  @JoinColumn(name ="e_id")
  private  Employees employees;


    @OneToOne(cascade =CascadeType.ALL)
    @JoinColumn(name ="m_id")
    private  Member member;

//    @OneToMany(mappedBy = "users")
//    @JsonIgnore
//    private List<Employees> employees = new ArrayList<>();
//
//    @OneToMany(mappedBy = "users")
//    @JsonIgnore
//    private List<Member> member = new ArrayList<>();


    public Users(String username, String password, String role, Employees employees, Member member) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.employees = employees;
        this.member = member;
    }

    public Users() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}