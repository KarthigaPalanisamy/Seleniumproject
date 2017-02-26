package ActionAlertsFrames;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertScreenshot{
	public static WebDriver driver;
	@BeforeClass
	public void setUp(){
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		System.out.println("setup done");
		
		
	}
	@Test
	public void alertScreenshot() throws Exception{
		driver.findElement(By.id("loginbutton")).click();
		//captureScreenshot("AlertScreenshot");
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		String alertMsg=alert.getText();
		System.out.println("The alert Message is displayed:"+alertMsg);		
		alert.accept();
		//captureScreenshot("Alert");
		driver.findElement(By.id("usernameId")).sendKeys("hello");
		driver.findElement(By.id("loginbutton")).click();
		captureScreenshot("AlertScreenshot1");
		Thread.sleep(3000);
		Alert alert1=driver.switchTo().alert();
		String alertMsg1=alert1.getText();
		System.out.println("The alert Message is displayed:"+alertMsg1);		
		alert1.accept();
		//captureScreenshot("Alert");
		
		
	}
	public void captureScreenshot( String screenshotName) throws IOException 
	 
	   {
	        
	File ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	      
	 
		FileUtils.copyFile(ss, new File("F:/Karthiga/Testing Training" +screenshotName+".jpg"));
	

	    }


	@AfterClass
	public void tearDown(){
		driver.close();
		System.out.println("Closing the page");
	}
	

}
