package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.examly.springapp.model.MedicalRecord;
import com.examly.springapp.service.MedicalRecordService;

@RestController
@RequestMapping("/medicalrecords")
public class MedicalRecordController {

    @Autowired
    private MedicalRecordService medicalRecordService;

    @PostMapping
    public ResponseEntity<MedicalRecord> addMedicalRecord(
            @RequestBody MedicalRecord record) {

        return new ResponseEntity<>(
                medicalRecordService.addMedicalRecord(record),
                HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MedicalRecord> getMedicalRecordById(
            @PathVariable Long id) {

        return new ResponseEntity<>(
                medicalRecordService.getMedicalRecordById(id),
                HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MedicalRecord> updateMedicalRecord(
            @PathVariable Long id,
            @RequestBody MedicalRecord record) {

        return new ResponseEntity<>(
                medicalRecordService.updateMedicalRecord(id, record),
                HttpStatus.OK);
    }

    @GetMapping("/patient/{id}")
    public ResponseEntity<?> getMedicalRecordsByPatient(
            @PathVariable Long id) {

        List<MedicalRecord> records =
                medicalRecordService.getMedicalRecordsByPatientId(id);

        if (records.isEmpty()) {
            return new ResponseEntity<>("No medical records found", HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(records, HttpStatus.OK);
    }
}
