package com.metlife.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3FBSignUp {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Create new account")).click();

        //enter firstname - john
        driver.findElement(By.name("firstname")).sendKeys("john");
        //enter lastname as wick
        driver.findElement(By.name("lastname")).sendKeys("wick");
        //click on custom radio button
        //label[text()='Custom']
        driver.findElement(By.xpath("//input[@value='-1']")).click();

        //19 Dec 1998

    }
}
