package selenium.ebay.register;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayValidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.setProperty("webdriver.gecko.driver","D:\\Karthiga\\Testing Training\\jar and war files\\jar\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();//Launching browser using Webdriver
		driver.manage().window().maximize();//Maximize browser window
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Getting the webpage
		driver.get("http://www.ebay.com/");
		//clicking Sign in
		driver.findElement(By.linkText("Sign in")).click();
		//Entering user name and password
		driver.findElement(By.xpath("//div[4]/span[2]/input")).sendKeys("karthigap2@gmail.com");
		driver.findElement(By.xpath("//div[5]/div/div[5]/span[2]/input")).sendKeys("Selenium2016");
		//clicking Login button
		driver.findElement(By.id("sgnBt")).click();
		
		try{
		if(driver.findElement(By.id("gh-ug")).getText() != null)
		{
			System.out.println(driver.findElement(By.id("gh-ug")).getText());
			System.out.println("Login successfully");
		}
		else
		{
			System.out.println("Login failed & Try Again");
			driver.findElement(By.xpath("//div[4]/span[2]/input")).sendKeys("karthigap2@gmail.com");
			driver.findElement(By.xpath("//div[5]/div/div[5]/span[2]/input")).sendKeys("Selenium2016");
			//clicking Login button
			driver.findElement(By.id("sgnBt")).click();
			
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		Select cat=new Select(driver.findElement(By.id("gh-cat")));// Selecting the category
		List<WebElement> catlist=cat.getOptions();// Storing all the options in list
		int count=catlist.size();//getting the total count of category
		System.out.println("Total number of elements in category is:"+count);// printing the total category
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("The list of elements in Categories");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i=0;i<count;i++)// getting the text of each category in the category list using for loop
		{
			String text=catlist.get(i).getText();
			System.out.println(text);
		}
		System.out.println("Searching for Books-Textbooks");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		cat.selectByVisibleText("Books");// Searching for  Books in  category
		driver.findElement(By.id("gh-btn")).click();//clicking the Search Button
		//clicking Textbook in Book Category
		driver.findElement(By.xpath("//*[@id='mainContent']/div[4]/div[4]/div/div/div[2]/div/a/h3")).click();
		WebElement ele=driver.findElement(By.xpath("//*[@id='bciw']/div/span[1]"));//saving the listings of textbook webelement
		String str=ele.getText();//storing the listings in String 
		System.out.println("Total listings of Textook:"+str);//printing that listings
		//getting the list of textbook dispalyed
		List<WebElement> booklist=driver.findElements(By.xpath("//html/body/div/div/div/div/div/div/div/div/div/div/div/w-root/div/div/ul/li/h3/a"));
		int count1=booklist.size();//finding the Totalsize of books displayed
		System.out.println("The number of books displayed in one page"+count1);//printing the total of books displayed
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		//getting number of search pages
		List<WebElement> totalpages=driver.findElements(By.xpath("//html/body/div/div/div/div/div/div/div/div/div/div/div/div/table/tbody/tr/td/a"));
		int pagecount=totalpages.size();
		System.out.println("Total number of search result pages are:"+pagecount);//printing the pagecount
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int k=0;k<pagecount;k++)//for loop for each page
		{
			System.out.println("Search result page"+k+":");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int j=0;j<count1;j++)//for loop for displaying all the textbooks 
		{
			String text1=booklist.get(j).getText();
			System.out.println(text1);
		}
		}
	
		//closing the page
		driver.close();

	}

}
