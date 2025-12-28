package com.examly.springapp.service;

import java.util.List;
import com.examly.springapp.model.MedicalRecord;

public interface MedicalRecordService {
    MedicalRecord addMedicalRecord(MedicalRecord record);
    MedicalRecord getMedicalRecordById(Long id);
    MedicalRecord updateMedicalRecord(Long id, MedicalRecord record);
    List<MedicalRecord> getMedicalRecordsByPatientId(Long patientId);
}
