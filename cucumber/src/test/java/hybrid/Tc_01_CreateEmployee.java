package hybrid;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automationTestNG.core.Frameworkscript;
import automationTestNG.helper.Helper;
import screens.Employeescreen;
import screens.Loginscreen;
import screens.Logoutscreen;

public class Tc_01_CreateEmployee extends Frameworkscript {

	@Test(dataProvider="getTestData")
	public void createEmployee(String userName,String password,String firstName,String LastName) throws Exception {
		driver .get("https://opensource-demo.orangehrmlive.com/");
		Loginscreen loginscreen= new Loginscreen(driver) ;
			loginscreen.login(userName,password);
			Employeescreen employeescreen=new Employeescreen(driver);
			employeescreen.enterDetails(firstName,LastName);
			Logoutscreen lgoutscreen =new Logoutscreen(driver);
					lgoutscreen.logout();
					
	}
		
		@DataProvider
		public String[][] getTestData() throws Exception {
			return Helper.getTestData();
			
			
		}
	}


