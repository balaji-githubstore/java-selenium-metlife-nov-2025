package com.metlife.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.HashMap;

public class Demo9Options2 {
    public static void main(String[] args) {


        ChromeOptions options=new ChromeOptions();

        HashMap<String,String> map=new HashMap<>();
        map.put("download.default_directory","C:\\SessionWork\\JavaConcept\\files");

        options.setExperimentalOption("prefs",map);

        //changing download dir

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.ilovepdf.com/pdf_to_word");


        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\SessionWork\\demo1.pdf");


        driver.findElement(By.xpath("//a[normalize-space()='Download WORD']")).click();

    }
}
