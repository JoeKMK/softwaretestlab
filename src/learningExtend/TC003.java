package learningExtend;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TC003 extends TC002 {

	@Test(priority=1)
	public void TC003 () {
		//email address for login
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("windtalker.checker@gmail.com");
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
	}
}
