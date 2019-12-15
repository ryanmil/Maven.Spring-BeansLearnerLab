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
public class TestInstructorConfig {

    @Autowired
    @Qualifier("tcUsaInstructors")
    private Instructors tcUsaInstructors;

    @Autowired
    @Qualifier("tcUkInstructors")
    private Instructors tcUkInstructors;

    @Autowired
    @Qualifier("instructors")
    private Instructors instructors;

    @Test
    public void testTcUsaInstructors() {
        Assert.assertEquals("Billy", tcUsaInstructors.findById(1L).getName());
    }

    @Test
    public void testTcUkInstructors() {
        Assert.assertEquals("Pat", tcUkInstructors.findById(1L).getName());
    }

    @Test
    public void testInstructors() {
        Assert.assertEquals("Roberto", instructors.findById(1L).getName());
    }

}
