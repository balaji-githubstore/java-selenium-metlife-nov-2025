package com.metlife.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Demo5Tabs {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.db4free.net/");

        //click on phpMyAdmin »
        //b[contains(text(),'phpMyAdmin')]
        driver.findElement(By.partialLinkText("phpMyAdmin")).click();

        List<String> windows=new ArrayList<>(driver.getWindowHandles());

        System.out.println(windows.get(0));
        System.out.println(windows.get(1));
    }
}
