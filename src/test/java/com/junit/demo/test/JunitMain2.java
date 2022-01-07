package com.junit.demo.test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitMain2 {

	static WebDriver driver; 
	Date d = new Date();
	
	@BeforeClass
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Before
	public void beforeTime() {	
		System.out.println(d);
	}
	
	@Test
	public void test1() {	
		driver.findElement(By.id("pass")).sendKeys("Venkat18");
		driver.findElement(By.name("login")).click();
	}
	
	@Test
	public void test2() {
		WebElement error = driver.findElement(By.xpath("//div[@class='_9ay7']"));
		String text = error.getText();
		Assert.assertTrue("Error Message Display: ", text.contains("email address "));
	}
	
	@After
	public void afterTime() {
		System.out.println(d);
	}
	
	@AfterClass
	public static  void closeBrowser() {
		driver.quit();
	}
	
}
