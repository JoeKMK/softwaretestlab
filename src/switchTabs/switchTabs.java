package switchTabs;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class switchTabs {
	WebDriver driver;

	@Test
	public void GoToLoginPage()	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\kyawm\\eclipse-workspace//chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.harveynorman.com.au/customer/account/login");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Click on Photo center link--this link will open in next tab
	driver.findElement(By.partialLinkText("PhotoCentre")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//switch back to homepage of HN and click on Account link	
	ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
    driver.switchTo().window(tabs.get(0));
    driver.findElement(By.xpath("//a[@class='my-account-link tracked']")).click();
	}   
}
