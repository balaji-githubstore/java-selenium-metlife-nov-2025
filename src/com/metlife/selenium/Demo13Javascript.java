package com.metlife.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Demo13Javascript {
    public static void main(String[] args) {


        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");


        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.malaysiaairlines.com/");

        driver.findElement(By.xpath("//span[text()='Accept all cookies']")).click();

        //approach 1
       // driver.findElement(By.xpath("//input[@name='dateDeparture']")).sendKeys("05 Dec 2025");

        //approach 2 - try automate calendar

        JavascriptExecutor js= (JavascriptExecutor) driver;

        //approach 3 - option1 - use javascript
//        js.executeScript("document.querySelector(\"input[name='dateDeparture']\").value='10 Dec 2025'");
//
//        js.executeScript("document.querySelector(\"input[name='dateReturn']\").value='18 Dec 2025'");

        //approach 3 - option2 - use javascript and webelement
        WebElement element1=driver.findElement(By.xpath("//input[@name='dateDeparture']"));
        js.executeScript("arguments[0].value='10 Dec 2025'",element1);

        WebElement element2=driver.findElement(By.xpath("//input[@name='dateReturn']"));
        js.executeScript("arguments[0].value='18 Dec 2025'",element2);
    }
}
