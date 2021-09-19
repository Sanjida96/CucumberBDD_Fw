package stepdefinations;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.Assert;
import pageobject.Signin_page;

public class SignIn extends Config {

    Signin_page SignIn =new Signin_page(driver);
    @Given("I am at talentTek home page")
    public void iminhomepage() {
        // String act;
        String exp = "Sign In";
        Assert.assertEquals(driver.getTitle(), exp);
    }

    @And("I click on create New Account button")
    public void iclicreatnewaccountbutton() {
    SignIn.clicreatnewaccountbutton();
    }


    }

