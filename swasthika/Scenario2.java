package com.facebook.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.awt.*;

public class Scenario2 {
    public static void main(String[] args) throws InterruptedException{

           WebDriver driver = new ChromeDriver();
           driver.get("https://www.fb.com/");

           String currentUrl = driver.getCurrentUrl();
           Assert.assertEquals(currentUrl, "https://www.facebook.com/", "URL redirection failed");

           WebElement acc= driver.findElement(By.linkText("Create new account"));
           Assert.assertTrue(acc.isDisplayed(), "Create an account section not found");
            acc.click();

            Thread.sleep(5000);

            WebElement fname = driver.findElement(By.name("firstname"));
            fname.sendKeys("John");

            WebElement lname = driver.findElement(By.name("lastname"));
            lname.sendKeys("Fernando");

            WebElement email= driver.findElement(By.name("reg_email__"));
             email.sendKeys("johnfernando98@gmail.com");
            email.clear();

            WebElement mno= driver.findElement(By.name("reg_email__"));
            mno.sendKeys("9786543980");
            Thread.sleep(1000);

            WebElement newpw= driver.findElement(By.name("reg_passwd__"));
            newpw.sendKeys("jofer98765");
            Thread.sleep(3000);

            WebElement month= driver.findElement(By.id("month"));
            month.sendKeys("june");

            WebElement day= driver.findElement(By.id("day"));
            day.sendKeys("13");

            WebElement year= driver.findElement(By.id("year"));
            year.sendKeys("1989");

            Thread.sleep(1000);

            driver.findElement(By.xpath("//*[@type=\"radio\"][@value=\"2\"]")).click();

            Thread.sleep(1000);

            WebElement signup= driver.findElement(By.xpath("//button[@name='websubmit']"));
            signup.click();


    }
}
