package homeworks;

import org.example.BrowserHelper;
import org.example.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NambaTest extends Base1{

    @Test
    public void testShop(){
        driver.navigate().to("https://nambafood.kg/?language=ru");
        WebElement marketShop = driver.findElement(By.xpath("(//div[@class='home--cat-prev'])[4]"));
        Helper.waitForElementToBeDisplayed(driver, marketShop);
        marketShop.click();
        Helper.pause(3000);
        Actions action = new Actions(driver);
        action.click(marketShop).perform();
        browserHelper.backURL();
        Helper.pause(3000);


//        action.moveToElement( driver.findElement(By.xpath("(//a[@href='#'])[2]"))).build().perform();
//        Helper.pause(3000);
//        WebElement forPartners = driver.findElement(By.xpath("(//a[contains(text(),'Для партнера')])[1]"));
//        Select select = new Select(forPartners);
//        select.selectByVisibleText("Для партнера");


    }

}
