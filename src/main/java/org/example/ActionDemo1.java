package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionDemo1 extends BaseTest{

//    @Test
//    public void testDoubleClick(){
//        browserHelper.openURL("https://demoqa.com/buttons");
//        WebElement doubleClickBtn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
//
//        Actions action = new Actions(driver);
//        action.doubleClick(doubleClickBtn).build().perform();
        @Test
    public void testAlert(){
            driver.navigate().to("https://demoqa.com/alerts");
//            WebDriver buttonAlert = driver.findElement(By.linkText("Click me"));
            driver.findElement(By.className("btn btn-primary"));
            driver.findElement(By.xpath(""));
        }



}
