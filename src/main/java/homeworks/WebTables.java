package homeworks;

import org.example.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class WebTables extends Base1 {

    @Test
    public void addNewUser() {
        driver.navigate().to("https://demoqa.com/webtables");
        driver.findElement(By.xpath("(//button[normalize-space()='Add'])[1]")).click();
        WebDriverWait wait = (new WebDriverWait(driver, Duration.ofSeconds(15)));
        Helper.pause(3000);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//div[@class='modal-body'])[1]"))));

        WebElement inputNameField = driver.findElement(By.xpath("//input[@id='firstName']"));
        inputNameField.sendKeys("Meder");
        WebElement inputLastNameField = driver.findElement(By.xpath("//input[@id='lastName']"));
        inputLastNameField.sendKeys("Boobekov");
        Helper.pause(3000);

        WebElement inputEmailField = driver.findElement(By.xpath("//input[@id='userEmail']"));
        inputEmailField.sendKeys("Boobekovmeder@gmail.com");
        WebElement inputAgeField = driver.findElement(By.xpath("//input[@id='age']"));
        inputAgeField.sendKeys("33");
        Helper.pause(3000);

        WebElement inputSalaryField = driver.findElement(By.xpath("//input[@id='salary']"));
        inputSalaryField.sendKeys("2500");
        WebElement inputDepartmentField = driver.findElement(By.xpath("//input[@id='department']"));
        inputDepartmentField.sendKeys("Freedom Technology");
        Helper.pause(3000);

        Actions action = new Actions(driver);
        WebElement submitButton = driver.findElement(By.xpath("(//button[normalize-space()='Submit'])[1]"));
        action.click(submitButton).perform();
        Helper.pause(3000);

        List<WebElement> userList = driver.findElements(By.xpath("//div[@class='rt-tr-group']"));

        for (WebElement e : userList) {
            if (e.getText().equals(inputNameField)) {
                System.out.println(e.getText());
//                WebElement user= driver.findElement(By.xpath("(//div[normalize-space()='Meder'])[1]"));
//                System.out.println(user.getText());



            }


        }

    }}





