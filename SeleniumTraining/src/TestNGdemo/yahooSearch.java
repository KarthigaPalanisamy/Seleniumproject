package TestNGdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class yahooSearch  {
	public static WebDriver driver;
	@BeforeClass
	public void intializingBrowser(){
		System.out.println("Opening the Chrome browser");
		System.setProperty("webdriver.chrome.driver", "F:/Karthiga/Testing Training/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test(description="calling google in chrome",dependsOnMethods="yahooSearch1")
	public void googleSearch1(){
		driver.get("https://www.google.com/");
		Reporter.log("Calling google in chrome");
		System.out.println("google inside");
	}
	@Test(description="calling yahoo in chrome")
	public void yahooSearch1(){
		driver.get("https://www.yahoo.com/");
		Reporter.log("Calling yahoo in chrome");
		System.out.println("yahoo inside");
	}
	@Test(description="calling gmail in chrome",enabled=false)
	public void gmail1(){
		driver.get("https://www.gmail.com/");
		Reporter.log("Calling gmail in chrome");
		System.out.println("gmail inside");
	}
	@AfterClass
	public void closingBrowser1(){
		System.out.println("Closing the chrome browser");
		driver.quit();
	}
}
