package Log4j;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class log4j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Logger logger=Logger.getLogger("log4j");
	        
		 
	       // configure log4j properties file
	       PropertyConfigurator.configure("Log4j.properties");
	       System.setProperty("webdriver.gecko.driver","D:\\Karthiga\\Testing Training\\jar and war files\\jar\\drivers\\geckodriver.exe");
	 
	 
	        // Open browser
	        WebDriver driver = new FirefoxDriver();
	        logger.info("Browser Opened");
	      
	        // Set implicit wait
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        logger.info("Implicit wait given");
	      
	 
	        // Load application
	        driver.get("https://www.google.com");
	        logger.info("Url opened");
	      
	 
	       
	          
		driver.quit();
		logger.info("closing browser");
	}
}

	