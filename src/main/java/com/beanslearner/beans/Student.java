package com.beanslearner.beans;

public class Student extends Person implements Learner {

    Double totalStudyTime = 0.0;

    public Student(Long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(Double numberHours) {
        totalStudyTime += numberHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
