package com.examly.springapp.service;

import java.util.List;
import com.examly.springapp.model.Appointment;

public interface AppointmentService {
  Appointment addAppointment(Appointment appointment);
  Appointment getAppointmentById(Long id);
  Appointment updateAppointment(Long id, Appointment appointment);
  List<Appointment> getAppointmentsByStatus(String status);
}

