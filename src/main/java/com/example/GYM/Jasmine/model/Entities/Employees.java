package com.example.GYM.Jasmine.model.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Employees {
    @Id
    private int e_id;
    private String full_name;
    private String type;
    private String username;
    private  String password;

@OneToOne(mappedBy = "employees")
private Users users;

//
//    @OneToMany(mappedBy = "employees")
//    @JsonIgnore
//    private List<Users> users = new ArrayList<>();

    @OneToMany(mappedBy = "employees")
    @JsonIgnore
    private List<Plan> items = new ArrayList<>();



    public Employees() {
    }

    public Employees(int e_id, String full_name, String type, String username, String password, Users users, List<Plan> items) {
        this.e_id = e_id;
        this.full_name = full_name;
        this.type = type;
        this.username = username;
        this.password = password;
        this.users = users;
        this.items = items;
    }

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public List<Plan> getItems() {
        return items;
    }

    public void setItems(List<Plan> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "employees{" +
                "e_id=" + e_id +
                ", password=" + password +
                ", full_name=" + full_name +
                ", username='" + username + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

