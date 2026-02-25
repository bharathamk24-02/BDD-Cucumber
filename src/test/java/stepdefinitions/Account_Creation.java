package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import reusablemethods.CommonMethods;
import steps.AccountCreation_Steps;

public class Account_Creation extends CommonMethods {

    WebDriver driver;

    AccountCreation_Steps steps = new AccountCreation_Steps();

    @Given("User on the Guidware application")
    public void userOnTheGuidewareApplication() throws InterruptedException {
       steps.login();
    }

    @When("user enters the username and password")
    public void userEntersTheUsernameAndPassword() throws InterruptedException {
        steps.enterUserNameAndPassword();
    }

    @And("user click on the okay Button")
    public void userClickOnTheOkayButton() throws InterruptedException {
        steps.loginButton();
    }

    @And("user click on Account button and click New account creation")
    public void userClickOnAccountButtonAndClickNewAccountCreation() throws InterruptedException {
        steps.clickAccountBtn();
        steps.clickNewAccountBtn();
    }

    @And("user enters the firstname ,lastname")
    public void userEntersTheFirstnameLastname() throws InterruptedException {
        steps.enterFirstName();
        steps.enterLastName();
    }

    @And("user click on the search button")
    public void userClickOnTheSearchButton() throws InterruptedException {
     steps.clickSubmitbtn();
    }

    @And("user click on the create new account button and select account type")
    public void userClickOnTheCreateNewAccountButtonAndSelectAccountType() throws InterruptedException {
        steps.clickNewAccountCreationBtnAndSelectPerson();
    }


    @And("user enters the account details as firstname,lastaname,address,zipcode,addresstypeand select organization")
    public void userEntersTheAccountDetailsAsFirstnameLastanameAddressZipcodeAddresstypeandSelectOrganization() throws InterruptedException {
        steps.enterAddress();
        steps.enterPincode();
        steps.selectAddressType();
        steps.selectOrganisation();
    }

    @And("user enters the organization name and click on search button,select the organization")
    public void userEntersTheOrganizationNameAndClickOnSearchButtonSelectTheOrganization() throws InterruptedException {
       steps.entersOrganisationName();
    }

    @And("user click on the update button")
    public void userClickOnTheUpdateButton() throws InterruptedException {
     steps.clickOrganisationUpdateBtn();
    }

    @Then("validate the account summary page details")
    public void validateTheAccountSummaryPageDetails() throws InterruptedException {
      steps.validateAccountDetails();
    }



}
