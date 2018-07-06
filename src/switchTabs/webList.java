package switchTabs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webList {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kyawm\\eclipse-workspace\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  //driver.manage().window().maximize();
		  driver.get("http://www.harveynorman.com.au");
		  //Select first product from the homepage
		  driver.findElement(By.xpath("//*[@id=\"category-grid\"]/div[1]/div[1]/div/div/div[3]/a")).click();
		  //Wait few seconds for the page to load
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
//		 //-------------------------To select dropdown using visible text-----------------------------------------------------------------
//		  
//		  Select Warranty = new  Select(driver.findElement(By.id("select_999999900")));
//		  //To Select Warrant through visible text opiton
//		  Warranty.selectByVisibleText("2 years Product Care ");
//		  //---------------------------------------------------------------------------------------------
//		
		  //---------------To select all dropdown elements----------------------------------------------------------------------- 
//		  Select Warranty = new  Select(driver.findElement(By.id("select_999999900")));
//		  
//		  //Get all the elements in from dropdown
//		  for(int j=0;j<=3;j++)
//			  System.out.println(Warranty.getOptions().get(j).getText());
//		  
//			//-----------------------End of Select dropdown------------------------------------------------------------
		
	
		//---------------To select dropdwon elements by index----------------------------------------------------------------------- 
		  Select Warranty = new  Select(driver.findElement(By.id("select_999999900")));
		 // To select it by index
		  Warranty.selectByIndex(3);
		  //----------------------End of index method-------------------------------------------------------------------
		  

	}

}
