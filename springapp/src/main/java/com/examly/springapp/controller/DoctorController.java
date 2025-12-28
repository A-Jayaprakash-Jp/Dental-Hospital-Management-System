package com.examly.springapp.controller;

import java.util.List;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.examly.springapp.model.Doctor;
import com.examly.springapp.service.DoctorService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService){
        this.doctorService = doctorService;
    }

    @PostMapping
    public ResponseEntity<Doctor> createDoctor(@RequestBody(required = false) Doctor doctor) {
        if (doctor == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Doctor savedDoctor = doctorService.addDoctor(doctor);
        return new ResponseEntity<>(savedDoctor, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Doctor>> getAllDoctors(HttpServletRequest request) {
        String accept = request.getHeader("Accept");
        if (accept == null || !accept.contains("application/json")) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        List<Doctor> doctors = doctorService
                .getDoctorsWithPagination(0, Integer.MAX_VALUE)
                .getContent();
        return new ResponseEntity<>(doctors, HttpStatus.OK);
    }

    @GetMapping("/page/{page}/{size}")
    public ResponseEntity<Page<Doctor>> getDoctorsWithPagination(
            @PathVariable int page,
            @PathVariable int size) {

        Page<Doctor> doctorPage = doctorService.getDoctorsWithPagination(page, size);
        return new ResponseEntity<>(doctorPage, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Doctor> getDoctorById(@PathVariable Long id) {
        Doctor doctor = doctorService.getDoctorById(id);
        if (doctor == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(doctor, HttpStatus.OK);
    }

 

    @PutMapping("/{id}")
    public ResponseEntity<Doctor> updateDoctor(
            @PathVariable Long id,
            @RequestBody Doctor doctor) {

        Doctor updatedDoctor = doctorService.updateDoctor(id, doctor);
        return new ResponseEntity<>(updatedDoctor, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDoctor(@PathVariable Long id) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
