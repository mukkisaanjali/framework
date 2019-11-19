package steps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinations {
	WebDriver driver =null;
	@Given("open browser and enter url")
	public void open_browser_and_enter_url() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com/");

  }

	@When("enter username,password and clickon signin")
	public void enter_username_password_and_clickon_signin() throws Exception, FileNotFoundException, IOException {
		Workbook workbook= WorkbookFactory.create(new FileInputStream(new File("")));
	   }

	@Then("user login into application")
	public void user_login_into_application() {
	    }

	@When("user clickon signoff")
	public void user_clickon_signoff() {
	   }

	@Then("user logout from application")
	public void user_logout_from_application() {
	   }


}