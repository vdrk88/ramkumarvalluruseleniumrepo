package Iter;

import org.junit.Before;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class inter {
	@BeforeTest
	public void login()
	{
		System.out.println("Logic for lOGIN");
	}
	@AfterTest
	public void logout()
	{
		System.out.println("Logic for logout");
	}
	@Test(priority=1)
	public void transfer()
	{
		System.out.println("Logic for tranfer");
	}
	@Test(priority=3)
	public void deposit()
	{
		System.out.println("Logic for deposit");
	}
	@Test(priority=2)
	public void withdraw()
	{
		System.out.println("Logic for withdraw");
	}
	

}
