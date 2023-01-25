package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Frames extends BaseTest{

    @Test
    public void test1(){
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame(2);
        WebElement text1 = driver.findElement(By.id("sampleHeading"));
        System.out.println(text1.getText());
    }
    @Test
    public void testWaitEtsy(){
        driver.navigate().to("https://www.etsy.com/");

    }



}
