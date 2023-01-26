//package org.example;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Wait;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//import java.util.function.Function;
//
//public class FluentWait extends BaseTest{
//    @Test
//    public static void test1() throws InterruptedException {
//        driver.navigate().to ("https://seleniumpractise.blogspot.com/search?q=explicit+wait");
//
//        driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
////      driver.findElement(By.xpath("//p[text()='WebDriver']")).click();
//
//        Thread.sleep(3000);
//
//
//        Wait<WebDriver> wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(40))
//                .pollingEvery(Duration.ofSeconds(5))
//                .ignoring(NoSuchElementException.class);
//
//        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
//            public WebElement apply(WebDriver driver) {
//                WebElement e = driver.findElement(By.xpath("//p[@id='demo']"));
//                String value = e.getAttribute("innerHTML");
//                if (value.equalsIgnoreCase("WebDriver")) {
//                    return e;
//                } else {
//                    System.out.println("Text which is coming on screen page " +value);
//                    return null;
//                }
//            }
//        });
//        System.out.println("Element is displayed ? " + element.isDisplayed());
//    }
//}
////    WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()='WebDriver']")));
////    element.click();
////        System.out.println("Element is displayed ?" + element.isDisplayed());
//}
