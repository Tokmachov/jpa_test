package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Getter
@Setter
@ToString
@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    protected Course() {}

    public Course(String name) {
        this.name = name;
    }
}
