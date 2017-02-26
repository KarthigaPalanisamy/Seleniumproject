package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class highlights {
	public static void main(String []args){
		 
		 
		WebDriver driver=new FirefoxDriver();
		 
		driver.manage().window().maximize();
		 
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("link-signup")).click();
		 
		 
		// Inspect element
		WebElement fname= driver.findElement(By.id("FirstName")); 		 
		// Call reuse method
		javaExecutor.highLight(driver, fname);
	    WebElement lname=driver.findElement(By.id("LastName"));
	    javaExecutor.highLight(driver, lname);
	    WebElement email=driver.findElement(By.id("GmailAddress"));
	    javaExecutor.highLight(driver, email);
	    WebElement password=driver.findElement(By.id("Passwd"));
	    javaExecutor.highLight(driver, password);
	    WebElement rpassword=driver.findElement(By.id("PasswdAgain"));
	    javaExecutor.highLight(driver, rpassword);
	    WebElement bmonth=driver.findElement(By.id("BirthMonth"));
	    javaExecutor.highLight(driver, bmonth);
	    WebElement bday=driver.findElement(By.id("BirthDay"));
	    javaExecutor.highLight(driver, bday);
	    WebElement byear=driver.findElement(By.id("BirthYear"));
	    javaExecutor.highLight(driver, byear);
	    WebElement gender=driver.findElement(By.id("Gender"));
	    javaExecutor.highLight(driver, gender);
	    WebElement phnumber=driver.findElement(By.id("RecoveryPhoneNumber"));
	    javaExecutor.highLight(driver, phnumber);
	    WebElement recoveryemail=driver.findElement(By.id("RecoveryEmailAddress"));
	    javaExecutor.highLight(driver, recoveryemail);
	    WebElement country=driver.findElement(By.id(":h"));
	    javaExecutor.highLight(driver, country);
	    WebElement submit=driver.findElement(By.id("submitbutton"));
	    javaExecutor.highLight(driver, submit);
		 
		 
		 
		 
		}

}
