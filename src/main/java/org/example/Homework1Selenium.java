package org.example;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.function.FailableShortSupplier;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Homework1Selenium {

    static Faker faker = new Faker();
    public String expectedFakeName;
    public String expectedFakeEmail;
    public String expectedFakeAddress;
    public String expectedFakePerAddress;

    @Test
    public void testCheck() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");

        WebElement fullNameInputField = driver.findElement(By.id("userName"));
        fullNameInputField.sendKeys(faker.name().firstName());

        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys(faker.internet().emailAddress());

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys(faker.address().city());

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys(faker.address().buildingNumber());


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");


        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();


        String fakeName = driver.findElement(By.id("name")).getText();
        String fakeEmail = driver.findElement(By.id("email")).getText();
        String fakeAddress = driver.findElement(By.id("currentAddress")).getText();
        String fakePerAddress = driver.findElement(By.id("permanentAddress")).getText();

        String expectedName = "Gulzat";
        String expectedEmail = "Gulzat@gmail.com";
        String expectedAddress = "Chui 115";
        String expectedPerAdd = "5676";


        assertEquals(fakeName, expectedName, "You  enter wrong name");
        assertEquals(fakeEmail, expectedEmail, "You input wrong email");
        assertEquals(fakeAddress, expectedAddress, "You enter wrong address");
        assertEquals(fakePerAddress, expectedPerAdd, "You enter wrong  permanent address");

        driver.close();
    }
}
//        @Test
//        public void headingText(){
//            driver.get("https://phptravels.com/demo/");
//            driver.manage().window().maximize();
//            String expectedHeading = "APPLICATION TEST DRIVE";
//
//            //Storing the text of the heading in a string
//            String heading = driver.findElement(By.xpath("//div[@class='text']//h2")).getText();
//            if(expectedHeading.equalsIgnoreCase(heading))
//                System.out.println("The expected heading is same as actual heading --- "+heading);
//            else
//                System.out.println("The expected heading doesn't match the actual heading --- "+heading);
//        }
//        @AfterTest
//        public void tearDown(){
//            driver.quit();
//        }
//    }
//
//
//
//
//
//
//
//
//        }




