package amazontestng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class Testamazon 
{
	public static WebDriver driver;
  @Test
  public void f() 
  {
	 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Teddy bears");
  }
  @BeforeClass
  public void beforeClass() 
  {
	  WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
  }

  @AfterClass
  public void afterClass() 
  {
	  
  }

}
