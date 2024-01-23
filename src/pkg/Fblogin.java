package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin {
	ChromeDriver driver;
@Before
public void setUp()
{
	driver=new ChromeDriver();
}

@Test
public void test() throws Exception
{
	driver.get("https://www.amazon.in");
	Thread.sleep(6000);
	
	
	
}
}
