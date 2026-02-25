package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import reusablemethods.CommonMethods;
import steps.Claimcenter_FnonCreation_Steps;

public class ClaimcenterFnonCreation extends CommonMethods {

    WebDriver driver;

    Claimcenter_FnonCreation_Steps steps_claim = new Claimcenter_FnonCreation_Steps();

    @Given("User on the Guidware claim application")
    public void userOnTheGuidwareClaimApplication() throws InterruptedException {
        steps_claim.claimLogin();
    }


    @And("user click on claim button and click New claim")
    public void userClickOnClaimButtonAndClickNewClaim() throws InterruptedException {
        steps_claim.userClickOnClaimButtonAndClickNewClaim();
    }

    @And("click create unverifiedpolicy")
    public void clickCreateUnverifiedpolicy() throws InterruptedException {
        steps_claim.clickCreateUnverifiedpolicy();
    }

    @And("user enters the policy number ,type ,and loss date ,effective date ,expiration date")
    public void userEntersThePolicyNumberTypeAndLossDateEffectiveDateExpirationDate() throws InterruptedException {
        steps_claim.userEntersThePolicyNumberTypeAndLossdateEffectiveDateExpirationdate();
    }

    @And("select name and add person")
    public void selectNameAndAddPerson() throws InterruptedException {
        steps_claim.selectNameAndAddPerson();
    }

    @And("user enters the new person information as firstname ,lastaname,zipcode and click update button")
    public void userEntersTheNewPersonInformationAsFirstnameLastanameZipcodeAndClickUpdateButton() throws InterruptedException {
        steps_claim.userEnterusernamePassowrdAddressAndZipcode();
    }

    @And("user click next btn and select name")
    public void userClickNextBtnAndSelectName() throws InterruptedException {
        steps_claim.userClickNextBtnAndSelectName();
    }

    @And("user click next btn ,select lose cause and select location")
    public void userClickNextBtnSelectLoseCauseAndSelectLocation() throws InterruptedException {
        steps_claim.userClickNextBtnSelectLoseCauseAndSelectLocation();

    }

    @And("click on next btn from sevices page and click finish")
    public void clickOnNextBtnFromSevicesPageAndClickFinish() throws InterruptedException {
        steps_claim.clickOnNextBtnFromServicesPageAndClickFinish();
    }

    @Then("validate claim number and click on the claim number to validate details")
    public void validateClaimNumberAndClickOnTheClaimNumberToValidateDetails() throws InterruptedException {
        steps_claim.userValidateClaimNumberAndClickOnTheClaimNumberToValidateDetails();

    }


    @And("click on the action button ,select by coverage,select c ,select collision")
    public void clickOnTheActionButtonSelectByCoverageSelectCSelectCollision() throws InterruptedException {
        steps_claim.clickOnTheActionButtonSelectByCoverageSelectcSelectCollision();
    }

    @And("select claimant and select vehicle,new incident")
    public void selectClaimantAndSelectVehicleNewIncident() throws InterruptedException {
        steps_claim.selectClaimantAndSelectVehicleNewIncident();
    }

    @And("select vehicle ,enter year ,make,model and select driver")
    public void selectVehicleEnterYearMakeModelAndSelectDriver() throws InterruptedException {
        steps_claim.selectVehicleEnterYearMakeModelAndSelectDriver();
    }

    @And("select loss occured and click ok")
    public void selectLossOccuredAndClickOk() throws InterruptedException {
        steps_claim.selectLossOccuredAndClickOk();
    }

    @Then("click okay and validate driver details")
    public void clickOkayAndValidateDriverDetails() throws InterruptedException {
        steps_claim.clickOkayAndValidateDriverDetails();

    }


}
