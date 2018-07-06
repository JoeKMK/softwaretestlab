package officeworks;
import java.util.concurrent.TimeUnit;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AT001_navigateToOfficeworks {
	WebDriver driver;
	
	@Test(priority=1)
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kyawm\\eclipse-workspace\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.officeworks.com.au/");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);			
		
	}
	@Test(priority=2)
	public void log_IN() {
		//locators--xpath and linktext
		//clicked on Account link
		//driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/ul/li[3]/a")).click();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	}
	@Test(priority=3)
	public void register() {
		//locators--xpath and linktext
		//clicked on Account link
		//driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"ow-my-account-header\"]/div/div/div[2]/a")).click();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
}
	  @Test(priority=4)
	     public void email_Address() {
	    	 //Email address field
	    	 driver.findElement(By.xpath("//*[@id=\"emailId\"]")).sendKeys("windtalker.checker@gmail.com");
	    			 
	     }
	  @Test(priority=5)
	     public void password() {
	    	 //password field
	    	 driver.findElement(By.xpath("//*[@id=\"logonPassword\"]")).sendKeys("01password01");
	    			 
	     }
	  @Test(priority=6)
	     public void confirm_Password() {
	    	 //confirm password field
	    	 driver.findElement(By.xpath("//*[@id=\"WC_UserRegistrationAddForm_FormInput_logonPasswordVerify_In_Register_1\"]")).sendKeys("01password01");
	    			 
	     }
	  @Test(priority=7)
	     public void title() {
	    	 
	    	 driver.findElement(By.xpath("//*[@id=\"personTitle\"]")).sendKeys("Mr.");
	    			 
	     }
	  @Test(priority=9)
	     public void firstName() {
	    	 
	    	 driver.findElement(By.xpath("//*[@id=\"WC_registerPage_NameEntryForm_FormInput_firstName_1\"]")).sendKeys("kyaw");
	    			 
	     }
	  @Test(priority=10)
	     public void lastName() {
	    	 
	    	 driver.findElement(By.xpath("//*[@id=\"WC_registerPage_NameEntryForm_FormInput_lastName_1\"]")).sendKeys("khing");
	    			 
	     }
	  @Test(priority=11)
	     public void mainPhoneNumber() {
	    	 
	    	 driver.findElement(By.xpath("//*[@id=\"WC_registerPage_NameEntryForm_FormInput_phone1_1\"]")).sendKeys("0470089011");
	    			 
	     }
	  @Test(priority=12)
	     public void mobileNumber() {
	    	 
	    	 driver.findElement(By.xpath("//*[@id=\"WC_registerPage_NameEntryForm_FormInput_mobilePhone1_1\"]")).sendKeys("0470089011");
	    			 
	     }
	  @Test(priority=13)
	     public void building_level_suite() {
	    	 
	    	 driver.findElement(By.xpath("//*[@id=\"WC_registerPage_AddressEntryForm_FormInput_address2_1\"]")).sendKeys("1");
	    			  
}
	  @Test(priority=14)
	     public void streetAddress() {
	    	
	    	 driver.findElement(By.xpath("//*[@id=\"WC_registerPage_AddressEntryForm_FormInput_address1_1\"]")).sendKeys(" tester court");
	    		

}

	  @Test(priority=15)
	     public void postCode() {
	    	 
	    	 driver.findElement(By.xpath("//*[@id=\"WC_registerPage_AddressEntryForm_FormInput_zipCode_1\"]")).sendKeys("3030");
	    		
}
	  @Test(priority=16)
	     public void suburb() {
	    	 
	    	 driver.findElement(By.xpath("//*[@id=\"WC_registerPage_AddressEntryForm_FormInput_city_1\"]")).sendKeys("WERRIBEE");
	    		
}

	  @Test(priority=17)
	     public void state() {
	    	
	    	 driver.findElement(By.xpath("//*[@id=\"WC_registerPage_AddressEntryForm_FormInput_state_1\"]")).sendKeys("VIC");
	    		
}  
//	  @Test(priority=18)
//     public void privacyPolicyCheckbox() {
//	    	 List<WebElement> elements=driver.findElements(By.xpath("//*[@id=\\\"privacy_register\\\"]"));
//	  int numberOfElements=elements.size();
//	  for(int i=0;i<numberOfElements;i++){
//	      elements=driver.findElements(By.xpath("//*[@id=\"privacy_register\"]"));
//	      elements.get(i).click();
//	    	 
	  
    
	  @Test(priority=19)
	     public void submitButton() {
	    	// submit button
	    	 driver.findElement(By.xpath("//*[@id=\"submitRegistration\"]")).click();
	    		  
}

}














