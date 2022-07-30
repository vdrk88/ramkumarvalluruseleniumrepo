package Iter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Web {
	@org.junit.Test
	public void test_script01() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Web\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.id("login1")).clear();
		driver.findElement(By.id("login1")).sendKeys("ramkumarvalluru");
		driver.findElement(By.id("password")).sendKeys("Ram@123");
        driver.findElement(By.name("proceed")).click();		
	}
	
}
