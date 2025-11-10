package com.metlife.oops;

class ChromeDriver123
{
    public String browserDriver;

    public ChromeDriver123()
    {
        browserDriver="Chrome";
        System.out.println("Launch chrome with default settings");
    }

    public ChromeDriver123(String Options)
    {
        browserDriver="Chrome";
        System.out.println("Launch chrome with default settings");
    }

    public void get(String url)
    {
        int browserDriver=100;
        System.out.println("Using "+this.browserDriver);
        System.out.println("chrome url navigation");
    }
}

public class Demo1Runner {
    public static void main(String[] args) {

    ChromeDriver123 driver=new ChromeDriver123("");
    driver.get("http://google.com");

    }
}
