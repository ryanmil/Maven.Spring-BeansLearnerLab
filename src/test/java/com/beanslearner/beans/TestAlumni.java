package com.beanslearner.beans;

import com.beanslearner.beans.configuration.Alumni;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAlumni {

    @Autowired
    private Alumni alumni;


    @Test
    public void testAlumni() {

        Student student = alumni.getStudents().findById(1L);

        Assert.assertEquals(1200.0, student.getTotalStudyTime(), .01);

    }

}
