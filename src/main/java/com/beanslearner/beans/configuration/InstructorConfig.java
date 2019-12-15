package com.beanslearner.beans.configuration;

import com.beanslearner.beans.Instructor;
import com.beanslearner.beans.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InstructorConfig {


    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors() {
        List<Instructor> tcUsaInstructors = new ArrayList<>();
        tcUsaInstructors.add(new Instructor(1L, "Billy"));
        tcUsaInstructors.add(new Instructor(2L, "Ken"));
        tcUsaInstructors.add(new Instructor(3L, "Kate"));

        return new Instructors(tcUsaInstructors);
    }

    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors() {
        List<Instructor> cohort = new ArrayList<>();
        cohort.add(new Instructor(1L, "Pat"));
        cohort.add(new Instructor(2L, "Frank"));

        return new Instructors(cohort);
    }

    @Bean(name = "instructors")
    @Primary
    public Instructors instructors() {
        List<Instructor> cohort = new ArrayList<>();
        cohort.add(new Instructor(1L, "Roberto"));
        cohort.add(new Instructor(2L, "Froilan"));
        cohort.add(new Instructor(3L, "Chris"));
        cohort.add(new Instructor(4L, "Dolio"));

        return new Instructors(cohort);
    }

}
