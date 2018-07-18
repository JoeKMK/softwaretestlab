package learningExtend;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC004 extends TC003{
	@Test(priority=1)
	public void password() {
		// password for login
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("thisispass");
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
	}
}
