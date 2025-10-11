
package com.example.teegalaproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.teegalaproject.model.Student;

//MarkerInterface
public interface StuRepo extends JpaRepository<Student,Integer>{

}
