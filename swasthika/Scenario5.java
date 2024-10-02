package com.facebook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class Scenario5 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.vitscc.com/");

        Thread.sleep(1000);

        Actions actions = new Actions(driver);

        WebElement employees = driver.findElement(By.xpath("//*[@id='top-menu']//a[.//span[contains(text(),'Employees')]]"));

        actions.moveToElement(employees).perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement addressCategory = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='top-menu']/ul[1]/li[6]/ul/li[5]/a")));

        addressCategory.click();

        String pageText = driver.findElement(By.tagName("body")).getText();
        String[] words = pageText.split("\\s+");
        String lastTwoWords = words[words.length-2] + " " + words[words.length-1];
        System.out.println(lastTwoWords);
        String s1=words[words.length-2];
        String s2=words[words.length-1];

        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://practice.expandtesting.com/login");
        WebElement unm= driver.findElement(By.name("username"));
        unm.sendKeys(s2);
        WebElement pw= driver.findElement(By.name("password"));
        pw.sendKeys(s1);
        WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
        js.executeScript("arguments[0].scrollIntoView(true);", login);

        Thread.sleep(2000);

        login.click();

        Thread.sleep(1000);
        driver.get(driver.getCurrentUrl());

        WebElement username= driver.findElement(By.name("username"));
        js.executeScript("arguments[0].scrollIntoView(true);", username);
        username.sendKeys("practice");

        WebElement password= driver.findElement(By.name("password"));
        js.executeScript("arguments[0].scrollIntoView(true);", password);
        password.sendKeys("SuperSecretPassword!");

        WebElement log= driver.findElement(By.xpath("//button[@type='submit']"));
        js.executeScript("arguments[0].scrollIntoView(true);", log);
        log.click();

        System.out.println("You are logged in successfully");











    }
}
