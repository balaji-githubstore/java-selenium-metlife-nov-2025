package com.metlife.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Demo11Actions2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.google.com");

        Actions actions=new Actions(driver);

        actions.moveToElement(driver.findElement(By.name("q"))).click()
                .keyDown(Keys.SHIFT).sendKeys("hello world").keyUp(Keys.SHIFT).pause(800)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).pause(800)
                .sendKeys(Keys.ENTER)
                .perform();
    }
}
