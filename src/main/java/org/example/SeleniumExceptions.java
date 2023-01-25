package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SeleniumExceptions extends BaseTest {

    @Test
    public void demo1() {
        // NoSuchElementException:
        browserHelper.openURL("https://demoqa.com/text-box");
        driver.findElement(By.id("userName1")).sendKeys("Hello World");
    }

    @Test
    public void noSuchWindowException() {
        //NoSuchWindowException
        browserHelper.openURL("https://demoqa.com/text-box");
        browserHelper.switchToWindow(5);
        driver.switchTo().window("id");
    }

    @Test
    public void noSuchFrameException() {
        // NoSuchFrameException
        browserHelper.openURL("https://demoqa.com/text-box");
        driver.switchTo().frame(5);
    }

    @Test
    public void noSuchAlertException() {
        // NoAlertPresentException
        browserHelper.openURL("https://demoqa.com/text-box");
        alertHelper.acceptAlert();

    }

    @Test
    public void invalidSelectorExceptionTest() {
        //   InvalidSelectorException
        browserHelper.openURL("https://demoqa.com/text-box");
        driver.findElement(By.xpath("(//button[@type='button'][100]"));
    }

    @Test
    public void noSuchSessionExceptionTest() {
        // NoSuchSessionException
        driver.quit();
        browserHelper.openURL("https://demoqa.com/text-box");
    }

    @Test
    public void staleElementReferenceExceptionTest() {
        // StaleElementReferenceException
        browserHelper.openURL("https://www.amazon.com/");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Iphone", Keys.ENTER);
        List<WebElement> allBrands = driver.findElements(By.xpath("//div[@id='brandsRefinements']//ul/li/span/a"));
        int count = 0;
        for (WebElement e : allBrands) {
            count++;
            if (e.getText().contains("SAMSUNG")) {
                driver.findElement(By.xpath("(//div[@id='brandsRefinements']//ul/li/span/a/div/label/i)" + "[" + count + "]")).click();
            }
        }
    }

    @Test
    public void timeOutExceptionTest(){
          // TimeOutException
          browserHelper.openURL("https://demoqa.com/dynamic-properties");
          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0)) ;
          wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter"))).click();

    }

    @Test
    public void test123(){
        browserHelper.openURL("https://demoqa.com/text-box");
        driver.findElement(By.id("userName")).click();
    }
}
