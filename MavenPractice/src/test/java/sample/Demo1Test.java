package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo1Test {
//ankith pulled  
	WebDriver driver=null;
	
	@Test
	public void d1Test()
	{
		System.out.println("Hi");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String BROWSER = System.getProperty("browser");
	/*	String URL = System.getProperty("url");
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}else {
			driver=new ChromeDriver();
		}
		driver.get(URL);*/
	}
}
