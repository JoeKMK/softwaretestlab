package woolworths.com.au;

import java.util.concurrent.TimeUnit;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class navigateToWoolworths {
	WebDriver driver;
	
	@Test(priority=1)
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kyawm\\eclipse-workspace\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.woolworths.com.au/");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);			
		
	}
	@Test(priority=2)
	public void log_IN() {
		//locators--xpath and linktext
		//clicked on Account link
		//driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@class='coreHeader-profile hidden-xs']")).click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.findElement(By.cssSelector("#center-panel > div > wow-login-page > div > div > wow-login-form > div > div > a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'sign up')]")).click();
	}
	@Test(priority=3)
	public void signUp() {
		//locators--xpath and linktext
		//clicked on Account link
		driver.findElement(By.xpath("//a[contains(text(),'sign up')]")).click();
		//driver.findElement(By.xpath("")).click();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
}
	
}