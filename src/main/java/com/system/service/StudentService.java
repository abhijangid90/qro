package com.system.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.system.entity.Student;
import com.system.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public void save(Student student) {
        studentRepository.save(student);
    }

    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    public Student findById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }
    
    

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    
    
}
