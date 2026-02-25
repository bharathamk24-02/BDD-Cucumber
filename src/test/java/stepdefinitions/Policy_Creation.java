package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import reusablemethods.CommonMethods;
import steps.PolicyCreation_steps;

public class Policy_Creation extends CommonMethods {

    WebDriver driver;

    PolicyCreation_steps steps = new PolicyCreation_steps();

    @And("click on the action button and select new submission")
    public void clickOnTheActionButtonAndSelectNewSubmission() {

        steps.clickActionBtnAndClickNewSubmission();
    }

    @And("select the organisation")
    public void selectTheOrganisation() throws InterruptedException {
        steps.selectOrganisationFromPolicy();
    }

    @And("select Next from offering page and select next from qualifications page")
    public void selectNextFromOfferingPageAndSelectNextFromQualificationsPage() throws InterruptedException {
        steps.selectNextFromOfferingPageAndSelectNextFromQualificationsPage();
    }

    @And("select next from policy info page and click on add button from drivers")
    public void selectNextFromPolicyInfoPageAndClickOnAddButtonFromDrivers() throws InterruptedException {
        steps.selectNextFromPolicyInfopageAndClickOnAddButtonFromDrivers();
    }

    @And("select existing driver and enter the license#")
    public void selectExistingDriverAndEnterTheLicense() throws InterruptedException {
        steps.selectExistingDrivers();
    }

    @And("select the license state and click on the roles section")
    public void selectTheLicenseStateAndClickOnTheRolesSection() throws InterruptedException {
        steps.selectTheLicensestateAndClickOnTheRolesSection();
    }

    @And("enter the year first licensed and enter no of violations ,no of accidents field")
    public void enterTheYearFirstLicensedAndEnterNoOfViolationsNoOfAccidentsField() throws InterruptedException {
        steps.enterTheyearFirstLicensedAndEnterNoOfViolationsNoOfAccidentsField();
    }

    @And("click on next button from drivers page and click on create vehicle")
    public void clickOnNextButtonFromDriversPageAndClickOnCreateVehicle() throws InterruptedException {
        steps.clickOnNextbuttonFromDriverspageAndClickOnCreateVehicle();
    }

    @And("enter the vin number ,select license state and add existing driver ,enter the cost value")
    public void enterTheVinNumberSelectLicenseStateAndAddExistingDriverEnterTheCostValue() throws InterruptedException {
        steps.enterTheVinNumberSelectLicenseStateAndAddExistingDriverEnterTheCostValue();

    }

    @And("click on next btn from PA coverages page and click on next from risk analysis page")
    public void clickOnNextBtnFromPACoveragesPageAndClickOnNextFromRiskAnalysisPage() throws InterruptedException {
        steps.clickOnNextBtnFromPACoveragesPageAndClickOnNextFromRiskAnalysisPage();

    }

    @And("click on quote from policy review page and select binding options")
    public void clickOnQuoteFromPolicyReviewPageAndSelectBindingOptions() throws InterruptedException {
        steps.clickOnQuoteFromPolicyReviewPageAndSelectBindingOptions();
    }

    @And("select issue policy and click okay button")
    public void selectIssuePolicyAndClickOkayButton() throws InterruptedException {
        steps.selectIssuePolicyAndClickOkayButton();
    }

    @Then("click view your policy and validate summary policy table")
    public void clickViewYourPolicyAndValidateSummaryPolicyTable() throws InterruptedException {
        steps.clickViewYourPolicyAndValidateSummaryPolicyTable();

    }


}
