package com.bd;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExamples{
	 @Test ( priority = 0 )
	public void Test1() {
		    System.out.println("Test 1");
	     }
	 @Test ( priority = 1 )
	 public void Test2 () {
		 System.out.println("Test 2");
	 }
	 @Test ( priority = 2 )
	 public void Test3 () {
		 System.out.println("Test 3"); 
	 }
	 @BeforeSuite
     public void beforeSuite() {
	    System.out.println("Before Suite");
     }
	 @AfterSuite
     public void afterSuite() {
 	    System.out.println("After Suite");
      }
	 @BeforeTest
     public void beforetest() {
	    System.out.println("Before Test");
     }
	 @AfterTest
     public void afteretest() {
	    System.out.println("After Test");
	 }
	 @BeforeClass
     public void beforeclass() {
	    System.out.println("Before Class");
     }
	 @AfterClass
     public void afterclass() {
	    System.out.println("After Class");
	 }
	 @BeforeMethod
	 public void beforemethod() {
		    System.out.println("Before Method");
		    }
	 @AfterMethod
     public void aftermethod() {
	    System.out.println("After Method");
	    }
	 }
