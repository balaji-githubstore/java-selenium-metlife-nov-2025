package com.metlife.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;

public class Demo10AssignementCitibankActions1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.citigroup.com/global/about-us/global-presence/india");

        driver.findElement(By.id("onetrust-accept-btn-handler")).click();

        //driver.findElement(By.xpath("//div[text()='My Account']")).click();
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//div[text()='My Account']"))).perform();

        driver.findElement(By.xpath("//div[text()='Banking with Citi']")).click();

        ArrayList<String> windows=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }
}
