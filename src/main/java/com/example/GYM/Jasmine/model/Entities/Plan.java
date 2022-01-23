package com.example.GYM.Jasmine.model.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Plan {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="p_id")
    private int p_id;
    private String p_name;
    private String p_description;
    private String amount;
    private String active;

    @OneToMany(mappedBy = "plan")
   @JsonIgnore
   private List<Lessons> items = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="employeesid",referencedColumnName = "e_Id")
    private Employees employees;

    public Plan() {

    }


    public Plan(int p_id, String p_name, String p_description, String amount, String active, List<Lessons> items, Employees employees) {
        this.p_id = p_id;
        this.p_name = p_name;
        this.p_description = p_description;
        this.amount = amount;
        this.active = active;
        this.items = items;
        this.employees = employees;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_description() {
        return p_description;
    }

    public void setP_description(String p_description) {
        this.p_description = p_description;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public List<Lessons> getItems() {
        return items;
    }

    public void setItems(List<Lessons> items) {
        this.items = items;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {


        return "plan{" +
                "p_id=" + p_id +
                ", p_name='" + p_name + '\'' +
                ", p_description='" + p_description + '\'' +
                ", amount='" + amount + '\'' +
                ", active='" + active + '\'' +
                '}';
    }
}