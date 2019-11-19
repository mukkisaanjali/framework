package windows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandcarIndia {

	WebDriver driver=null;
	@org.testng.annotations.Test
	public void Test() {
		WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	driver.get("https://www.hondacarindia.com/");
	driver.findElement(By.xpath(" //i[@class='menuIcon serviceIcon']")).click();
	Set<String>windowsid=driver.getWindowHandles();
	for(String windowsids :windowsid) {
		System.out.println(windowsids);
		
	}
	
	

}

}