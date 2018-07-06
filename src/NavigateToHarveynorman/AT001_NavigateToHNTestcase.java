package NavigateToHarveynorman;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AT001_NavigateToHNTestcase {

	@Test
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kyawm\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.harveynorman.com.au/");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);		
	
	
	}	
	
}
