package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	static ArrayList<Course> courses = new ArrayList<Course>();
	static ArrayList<Section> sections = new ArrayList<Section>();
	static ArrayList<Semester> semesters = new ArrayList<Semester>();
	static ArrayList<Student> students = new ArrayList<Student>();

	@BeforeClass
	public static void setup() {

		Course c1 = new Course("Accounting", 1, eMajor.BUSINESS);
		courses.add(c1);

		Course c2 = new Course("Chemistry 103", 2, eMajor.CHEM);
		courses.add(c2);

		Course c3 = new Course("CISC 181", 3, eMajor.COMPSI);
		courses.add(c3);

		// Semester Creation
		Calendar FallStart = Calendar.getInstance();
		FallStart.set(2015, 9, 1);

		Calendar FallEnd = Calendar.getInstance();
		FallEnd.set(2015, 12, 19);

		Calendar SpringStart = Calendar.getInstance();
		SpringStart.set(2016, 2, 8);

		Calendar SpringEnd = Calendar.getInstance();
		SpringEnd.set(2016, 5, 20);

		Semester Fall = new Semester(UUID.randomUUID(), FallStart.getTime(), FallEnd.getTime());
		semesters.add(Fall);

		Semester Spring = new Semester(UUID.randomUUID(), SpringStart.getTime(), SpringEnd.getTime());
		semesters.add(Spring);

		Section s1 = new Section(c2.getCourseID(), Fall.getSemesterID(), 1);
		semesters.add(s1);

		Section s2 = new Section(c1.getCourseID(), Fall.getSemesterID(), 2);
		semesters.add(s2);

		Section s3 = new Section(c1.getCourseID(), Fall.getSemesterID(), 3);
		semesters.add(s3);

		Section s4 = new Section(c1.getCourseID(), Spring.getSemesterID(), 4);
		semesters.add(s4);

		Section s5 = new Section(c1.getCourseID(), Spring.getSemesterID(), 5);
		semesters.add(s5);

		Section s6 = new Section(c1.getCourseID(), Spring.getSemesterID(), 6);
		semesters.add(s6);

		
		Calendar StudentBirth = Calendar.getInstance();
		StudentBirth.set(1997, 2, 13);

		Student st0 = new Student("Paul", "George", "Jureidini", StudentBirth.getTime(), eMajor.BUSINESS,
				"225 Roadroad Road", "666 666 6666", "yoyoyoyoyoma@udel.edu");
		students.add(st0);
		Student st1 = new Student("Paul", "George", "Jureidini", StudentBirth.getTime(), eMajor.BUSINESS,
				"225 Roadroad Road", "666 666 6666", "yoyoyoyoyoma@udel.edu");
		students.add(st1);
		Student st2 = new Student("Paul", "George", "Jureidini", StudentBirth.getTime(), eMajor.BUSINESS,
				"225 Roadroad Road", "666 666 6666", "yoyoyoyoyoma@udel.edu");
		students.add(st2);
		Student st3 = new Student("Paul", "George", "Jureidini", StudentBirth.getTime(), eMajor.BUSINESS,
				"225 Roadroad Road", "666 666 6666", "yoyoyoyoyoma@udel.edu");
		students.add(st3);
		Student st4 = new Student("Paul", "George", "Jureidini", StudentBirth.getTime(), eMajor.BUSINESS,
				"225 Roadroad Road", "666 666 6666", "yoyoyoyoyoma@udel.edu");
		students.add(st4);
		Student st5 = new Student("Paul", "George", "Jureidini", StudentBirth.getTime(), eMajor.BUSINESS,
				"225 Roadroad Road", "666 666 6666", "yoyoyoyoyoma@udel.edu");
		students.add(st5);
		Student st6 = new Student("Paul", "George", "Jureidini", StudentBirth.getTime(), eMajor.BUSINESS,
				"225 Roadroad Road", "666 666 6666", "yoyoyoyoyoma@udel.edu");
		students.add(st6);
		Student st7 = new Student("Paul", "George", "Jureidini", StudentBirth.getTime(), eMajor.BUSINESS,
				"225 Roadroad Road", "666 666 6666", "yoyoyoyoyoma@udel.edu");
		students.add(st7);
		Student st8 = new Student("Paul", "George", "Jureidini", StudentBirth.getTime(), eMajor.BUSINESS,
				"225 Roadroad Road", "666 666 6666", "yoyoyoyoyoma@udel.edu");
		students.add(st8);
		Student st9 = new Student("Paul", "George", "Jureidini", StudentBirth.getTime(), eMajor.BUSINESS,
				"225 Roadroad Road", "666 666 6666", "yoyoyoyoyoma@udel.edu");
		students.add(st9);

	}

	@Test
	public void testOne() {


		Enrollment e5 = new Enrollment(students.get(5).getStudentID(), students.get(5).getSectionID());
		e5.setGrade(64.00);

		Enrollment e6 = new Enrollment(students.get(6).getStudentID(), students.get(0).getSectionID());
		e6.setGrade(99.00);

		Enrollment e7 = new Enrollment(students.get(7).getStudentID(), students.get(1).getSectionID());
		e7.setGrade(55.00);

		Enrollment e8 = new Enrollment(students.get(8).getStudentID(), students.get(2).getSectionID());
		e8.setGrade(85.00);

		Enrollment e9 = new Enrollment(students.get(9).getStudentID(), students.get(3).getSectionID());
		e9.setGrade(78.00);
		
		Enrollment e0 = new Enrollment(students.get(0).getStudentID(), students.get(0).getSectionID());
		e0.setGrade(89.00);

		Enrollment e1 = new Enrollment(students.get(1).getStudentID(), students.get(1).getSectionID());
		e1.setGrade(75.00);

		Enrollment e2 = new Enrollment(students.get(2).getStudentID(), students.get(2).getSectionID());
		e2.setGrade(90.00);

		Enrollment e3 = new Enrollment(students.get(3).getStudentID(), students.get(3).getSectionID());
		e3.setGrade(93.00);

		Enrollment e4 = new Enrollment(students.get(4).getStudentID(), students.get(4).getSectionID());
		e4.setGrade(46.00);

		
		double GPA0 = ((e0.getGrade() / 100) * (courses.get(0).getGradePoints() * 4)) / courses.get(0).getGradePoints();
		double GPA1 = ((e1.getGrade() / 100) * (courses.get(1).getGradePoints() * 4)) / courses.get(1).getGradePoints();
		double GPA2 = ((e2.getGrade() / 100) * (courses.get(2).getGradePoints() * 4)) / courses.get(2).getGradePoints();
		double GPA3 = ((e3.getGrade() / 100) * (courses.get(0).getGradePoints() * 4)) / courses.get(0).getGradePoints();
		double GPA4 = ((e4.getGrade() / 100) * (courses.get(1).getGradePoints() * 4)) / courses.get(1).getGradePoints();
		double GPA5 = ((e5.getGrade() / 100) * (courses.get(2).getGradePoints() * 4)) / courses.get(2).getGradePoints();
		double GPA6 = ((e6.getGrade() / 100) * (courses.get(0).getGradePoints() * 4)) / courses.get(0).getGradePoints();
		double GPA7 = ((e7.getGrade() / 100) * (courses.get(1).getGradePoints() * 4)) / courses.get(1).getGradePoints();
		double GPA8 = ((e8.getGrade() / 100) * (courses.get(2).getGradePoints() * 4)) / courses.get(2).getGradePoints();
		double GPA9 = ((e9.getGrade() / 100) * (courses.get(0).getGradePoints() * 4)) / courses.get(0).getGradePoints();

		assertEquals(3.56, GPA0, 0);
		assertEquals(3.00, GPA1, 0);
		assertEquals(3.60, GPA2, 0);
		assertEquals(3.72, GPA3, 0);
		assertEquals(1.84, GPA4, 0);
		assertEquals(2.56, GPA5, 0);
		assertEquals(3.96, GPA6, 0);
		assertEquals(2.20, GPA7, 0);
		assertEquals(3.40, GPA8, 0);
		assertEquals(3.12, GPA9, 0);

		
		double CourseOneAvg = (e0.getGrade() + e3.getGrade() + e6.getGrade() + e9.getGrade()) / 4;
		CourseOneAvg = Math.round(CourseOneAvg * 100.00) / 100.00;

		double CourseTwoAvg = (e1.getGrade() + e4.getGrade() + e7.getGrade()) / 3;
		CourseTwoAvg = Math.round(CourseTwoAvg * 100.00) / 100.00;

		double CourseThreeAvg = (e2.getGrade() + e5.getGrade() + e8.getGrade()) / 3;
		CourseThreeAvg = Math.round(CourseThreeAvg * 100.00) / 100.00;

		assertEquals(89.75, CourseOneAvg, 0);
		assertEquals(58.67, CourseTwoAvg, 0);
		assertEquals(79.67, CourseThreeAvg, 0);

	}

	@Test
	public void  changeMajor() {

		
		students.get(2).setMajor(eMajor.PHYSICS);
		assertTrue(students.get(0).getMajor() == "PHYSICS");

	}

}