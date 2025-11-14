package com.metlife.oops;


class AutomationWrapper
{
    public String browser;
    public int aParent=10;

    public AutomationWrapper()
    {
        System.out.println("Parent constructor");
    }
    public void setup()
    {
        browser="chrome";
        System.out.println("browser launch");
    }

    public void teardown()
    {
        browser=null;
        System.out.println("browser quit");
    }
}
class LoginTest extends AutomationWrapper
{
    public int aChild=10;
    public LoginTest()
    {
        System.out.println("Child constructor");
    }
    public void validLoginTest()
    {
        System.out.println(browser);
        System.out.println("valid login test");
    }
}


public class Demo2Inheritance {
    public static void main(String[] args) {

        LoginTest obj=new LoginTest();

//        obj.setup();
//        obj.validLoginTest();
//        obj.teardown();

        System.out.println(obj.aParent);
        System.out.println(obj.aChild);
    }
}
