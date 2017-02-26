package selenium.slideshare.isdisplayed.isenabled.check;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class displayed_enabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a new instance 
		WebDriver driver = new FirefoxDriver();
		//maximize the browser window
		driver.manage().window().maximize();
		//getting the URL
		driver.get("http://www.slideshare.net/");
		//Title of the current page
		System.out.println(driver.getTitle());
		//creating webelement for login button
		WebElement element=driver.findElement(By.id("login"));
		//checking login button isDisplayed or not
		boolean loginbutton= element.isDisplayed();
				if(loginbutton==true)
		{
			System.out.println("Login Button is Displayed");
		}
		else
		{
			System.out.println("Login Button is not displayed");
		}
		//checking login button isEnabled or not
		boolean loginbtn=element.isEnabled();
		if(loginbtn==true){
			System.out.println("Login Button is enabled");
			//clicking the login button if it is enabled
			element.click();
			//getting current url after clicking login button
			System.out.println("Current Url is:" +driver.getCurrentUrl());
		}
		else{
			System.out.println("Login Button is not enabled");
			
		}
		//typing username
		driver.findElement(By.id("user_login")).sendKeys("karthigap2@gmail.com");
		//typing password
		driver.findElement(By.id("user_password")).sendKeys("123456");
		//clicking login button
		driver.findElement(By.id("login_from_loginpage")).click();
		//driver.findElement(By.className("j-button-label")).click();
		//creating webelemnt for error message
		 WebElement errmsg=driver.findElement(By.xpath("//html/body/div[2]/div/div[3]/form/fieldset/div[3]"));
		System.out.println(errmsg);
		//checking errmsg is displayed or not
		boolean enabled=errmsg.isEnabled();
		if(enabled==true){
			System.out.println(errmsg.getText());
		}
		else{
			System.out.println("no error");
		}
		//closing the current page
		driver.close();

	}

}
