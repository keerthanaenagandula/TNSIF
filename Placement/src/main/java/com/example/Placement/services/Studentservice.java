package com.example.Placement.services;

import com.example.Placement.Entity.Student;
import java.util.List;
import java.util.Optional;

public interface Studentservice {
    List<Student> getAllStudents();
    Optional<Student> getStudentById(Long id);
    Student saveStudent(Student student);
    List<Student> saveStudents(List<Student> students);
    Student updateStudent(Long id, Student student);
    void deleteStudent(Long id);
}
