package uBank.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AT001_navigateToUBank {
	WebDriver driver;
	
	
	@Test(priority=1)
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kyawm\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.ubank.com.au/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);		
		driver.findElement(By.cssSelector("a.menu-homeloan.menu-icon > span")).click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/div[3]/div/div[2]/header/div[2]/div[1]/div/div/section/nav/a[4]")).click();
}
}