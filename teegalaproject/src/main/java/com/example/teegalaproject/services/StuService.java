package com.example.teegalaproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teegalaproject.model.Student;
import com.example.teegalaproject.repo.StuRepo;

@Service
public class StuService {

    @Autowired
    private StuRepo stuRepo;

    // Add a student
    public Student addStudent(Student student) {
        return stuRepo.save(student);
    }

    // Get all students
    public List<Student> getAllStudents() {
        return stuRepo.findAll();
    }

    // Get student by ID
    public Optional<Student> getStudentById(int id) {
        return stuRepo.findById(id);
    }

    // Update student
    public Student updateStudent(Student student) {
        return stuRepo.save(student);
    }

    // Delete student by ID
    public void deleteStudent(int id) {
        stuRepo.deleteById(id);
    }
}

		
	


