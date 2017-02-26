package selenium.ebay.register;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class webelementkdevi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		//verifying enabled
		WebElement signbtn = driver.findElement(By.linkText("Sign in"));
		System.out.println(signbtn.isDisplayed());
		System.out.println(signbtn.isEnabled());
		signbtn.click();
		//sign into ebay
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[5]/div/div[1]/div/div[1]/div[1]/div[2]/div/span/form/div[1]/div[5]/div/div[4]/span[2]/input")).sendKeys("gkarthiga2015@gmail.com");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[5]/div/div[1]/div/div[1]/div[1]/div[2]/div/span/form/div[1]/div[5]/div/div[5]/span[2]/input")).sendKeys("shruthe911");	
		driver.findElement(By.id("sgnBt")).click();
		
		Select catgy = new Select(driver.findElement(By.id("gh-cat")));
		catgy.selectByIndex(4);
		driver.findElement(By.id("gh-btn")).click();
		// clicking on the text book
		driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[4]/div/div/div[2]/div/a/h3")).click();
		
		WebElement texlist = driver.findElement(By.xpath("//*[@id='bciw']/div/span[1]"));
		
		
		String texstr = texlist.getText();
		
		System.out.println(texstr);
		
		List<WebElement> books = driver.findElements(By.xpath("//html/body/div[5]/div[2]/div[1]/div[1]/div/div[1]/div/div[3]/div/div[1]/div/w-root/div/div/ul/li/h3/a"));
		int countbooks = books.size();
		System.out.println(countbooks);
		for(int i=0;i<countbooks;i++)
		{
			String svalue = books.get(i).getText();
			
			
			
			System.out.println(svalue);
			
				
		
		}
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		driver.quit();
		
		

	}

}
