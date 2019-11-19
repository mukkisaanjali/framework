package screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginscreen {
	@FindBy(id="txtUsername")
	private WebElement txtUsername=null;
	@FindBy(id="txtPassword")
	private WebElement txtPassword=null;
	@FindBy (id="btnLogin")
    private WebElement btnLogin=null;
	@FindBy(id="btnSave")
	private WebElement btnSave = null;
	
	public Loginscreen(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void login(String userName,String password) {
		txtUsername .sendKeys(userName);
		txtPassword.sendKeys(password);
		btnLogin.click();
		
	}
}
