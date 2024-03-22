package com.doctor.repository;

import java.util.List;

import com.doctor.exception.DoctorNotFoundException;
import com.doctor.exception.IdNotFoundException;
import com.doctor.model.Doctor;

public interface IDoctorRepository {
	
	void addDoctor(Doctor doctor);
    void updateDoctor(int doctorId, double consulationFee);
    void deleteDoctor(int doctorId);
    List<Doctor> findAll();
    List<Doctor> findBySpeciality(String speciality) throws DoctorNotFoundException;
    List<Doctor> findBySpecialityAndExperience(String speciality, int experience) throws DoctorNotFoundException;
    List<Doctor> findBySpecialityAndFeesLessThan(String speciality, int consultationFees) throws DoctorNotFoundException;
    List<Doctor> findBySpecialityAndRating(String speciality, int ratings) throws DoctorNotFoundException;
    List<Doctor> findBySpecialityAndNameContains(String speciality, String doctorName) throws DoctorNotFoundException;
    Doctor findById(int doctorId) throws IdNotFoundException;
}