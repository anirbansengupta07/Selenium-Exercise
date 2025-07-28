package com.calculator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktest {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hollandandbarrett.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Vitamins")).click();
		
		
		List<WebElement> Links=driver.findElements(By.xpath("//a"));
		int nolinks=Links.size();
		
		for(int i=0;i<nolinks;i++)
		{
			System.out.println(Links.get(i).getText());
			String str=Links.get(i).getText();
			String str1="Vitamins";
			if(str==str1) {
				driver.findElement(By.linkText("Vitamins")).click();
				driver.findElement(By.xpath("(//a[contains(@type,'button')])[4]")).click();
			}
		}
	}
}
