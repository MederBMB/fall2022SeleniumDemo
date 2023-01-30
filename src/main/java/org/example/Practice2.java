package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice2 extends BaseTest{

    @Test
    public void radioButtonClick(){
        driver.navigate().to("https://demoqa.com/radio-button");
        WebElement radioBtn = driver.findElement(By.xpath("//label[normalize-space()='Yes']"));
        radioBtn.click();
        Assert.assertTrue(radioBtn.isEnabled());
        String text =driver.findElement(By.xpath("//p[@class='mt-3']")).getText();
//        Assert.assertEquals(text, "You have selected ");



    }
}
