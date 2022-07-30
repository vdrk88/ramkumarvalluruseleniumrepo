package Iter;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Truetest {
	@Test
	public void googletest()throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\Web\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/");
		String actualTittle = driver.getTitle();
		org.testng.Assert.assertTrue(actualTittle.equals("Yahoo"));
		driver.close();
		
		
		
	}
	

}
