package pageobject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Signup_page {
    public Signup_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;
        //locators
    }

    //functions
    @FindBy(how = How.NAME, using = "firstName")
    public WebElement firstNameLock;
    @FindBy(how = How.XPATH, using = "//*[@name='lastName']")
    public WebElement lastNameLock;
    @FindBy(how = How.CSS, using = "#signup-form > input:nth-child(6)")
    public WebElement emailLock;
    @FindBy(how = How.XPATH, using = "//*[@name='password']")
    public WebElement passlock;
    @FindBy(how = How.NAME, using = "confirmPassword")
    public WebElement ConfirmpassLock;
    @FindBy(how = How.NAME, using = "month")
    public WebElement monthLock;
    @FindBy(how = How.NAME, using = "day")
    public WebElement dayLock;
    @FindBy(how = How.NAME, using = "year")
    public WebElement yearLock;
    @FindBy(how = How.XPATH, using = "//*[@id='male']")
    public WebElement maleLock;
    @FindBy(how = How.XPATH, using = "//*[@id='female']")
    public WebElement femaleLock;
    @FindBy(how = How.ID, using = "defaultCheck1")
    public WebElement agreed;
    @FindBy(how = How.XPATH, using = "//*[@id='signup-form']/button")
    public WebElement createMyAccountButton;
    @FindBy(how = How.XPATH, using = "//*[@id='error_message']/div")
    public WebElement Validtionserror;

    //firstName
    public void enterFirstName(String firstName) {
        WebDriverWait wait = new WebDriverWait(Config.driver, 30);
        wait.until(ExpectedConditions.visibilityOf(firstNameLock));
        firstNameLock.clear();
        firstNameLock.sendKeys(firstName);


    }

    public void enterLastName(String lastName) {
        // wait
        WebDriverWait wait = new WebDriverWait(Config.driver, 30);
        wait.until(ExpectedConditions.visibilityOf(lastNameLock));
        lastNameLock.clear();
        lastNameLock.sendKeys(lastName);
    }

    public void enterEmailAddress(String email) {
        // wait
        WebDriverWait wait = new WebDriverWait(Config.driver, 30);
        wait.until(ExpectedConditions.visibilityOf(emailLock));
        emailLock.clear();
        emailLock.sendKeys(email);
    }

    public void enterthePassword(String pass) {
        // wait
        WebDriverWait wait = new WebDriverWait(Config.driver, 30);
        wait.until(ExpectedConditions.visibilityOf(passlock));
        passlock.clear();
        passlock.sendKeys(pass);

    }

    public void entertheconfirmPassword(String Confirmpass) {
        // wait
        WebDriverWait wait = new WebDriverWait(Config.driver, 30);
        wait.until(ExpectedConditions.visibilityOf(ConfirmpassLock));
        ConfirmpassLock.clear();
        ConfirmpassLock.sendKeys(Confirmpass);
    }

    public void enterMonth(int actMonth) {
        Select m = new Select(monthLock);
        m.selectByIndex(actMonth);
    }

    public void enterDay(String actDay) {
        Select d = new Select(dayLock);
        d.selectByVisibleText(actDay);
    }

    public void enterYear(String actYear) {
        Select y = new Select(yearLock);
        y.selectByVisibleText(actYear);
    }

    public void pickGenderAsMale() {
        maleLock.click();
    }

    public void pickGenderAsfemale() {
        femaleLock.click();
    }

    public void clickAgree() {
        agreed.click();

    }
    public void clickCreateMyAccountButton (){
        WebDriverWait wait = new WebDriverWait(Config.driver, 40);
        wait.until(ExpectedConditions.visibilityOf(createMyAccountButton));
        createMyAccountButton.click();
    }
    public void asserterrorMessage() {
        // Assert the error message
        String experrorMessage = "Validation error";
        String actualMessage = Validtionserror.getText().substring(0,21);
        System.out.println(actualMessage);
        Assert.assertEquals(actualMessage, experrorMessage);
    }

}

