package com.testspring.ukd.testspr.service;

import java.util.List;
import com.testspring.ukd.testspr.model.Student;
import com.testspring.ukd.testspr.repository.StudentRepository;

public class StudentService {
    public StudentRepository studentDB = new StudentRepository();

    public List<Student> getAllUsers() {
        return studentDB.getAllStudents();
    }
}