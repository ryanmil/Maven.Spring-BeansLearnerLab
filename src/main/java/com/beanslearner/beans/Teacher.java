package com.beanslearner.beans;

public interface Teacher {

    void teacher(Learner learner, Double numberOfHours);

    void lecture(Iterable<? extends Learner> learners, Double numberOfHours);

}
