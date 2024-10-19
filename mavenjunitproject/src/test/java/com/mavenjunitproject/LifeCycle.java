package com.mavenjunitproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
/*
@BeforeClass – Run once before any of the test methods in the class, 
public static void
@AfterClass – Run once after all the tests in the class have been run, public static void
@Before – Run before @Test, public void
@After – Run after @Test, public void
@Test – This is the test method to run, public void
@Ignore
  
 */
//@DisplayName("Test lifecycle")
public class LifeCycle {
	
	@Test(timeout = 400)
	public void test1() {
		System.out.println("Test1");
	}
	@Test(timeout = 4000)
	public void test2() {
		System.out.println("Test2");
	}
//	@Test(timeout = 1000)
//	public void test3() {
//		System.out.println("Test3");
//	}
//	@Test(timeout = 100)
//	@DisplayName("Custom test name containing spaces")
//	public void test4() {
//		System.out.println("Test4");
//	}
	@Ignore
	@Test(timeout = 100)
	public void test5() {
		System.out.println("Test5");
	}
	@Before
	public void beforeEachTest() {
		System.out.println("beforeEachTest");
	}
	@BeforeClass
	public static void beforeTest() {
		System.out.println("before Test :Only run once");
	}
	@AfterClass
	public static void afterClassMethod() {
		System.out.println("after Test :Only run once");
	}
	@After
	public void afterEachTest() {
		System.out.println("afterEachTest");
	}


}


