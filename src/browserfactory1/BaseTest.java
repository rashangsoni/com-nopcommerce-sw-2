package browserfactory1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;


    public static String baseUrl = "https://demo.nopcommerce.com/";

    public void openBrowser(String baseUrl){
        driver = new ChromeDriver();

        driver.get(baseUrl);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    public void closeBrowser(){driver.close();}
}


