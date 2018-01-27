package com.wellme.practice.model;

import com.wellme.common.User;

public class Patient extends User{
	private int patientId;
	private PreferredTime[] preferredTimes;
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public PreferredTime[] getPreferredTimes() {
		return preferredTimes;
	}
	public void setPreferredTimes(PreferredTime[] preferredTimes) {
		this.preferredTimes = preferredTimes;
	}
	
}
