package org.example;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoQATest {

    WebDriver driver;

    @BeforeClass
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");

    }

    @Test
    public void textBoxTest() throws InterruptedException {


        Faker faker = new Faker();

        String name = faker.name().fullName();
//        String email = faker.internet().emailAddress();
//        String currentAddress = faker.address().fullAddress();
//        String permanentAddress = faker.address().secondaryAddress();

        WebElement fullNameInput = driver.findElement(By.id("userName"));
//        WebElement emailInput = driver.findElement(By.id("userEmail"));
//        WebElement currentAddressInput = driver.findElement(By.id("currentAddress"));
//        WebElement permanentAddressInput = driver.findElement(By.id("permanentAddress"));

        fullNameInput.sendKeys(name);
//        emailInput.sendKeys(email);
//        currentAddressInput.sendKeys(currentAddress);
//        permanentAddressInput.sendKeys(permanentAddress);

        Thread.sleep(3000);

        WebElement submitButton = driver.findElement(By.id("submit"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        submitButton.click();

        WebElement actualNameElement= driver.findElement(By.id("name"));

        String actualNameText = actualNameElement.getText();
        Assert.assertEquals(actualNameText,"Name:"+name);
        Assert.assertTrue(actualNameText.contains(name));

//        WebElement actualEmail = driver.findElement(By.id("email"));
//        WebElement actualCurrentAddress = driver.findElement(By)
//        WebElement actualPermanentAddress = driver.findElement(By)



    }
    @AfterClass
    public void close(){
        driver.close();
        driver.quit();
    }
}
