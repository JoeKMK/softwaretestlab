package NavigateToHarveynorman;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AT003_loginToMyAccount {
	WebDriver driver;
	
	@Test(priority=1)
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kyawm\\eclipse-workspace\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.harveynorman.com.au/");
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);		
		
		
	}
	@Test(priority=2)
	public void Accountclick() {
		//locators--xpath and linktext
		//clicked on Account link
				driver.findElement(By.linkText("Account")).click();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
	}
	@Test(priority=3)
	public void emailAddress() {
		//email address for login
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kyawmyokhing01@gmail.com");
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
	}
	@Test(priority=4)
	public void password() {
		// password for login
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("thisispass");
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
	}
	 @Test(priority=5)
     public void logIn() {
     // click Login button
     driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
     }
	 
	 @Test(priority=6)
     public void myAccountScreen() {
     // click Login button
     driver.findElement(By.linkText("My account information")).click();
	 }
	 @Test(priority=7)
     public void myAddressBook() {
     // click on " My Address Book"
     driver.findElement(By.linkText("My address book")).click();
		}
	 @Test(priority=8)
     public void firstName() {
     // first name
     driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("test");
		}
	 @Test(priority=9)
     public void lastName() {
     // last name
     driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("NGlearning");
	 }
	 @Test(priority=10)
     public void companyName() {
    	 //company name
    	 driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("softwareTesting");
    			 
     }
	 @Test(priority=11)
     public void primaryTelephone() {
    	 //primary telephone
    	 driver.findElement(By.xpath("//*[@id=\"telephone\"]")).sendKeys("0470089011");
		}
	 @Test(priority=12)
     public void faxNumber() {
    	 //fax number
    	 driver.findElement(By.xpath("//*[@id=\"fax\"]")).sendKeys("1370089011");
		} 
	 @Test(priority=13)
     public void streetNumberandName() {
    	 //Street number and name
    	 driver.findElement(By.xpath("//*[@id=\"street_1\"]")).sendKeys("1,hotel lane");
	 }	
	 @Test(priority=13)
     public void suburbAndPostcode() {
    	 //Suburb and postcode
    	 driver.findElement(By.xpath("//*[@id=\"my-location-input-address\"]")).sendKeys("werribee,3030");
	 }	 
	 @Test(priority=14)
     public void save() {
     // Save button
     driver.findElement(By.xpath("//*[@id=\"edit-ShipAddress\"]")).click();
     }
	 @Test(priority=15)
     public void myOrders() {
     // click on " My orders" button
     driver.findElement(By.linkText("My orders")).click();
		}
	 @Test(priority=16)
     public void myWishlist() {
     // click on " My wishlist" button
     driver.findElement(By.linkText("My wishlist")).click();
		}
	 @Test(priority=17)
     public void logOut() {
     // click on " Log Out" button
     driver.findElement(By.linkText("Log Out")).click();
		} 
	 
   }






