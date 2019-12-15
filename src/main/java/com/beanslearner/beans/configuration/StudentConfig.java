package com.beanslearner.beans.configuration;

import com.beanslearner.beans.Student;
import com.beanslearner.beans.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents() {
        List<Student> cohort = new ArrayList<>();
        cohort.add(new Student(1L, "Ryan"));
        cohort.add(new Student(2L, "Ben"));
        cohort.add(new Student(3L, "Val"));
        cohort.add(new Student(4L, "Kendra"));
        cohort.add(new Student(5L, "Kai"));

        return new Students(cohort);
    }

    @Bean(name = "previousStudents")
    public Students previousStudents() {
        List<Student> cohort = new ArrayList<>();
        cohort.add(new Student(6L, "Tem"));
        cohort.add(new Student(7L, "Tem's Egg"));
        cohort.add(new Student(8L, "Bob"));

        return new Students(cohort);
    }

}
