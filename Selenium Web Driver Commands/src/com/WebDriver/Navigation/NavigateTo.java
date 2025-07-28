package com.WebDriver.Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTo {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		driver.navigate().to("https://login.yahoo.com/?.src=ym&lang=en-GB&done=https%3A%2F%2Fin.mail.yahoo.com%2F%3Fguce_referrer%3DaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8%26guce_referrer_sig%3DAQAAAHuXkZUAYIsPGwN5GHkAsY758N_ZKWM3p1iPBQrxWQu3g0fw3jUk3gyq5EY2FNKt6QAn4Bz2Hpq9UQy_BVhAkPEMfTS2iP4hB0OwJDW5kxEVc0eeIrbSUZaHDSEZ6ka-Cdfag7D4oz6uQOjjLsEJMraN30j8GV3By0jV8ykIjzyy");
		driver.manage().window().maximize();
		driver.navigate().back();
		String title=driver.getTitle();
		driver.quit();

	}

}
