package com.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.system.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
