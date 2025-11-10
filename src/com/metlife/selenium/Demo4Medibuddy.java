package com.metlife.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo4Medibuddy {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.medibuddy.in/"); //wait for page load to complete

        //findElement--> checks for presence of element in 0.5s/500ms
        driver.findElement(By.linkText("Login")).click();

        driver.findElement(By.id("phone")).sendKeys("78788874");

    }
}
