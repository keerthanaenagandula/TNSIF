
	package com.example.Placement.services;

	import com.example.Placement.Entity.Student;
	import com.example.Placement.repo.Studentrepo;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import java.util.List;
	import java.util.Optional;

	@Service
	public class Studentservices implements Studentservice{
	    @Autowired
	    private Studentrepo studentrepo;

	    @Override
	    public List<Student> getAllStudents() {
	        return studentrepo.findAll();
	    }

	    @Override
	    public Optional<Student> getStudentById(Long id) {
	        return studentrepo.findById(id);
	    }

	    @Override
	    public Student saveStudent(Student student) {
	        return studentrepo.save(student);
	    }

	    @Override
	    public List<Student> saveStudents(List<Student> students) {
	        return studentrepo.saveAll(students);
	    }

	    @Override
	    public Student updateStudent(Long id, Student student) {
	        student.setId(id);
	        return studentrepo.save(student);
	    }

	    @Override
	    public void deleteStudent(Long id) {
	        studentrepo.deleteById(id);
	    }
	}

