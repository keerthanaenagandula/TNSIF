package com.example.teegalaproject.Controls;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.teegalaproject.model.Student;
import com.example.teegalaproject.services.StuService;

@RestController
@RequestMapping("/api/students")
public class StuController {

    @Autowired
    private StuService stuService;

    // Create new student
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return stuService.addStudent(student);
    }

    // Get all students
    @GetMapping
    public List<Student> getAllStudents() {
        return stuService.getAllStudents();
    }

    // Get student by ID
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id) {
        Optional<Student> student = stuService.getStudentById(id);
        return student.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Update student
    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable int id, @RequestBody Student studentDetails) {
        Optional<Student> optionalStudent = stuService.getStudentById(id);
        if (!optionalStudent.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        Student student = optionalStudent.get();
        // Set updated fields
        student.setSname(studentDetails.getSname());
        student.setCollege(studentDetails.getCollege());
        student.setRollno(studentDetails.getRollno());
        student.setQualification(studentDetails.getQualification());
        student.setCourse(studentDetails.getCourse());
        student.setYear(studentDetails.getYear());
        student.setCerificate(studentDetails.getCerificate());
        student.setHallticket(studentDetails.getHallticket());

        Student updatedStudent = stuService.updateStudent(student);
        return ResponseEntity.ok(updatedStudent);
    }

    // Delete student
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int id) {
        Optional<Student> optionalStudent = stuService.getStudentById(id);
        if (!optionalStudent.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        stuService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }
}






	
	
	
	
	
	
	



