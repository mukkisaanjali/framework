package xpath;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Apachepoi {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\seliniumwork\\maven\\drivers\\chromedriver.exe");
		
		Workbook workbook= WorkbookFactory.create(new FileInputStream(new File("D:\\Book.xls")));
		System.out.println(workbook.getNumberOfSheets());
		Sheet sheet=workbook.getSheet("sheet1");
		for(Row row:sheet) {
			for(Cell col:row) {
				System.out.println(col+"\t");
			}
			workbook.close();
		}
		}

}
