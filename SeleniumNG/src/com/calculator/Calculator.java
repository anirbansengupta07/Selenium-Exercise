package com.calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calculator 
{
WebDriver driver;
	
	@Test
	public void DemoTestID() throws Exception
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com//");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("easycalculation");
		driver.findElement(By.xpath("APjFqb")).sendKeys("easycalculation");
		driver.findElement(By.name("password")).sendKeys("Classic@897");
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
