package com.junit.demo.test;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitMain {
	static WebDriver driver;
	
	@BeforeClass
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test1() {	
		driver.findElement(By.id("email")).sendKeys("venkat");
		driver.findElement(By.id("pass")).sendKeys("Venkat18");
		driver.findElement(By.name("login")).click();
	}
	
	@AfterClass
	public static  void closeBrowser() {
		driver.quit();
	}
}
