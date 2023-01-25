package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class CssDemo extends BaseTest {

    @Test
    public void cssTest1() {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Iphone", Keys.ENTER);

        WebElement appleText = driver.findElement(By.cssSelector("li[id='p_89/Apple']"));
        System.out.println(appleText.getText());
        List<WebElement> allBrands = driver.findElements(By.xpath("//div[@id='brandsRefinements']/child::ul/descendant::a"));

        driver.findElement(By.cssSelector("a[aria-label='See more, Brands'] span[class='a-expander-prompt']\n")).click();
       clickAnElementMatchingText(allBrands,"Google");



    }
    private void clickAnElementMatchingText(List<WebElement> alBrands,String brand){
        for (WebElement e:alBrands) {
            String element = e.getText();
            if (element.equalsIgnoreCase(brand)){
                e.click();
                break;

        }


            }

        }

    }
