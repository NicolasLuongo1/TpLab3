package com.UTN.TP.Service;

import com.UTN.TP.Model.PatientModel;

import java.util.List;

public interface PatientService {
    PatientModel addPatient(PatientModel patientModel);
    List<PatientModel> getPatientList();
}
