package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Demo1{

    @Test
    public void testDemo1(){
        WebDriverManager.chromedriver().setup(); // Configure ChromeDriver to connect browser
        WebDriver driver = new ChromeDriver();   // Creating instance of ChromeDriver
        driver.manage().window().maximize();     // Maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //Driver will wait 20 seconds
        driver.get("https://demoqa.com/text-box");

        WebElement fullNameInputField = driver.findElement(By.id("userName"));
        fullNameInputField.sendKeys("John Doe");

        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys("john@gmail.com");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Address 123");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("NewAddress 456");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");


        WebElement submitButton =driver.findElement(By.id("submit"));
        submitButton.click();




    }

}


