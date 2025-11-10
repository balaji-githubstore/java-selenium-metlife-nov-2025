package com.metlife.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo12Upload {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://smallpdf.com/pdf-to-word");


        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\SessionWork\\demo1.pdf");
}
}
