package org.example;

import org.bouncycastle.asn1.dvcs.DVCSObjectIdentifiers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ElementNotVisibleExceptionDemo extends BaseTest {
    @Test
    public void ElementNotVisible() {
        driver.navigate().to("https://www.google.com/");
        WebElement enableAfter = driver.findElement(By.xpath("//div[@class='gb_j']"));
        enableAfter.click();




    }

}