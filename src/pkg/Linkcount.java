package pkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {

	
ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}
	
	@Test
	public void titleVerification() throws Exception
	{
		
		List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
		
		System.out.println("Total no of links="+linkdetails.size());
		
		for(WebElement element :linkdetails)
		{
			
			String link=element.getAttribute("href");
			verify(link);
			
		}	
		
	}

	public void verify(String link) {
		try {
		URL u=new URL(link);
		 HttpURLConnection con=(HttpURLConnection)u.openConnection();
		 if(con.getResponseCode()==200)
		 {
			 System.out.println("response code is 200----"+link);
		 }
		 else if(con.getResponseCode()==404)
		 {
			 System.out.println("response code is 404"+link);
		 }
		 else
		 {
			 System.out.println("other response code");
		 }
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
}
