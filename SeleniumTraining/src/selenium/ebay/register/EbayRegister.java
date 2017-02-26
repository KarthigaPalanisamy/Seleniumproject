package selenium.ebay.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayRegister {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","D:\\Karthiga\\Testing Training\\jar and war files\\jar\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//System.out.println(driver.getCurrentUrl());
		driver.get("https://www.ebay.com");
		Thread.sleep(1000);
		
		System.out.println(driver.getPageSource());
		driver.findElement(By.linkText("register")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("karthigap2@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("remail")).sendKeys("karthigap2@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("PASSWORD")).sendKeys("Selenium2016");
		Thread.sleep(1000);
		driver.findElement(By.id("firstname")).sendKeys("Karthiga");
		Thread.sleep(1000);
		driver.findElement(By.id("lastname")).sendKeys("Palanisamy");
		Thread.sleep(1000);
		driver.findElement(By.id("phoneFlagComp1")).sendKeys("9013376173");
		Thread.sleep(1000);
		driver.findElement(By.id("sbtBtn")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("phoneFlagComp1")).sendKeys(arg0);
		driver.quit();

	}

}
