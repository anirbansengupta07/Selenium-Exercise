package com.HandlingAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OnlyTesting 
{
	@Test
	public void main() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://only-testing-blog.blogspot.com/2014/05/form.html");
		
		driver.findElement(By.name("FirstName")).sendKeys("Anirban");
		driver.findElement(By.name("LastName")).sendKeys("Sengupta");
		driver.findElement(By.name("EmailID")).sendKeys("anirbansengupta0077@gmail.com");
		driver.findElement(By.name("MobNo")).sendKeys("7586859452");
		driver.findElement(By.name("Company")).sendKeys("Oracle");
		
		driver.findElement(By.xpath("//*[@id=\"post-body-8228718889842861683\"]/div[1]/form/input[6]")).click();
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
	}
}