package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	UUID SectionID, StudentID, EnrollmentID;
	double Grade;
	
	private void Enrollment()
	{

	}
	
	private UUID Enrollment(int StudentID, int SectionID)
	{
		return EnrollmentID;

	}

	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}

	public double getGrade() {
		return Grade;
	}

	public void setGrade(double grade) {
		Grade = grade;
	}
	
}
