package TestNGdemo;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DataDrivencallUtility extends ExcelUtilities {
	
	public static String[][] data;
	public static WebDriver driver;
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
String excelInput = new String("F:/Karthiga/Testing Training/excelfile/ReadExcelTestNG.xlsx");
String excelOutput = new String("F:/Karthiga/Testing Training/excelfile/WriteExcelTestNG.xlsx");

	System.out.println("starting to read from excel");
	data = ReadExcelData(excelInput,"Sheet1");
	System.out.println("in Process of reading");
	
		String username= null;
		String password= null;
		
		for(int i=1;i<rowNum;i++){
			username =data[i][0];
			password=data[i][1];
			
			// Calling setUp() method
			setUp();
			
			//Calling Login
			LoginTestData(username,password);
			
			boolean testResult = verifyResult();
			if(testResult){
				setCellData(excelOutput,"pass",i,2);}
				else
				{
					ExcelUtilities.setCellData(excelOutput,"Fail",i,2);;
				}
			//Closing
			tearDown();
			
			
			}
		}
	
	public static void setUp(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.slideshare.net");
		System.out.println("SetUp Done");
		
	}
	
	public static void LoginTestData(String username, String password){
		
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.name("user_login")).sendKeys(username);
		driver.findElement(By.id("user_password")).sendKeys(password);
		driver.findElement(By.id("login_from_loginpage")).click();	
		System.out.println("LoginTest Done");
	}
	
	public static boolean verifyResult(){
		if(driver.findElement(By.xpath(".//*[@id='login-form']/fieldset/div[3]")).isEnabled()){
		return true;
	}
		else{
		return false;
		}}

	public static void tearDown(){
	driver.close();	
	}

}

