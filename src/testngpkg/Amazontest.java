package testngpkg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazontest {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		
		
		 driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlopen() {
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}	
	
	@Test
	public void main() throws Exception
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement serchBox = driver.findElement(By.id("twotabsearchtextbox"));
		serchBox.sendKeys("Mobile Phones");
		
		WebElement serchButton = driver.findElement(By.id("nav-search-submit-button"));
		serchButton.click();
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a")).click();
	     Set<String> windows=driver.getWindowHandles();
	     for(String win:windows)
	     {
	    	 if(!win.equals(parentwindow))
	    	 {
	    		 driver.switchTo().window(win);
	    		 String title=driver.getTitle();
	    		 System.out.println(title);
	    		 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	    		 driver.findElement(By.xpath("//*[@id=\"attach-close_sideSheet-link\"]")).click();
	    	 }
	     }
		 
		
	}

}
