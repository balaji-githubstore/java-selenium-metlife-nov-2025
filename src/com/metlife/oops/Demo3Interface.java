package com.metlife.oops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//all the method req for cross browser testing will be declared in the interface
interface WebDriverDemo {
    public abstract void get(String url);

    void quit();
}
interface JavascriptExecutorDemo
{
    void executeScript();
}

class ChromeDriverDemo implements WebDriverDemo,JavascriptExecutorDemo {
    public ChromeDriverDemo() {
        System.out.println("chrome browser launch");
    }

    @Override
    public void get(String url) {
        System.out.println("chrome " + url);
    }

    @Override
    public void quit() {
        System.out.println("chrome quit");
    }
    public void onlyChrome()
    {

    }

    @Override
    public void executeScript() {
        System.out.println("run js in chrome");
    }
}

class EdgeDriverDemo implements WebDriverDemo,JavascriptExecutorDemo {
    public EdgeDriverDemo() {
        System.out.println("edge browser launch");
    }

    @Override
    public void get(String url) {
        System.out.println("edge " + url);
    }

    @Override
    public void quit() {
        System.out.println("quit edge");
    }

    @Override
    public void executeScript() {
        System.out.println("run js in edge");
    }
}
class XBrowser
{

}
public class Demo3Interface {
    public static void main(String[] args) {

        WebDriverDemo driver=new EdgeDriverDemo();
        driver.get("http://google.com");
        driver.quit();

        JavascriptExecutorDemo js = (JavascriptExecutorDemo) driver; //check new EdgeDriverDemo(); can be stored JavascriptExecutorDemo
        js.executeScript();


    }
}
