package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		ArrayList<Course> course = new ArrayList<Course>();
		
		Course a = new Course("Marketing", 3, eMajor.BUSINESS);
		course.add(a);
		Course b = new Course("Physics 207", 4, eMajor.PHYSICS);
		course.add(b);
		Course c = new Course("CISC 181", 3, eMajor.COMPSI);
		course.add(c);
		
		
		ArrayList<Semester> semesters = new ArrayList<Semester>();
		Semester d = new Semester("Fall");
		semesters.add(d);
		Semester e = new Semester("Spring");
		semesters.add(e);
		
		
		ArrayList<Section> section = new ArrayList<Section>();
		Section f = new Section(1, Course(course), Semester(semesters));
		section.add(f);
		Section g = new Section(2, Course(course), Semester(semesters));
		section.add(g);
		
		Calendar birthDate = Calendar.getInstance();
		ArrayList<Student> student = new ArrayList<Student>();
		Student s1 = new Student("Paul", "George", "Jureidini" , birthDate.set(1995, 4, 26), eMajor.COMPSI,
				"66 West Cle Ave.", "6666666666", "pauldeam@udel.edu");
		student.add(s1);
		Student s2 = new Student("Paul", "George", "Jureidini" , birthDate.set(1995, 4, 26), eMajor.COMPSI,
				"66 West Cle Ave.", "6666666666", "pauldeam@udel.edu");
		student.add(s2);
		Student s3 = new Student("Paul", "George", "Jureidini" , birthDate.set(1995, 4, 26), eMajor.COMPSI,
				"66 West Cle Ave.", "6666666666", "pauldeam@udel.edu");
		student.add(s3);
		Student s4 = new Student("Paul", "George", "Jureidini" , birthDate.set(1995, 4, 26), eMajor.COMPSI,
				"66 West Cle Ave.", "6666666666", "pauldeam@udel.edu");
		student.add(s4);
		Student s5 = new Student("Paul", "George", "Jureidini" , birthDate.set(1995, 4, 26), eMajor.COMPSI,
				"66 West Cle Ave.", "6666666666", "pauldeam@udel.edu");
		student.add(s5);
		Student s6 = new Student("Paul", "George", "Jureidini" , birthDate.set(1995, 4, 26), eMajor.COMPSI,
				"66 West Cle Ave.", "6666666666", "pauldeam@udel.edu");
		student.add(s6);
		Student s7 = new Student("Paul", "George", "Jureidini" , birthDate.set(1995, 4, 26), eMajor.COMPSI,
				"66 West Cle Ave.", "6666666666", "pauldeam@udel.edu");
		student.add(s7);
		Student s8 = new Student("Paul", "George", "Jureidini" , birthDate.set(1995, 4, 26), eMajor.COMPSI,
				"66 West Cle Ave.", "6666666666", "pauldeam@udel.edu");
		student.add(s8);
		Student s9 = new Student("Paul", "George", "Jureidini" , birthDate.set(1995, 4, 26), eMajor.COMPSI,
				"66 West Cle Ave.", "6666666666", "pauldeam@udel.edu");
		student.add(s9);
		Student s10 = new Student("Paul", "George", "Jureidini" , birthDate.set(1995, 4, 26), eMajor.COMPSI,
				"66 West Cle Ave.", "6666666666", "pauldeam@udel.edu");
		student.add(s10);
		
		
		
	}

	private static Object Semester(ArrayList<Semester> semesters) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object Course(ArrayList<Course> course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	public void test() {
		
		double gpa1 = 3.50;
		double gpa2 = 3.12;
		ArrayList<Enrollment> enrollList = new ArrayList<Enrollment>();
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
			Enrollment newEnroll = new Enrollment(student.get(j).getStudentID(), section.get(i).getSectionID());
			enrollList.add(newEnroll);
			}
		}
		
		assertEquals(enrollList.get(0).getGrade(), gpa1, .0001);
		assertEquals(enrollList.get(1).getGrade(), gpa1, .0001);
		assertEquals(enrollList.get(2).getGrade(), gpa1, .0001);
		assertEquals(enrollList.get(3).getGrade(), gpa1, .0001);
		assertEquals(enrollList.get(4).getGrade(), gpa1, .0001);
		assertEquals(enrollList.get(5).getGrade(), gpa2, .0001);
		assertEquals(enrollList.get(6).getGrade(), gpa2, .0001);
		assertEquals(enrollList.get(7).getGrade(), gpa2, .0001);
		assertEquals(enrollList.get(8).getGrade(), gpa2, .0001);
		assertEquals(enrollList.get(9).getGrade(), gpa2, .0001);
		
		for (int i = 0; i < (enrollList.size()/2); i++) {
			enrollList.get(i).setGrade(85.00);
		}
		
		for (int i = (enrollList.size()/2); i < enrollList.size(); i++) {
			enrollList.get(i).setGrade(80.00);
		}
		
		assertEquals(enrollList.get(0).getGrade(), gpa1, .0001);
		assertEquals(enrollList.get(1).getGrade(), gpa1, .0001);
		assertEquals(enrollList.get(2).getGrade(), gpa1, .0001);
		assertEquals(enrollList.get(3).getGrade(), gpa1, .0001);
		assertEquals(enrollList.get(4).getGrade(), gpa1, .0001);
		assertEquals(enrollList.get(5).getGrade(), gpa2, .0001);
		assertEquals(enrollList.get(6).getGrade(), gpa2, .0001);
		assertEquals(enrollList.get(7).getGrade(), gpa2, .0001);
		assertEquals(enrollList.get(8).getGrade(), gpa2, .0001);
		assertEquals(enrollList.get(9).getGrade(), gpa2, .0001);
		
		
		student.get(0).setMajor(eMajor.CHEM);
		assertTrue(student.get(0).getMajor() == eMajor.CHEM);
	}
}