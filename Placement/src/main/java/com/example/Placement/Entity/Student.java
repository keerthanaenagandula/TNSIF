package com.example.Placement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "placement")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String qualification;
    private String course;
    private int year;
    private Long hallTicketNo;
    private Long roll;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Long getHallTicketNo() {
		return hallTicketNo;
	}

	public void setHallTicketNo(Long hallTicketNo) {
		this.hallTicketNo = hallTicketNo;
	}

	public Long getRoll() {
		return roll;
	}

	public void setRoll(Long roll) {
		this.roll = roll;
	}

}