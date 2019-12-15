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
public class TestClassroomConfig {

    @Autowired
    @Qualifier("currentCohort")
    private Classroom currentCohort;

    @Autowired
    @Qualifier("previousCohort")
    private Classroom previousCohort;


    @Test
    public void TestCurrentCohort() {

        Assert.assertEquals("Ryan", currentCohort.getStudents().findById(1L).getName());

    }

    @Test
    public void TestPreviousCohort() {

        Assert.assertEquals("Tem", previousCohort.getStudents().findById(6L).getName());

    }

}
