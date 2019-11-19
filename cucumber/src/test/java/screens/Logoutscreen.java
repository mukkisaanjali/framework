package screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutscreen {
	
	@FindBy(id="welcome")
	private WebElement lnkwelcome=null;
	
	@FindBy(linkText = "Logout")
	private WebElement lnkLogout =null;
	
	public Logoutscreen(WebDriver driver) {
		PageFactory.initElements(driver,this);	}
	public void logout() {
		lnkwelcome.click();
		lnkLogout.click();
	}

}
