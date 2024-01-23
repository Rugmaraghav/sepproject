package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}

	@Test
	public void logoDisplay() 
	{
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		boolean l=logo.isDisplayed();
		if(l)
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("Logo is not displayed");
		}
	}
	@Test
	public void buttontest() {
		WebElement button=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
	boolean e=	button.isEnabled();
	if(e)
	{
		System.out.println("button is enabled");
	}
	else
	{
		System.out.println("button is disabled");
	}
	
		
	}

}
