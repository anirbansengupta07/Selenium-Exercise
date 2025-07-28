package com.radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EMT 
{

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		
		driver.findElement(By.xpath("//label[normalize-space()='Defence Forces']//span[@class='checkmark_df']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[normalize-space()='Students']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[normalize-space()='Senior Citizens']//span[contains(@class,'checkmark_df')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[normalize-space()='Doctors Nurses']")).click();
		
		int radiobtn=driver.findElements(By.xpath("//*[@id=\"divFamilyFare\"]/ul")).size();
		
		System.out.println("Number of radio buttons: "+radiobtn);
		driver.quit();
		
		
	}

}