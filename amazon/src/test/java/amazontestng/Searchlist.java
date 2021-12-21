package amazontestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Searchlist 
{
	public static WebDriver driver;
	@Test
	  public void f() 
	  {
		 WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 driver.get("https://www.flipkart.com");
	  }

}
