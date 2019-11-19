package automationTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testscript1 {
	@BeforeSuite
	public void beforesuite() {
	
		System.out.println("beforesuite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforemethod");
	}
	@Test
	public void testmethod() {
		System.out.println(" testmethod");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
		
	}
	

}

