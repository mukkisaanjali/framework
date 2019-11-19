package seliniumgrid;



import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Testscript1 {
	@Test
	public static void testMethod() throws Exception {
		DesiredCapabilities capabilities =new DesiredCapabilities();
		capabilities.setPlatform(Platform.WINDOWS);
		capabilities.setBrowserName("chrome");
		WebDriver driver= new RemoteWebDriver(new URL("http://192.168.0.102:4444/wd/hub"),capabilities);
		driver.manage().window().maximize();
		driver.get("https://www.thepancard.com/");
		Thread.sleep(2000);
		driver.quit();
	}

}
