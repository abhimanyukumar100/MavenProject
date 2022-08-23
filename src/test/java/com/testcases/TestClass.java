package com.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.utility.ObjectInitialization;

public class TestClass extends ObjectInitialization{
	
	
	 public TestClass() {
		 super();
		 
	 }
	
	@BeforeTest  
	public void beforeTest() {    
	System.out.println("before test");  
	}   
	@Test
	public void test() {
		System.out.println(" test");
		pgclass.search();
	}
	@AfterTest  
	public void afterTest() {  
	driver.quit();  
	System.out.println("after test");  
	}         

}
