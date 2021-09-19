package pageobject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Signup_page {
    public Signup_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;
        //locators


        //functions
    }

}
