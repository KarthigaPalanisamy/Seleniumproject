package TestNGdemo;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class gmailIE {
	public static WebDriver driver;
	// TODO Auto-generated method stub
	
			 //Logger logger=Logger.getLogger("log4j");
		        
			 
		       // configure log4j properties file
		     
	@BeforeClass
	public void intializingBrowser(){
		System.out.println("Opening the IE browser");
		System.setProperty("webdriver.ie.driver", "F:/Karthiga/Testing Training/drivers/IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test(description="calling google in IE",alwaysRun=true)
	public void googleSearch2(){
		  //PropertyConfigurator.configure("Log4j.properties");
		Reporter.log("Calling google in IE");
		driver.get("https://www.google.com/");
	}
	@Test(description="calling yahoo in IE",enabled=true)
	public void yahooSearch2(){
		Reporter.log("Calling yahoo in IE");
		driver.get("https://www.yahoo.com/");
	}
	@Test(description="calling gmail in IE",enabled=true,dependsOnMethods="yahooSearch2")
	public void gmail2(){
		Reporter.log("Calling gmail in IE");
		driver.get("https://www.gmail.com/");
	}
	@AfterClass
	public void closingBrowser2(){
		System.out.println("Closing the IE browser");
		driver.quit();
	}
}
