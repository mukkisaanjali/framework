package automationTestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sun.org.apache.bcel.internal.generic.NEW;

import automationTestNG.core.Frameworkscript;
import automationTestNG.helper.Helper;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_01_CreateEmployee  extends Frameworkscript {
	WebDriver driver=null;
		
		@BeforeTest
		public void init() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			}
	
	@Test(dataProvider="getTestdata")	
	public void createEmployee(String userName,String password,String firstName,String lastName) throws Exception {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("firstName")).sendKeys(firstName);
		driver.findElement(By.id("lastName")).sendKeys(lastName);
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	
	}
	@AfterTest
	public void destroy() {
		driver.quit();
	}
	
	@DataProvider
	public  String[][] getTestData() throws Exception {
		String[][]data = null;
		Workbook workbook= WorkbookFactory.create(new FileInputStream(new File("D:\\Book1.xlsx")));
		Sheet sheet= workbook.getSheet("sheet1");
		data = new String[sheet.getPhysicalNumberOfRows()][sheet.getRow(0).getPhysicalNumberOfCells()];
		for(int rowIndex=0;rowIndex<sheet.getPhysicalNumberOfRows();rowIndex++) {
			for(int colIndex=0;colIndex<sheet.getRow(rowIndex).getPhysicalNumberOfCells();colIndex++) {
				data[rowIndex][colIndex]=sheet.getRow(rowIndex).getCell(colIndex).toString();
			}
		}
		workbook.close();
		return data;
	}
}
			
		
	

