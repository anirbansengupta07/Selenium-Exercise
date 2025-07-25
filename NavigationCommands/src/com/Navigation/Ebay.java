package com.Navigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.half.ebay.com");
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
