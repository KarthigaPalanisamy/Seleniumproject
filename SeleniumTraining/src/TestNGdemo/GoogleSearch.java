package TestNGdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearch {
	public static WebDriver driver;
	@BeforeClass
	public void intializingBrowser(){
		System.out.println("Opening the firefox browser");
	
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test(description="calling google in firefox",priority=3)
	public void googleSearch(){
		driver.get("https://www.google.com/");
		Reporter.log("Calling google in firefox");
		driver.findElement(By.id("lst-ib")).sendKeys("Hello");
		System.out.println("google inside");
	}
	@Test(description="calling yahoo in firefox",priority=1)
	public void yahooSearch(){
		driver.get("https://www.yahoo.com/");
		Reporter.log("Calling yahoo in firefox");
		System.out.println("yahoo method");
	}
	@Test(description="calling gmail in firefox",priority=2)
	public void gmail(){
		driver.get("https://www.gmail.com/");
		Reporter.log("Calling gmail in firefox");
		System.out.println("gmail method");
	}
	@AfterClass
	public void closingBrowser(){
		System.out.println("Closing the firefoxbrowser");
		driver.quit();
	}
}
