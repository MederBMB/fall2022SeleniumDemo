package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import static org.example.Helper.ts;

public class CaptureScreenshots {

    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

//        Full Page Screenshot
//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File src=ts.getScreenshotAs(OutputType.FILE);
//        File trg = new File(".\\screenshots\\homepage.png");
//
//        FileUtils.copyFile(src, trg);
//
//        driver.close();
//        Helper.takeFullPageScreenshot(driver, "SDET");


//    Screenshot of section/portion of the page

//       WebElement section = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
//       File src = section.getScreenshotAs(OutputType.FILE);
//       File trg = new File(".\\screenshots\\featuredproducts.png");
//       FileUtils.copyFile(src, trg);
//       Helper.takeSectionScreenshot(section, "featured");

       WebElement elem = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//       File src = elem.getScreenshotAs(OutputType.FILE);
//       File trg = new File(".\\screenshots\\logo2.png");
//       FileUtils.copyFile(src, trg);
        Helper.takeElementScreenshot(elem, "Logo2");

    }
}
