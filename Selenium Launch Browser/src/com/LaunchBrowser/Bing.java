package com.LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.bing.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println();
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		System.out.println(driver.getPageSource());
		driver.quit();
	}

}
