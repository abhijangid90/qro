package com.system.controller;





import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.system.entity.Student;
import com.system.service.StudentService;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    // This method gets all students and returns the "student" view (student.html).
    @GetMapping("/students")
    public String getAllStudents(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "students"; // Refers to student.html
    }

    @GetMapping("/students/add")
    public String showAddStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "add-student"; // Refers to add-student.html
    }

    @PostMapping("/students")
    public String addStudent(@ModelAttribute Student student) {
        studentService.save(student);
        return "redirect:/students";
    }

    @GetMapping("/students/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteById(id);
        return "redirect:/students";
    }

    
//    @GetMapping("/j")
//    public String home() {
//        return "interace";
//    }
    @GetMapping("/user")
    public String showStudents(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "student"; // This refers to student.html
    }
//    
    
//    @GetMapping("/j")
//    public String getAllStudent(Model model) {
//        model.addAttribute("student", studentService.findAll());
//        return "student";
//    } 
    

   
    }
