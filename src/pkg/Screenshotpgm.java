package pkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpgm {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("file:///E:/Rugma/selenium%20notes/alert.html");
	}

	@Test
	public void test() throws Exception 
	{
		
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s, new File("E://screenshot1.png"));
		
		WebElement button=driver.findElement(By.xpath("/html/body/input[1]"));
		File s2=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s2, new File("./Screenshot/displaybutton.png"));
		
		
	}

}
