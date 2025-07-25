package com.Navigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Orange {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		System.out.println();
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		System.out.println(driver.getPageSource());
		System.out.println();
		driver.navigate().to("https://www.espncricinfo.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
		

	}

}
