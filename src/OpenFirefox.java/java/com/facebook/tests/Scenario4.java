package com.facebook.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.WebElement;



public class Scenario4 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        Thread.sleep(1000);

        WebElement searchbar = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
        searchbar.sendKeys("Apple Watches");

        Thread.sleep(1000);

        WebElement category = driver.findElement(By.xpath("//*[@id=\"gh-cat\"]"));
        Select s = new Select(category);
        s.selectByVisibleText("Consumer Electronics");

        WebElement search = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]"));
        search.click();
        Thread.sleep(1000);

        driver.close();


    }
}