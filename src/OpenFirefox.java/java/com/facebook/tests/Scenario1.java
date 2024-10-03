package com.facebook.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.net.URL;


public class Scenario1 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://vitscc.com");

        String title = driver.getTitle();
        System.out.println("Page title is:" + title);

        String T= "VITS Consulting Corp";
        Assert.assertNotEquals(T,title);

        driver.get("https://www.facebook.com");
        driver.navigate().back();
        System.out.println("URL of the page is:" + driver.getCurrentUrl());
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();


        }
    }