package screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Employeescreen {
	@FindBy(id="menu_pim_viewPimModule")
	private WebElement lnkpIM=null;
	@FindBy(id="menu_pim_addEmployee")
	private WebElement lnkAddEmployee=null;
	@FindBy(id="firstName")
	private WebElement txtfirstName=null;
	@FindBy(id="lastName")
	private WebElement txtLastName=null;
	@FindBy(id="btnSave")
	private WebElement btnSave=null;
	public Employeescreen(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void enterDetails(String firstName, String lastName) throws Exception {
		lnkpIM.click();
		Thread.sleep(1000);
		lnkAddEmployee.click();
		Thread.sleep(1000);
		txtfirstName.sendKeys(firstName);
		txtLastName.sendKeys(lastName);
		btnSave.click();
		
	}

}
