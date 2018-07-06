package general;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebook {
	WebDriver driver;
	
	@Test(priority=1)
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kyawm\\eclipse-workspace\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.facebook.com/");
		
	}
	@Test(priority=2)
	public void email() {
		//locators--xpath and linktext
		//clicked on Account link
		//driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("windtalker.checker@gmail.com");
	
	}
	@Test(priority=3)
	public void password() {
		//locators--xpath and linktext
		//clicked on Account link
		//driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("thisisnotpass");
	
	}
	 @Test(priority=4)
     public void logIn() {
     // Submit button
     driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
     }
}