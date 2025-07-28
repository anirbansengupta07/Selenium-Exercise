package com.DDB;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FB 
{
	@Test
	public void FBLaunch() throws Exception
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/campaign/landing.php?");
		
		WebElement month_Dropdown=driver.findElement(By.id("month"));
		Select month_dd=new Select(month_Dropdown);
		
		List<WebElement> month_list=month_dd.getOptions();
		int total_month=month_list.size();
		
		for(WebElement ele : month_list)
		{
			String month_name=ele.getText();
			System.out.println("Month names: "+month_name);
		}
		driver.quit();	
		}
}
