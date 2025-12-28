package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examly.springapp.model.Doctor;
import com.examly.springapp.repository.DoctorRepository;

@Service
public class AdminServiceImpl implements AdminService {
    
    @Autowired
    private DoctorRepository doctorRepository;
    
    @Override
    public Doctor getDoctorById(Long id) {
        return doctorRepository.findById(id).orElse(null);
    }
    
    @Override
    public void deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
    }
}
