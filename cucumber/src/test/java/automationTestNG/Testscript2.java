package automationTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testscript2 {
WebDriver driver= null;
@BeforeTest
public void openBrowser() {
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
}
@BeforeMethod
public void login() {
	driver.get("http://newtours.demoaut.com/");
	driver.findElement(By.name("userName")).sendKeys("mercury");
	driver.findElement(By.name("password")).sendKeys("mercury");
	driver.findElement(By.name("login")).click();
}
@Test
public void bookATicket() {
	driver.findElement(By.name("findFlights")).click();
	driver.findElement(By.name("reserveFlights")).click();
	driver.findElement(By.name("buyFlights")).click();
}
@AfterMethod
public void logoff() {
	driver.findElement(By.linkText("SIGN-OFF")).click();
}
@AfterTest
public void closeBrowser() throws Exception {
	Thread.sleep(1000);
	driver.quit();
	
	
}
}
