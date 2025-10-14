package com.example.teegalaproject.Controls;

import com.example.teegalaproject.model.Student;
import com.example.teegalaproject.services.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StuController {

    @Autowired
    private StuService stuService;

    // Bulk Insert
    @PostMapping("/bulk")
    public List<Student> addStudents(@RequestBody List<Student> students) {
        return stuService.addStudents(students);
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return stuService.addStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return stuService.getAllStudents();
    }

    @GetMapping("/{sid}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long sid) {
        Optional<Student> student = stuService.getStudentById(sid);
        return student.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{sid}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long sid, @RequestBody Student details) {
        Student updated = stuService.updateStudent(sid, details);
        if (updated != null) return ResponseEntity.ok(updated);
        else return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{sid}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long sid) {
        boolean deleted = stuService.deleteStudent(sid);
        if (deleted) return ResponseEntity.noContent().build();
        else return ResponseEntity.notFound().build();
    }

    // PATCH endpoint for partial update
    @PatchMapping("/{sid}")
    public ResponseEntity<Student> patchStudent(@PathVariable Long sid, @RequestBody Student partial) {
        Student updated = stuService.patchStudent(sid, partial);
        if (updated != null) return ResponseEntity.ok(updated);
        else return ResponseEntity.notFound().build();
    }
}








	
	
	
	
	
	
	



