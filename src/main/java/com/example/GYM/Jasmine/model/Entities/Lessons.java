package com.example.GYM.Jasmine.model.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Lessons {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int l_id;
    private String l_name;
    private String l_type;
    private String l_description;
    private String l_date_time;


         @ManyToMany(mappedBy = "lessons")
         @JsonIgnore
         private java.util.List<Member> member = new ArrayList<>();

         @ManyToOne
         @JoinColumn(name="planid",referencedColumnName = "p_Id")
         private Plan plan;


    public Lessons() {
    }


    public Lessons(int l_id, String l_name, String l_type, String l_description, String l_date_time, List<Member> member, Plan plan) {
        this.l_id = l_id;
        this.l_name = l_name;
        this.l_type = l_type;
        this.l_description = l_description;
        this.l_date_time = l_date_time;
        this.member = member;
        this.plan = plan;
    }

    public int getL_id() {
        return l_id;
    }

    public void setL_id(int l_id) {
        this.l_id = l_id;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getL_type() {
        return l_type;
    }

    public void setL_type(String l_type) {
        this.l_type = l_type;
    }

    public String getL_description() {
        return l_description;
    }

    public void setL_description(String l_description) {
        this.l_description = l_description;
    }

    public String getL_date_time() {
        return l_date_time;
    }

    public void setL_date_time(String l_date_time) {
        this.l_date_time = l_date_time;
    }

    public List<Member> getMember() {
        return member;
    }

    public void setMember(List<Member> member) {
        this.member = member;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {


        return "lessons{" +
                "l_id=" + l_id +
                ", l_name='" + l_name + '\'' +
                ", l_type='" + l_type + '\'' +
                ", l_description='" + l_description + '\'' +
                ", l_date_time='" + l_date_time + '\'' +
                '}';
    }
}