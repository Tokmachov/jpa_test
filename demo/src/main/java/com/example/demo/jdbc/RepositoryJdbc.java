package com.example.demo.jdbc;

import com.example.demo.model.Person;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositoryJdbc {

    private JdbcTemplate jdbcTemplate;


    public RepositoryJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Person> getPersonList() {
        return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<Person>(Person.class));
    }

    public Person findById(Long id) {
        return jdbcTemplate.queryForObject("select * from person where id=?", new Object[]{id}, new BeanPropertyRowMapper<Person>(Person.class));
    }
}
