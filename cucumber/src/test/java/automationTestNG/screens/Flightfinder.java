package automationTestNG.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flightfinder {
	@FindBy(name="findflights")
	private WebElement btncontinue=null;
	@FindBy(name="reserveFlights")
	private WebElement cntinue=null;
	public Flightfinder(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void clickoncontinue() {
		btncontinue.click();
		cntinue.click();
		
	}
	

}
