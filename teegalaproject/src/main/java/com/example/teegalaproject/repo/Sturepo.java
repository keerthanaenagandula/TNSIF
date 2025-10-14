package com.example.teegalaproject.repo;

import com.example.teegalaproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Sturepo extends JpaRepository<Student, Long> {
}


