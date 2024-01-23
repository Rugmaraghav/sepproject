package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class FIrstseleniumscript {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver(); // to launch browser
		driver.get("https://www.facebook.com");
		String actualtitle = driver.getTitle();
		System.out.println("title=" + actualtitle);
		String exp = "Facebook";

		if (exp.equals(actualtitle)) {
			System.out.println("title is same");
		} else {
			System.out.println("not same");
		}

		driver.quit();

	}

}
