package stepdefinations;

import base.Config;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import pageobject.Signup_page;

public class SignUp extends Config {
    Signup_page SignUp = new Signup_page(driver);
    Faker faker = new Faker();
    @And("I enter student information with valid email adress")
    public void ienterstudentinformationwithvalidEmailAdress(){
        String firstName = faker.name().firstName();
        SignUp.enterFirstName(firstName);
        String lastName = faker.name().lastName();
        SignUp.enterLastName(lastName);
        // email
        String email = faker.internet().safeEmailAddress();
        SignUp.enterEmailAddress(email);
        String pass =faker.internet().password();
        SignUp.enterthePassword(pass);
        String Confirmpass=faker.internet().password();
        SignUp.entertheconfirmPassword(Confirmpass);
        SignUp.enterMonth(10);
        SignUp.enterDay("28");
        SignUp.enterYear("1996");
       SignUp.pickGenderAsMale();
        SignUp.pickGenderAsfemale();
        SignUp.agreed.click();
  //  }
  //  @When("I click on Create My Account button")
   // public void iClickOnCreateMyAccountButton() {
       SignUp.clickCreateMyAccountButton();
  //  }

   // @Then("I will verify Thank you message")
   // public void iWillVerifyThankYouMessage() {
        SignUp.asserterrorMessage();
    }

    }

