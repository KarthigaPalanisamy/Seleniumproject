package differentbrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class chromeBrowser {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.ie.driver", "F:/Karthiga/Testing Training/drivers/IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver", "F:/Karthiga/Testing Training/drivers/chromedriver.exe");
		//WebDriver driver=new InternetExplorerDriver();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com/");
		driver.quit();

	}

}
