package differentbrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multipleMethod {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new FirefoxDriver();
		setup();
		search();
		teardown();
		

	}

	private static void teardown() {
		// TODO Auto-generated method stub
		System.out.println("time for quit");
		driver.quit();
		
	}

	public static void search() {
		// TODO Auto-generated method stub
		driver.findElement(By.id("lst-ib")).sendKeys("Kathirvel Kandasamy");
		driver.findElement(By.xpath("//*[@id='sblsbb']/button")).click();
		
	}

	public static void setup() {
		// TODO Auto-generated method stub
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		
	}
	

}
