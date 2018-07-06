package switchTabs;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
//if this line is not recognised then download the jar file
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class screenShot {
	WebDriver driver;
	
	//Navigate to website
	@Test
	public void Screenshot()  {
		//Locate Chrome Driver in your machine and open
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
         driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	     driver.get("https://google.com.au");
	 }
	
	//Capture Screenshot
	//If FileUtils is throwing error download jar file 
	@Test
	public void location() throws IOException {
    File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(screenshotFile, new File("C:\\screenshots.png"));
   // driver.close();
   // driver.quit(); 
	}
    
}
