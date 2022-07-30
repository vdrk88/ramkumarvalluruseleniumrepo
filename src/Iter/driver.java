package Iter;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver {
	@org.testng.annotations.Test	
	 public void testweb()
	 {
		 System.setProperty("webdriver.chrome.driver", "D:\\Web\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			driver.manage().window().maximize();
			driver.findElement(By.id("email")).sendKeys("ramkumar.109@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("Ram@1989");
			driver.findElement(By.name("login")).click();
	 }
	

}
