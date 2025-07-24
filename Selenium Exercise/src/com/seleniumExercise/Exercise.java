package com.seleniumExercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise {

    public static void main(String[] args) {
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://opensource-demo.orangehrmlive.com/");

        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://demo.opencart.com/");

        WebDriver driver3 = new ChromeDriver();
        driver3.get("https://www.bing.com");

        WebDriver driver4 = new ChromeDriver();
        driver4.get("https://www.freecrm.com/");

        WebDriver driver5 = new ChromeDriver();
        driver5.get("https://www.half.ebay.com");
    }
}

