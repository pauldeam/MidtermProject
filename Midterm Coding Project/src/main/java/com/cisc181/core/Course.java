package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {

	UUID CourseID;
	String CourseName;
	int GradePoints;
	private eMajor Major;
	
	
	public Course() {
		// TODO Auto-generated constructor stub
	}
	
	public eMajor getMajor() {
		return Major;
	}
	public void setMajor(eMajor major) {
		Major = major;
	}
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getGradePoints() {
		return GradePoints;
	}
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}
	
	
}
