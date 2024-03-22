package com.doctor.model;

public class Doctor {
	private Integer doctorId;
    private String doctorName;
    private String speciality;
    private double consultationFee;
    private int ratings;
    private int experience;
	public Doctor() {
		super();
	}
	public Doctor(Integer doctorId, String doctorName, String speciality, double consultationFee, int ratings,
			int experience) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.speciality = speciality;
		this.consultationFee = consultationFee;
		this.ratings = ratings;
		this.experience = experience;
	}
	public Integer getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public double getConsultationFee() {
		return consultationFee;
	}
	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", speciality=" + speciality
				+ ", consultationFee=" + consultationFee + ", ratings=" + ratings + ", experience=" + experience + "]";
	}
    
    
    
}
