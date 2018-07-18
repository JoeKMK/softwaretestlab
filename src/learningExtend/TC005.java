package learningExtend;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC005 extends TC004{
	@Test(priority=1)
	  public void logIn() {
	     // click Login button
	     driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
	     }

}
