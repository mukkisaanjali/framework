package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.cleartrip.com/");
	List<WebElement>list=driver.findElements(By.xpath(" //input[@id='RoundTrip']"));
	System.out.println(list.size());
	Thread.sleep(1000);
	driver.quit();
		

	}

}
