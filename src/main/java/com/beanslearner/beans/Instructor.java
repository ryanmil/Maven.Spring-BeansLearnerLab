package com.beanslearner.beans;

public class Instructor extends Person implements Teacher {


    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teacher(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, Double numberOfHours) {
        int size = 0;
        for (Learner l : learners) {
            size++;
        }

        Double time = numberOfHours / size;
        for (Learner l : learners) {
            l.learn(time);
        }
    }
}
