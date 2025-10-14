
	package com.example.Placement.controller;

	import com.example.Placement.Entity.Student;
	import com.example.Placement.services.Studentservices;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;

	import java.util.List;
	import java.util.Optional;

	@RestController
	@RequestMapping("/api/students")
	public class Studentcontroller {
	    @Autowired
	    private Studentservices studentservices;

	    @GetMapping
	    public List<Student> getAllStudents() {
	        return studentservices.getAllStudents();
	    }

	    @GetMapping("/{id}")
	    public Optional<Student> getStudentById(@PathVariable Long id) {
	        return studentservices.getStudentById(id);
	    }

	    @PostMapping
	    public List<Student> saveStudents(@RequestBody List<Student> students) {
	        return studentservices.saveStudents(students);
	    }

	    @PutMapping("/{id}")
	    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
	        return studentservices.updateStudent(id, student);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteStudent(@PathVariable Long id) {
	        studentservices.deleteStudent(id);
	    }

	    @PatchMapping("/{id}")
	    public Student patchStudent(@PathVariable Long id, @RequestBody Student student) {
	        Student existing = studentservices.getStudentById(id).orElseThrow();
	        if (student.getName() != null) existing.setName(student.getName());
	        return studentservices.saveStudent(existing);
	    }
	}

