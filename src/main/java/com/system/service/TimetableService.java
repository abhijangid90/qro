package com.system.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.system.entity.Timetable;


@Service
public class TimetableService {

    public List<Timetable> processTimetableFile(MultipartFile file) throws IOException {
        List<Timetable> timetableList = new ArrayList<>();
        try (Workbook workbook = WorkbookFactory.create(file.getInputStream())) { // Use try-with-resources
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                if (row.getRowNum() == 0) continue; // Skip header row
                Timetable timetable = new Timetable();
                timetable.setSubject(row.getCell(0).getStringCellValue());
                timetable.setDay(row.getCell(1).getStringCellValue());
                timetable.setTime(row.getCell(2).getStringCellValue());
                timetableList.add(timetable);
            }
        }
        return timetableList;
    }
}
