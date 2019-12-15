package com.beanslearner.beans;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestStudentConfig {

    @Autowired
    @Qualifier("students")
    private Students students;

    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;

    @Test
    public void testCurrentStudentsBean() {
        Assert.assertEquals(students.findById(1L).getName(), "Ryan");
    }

    @Test
    public void testPreviousStudentsBean() {
        Assert.assertEquals(previousStudents.findById(6L).getName(), "Tem");
    }


}
