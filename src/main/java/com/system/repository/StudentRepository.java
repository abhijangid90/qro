package com.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.system.entity.Student;



public interface StudentRepository extends JpaRepository<Student, Long> {
}