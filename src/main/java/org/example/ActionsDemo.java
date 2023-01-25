package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsDemo  extends BaseTest{

    Actions actions = new Actions(driver);

//    @Test
//    public void testRadioButton() throws Exception{
//        driver.get("https://demoqa.com/radio-button");
////label[@for='yesRadio
//        WebElement yesRadio = driver.findElement(By.xpath(".//label[@for='yesRadio']"));
//        yesRadio.click();
//        Thread.sleep(3000);
//        Assert.assertTrue(yesRadio.isEnabled());
//
//        WebElement commands = driver.findElement(By.xpath(""));
////                enter home/click command
//    }
//    @Test
//    public void testRightClick() {
//        driver.get("https://demoqa.com/buttons");
//        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
//
//        Actions actions = new Actions(driver);
//        actions.doubleClick(doubleClickBtn).perform();
//        Assert.assertEquals(driver.findElement(By.id("doubleClickMessage")).getText(), "You have done a double click");
//
//        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
//        actions.contextClick(rightClickBtn).perform();
//        Assert.assertTrue(driver.findElement(By.id("rigthClickMessage")).getText().contains("You have done a right click"));
//
//        WebElement clickMeBtn = driver.findElement(By.xpath(".//button[text()='Click Me]"));
//        actions.click(clickMeBtn).perform();
//        Helper.pause(3000);
//        WebElement clickMessage = driver.findElement(By.id("dynamicClickMessage"));
//        Assert.assertEquals(clickMessage.getText(), "You have done a dynamic click");
//    }
        @Test
        public void testMoveToElementAndSelect(){
        driver.get("https://www.imoving.com/");
        WebElement houseTypeSelectMenu = driver.findElement(By.id("houseTypeSelectList"));
            Select select = new Select(houseTypeSelectMenu);
            select.selectByValue("1080");
            Helper.pause(3000);
            select.selectByVisibleText("My Apartment");
            Helper.pause(3000);
            select.selectByIndex(3);
            Helper.pause(3000);


    }


}
