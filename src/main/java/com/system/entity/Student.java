package com.system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="student")
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private double class10Percentage;
    private double class12Percentage;
    private double currentSemesterCGPA;
    private double totalCGPA;
    private String rollNumber;
    private int year;
    private int semester;
    private String classSection;
    private String type; // "Hosteller" or "Day Scholar"
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getClass10Percentage() {
		return class10Percentage;
	}
	public void setClass10Percentage(double class10Percentage) {
		this.class10Percentage = class10Percentage;
	}
	public double getClass12Percentage() {
		return class12Percentage;
	}
	public void setClass12Percentage(double class12Percentage) {
		this.class12Percentage = class12Percentage;
	}
	public double getCurrentSemesterCGPA() {
		return currentSemesterCGPA;
	}
	public void setCurrentSemesterCGPA(double currentSemesterCGPA) {
		this.currentSemesterCGPA = currentSemesterCGPA;
	}
	public double getTotalCGPA() {
		return totalCGPA;
	}
	public void setTotalCGPA(double totalCGPA) {
		this.totalCGPA = totalCGPA;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public String getClassSection() {
		return classSection;
	}
	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

    // Getters and Setters
    // ...
    
    
}