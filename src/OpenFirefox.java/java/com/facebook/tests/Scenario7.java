package com.facebook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario7 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gmail.com/");

        WebElement email= driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        email.sendKeys("seleniumassignment456");

        WebElement next= driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
        next.click();

        Thread.sleep(3000);

        WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        password.sendKeys("selenium456");

        WebElement Next= driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"));
        Next.click();

        Thread.sleep(3000);

        WebElement compose= driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[1]/div/div"));
        compose.click();

        Thread.sleep(3000);

        WebElement to= driver.findElement(By.xpath("//*[@id=\":b9\"]"));
        to.sendKeys("qatesting@vitsconsulting.com");

        WebElement subject= driver.findElement(By.xpath("//*[@id=\":7m\"]"));
        subject.sendKeys("QA Automation TestMail");

        Thread.sleep(3000);

        WebElement body= driver.findElement(By.xpath("//*[@id=\":8w\"]"));
        body.sendKeys("Hi Team- Practing QA testing");

        WebElement send= driver.findElement(By.xpath("//*[@id=\":7c\"]"));
        send.click();

    }
}
