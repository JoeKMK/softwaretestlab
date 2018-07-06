package harveyNormanShopping;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class harveyNormanShopping {
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
	public void ClickOnFirstItem() {
		//locators--xpath and linktext
		//clicked on Account link
		//driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//img[@class='photo photo-category lazy']")).click();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	}
	@Test(priority=3)
	public <Select> void Select() {
		//locators--xpath and linktext
		//clicked on Account link
		//driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/ul/li[5]/a")).click();
	
	//	  Select Warranty = new  Select(driver.findElement(By.id("select_999999900")));
	//	  ((Object) Warranty).selectByVisibleText("1 year Product Care");
	}
	  @Test(priority=4)
	     public void addToCart() {
	    	 
	    	 driver.findElement(By.xpath("//button[contains(@id,\"btn-add-to-cart\")]")).click();
	    	  driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	    	 
	     }
	  @Test(priority=5)
	  public void myCart() {
		 driver.findElement(By.xpath("//a[contains(@class,\"btn btn_lg btn_success tracked\")]")).click();
		
		 //pop-up window
		 Alert alt= driver.switchTo().alert();
		 alt.accept();
		  driver.findElement(By.xpath("//a[contains(@class,\"close pull-right notify_close_0\")]")).click();
	  }
	  
	  @Test(priority=6)
	  public void Continue() {
		  driver.findElement(By.linkText("CONTINUE")).click();
		//  driver.findElement(By.xpath("//*[@id=\"topCartContent\"]/div/div[2]/div[2]/div/a")).click();
	  }
//	  @Test(priority=7)
//	  public void freeDelivery() {
//		  driver.findElement(By.xpath("//input[contains(@class,'shipmethod')]")).click();
//	}
//	  @Test(priority=8)
//	  public void selectStore() {
//		  driver.findElement(By.xpath("//a[contains(@class,'btn btn_primary btn_block-xs tracked')]")).click();
//	} 
//	  @Test(priority=9)
//	  public void postCode() {
//		  driver.findElement(By.xpath("//input[contains(@class,'auto_box form-control')]")).sendKeys("3030");
//		  driver.findElement(By.xpath("//button[contains(@class,\"btn btn_sm\")]")).click();
//		  driver.findElement(By.xpath("//a[contains(@class,'btn btn_block btn_primary')]")).click();
//	}   
//	  @Test(priority=10)
//	  public void continueToCheckout() {
//		  driver.findElement(By.xpath("//a[contains(@id,\"btn_checkout\")]")).click();
//	} 
//	  @Test(priority=11)
//	  public void firstName() {
//		  driver.findElement(By.xpath("//input[contains(@id,\"billing:firstname\")]")).sendKeys("kyaw");
//	} 
	  
}