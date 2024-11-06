package com.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.system.entity.Teacher;
import com.system.service.TeacherService;

@Controller
@RequestMapping("/teachers")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public String getAllTeachers(Model model) {
        model.addAttribute("teachers", teacherService.findAll());
        return "teachers";
    }

    @GetMapping("/add")
    public String showAddTeacherForm(Model model) {
        model.addAttribute("teacher", new Teacher());
        return "add-teacher";
    }

    @PostMapping
    public String addTeacher(@ModelAttribute Teacher teacher) {
        teacherService.save(teacher);
        return "redirect:/teachers";
    }

    @GetMapping("/delete/{id}")
    public String deleteTeacher(@PathVariable Long id) {
        teacherService.deleteById(id);
        return "redirect:/teachers";
    }
}