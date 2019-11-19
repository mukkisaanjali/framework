package automationTestNG.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookaFlight {
	@FindBy(name="passFirst0")
	private WebElement txtFirstName=null;
	@FindBy(name="password0")
	private WebElement txtLastName=null;
	@FindBy(name="buyflights")
private WebElement btnflights=null;
	@FindBy(linkText = "SIGN-OFF")
	private WebElement btnsignoff=null;
	public BookaFlight(WebDriver driver) {
		PageFactory.initElements(driver,this );
		
	}
	public void enterDetails(String firstName,String Lastname) {
		txtFirstName.sendKeys(firstName);
		txtLastName.sendKeys(Lastname);
		btnflights.click();
		btnsignoff.click();
	}
}
