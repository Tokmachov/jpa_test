package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class) // это говорит, что мы хотим запускать контекс
@SpringBootTest(classes = JpaDemoApplication.class) //откуда брать контекст
public class CourseRepositoryTest {
    @Test
    public void startContext() {}

}
