package com.example.demo.model;

import lombok.*;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Person {
    private long id;
    private String name;
    private String location;
    private Date dateOfBirth;
}
