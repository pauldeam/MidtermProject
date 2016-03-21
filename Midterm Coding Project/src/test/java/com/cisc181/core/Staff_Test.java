package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.*;


public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() {
		ArrayList<Staff> staffTest= new ArrayList<Staff>();
		
		Staff a = new Staff(null);
		a.setSalary(100000);
		staffTest.add(a);
		
		Staff b = new Staff(null);
		b.setSalary(90000);
		staffTest.add(b);

		Staff c = new Staff(null);
		c.setSalary(85000);
		staffTest.add(c);
		
		Staff d = new Staff(null);
		d.setSalary(75000);
		staffTest.add(d);
		
		Staff e = new Staff(null);
		e.setSalary(70000);
		staffTest.add(e);
		
		double average = ((a.getSalary() + b.getSalary() + c.getSalary() + d.getSalary() + e.getSalary()) / 5);
		double actual = 84000;
				
				
		assertEquals(actual, average, .000000000001);
	}	

	@Test
	public void testPhoneNumber() {

		String ex = "666666";
		boolean caught = false;
		Staff member = new Staff(null);
		
		try {
			member.setPhone(ex);
		} catch (Exception e) {
			caught = true;
		}
		
		assertTrue(caught);
		
		
}
	
	private void setPhone(String string) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testDOB() {

		boolean caught = false;
		try {
			setDOB(1800, 2, 02);
		} catch (Exception e) {
			caught = true;
		}
		
		assertTrue(caught);
		
		
}

	private void setDOB(int i, int j, int k) {
		// TODO Auto-generated method stub
		
	}
}
