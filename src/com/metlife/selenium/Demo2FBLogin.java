package com.metlife.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo2FBLogin {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.facebook.com/");

        By locator = By.id("email");
//        WebElement element = driver.findElement(locator);
//        element.sendKeys("hello123232@gmail.com");

//        WebElement element = driver.findElement(By.id("email"));
//        element.sendKeys("hello123232@gmail.com");

        driver.findElement(By.id("email")).sendKeys("hello34343@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("welcome");

        //click on login
        driver.findElement(By.name("login")).click();

    }
}
