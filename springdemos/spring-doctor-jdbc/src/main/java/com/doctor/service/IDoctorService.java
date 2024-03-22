package com.doctor.service;

import java.util.List;

import com.doctor.exception.DoctorNotFoundException;
import com.doctor.exception.IdNotFoundException;
import com.doctor.model.Doctor;

public interface IDoctorService {
	 void addDoctor(Doctor doctor);
	    void updateDoctor(int doctorId, double consulationFee);
	    void deleteDoctor(int doctorId);
	    List<Doctor> getAll();
	    List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException;
	    List<Doctor> getBySpecialityAndExperience(String speciality, int experience) throws DoctorNotFoundException;
	    List<Doctor> getBySpecialityAndFeesLessThan(String speciality, int consultationFees) throws DoctorNotFoundException;
	    List<Doctor> getBySpecialityAndRating(String speciality, int ratings) throws DoctorNotFoundException;
	    List<Doctor> getBySpecialityAndNameContains(String speciality, String doctorName) throws DoctorNotFoundException;
	    Doctor getById(int doctorId) throws IdNotFoundException;
}