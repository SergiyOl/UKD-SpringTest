package com.testspring.ukd.testspr.repository;

import java.util.ArrayList;
import java.util.List;
import com.testspring.ukd.testspr.model.*;

public class StudentRepository {

    private List<Student> students = new ArrayList<>();

    public StudentRepository() {
        students.add(new Student(0, "Serhii", 16));
        students.add(new Student(1, "John", 19));
        students.add(new Student(2, "Kate", 17));
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public void addStudent(int id, String name, int age) {
        students.add(new Student(id, name, age));
    }

    public List<Student> findStudentById(int id) {
        List<Student> foundStudent = new ArrayList<>();
        for (Student student : students) {
            if (student.getId() == id) {

            }
        }
        return foundStudent;
    }

    public void deleteStudentById(int id) {
        for (Student toDelete : findStudentById(id)) {
            for (Student student : students) {
                if (student.getId() == toDelete.getId()) {
                    students.remove(student);
                }
            }
        }
    }

    public void updateStudent(int id, String name, int age) {
        for (Student toUpdate : findStudentById(id)) {
            for (Student student : students) {
                if (student.getId() == toUpdate.getId()) {
                    student = new Student(id, name, age);
                }
            }
        }
    }
}