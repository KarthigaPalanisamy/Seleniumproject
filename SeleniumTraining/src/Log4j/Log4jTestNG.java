package Log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Log4jTestNG {
	WebDriver driver;
	static Logger logger=Logger.getLogger(Log4jTestNG.class);
  @Test
  public void f() {
	  //setting propert for log4j
	  PropertyConfigurator.configure("Log4j.properties");
	  System.setProperty("webdriver.gecko.driver","D:\\Karthiga\\Testing Training\\jar and war files\\jar\\drivers\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  logger.info("Intiating browser");
	  driver.manage().window().maximize();
	  logger.info("maximizing window");
	  driver.get("http://www.google.com");
	  logger.info("oppwning google page");
	  Reporter.log("Opening Google page succesfull");
	  driver.quit();
	  logger.info("closing browser");
  }
}
