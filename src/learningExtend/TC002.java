package learningExtend;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TC002 extends TC001 {
	

	@Test(priority=1)
	public void TC002 () {
		//locators--xpath and linktext
		//clicked on Account link
		driver.findElement(By.linkText("Account")).click();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
	}
}
