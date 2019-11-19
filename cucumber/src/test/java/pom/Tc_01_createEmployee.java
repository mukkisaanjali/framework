package pom;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import automationTestNG.screens.BookaFlight;
import automationTestNG.screens.Flightfinder;
import automationTestNG.screens.Loginscreens;
import automationTestNG.screens.frameworkscript;

public class Tc_01_createEmployee extends frameworkscript {
	WebDriver driver=null;
	@Test
	public void bookATicket() throws Exception{
		driver.get("http://newtours.demoaut.com/");
		Loginscreens loginscreen = new Loginscreens(driver);
		loginscreen.login("mercury","mercury");
		Flightfinder finder = new Flightfinder(driver);
		finder.clickoncontinue();
		BookaFlight bookaticket= new BookaFlight(driver);
		bookaticket.enterDetails("srikrishna","A");
		
		
		
	}
}
		
		
		
		
	
	

