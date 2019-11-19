package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttonactions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.cleartrip.com/");
     WebElement rboneway=driver.findElement(By.id("One way"));
     System.out.println(rboneway.isSelected());
     WebElement DepartDate=driver.findElement(By.id("DepartDate"));
     System.out.println(" Displayedstatus:"+DepartDate.isDisplayed());
     WebElement rbRoundtrip= driver.findElement(By.id("Round trip"));
     rbRoundtrip.click();
     System.out.println(rbRoundtrip.isSelected());
     System.out.println("Displayedststus:"+DepartDate.isDisplayed());
     Thread.sleep(1000);
     driver.quit();
}
}
