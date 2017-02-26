package selenium.errors.signup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class signupErrors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.ebay.com/");//getting ebay url
		driver.findElement(By.id("gh-ug-flex")).click();//clicking on the register using id
		WebElement emailele=driver.findElement(By.id("email"));
		//emailele.sendKeys("karthigap2@gmail.com");
		emailele.sendKeys("");
		//emailele.sendKeys("kk");
		//emailele.sendKeys("karthiga");
		WebElement remailele=driver.findElement(By.id("remail"));
		//remailele.sendKeys("karthigap2@gmail.com");
		remailele.sendKeys("");
		//remailele.sendKeys("karthigap@gmail.com");
		WebElement passele=driver.findElement(By.id("PASSWORD"));
		//passele.sendKeys("Selenium2016");
		passele.sendKeys("");
		//passele.sendKeys("12345");
		//passele.sendKeys("aaaaaaa");
		WebElement fname=driver.findElement(By.id("firstname"));
		//fname.sendKeys("Karthiga");
		fname.sendKeys("");
		WebElement lname=driver.findElement(By.id("lastname"));
		//lname.sendKeys("Palanisamy");
		lname.sendKeys("");
		//driver.findElement(By.id("phoneFlagComp1")).sendKeys("9013376173");
		driver.findElement(By.id("sbtBtn")).click();
		WebElement email=driver.findElement(By.id("email_w"));
		boolean emailerror=email.isDisplayed();
		WebElement remail=driver.findElement(By.id("remail_w"));
		boolean remailerror=remail.isDisplayed();
		WebElement password=driver.findElement(By.id("PASSWORD_w"));
		boolean passerror=password.isDisplayed();
		WebElement firstname=driver.findElement(By.id("firstname_w"));		
		boolean fnameerror=firstname.isDisplayed();
		WebElement lastname=driver.findElement(By.id("lastname_w"));
		boolean lnameerror=lastname.isDisplayed();
		WebElement error=driver.findElement(By.id("ertx"));
		boolean ertx=error.isDisplayed();
		if((emailerror||remailerror||passerror||fnameerror||lnameerror)==true){
			System.out.println(email.getText());
			System.out.println(remail.getText());
			System.out.println(password.getText());
			System.out.println(firstname.getText());
			System.out.println(lastname.getText());
			if(ertx==true){
				System.out.println(error.getText());
				System.out.println("--------------------------------------------");
				WebElement er_email=driver.findElement(By.id("er_email"));
				System.out.println("click:"+er_email.getText());
				er_email.click();
				emailele.sendKeys("karthigap2@gmail.com");
				WebElement er_remail=driver.findElement(By.id("er_remail"));
				System.out.println("click:"+er_remail.getText());
				er_remail.click();
				remailele.sendKeys("karthigap2@gmail.com");
				WebElement er_PASSWORD=	driver.findElement(By.id("er_PASSWORD"));
				System.out.println("click:"+er_PASSWORD.getText());
				er_PASSWORD.click();
				passele.sendKeys("Selenium2016");
				WebElement er_firstname=driver.findElement(By.id("er_firstname"));
				System.out.println("click:"+er_firstname.getText());
				er_firstname.click();
				fname.sendKeys("Karthiga");
				WebElement er_lastname=driver.findElement(By.id("er_lastname"));
				System.out.println("click:"+er_lastname.getText());
				er_lastname.click();
				lname.sendKeys("Palanisamy");
				driver.findElement(By.id("phoneFlagComp1")).sendKeys("9013376173");
				driver.findElement(By.id("sbtBtn")).click();
				System.out.println("after correcting the errors logged in successfully");
					
				
				
			}
					
		}
		else{
			driver.findElement(By.id("sbtBtn")).click();
			System.out.println("logged in successfully");
		}
	
		
		driver.close();//closing the webpage
	}

}
