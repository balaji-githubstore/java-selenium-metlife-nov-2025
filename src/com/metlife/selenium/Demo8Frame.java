package com.metlife.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo8Frame {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://netbanking.hdfcbank.com/netbanking/");

        //switch using WebElement
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));

        //switch using index
//        driver.switchTo().frame(0);

        //switch using name or id as String
//        driver.switchTo().frame("login_page");

        driver.findElement(By.name("fldLoginUserId")).sendKeys("john123");

        //click on Continue
        driver.findElement(By.linkText("CONTINUE")).click();

        //switch to main html
        driver.switchTo().defaultContent();

    }
}
