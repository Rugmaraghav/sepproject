package testngpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrisation {
	
	
	@Parameters({"email","pswd"})
	@Test
	public void main(String email,String pswd)
	{
		
		
	}
	
	

}
