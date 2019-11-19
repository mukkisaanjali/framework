package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textfield {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apsrtconline.com/");
		WebElement list=driver.findElement(By.xpath("//input[@id='toPlaceName']"));
		System.out.println(list.getSize());
		Thread.sleep(2000);
		driver.quit();
	}

}
