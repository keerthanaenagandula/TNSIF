package com.example.teegalaproject.services;

import com.example.teegalaproject.model.Student;
import com.example.teegalaproject.repo.Sturepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StuService {
    @Autowired
    private Sturepo sturepo;

    public Student addStudent(Student student) {
        return sturepo.save(student);
    }

    public List<Student> addStudents(List<Student> students) {
        return sturepo.saveAll(students);
    }

    public List<Student> getAllStudents() {
        return sturepo.findAll();
    }

    public Optional<Student> getStudentById(Long sid) {
        return sturepo.findById(sid);
    }

    public Student updateStudent(Long sid, Student details) {
        return sturepo.findById(sid).map(student -> {
            student.setName(details.getName());
            student.setCollege(details.getCollege());
            student.setRoll(details.getRoll());
            student.setQualification(details.getQualification());
            student.setCourse(details.getCourse());
            student.setYear(details.getYear());
            student.setCertificate(details.getCertificate());
            student.setHalltickect(details.getHalltickect());
            return sturepo.save(student);
        }).orElse(null);
    }

    public boolean deleteStudent(Long sid) {
        if (sturepo.existsById(sid)) {
            sturepo.deleteById(sid);
            return true;
        }
        return false;
    }

    public Student patchStudent(Long sid, Student partialStudent) {
        return sturepo.findById(sid).map(student -> {
            if (partialStudent.getName() != null) student.setName(partialStudent.getName());
            // Add checks for other fields and set if not null
            return sturepo.save(student);
        }).orElse(null);
    }
}

		
	


