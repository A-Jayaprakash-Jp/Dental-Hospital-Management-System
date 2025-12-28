package com.examly.springapp.service;

import com.examly.springapp.model.Doctor;

public interface AdminService {
    Doctor getDoctorById(Long id);
    void deleteDoctor(Long id);
}
