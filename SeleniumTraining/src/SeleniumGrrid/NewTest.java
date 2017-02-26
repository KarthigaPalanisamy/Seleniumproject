package SeleniumGrrid;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class NewTest {
  @Test
  public void f() throws MalformedURLException {
	// We have to mention browser which we want to use for test execution
	  //System.setProperty("webdriver.gecko.driver","D:\\Karthiga\\Testing Training\\jar and war files\\jar\\drivers\\geckodriver.exe");
	  DesiredCapabilities cap=DesiredCapabilities.firefox();
	 // DesiredCapabilities cap1=DesiredCapabilities.firefox();
	   
	  // Set the platform where we want to run our test- we can use MAC and Linux and other platforms as well
	  cap.setPlatform(Platform.WINDOWS);
	   
	  // Here you can use hub address, hub will take the responsibility to execute the test on respective node
	  URL url=new URL("http://localhost:4444/wd/hub");
	   
	  // Create driver with hub address and capability
	  WebDriver driver=new RemoteWebDriver(url, cap);
	   
	  // start application
	  driver.get("http://www.google.com");
	   
	 
	   
	  driver.close();
  }
}
