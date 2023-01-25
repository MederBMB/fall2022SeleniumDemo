package homeworks;

import org.example.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MovingTest extends Base1 {


    @Test
    public void testWhatAreYouMoving() {
        driver.get("https://www.imoving.com/");
        WebElement houseTypeSelectMenu = driver.findElement(By.id("houseTypeSelectList"));
        Select select = new Select(houseTypeSelectMenu);
        select.selectByValue("1080");
        Helper.pause(3000);
        select.selectByVisibleText("My Apartment");
    }
    @Test
    public void testMoveSize(){
        WebElement moveSize = driver.findElement(By.id("hp-nav-select-house"));
        Select select2 = new Select(moveSize);
        select2.selectByValue("9509");

    }

}