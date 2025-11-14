package com.metlife.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Demo9Options {
    public static void main(String[] args) {


        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--disable-notifications");
        //options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
//        options.setAcceptInsecureCerts(true);

        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.malaysiaairlines.com/"); //wait for page load to complete

        //font as per UI for linkText and partialLinkText
        driver.findElement(By.linkText("NEXT")).click();

    }
}
