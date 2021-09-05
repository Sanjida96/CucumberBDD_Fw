package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobject.Signup_page;

public class Talentteksignupsteps {
    @And("I enter student's  date of birth")
    public void iEnterStudentSDateOfBirth() {
        Signup_page.enterfirstname();

    }

    @Given("I click on create new account")
    public void iClickOnCreateNewAccount() {
    }
}
