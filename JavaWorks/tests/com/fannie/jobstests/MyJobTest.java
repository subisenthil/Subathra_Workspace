package com.fannie.jobstests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fannie.jobs.MyJob1;

public class MyJobTest {
	// this method will be invoke before every @Test
	// null
	MyJob1 mj;
	List<String> myt = new ArrayList<String>();

	@Before
	public void setUp() {
		System.out.println("I am from before: ");
		mj = new MyJob1();
	//	myt = new 
	}

	@After
	public void tearDown() {
		System.out.println("I am from after: ");
	}

	@Test
	public void test() {

		boolean flag = mj.insertEmp(1);
		assertEquals(true, flag);
		System.out.println("I am from test: ");
	}

	@Test
	public void test1() {

		int num1 = mj.getNumberOfEmps();
		// boolean flag = myjob.insertEmp(1);
		System.out.println("I am from test: ");
		assertEquals(5, num1);
	}

	@Test(timeout= 1000)
	public void countEmpTest() {
		assertEquals(5, mj.getNumberOfEmps());
		System.out.println("I am from test: ");

	}
	
	@Test
	public void getMyEmpsTest() {
		assertEquals(0, (myt.size()));
		System.out.println("The test is pass for array ");

	}
	
	@Test
	public void getMyEmpsTest1() {
		assertEquals(2, (myt.size()));
		System.out.println("The test is Fail for array ");

	}
}
