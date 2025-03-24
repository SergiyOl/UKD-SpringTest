package com.testspring.ukd.testspr.repository;

import java.util.ArrayList;
import java.util.List;
import com.testspring.ukd.testspr.model.*;

public class StudentRepository {

    private final List<Student> students = new ArrayList<>();

    public StudentRepository() {
        students.add(new Student(0, "Serhii", 16));
        students.add(new Student(1, "John", 19));
        students.add(new Student(2, "Kate", 17));
    }

    public List<Student> getAllStudents() {
        return students;
    }
}