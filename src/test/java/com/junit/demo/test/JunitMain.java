package com.junit.demo.test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitMain {
	static final WebDriver driver = new ChromeDriver();
	final Date d = new Date();
	
	@BeforeClass
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Before
	public void beforeTime() {
		
		System.out.println(d.getTime());

	}
	
	@Test
	public void test1() {	
		driver.findElement(By.id("email")).sendKeys("venkat");
		driver.findElement(By.id("pass")).sendKeys("Venkat18");
		driver.findElement(By.name("login")).click();
	}
	
	@After
	public void afterTime() {
		System.out.println(d.getTime());

	}
	
	@AfterClass
	public static  void closeBrowser() {
		driver.quit();
	}
}
