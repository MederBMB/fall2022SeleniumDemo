package homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.BrowserHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class Base1 {

    WebDriver driver;
    BrowserHelper browserHelper;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        browserHelper=new BrowserHelper(driver);

    }
}
