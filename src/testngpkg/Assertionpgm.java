package testngpkg;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertionpgm {
ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	
	@Test
	public void titleVerification()
	{
		String exp="google";
		String title=driver.getTitle();
		
		Assert.assertEquals(title, exp);
		
		System.out.println("hello");
	}

}
