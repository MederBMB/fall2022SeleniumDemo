package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class XpathHomeWork {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://glovoapp.com/kg/ru/bishkek/");
    }

    @Test(description = "Find start button", priority = 1)
    public void xPath() {
        WebElement searchButton = driver.findElement(By.xpath("(//button[@id='user-register'])[2]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        searchButton.click();
    }

    @Test(priority = 2)
    public void putName() {
        WebElement nameButton = driver.findElement(By.xpath("//*[@id=\"signup-name\"]/div/input"));
        nameButton.sendKeys("Meder");
    }

    @Test(priority = 3)
    public void putEmail() {
        WebElement emailButton = driver.findElement(By.xpath("//*[@id=\"signup-email\"]/div/input"));
        emailButton.sendKeys("meder.boobekov@bk.ru");
    }

    @Test(priority = 4)
    public void putPassword() {
        WebElement passwordButton = driver.findElement(By.xpath("//*[@id=\"signup-password\"]/div/div/input"));
        passwordButton.sendKeys("@glovoP@$$w0rd123@");
    }

    @Test (priority = 5)
    public void registerButton(){
        WebElement regButton = driver.findElement(By.xpath("//*[@id=\"signup-button\"]/span"));
        regButton.click();
    }

    @Test (priority = 6)
    public void getInGlovo(){
        WebElement getIn = driver.findElement(By.xpath("//*[@id=\"base-modal\"]/div/div[2]/div/div/div/div[3]/button/span"));
        getIn.click();
    }

    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}

