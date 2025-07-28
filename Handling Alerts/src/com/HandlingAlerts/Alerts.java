package com.HandlingAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alerts
{
	@Test
	public void TestPopUps() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(8000);
		alert.accept();
		
		String result = driver.findElement(By.cssSelector("#result")).getText();
		System.out.println(result);
		Assert.assertEquals("You successfully clicked an alert", result);
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		Alert alert2=driver.switchTo().alert();
		Thread.sleep(8000);
		alert2.dismiss();
		
		String result2 = driver.findElement(By.cssSelector("#result")).getText();
		System.out.println(result2);
		Assert.assertEquals("You clicked: Cancel", result2);
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		Alert alert3=driver.switchTo().alert();
		Thread.sleep(8000);
		alert3.accept();
		
		String result3 = driver.findElement(By.cssSelector("#result")).getText();
		System.out.println(result3);
		Assert.assertEquals("You clicked: Ok", result3);
		
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
//		Alert alert4=driver.switchTo().alert();
//		Thread.sleep(8000);
//		alert4.accept();
//		
//		String result4 = driver.findElement(By.cssSelector("#result")).getText();
//		System.out.println(result4);
//		Assert.assertEquals("You clicked: Ok", result4);
		
	}
}
