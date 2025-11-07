package com.metlife.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;


public class Demo3FBSignUp {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

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

        //19
        Select selectDay=new Select(driver.findElement(By.id("day")));
        selectDay.selectByVisibleText("19");

        Select selectMonth=new Select(driver.findElement(By.id("month")));
        selectMonth.selectByVisibleText("Dec");
//        selectMonth.selectByValue("12");
//        selectMonth.selectByIndex(11);

        //1998
        Select selectYear=new Select(driver.findElement(By.xpath("//select[@title='Year']")));
        selectYear.selectByVisibleText("1998");

        driver.findElement(By.name("websubmit")).click();
    }
}
