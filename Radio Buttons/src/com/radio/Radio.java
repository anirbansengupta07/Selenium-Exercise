package com.radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio 
{

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php");
		
		driver.findElement(By.xpath("//label[normalize-space()='Female']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[normalize-space()='Custom']")).click();
		
		int radiobtn=driver.findElements(By.xpath("//input@name='sex'")).size();
		System.out.println("Number of radio buttons: "+radiobtn);
		driver.quit();
		
		
	}

}
