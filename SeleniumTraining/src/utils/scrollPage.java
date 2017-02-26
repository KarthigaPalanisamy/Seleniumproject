package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scrollPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mozilla.org/en-US/");
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		((JavascriptExecutor) driver).executeScript("scroll(0,500)");

	}

}
