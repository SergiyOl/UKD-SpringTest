package com.testspring.ukd.testspr.service;

import java.util.List;
import com.testspring.ukd.testspr.model.Student;
import com.testspring.ukd.testspr.repository.StudentRepository;

public class StudentService {
    public StudentRepository studentDB = new StudentRepository();

    public List<Student> getAllStudents() {
        return studentDB.getAllStudents();
    }

    public void addStudent(int id, String name, int age) {
        studentDB.addStudent(id, name, age);
    }

    public List<Student> findStudentById(int id) {
        return studentDB.findStudentById(id);
    }

    public void deleteStudentById(int id) {
        studentDB.deleteStudentById(id);
    }

    public void updateStudent(int id, String name, int age) {
        studentDB.updateStudent(id, name, age);
    }
}