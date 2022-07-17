package com.example.demo;

import com.example.demo.jdbc.RepositoryJdbc;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private RepositoryJdbc repositoryJdbc;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Person> persons = repositoryJdbc.getPersonList();
        Person person = repositoryJdbc.findById(10001L);
        System.out.println(persons);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! " + person.toString());
    }
}
