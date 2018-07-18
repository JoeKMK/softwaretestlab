package learningExtend;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TC001 {
	
WebDriver driver;
@Test(priority=1)
public void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kyawm\\eclipse-workspace\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.harveynorman.com.au/");
	driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);		
}

}