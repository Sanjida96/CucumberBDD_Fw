package pageobject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Signin_page extends Config {

    public Signin_page (WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }

    // locators
    @FindBy(how = How.LINK_TEXT, using = "Create New Account")
    public WebElement clicktocreatenewacoountfromSIGNINpage;

   // public Signin_page (WebDriver driver){
    //    PageFactory.initElements(driver,this);
    //    Config.driver =driver;
   // }

    public void clicreatnewaccountbutton() {
        clicktocreatenewacoountfromSIGNINpage.click();
    }
}