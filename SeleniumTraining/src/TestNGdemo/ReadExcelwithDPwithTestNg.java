package TestNGdemo;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcelwithDPwithTestNg {
	
	@Test(dataProvider = "getData")
	public void LoginTest(String username, String password){
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.slideshare.net");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_password")).sendKeys(password);
		driver.findElement(By.id("login_from_loginpage")).click();
		driver.close();
		
	}
	
	@DataProvider
	public String[][] getData() throws Exception{
		File excel = new File("F:/Karthiga/Testing Training/excelfile/ReadExcelTestNG.xlsx");
		FileInputStream fis = new FileInputStream(excel);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		int rowNum = ws.getLastRowNum() +1;
		int colNum =ws.getRow(0).getLastCellNum();
		
		String[][] data = new String [rowNum][colNum];
		
		for(int i=1; i<rowNum; i++){
			XSSFRow row = ws.getRow(i);
			for(int j=0;j<colNum;j++){
				XSSFCell cell= row.getCell(j);
				String Value = cellToString(cell);
				data[i][j]= Value;
				
			}
			
		}
		return data;
	}
		
	public static String cellToString(XSSFCell cell){
		
		int type;
		Object result;
		type = cell.getCellType();
		
		switch(type){
			
		case 0://numeric Value in Excel
			result=cell.getNumericCellValue();
			
			break;
		
		case 1://String Value in Excel
			result=cell.getStringCellValue();
			break;
		default:
			throw new RuntimeException("There is no support for this type");
		}
		return result.toString();	
		}
	

}

