package com.metlife.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Demo7Alert {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm");

        //click on Go
        //driver.findElement(By.xpath("//img[@alt='Go']")).click();

        //wait for alert present - explicit wait
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());

        String actualAlertMessage= driver.switchTo().alert().getText();
        System.out.println(actualAlertMessage);

        driver.switchTo().alert().accept();
    }
}
