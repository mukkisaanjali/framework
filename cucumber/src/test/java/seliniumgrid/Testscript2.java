package seliniumgrid;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Testscript2 {
	@Test
   public static void testMethod() throws Exception {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.way2sms.com/");
		TakesScreenshot takesScreenshot= (TakesScreenshot)driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File source1 = new File("D:\\Anjali.PNG");
		FileHandler.copy(source, source1);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
