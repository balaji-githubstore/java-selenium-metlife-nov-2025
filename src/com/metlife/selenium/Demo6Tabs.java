package com.metlife.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Demo6Tabs {

    public static void main(String[] args) {

       // System.setProperty("webdriver.chrome.driver","C:\\SessionWork\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.db4free.net/");

        driver.findElement(By.partialLinkText("phpMyAdmin")).click();

        //Switch to 2nd tab
        ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));

        driver.findElement(By.id("input_username")).sendKeys("admin");
        driver.findElement(By.id("input_password")).sendKeys("admin123");
        driver.findElement(By.id("input_go")).click();

        //get the error and print it
        //div[contains(text(),'Access denied')]
        String actualError=driver.findElement(By.id("pma_errors")).getText();
        System.out.println(actualError);

        String actualHeader=driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]")).getText();
        System.out.println(actualHeader);

        driver.quit();  //check what happens
    }
}
