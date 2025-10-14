package com.example.teegalaproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @Column(name = "sid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sid;

    private String name;
    private String college;
    private Long roll;
    private String qualification;
    private String course;
    private int year;
    private String certificate;
    private long halltickect;
    
	
	public Long getId() {
		return sid;
	}
	public void setId(Long id) {
		this.sid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public Long getRoll() {
		return roll;
	}
	public void setRoll(Long roll) {
		this.roll = roll;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	public long getHalltickect() {
		return halltickect;
	}
	public void setHalltickect(long halltickect) {
		this.halltickect = halltickect;
	}
			
}