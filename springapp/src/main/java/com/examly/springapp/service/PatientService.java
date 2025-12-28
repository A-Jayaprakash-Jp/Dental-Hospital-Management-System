package com.examly.springapp.service;

import com.examly.springapp.model.Patient;

public interface PatientService {
    Patient addPatient(Patient patient);
    Patient getPatientById(Long id);
    Patient updatePatient(Long id, Patient patient);
}
