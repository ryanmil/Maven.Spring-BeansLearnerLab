package com.beanslearner.beans.configuration;

import com.beanslearner.beans.Instructors;
import com.beanslearner.beans.Student;
import com.beanslearner.beans.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;

@Component
@DependsOn({"instructors", "previousStudents"})
public class Alumni {

    private Students students;
    private Instructors instructors;

    @Autowired
    public Alumni(Instructors instructors, Students students) {
        this.instructors = instructors;
        this.students = students;
    }

    @PostConstruct
    private void executeBootcamp() {
        for (Student s : students) {
            s.learn(1200.0);
        }
    }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}
