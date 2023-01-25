package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrowsersDemo extends BaseTest{


    @Test
    public void test1(){
        browserHelper.openURL("https://demoqa.com/browser-windows");

        WebElement newTab =driver.findElement(By.xpath("//button[@id='tabButton']"));
        newTab.click();
        Helper.pause(5000);
        browserHelper.switchToWindow(0);
        Helper.pause(3000);
        browserHelper.switchToParent();



    }
}
