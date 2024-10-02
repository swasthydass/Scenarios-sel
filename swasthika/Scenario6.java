package com.facebook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Scenario6 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");

        WebElement frameele= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(frameele);

        Thread.sleep(3000);

        WebElement sourceelement= driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
        WebElement targetelement= driver.findElement(By.xpath("//*[@id=\"droppable\"]"));

        String initialColor = targetelement.getCssValue("background-color");
        System.out.println("initial color:" +initialColor);

        String initialtext= targetelement.getText();
        System.out.println("initialtext:" +initialtext);

        Actions action= new Actions(driver);
        action.dragAndDrop(sourceelement,targetelement).perform();

        String finalcolor = targetelement.getCssValue("background-color");
        System.out.println("final color: " +finalcolor );

        String finaltext= targetelement.getText();
        System.out.println("finaltext:" +finaltext);

        Assert.assertNotEquals(initialColor,finalcolor);
        System.out.println("Color change verified successfully!");

        Assert.assertNotEquals(initialtext,finaltext);
        System.out.println("Text changed to "+ finaltext);


        driver.quit();


    }


    }

