package com.system.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Correct import for Model
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.system.entity.Timetable;
import com.system.service.TimetableService;

@Controller
public class TimetableController {

    private final TimetableService timetableService;

    public TimetableController(TimetableService timetableService) {
        this.timetableService = timetableService;
    }

    @PostMapping("/timetable/upload")
    public String uploadTimetable(@RequestParam("file") MultipartFile file, Model model) {
        try {
            List<Timetable> timetableList = timetableService.processTimetableFile(file);
            model.addAttribute("timetableList", timetableList);
        } catch (IOException e) {
            model.addAttribute("error", "Failed to upload the file: " + e.getMessage());
        }
        return "student"; // Return to the same view where you display the student data
    }

    @GetMapping("/k")
    public String getStudents(Model model) {
        // Add logic to fetch and add students to the model if needed
        return "student"; // Return your main student management view
    }
}
