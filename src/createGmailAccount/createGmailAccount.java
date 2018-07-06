package createGmailAccount;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class createGmailAccount {
	WebDriver driver;
	
	@Test(priority=1)
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kyawm\\eclipse-workspace\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.google.com/gmail/about/#");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);		
		
		
	}
	@Test(priority=2)
	public void createAnAccount() {
		//locators--xpath and linktext
		//clicked on Account link
		//driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/ul/li[5]/a")).click();
		driver.findElement(By.linkText("CREATE AN ACCOUNT")).click();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	}
	@Test(priority=3)
	public void firstName() {
		//locators--xpath and linktext
		//clicked on Account link
		//driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/ul/li[5]/a")).click();
		//driver.findElement(By.xpath("//input[contains(@class,\"whsOnd zHQkBf\")]")).click();
		driver.findElement(By.cssSelector("#firstName")).sendKeys("Kyaw");
	}
}