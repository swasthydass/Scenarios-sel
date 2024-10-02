package com.facebook.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

import static javax.swing.text.html.CSS.getAttribute;

public class Scenario3 {

    public static WebDriver getDriver(String browserType) {
        WebDriver driver = null;

        switch (browserType.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Invalid browser type: " + browserType);
                break;
        }

        return driver;
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Scenario3.getDriver("chrome");

        if (driver != null) {
            String url = "http://www.flipkart.com";
            driver.get(url);
            Thread.sleep(1000);

            List<WebElement> links = driver.findElements(By.tagName("a"));
            System.out.println("The number of links is " + links.size());
            Thread.sleep(1000);

            for (WebElement link : links) {
                String linkText = link.getText();
                String linkUrl = link.getAttribute("href");

                System.out.println("Link Text: " + linkText);
                System.out.println("URL: " + linkUrl);
                System.out.println("-------------------");
            }
            driver.close();



        }
    }
}