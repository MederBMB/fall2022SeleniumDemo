package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UploadDownLoadDemo extends BaseTest{

    @Test
    public void test1(){
        driver.navigate().to("https://demoqa.com/upload-download");
        driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\Админ\\Desktop\\Meder\\aza");
    }
}
