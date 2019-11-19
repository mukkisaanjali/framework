package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		WebElement btnsearch=driver.findElement(By.id("gi_search_btn"));
		System.out.println(btnsearch.getText());
		Thread.sleep(2000);
		driver.quit();

	}

}
