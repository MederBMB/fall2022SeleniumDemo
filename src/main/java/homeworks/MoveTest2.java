package homeworks;

import org.example.Helper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class MoveTest2 extends Base1 {
    @Test(priority = 1)
    public void testMoveHome() {
        driver.get("https://www.imoving.com/full-inventory/#!/");
        WebElement houseMenu = driver.findElement(By.id("houseTypeSelectList"));
        Select select = new Select(houseMenu);
        select.selectByValue("1080");
        Helper.pause(3000);

        WebElement moveSizeMenu = driver.findElement(By.id("hp-nav-select-house"));
        Select select2 = new Select(moveSizeMenu);
        select2.selectByVisibleText("Just a few Items");
        Helper.pause(3000);

        WebElement clickQuotes = driver.findElement(By.xpath("//button[@class='btn btn-white quickQuoteLink']"));
        clickQuotes.click();
        Helper.pause(3000);

        WebElement continuesBox = driver.findElement(By.xpath("//span[@class='col-sm-9 col-xs-12']"));
        continuesBox.click();
        Helper.pause(3000);

        driver.findElement(By.xpath("//div[@class='modal-buttons']/a")).click();
        Helper.pause(3000);
        driver.findElement(By.id("closeTutorial")).click();

        Actions action = new Actions(driver);
        WebElement pictureDresser = driver.findElement(By.xpath("//div[@class='14']//figure"));
        action.moveToElement(pictureDresser).build().perform();
        driver.findElement(By.xpath("//div[@class='14']//a[@class='btn btn-blue'][normalize-space()='Add to Inventory']")).click();
        Helper.pause(3000);

        WebElement plusBoxDresser = driver.findElement(By.xpath("//span[@class='quantityCounterBlock']//button[@class='quantity-plus']"));
        action.doubleClick(plusBoxDresser).perform();
        Helper.pause(3000);

        WebElement bedImageContainer = driver.findElement(By.xpath("//div[@class='13']//figure"));
        action.moveToElement(bedImageContainer).build().perform();
        driver.findElement(By.xpath("//div[@class='13']//a[@class='btn btn-blue'][normalize-space()='Add to Inventory']")).click();
        Helper.pause(3000);
        WebElement plusBoxBed = driver.findElement(By.xpath("(//button[@class='quantity-plus'])[3]"));
        action.doubleClick(plusBoxBed).perform();

        WebElement tvImageContainer = driver.findElement(By.xpath("//div[@class='12']//figure"));
        action.moveToElement(tvImageContainer).build().perform();
        driver.findElement(By.cssSelector("div[class='12'] div[class='add-item-mob visible-xs-block visible-sm-block'] a[class='btn btn-blue']")).click();
        Helper.pause(3000);
        WebElement plusBoxTv = driver.findElement(By.xpath("(//button[@class='quantity-plus'])[5]"));
        action.doubleClick(plusBoxTv).perform();

        WebElement boxItem = driver.findElement(By.xpath("(//div[@class='arrowOpenRightNavigation leftArrowNavi'])[2]"));
        boxItem.click();
        driver.findElement(By.xpath("(//span[@class='roomPanelIcon quantity-plus1'])[1]")).click();

        WebElement expectedItems = driver.findElement(By.xpath("//span[@class='room-counter']"));
        Assert.assertEquals(expectedItems.getText(), "9 items");

//        WebElement actualdresser = driver.findElement(By.xpath("//h3[text()='Dresser']"));
//        Assert.assertEquals(actualdresser.getText(), "Dresser");
//
//        WebElement actualbed =driver.findElement(By.xpath("//h3[normalize-space()='Bed (All parts included)']"));
//        Assert.assertEquals(actualbed.getText(),"Bed (All parts included)");
//
//        WebElement actualTV = driver.findElement(By.xpath( "//h3[contains(text(),'Tv')]"));
//        Assert.assertEquals(actualTV.getText(),"Tv");


        WebElement chairImageContainer = driver.findElement(By.xpath("//div[@class='11']//figure"));
        action.moveToElement(chairImageContainer).build().perform();
        driver.findElement(By.xpath("//div[@class='11']//a[@class='btn btn-blue'][normalize-space()='Add to Inventory']")).click();
        Helper.pause(3000);
        WebElement plusBoxChair = driver.findElement(By.xpath("(//button[@class='quantity-plus'])[7]"));
        action.doubleClick(plusBoxChair).perform();

        WebElement sofaImageContainer = driver.findElement(By.xpath("//div[@class='10']//figure"));
        action.moveToElement(sofaImageContainer).build().perform();
        driver.findElement(By.xpath("//div[@class='10']//a[@class='btn btn-blue'][normalize-space()='Add to Inventory']")).click();
        Helper.pause(3000);
        WebElement plusBoxSofa = driver.findElement(By.xpath("(//button[@class='quantity-plus'])[9]"));
        action.doubleClick(plusBoxSofa).perform();


        WebElement complete = driver.findElement(By.xpath("//h3[text()='Complete Order']"));
        complete.click();
        driver.findElement(By.xpath("(//button[@class='quantity-plus'])[1]")).click();
        driver.findElement(By.xpath("(//button[@class='quantity-plus'])[2]")).click();
        Helper.pause(3000);
        driver.findElement(By.xpath("(//button[@class='quantity-plus'])[5]")).click();
        driver.findElement(By.xpath("(//button[@ng-disabled='roomBox.disabled'])[18]")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Add and Continue']")).click();
        Helper.pause(3000);


    }
    @Test(priority = 2)
    public void enterZipCode () {
        WebElement inputField = driver.findElement(By.xpath("(//input[@name='addressInput'])[1]"));
        inputField.sendKeys("123 William Street, New York, NY 10038, USA");
        Helper.pause(3000);
        driver.findElement(By.xpath("(//button[@class='btn btn-green save-instructions'][normalize-space()='Approve'])[1]")).click();
//        WebDriverWait wait= (new WebDriverWait(driver, Duration.ofSeconds(15)));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-green save-instructions'][normalize-space()='Approve'])[1]")));
//        driver.findElement(By.xpath("(//button[@class='btn btn-blue open-instructions'])[1]")).click();

        WebElement inputFieldDropOffAt =driver.findElement(By.xpath("(//input[@name='addressInput'])[2]"));
       inputFieldDropOffAt.sendKeys("124 Conch Street, Port St. Joe, FL 32456, USA");
        Helper.pause(3000);
        driver.findElement(By.cssSelector("(//button[@class='btn btn-green save-instructions'])[4]")).click();

        driver.findElement(By.xpath("//button[normalize-space()='Confirm']")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='Choose Movers'])[1]")).click();

    }
}
