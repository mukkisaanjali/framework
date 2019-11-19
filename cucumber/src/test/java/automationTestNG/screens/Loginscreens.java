package automationTestNG.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginscreens{
		@FindBy(name="userName")
		private  WebElement txtUserName=null;
		@FindBy(name="password")
		private WebElement txtPassword=null;
		@FindBy(name="login")
		private  WebElement btnlogin=null;
		public Loginscreens(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		public  void login(String userName,String password) {
			txtUserName.sendKeys(userName);
			txtPassword.sendKeys(password);
			btnlogin.click();
		}
		
	}
	


