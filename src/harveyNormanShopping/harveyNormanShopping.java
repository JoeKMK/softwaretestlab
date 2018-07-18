package harveyNormanShopping;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.*;

public class harveyNormanShopping {
	WebDriver driver;
	
	@Test(priority=1)
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kyawm\\eclipse-workspace\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.harveynorman.com.au/");
		driver.manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);		
	}
	@Test(priority=2)
	public void ClickOnFirstItem() {
	
		driver.findElement(By.xpath("//img[@class='photo photo-category lazy']")).click();
		driver.manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);
	}
	@Test(priority=3)
	public void Select() throws InterruptedException {
		//locators--xpath and linktext
		//clicked on Account link
		//driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/ul/li[5]/a")).click();
	
		Select select = new Select(driver.findElement(By.id("select_999999900")));
		select.selectByVisibleText("1 year Product Care");
		Thread.sleep(5000);
	}
	  @Test(priority=4)
	     public void addToCart() {
	    	 
	    	 driver.findElement(By.xpath("//button[contains(@id,\"btn-add-to-cart\")]")).click();
	    	  driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	    	 
	     }
	  @Test(priority=5)
	  public void myCart() throws InterruptedException {
		 driver.findElement(By.xpath("//a[contains(@class,\"btn btn_lg btn_success tracked\")]")).click();
		 driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS); 
		 
		 //pop-up window
		   Thread.sleep(5000); //wait for the modal message to appear
		    String winHandleBefore = driver.getWindowHandle();
		    driver.findElement(By.xpath("//a[contains(@class,\"close pull-right notify_close_0\")]")).click();
		    Thread.sleep(2000);
		    driver.switchTo().window(winHandleBefore);
		    driver.manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);
		    
	/*	NOT FOR THIS CASE 
	 * Set<String> set =  driver.getWindowHandles();
		 List<String> list = new ArrayList<>(set);

		 // store your main window handle in variable
		 String mainWindow = list.get(0);

		  //To close all unwanted popup
		 for(int i =1; i <list.size(); i++)
		 {
		     String unwantedPopup = list.get(i);
		     driver.switchTo().window(unwantedPopup);
		     driver.close();
		 }
		 // Switch back to your main window
		 driver.switchTo().window(mainWindow);
		 
		 
	  test = driver.switchTo().alert().getText();
	 System.out.println(test);
	 alt.accept();
	 driver.switchTo().alert().dismiss();
	 driver.findElement(By.xpath("//a[contains(@class,\"close pull-right notify_close_0\")]")).click();
		 */
	  }
	  
	  @Test(priority=6)
	  public void Continue() {
		  driver.findElement(By.xpath("//*[@id=\"topCartContent\"]/div/div[2]/div[2]/div/a")).click();
		  driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		  //driver.findElement(By.linkText("CONTINUE")).click();
		//  driver.findElement(By.xpath("//*[@id=\"topCartContent\"]/div/div[2]/div[2]/div/a")).click();
	  }
	  @Test(priority=7)
	  public void freeDelivery() {
		  driver.findElement(By.xpath("//input[contains(@class,'shipmethod')]")).click();
	}
	  @Test(priority=8)
	  public void SelectStore() {
		  driver.findElement(By.linkText("SELECT STORE")).click();
		//a[contains(@id,\"store_select_btn\")]
		  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);  
	} 
	  @Test(priority=9)
	  public void postCode() throws InterruptedException {
		  
		  String winHandleBefore = driver.getWindowHandle();
		  driver.switchTo().window(winHandleBefore);
		  Thread.sleep(2000);
		
		  
		  driver.findElement(By.xpath("//input[contains(@class,\"auto_box form-control\")]")).sendKeys("3030");
		  driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);  
		//input[contains(@class,\"auto_box form-control\")]
		  
		  driver.findElement(By.cssSelector("#submit_postcode")).click();
		  Thread.sleep(5000);
		 // driver.manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);  
		//button[contains(@id,\"submit_postcode\")]
		  
		  driver.findElement(By.cssSelector("#storeResponse > div:nth-child(1) > div.col-sm-2.col-xs-12 > a")).click();
		  Thread.sleep(5000);
		
}   
	  @Test(priority=10)
	  public void continueToCheckout() {
		  driver.findElement(By.xpath("//a[contains(@id,\"btn_checkout\")]")).click();
		  driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS); 
	} 
	  @Test(priority=11)
	  public void firstName() {
		  driver.findElement(By.xpath("//input[contains(@id,\"billing:firstname\")]")).sendKeys("kyaw");
	} 
	  @Test(priority=12)
	  public void lastName() {
		  driver.findElement(By.xpath("//input[contains(@id,\"billing:lastname\")]")).sendKeys("khing");
	} 
	  @Test(priority=13)
	  public void PrimaryPhone() {
		  driver.findElement(By.xpath("//input[contains(@id,\"billing:telephone\")]")).sendKeys("0470089012");
	} 
	  @Test(priority=14)
	  public void Email() {
		  driver.findElement(By.xpath("//input[contains(@id,\"billing:email\")]")).sendKeys("kyawmyokhing01@gmail.com");
	} 
	  @Test(priority=15)
	  public void Checkbox() throws InterruptedException {
		  driver.findElement(By.xpath("//*[@id=\"onestepcheckout-top-form\"]/div[5]/div[1]/div[1]/div/div/label")).click();
		  Thread.sleep(8000);
	} 
		@Test(priority=16)
			
			public void PayPal() throws InterruptedException {
				
				Select select = new Select(driver.findElement(By.id("checkout-payment-method-switcher")));
				
				select.selectByVisibleText("PayPal");
				Thread.sleep(5000);
		}
		  @Test(priority=17)
		  public void ContinueToPayPal() {
			  driver.findElement(By.id("paypal_express-continue-to-paypal-btn")).click();
			  driver.manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);
}
}











