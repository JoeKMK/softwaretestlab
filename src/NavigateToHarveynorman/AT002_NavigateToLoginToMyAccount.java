package NavigateToHarveynorman;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AT002_NavigateToLoginToMyAccount {
	WebDriver driver;
	
	@Test(priority=1)
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kyawm\\eclipse-workspace\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.harveynorman.com.au/");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);		
		
		
	}
	@Test(priority=2)
	public void Accountclick() {
		//locators--xpath and linktext
		//clicked on Account link
		//driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/ul/li[5]/a")).click();
		driver.findElement(By.linkText("Account")).click();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	}
	@Test(priority=3)
	public void CreateAnAccount() {
		//locators--xpath and linktext
		//clicked on Account link
		//driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"new-account-info\"]/div/a")).click();
	}
	
     @Test(priority=4)
     public void firstName() {
    	 //first name field
    	 driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("test");
    	  
     }
     @Test(priority=5)
     public void lastName() {
    	 // last name field
    	 driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("NGlearning");
    			 
     }
     @Test(priority=6)
     public void emailAddress() {
    	 //Email address field
    	 driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("windtalker.checker@gmail.com");
    			 
     }
     @Test(priority=7)
     public void password() {
    	 //password field
    	 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("thisispass");
    			 
     }
     @Test(priority=8)
     public void reenterPassword() {
    	 //Re-enter password field
    	 driver.findElement(By.xpath("//*[@id=\"confirmation\"]")).sendKeys("thisispass");
    	 
    }
     @Test(priority=9)
     public void checkBox() {
    	 // check_box
    	 driver.findElement(By.xpath("//*[@id=\"accept_terms\"]")).click();
     }
     @Test(priority=10)
     public void submitButton() {
     // Submit button
     driver.findElement(By.xpath("//*[@id=\"form-createaccount\"]/div[4]/div/button")).click();
     }
		}