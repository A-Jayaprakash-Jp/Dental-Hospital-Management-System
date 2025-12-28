package com.examly.springapp.service;

import org.springframework.data.domain.Page;
import com.examly.springapp.model.Doctor;

public interface DoctorService {

    Doctor addDoctor(Doctor doctor);

    Page<Doctor> getDoctorsWithPagination(int page, int size);

    Doctor getDoctorById(Long id);

    Doctor updateDoctor(Long id, Doctor doctor);
}
