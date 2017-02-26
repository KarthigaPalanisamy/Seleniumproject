package testNGpackage;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class testClass {
  private WebDriver driver;
  @BeforeClass
  public void setUp() throws Exception {
	 System.setProperty("webdriver.gecko.driver","D:\\Karthiga\\Testing Training\\jar and war files\\jar\\drivers\\geckodriver.exe");
    driver = new FirefoxDriver();
  }
// Search using keyword through Google search

  @Test
  public void testtestclass() throws Exception {
        //Open Home Page
        driver.get("http://www.google.com");
        //Enter text in search box
        driver.findElement(By.name("q")).sendKeys("selenium");
        //Thread.sleep(1000);
        //Click Search button
        driver.findElement(By.name("btnG")).click();
       // Thread.sleep(10000);
        System.out.println(driver.getTitle());
  }

  @AfterClass
  public void tearDown() throws Exception {
    driver.quit();
    }
  }