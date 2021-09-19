package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Config {
    public static WebDriver driver;
    public static  WebDriver setUpDriver(String drivertype){
         if(drivertype.equalsIgnoreCase("ch")){
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
         }else if(drivertype.equalsIgnoreCase("ff")){
             WebDriverManager.firefoxdriver().setup();
             driver= new FirefoxDriver();
         }
         driver.manage().deleteAllCookies();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
         return driver;
    }
}
