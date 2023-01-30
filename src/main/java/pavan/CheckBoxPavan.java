package pavan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxPavan {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

         driver.get("https://itera-qa.azurewebsites.net/home/automation");
         //  1)  Select a specific check box
         //        driver.findElement(By.xpath("//input[@id='monday']")).click();

         //  2) Select all the checkboxes
        List <WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
        System.out.println("Total number of check boxes:"+checkboxes.size());

         //   using for loop

//        for (int i=0; i<=checkboxes.size(); i++);
//        {
//            int i= checkboxes.size();
//            checkboxes.get(i).click();
//        }
        // using for each loop
//        for (WebElement chbox:checkboxes)
//        {
//            chbox.click();
//
//        }
        //   3) select a multiple checkboxes by choice (monday, thursday, sunday)
//        for (WebElement chbox:checkboxes)
//        {
//            String checkboxname = chbox.getAttribute("id");
//            if (checkboxname.equals("monday") || checkboxname.equals("thursday") || checkboxname.equals("sunday"))
//            {
//                chbox.click();
//            }
//
//        }

        // 4) select last 2 check boxes
        // (total number of checkboxes - number of checkboxes want to select = starting index)
        // 7 - 2 = 5

        int totalcheckboxes = checkboxes.size();
//        for (int i = totalcheckboxes -2; i<totalcheckboxes; i++)
//        {
//            checkboxes.get(i).click();
//        }
//        5) select first 2 checkboxes;
        for (int i=0; i<totalcheckboxes; i++)
        {
            if (i<2)
            checkboxes.get(i).click();
        }





    }



}
