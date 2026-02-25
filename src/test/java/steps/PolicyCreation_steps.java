package steps;

import hooks.Hooks;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import reusablemethods.CommonMethods;

import java.util.List;

public class PolicyCreation_steps extends CommonMethods {
    WebDriver driver;

    public PolicyCreation_steps() {
        driver = Hooks.getDriver();
    }


    public void clickActionBtnAndClickNewSubmission() {

        Actions actions = new Actions(driver);
        WebElement actionsBtn = driver.findElement(By.xpath("//span[@id=\"AccountFile:AccountFileMenuActions-btnEl\"]"));
        actions.moveToElement(actionsBtn, 30, 0).click().perform();
        driver.findElement(By.xpath("//span[@id=\"AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewSubmission-textEl\"]")).click();
    }

    public void selectOrganisationFromPolicy() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id=\"NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:7:addSubmission\"]")).click();

    }


    public void selectNextFromOfferingPageAndSelectNextFromQualificationsPage() throws InterruptedException {
        Thread.sleep(1000);
        driver.navigate().refresh();
        driver.findElement(By.id("SubmissionWizard:Next-btnInnerEl")).click();

        Thread.sleep(1000);
        driver.navigate().refresh();
        driver.findElement(By.id("SubmissionWizard:Next-btnInnerEl")).click();
    }

    public void selectNextFromPolicyInfopageAndClickOnAddButtonFromDrivers() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id("SubmissionWizard:Next-btnInnerEl")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[contains(text(),'Add')][@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver-btnInnerEl\"])")).click();

    }

    public void selectExistingDrivers() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddExistingContact-textEl\"]")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddExistingContact:0:UnassignedDriver-textEl\"]")).click();

        Thread.sleep(1000);
        WebElement dob = driver.findElement(By.xpath("//input[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:DateOfBirth-inputEl']"));
        dob.click();
        dob.clear();
        dob.sendKeys("02/24/1952");

        WebElement License = driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:LicenseInputSet:LicenseNumber-inputEl"));
        String licenseNum = RandomStringUtils.randomNumeric(8);
        License.sendKeys(licenseNum);

    }

    public void selectTheLicensestateAndClickOnTheRolesSection() throws InterruptedException {
        driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:LicenseInputSet:LicenseState-inputEl")).click();
        driver.findElement(By.xpath("//li[contains(text(),'Alaska')]")).click();
        //Roles Btn
        driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:RolesCardTab-btnInnerEl")).click();
        Thread.sleep(1000);
    }

    public void enterTheyearFirstLicensedAndEnterNoOfViolationsNoOfAccidentsField() throws InterruptedException {
        WebElement licensedYear = driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PolicyDriverInfoDV:yearlicensed-inputEl"));
        licensedYear.click();
        licensedYear.sendKeys("2016");

        driver.findElement(By.xpath("((//div[@class='x-grid-item-container'])[4]//div[@class='x-grid-cell-inner '])[2]")).click();

        Thread.sleep(1000);
        WebElement noOfAccident_1 = driver.findElement(By.xpath("//li[contains(text(),'0')][1]"));
        noOfAccident_1.click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("((//div[@class='x-grid-item-container'])[4]//div[@class='x-grid-cell-inner '])[3]")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("(//li[contains(text(),'0')])[2]")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("((//div[@class='x-grid-item-container'])[4]//div[@class='x-grid-cell-inner '])[6]")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class=\"x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box x-boundlist-above\"]//li[text()=\"0\"]")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("((//div[@class='x-grid-item-container'])[4]//div[@class='x-grid-cell-inner '])[7]")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class=\"x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box x-boundlist-above\"]//li[text()=\"0\"]")).click();


    }


    public void clickOnNextbuttonFromDriverspageAndClickOnCreateVehicle() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id("SubmissionWizard:Next-btnInnerEl")).click();

        Thread.sleep(1000);
        driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel_tb:Add-btnInnerEl")).click();

    }

    public void enterTheVinNumberSelectLicenseStateAndAddExistingDriverEnterTheCostValue() throws InterruptedException {

        Thread.sleep(1000);
        WebElement vinNum = driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Vin_DV-inputEl"));
        String vinNum1 = RandomStringUtils.randomNumeric(4);
        vinNum.sendKeys(vinNum1);

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicensePlate_DV-inputEl']")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicenseState_DV-inputEl']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class=\"x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box x-boundlist-above\"]//li[text()=\"Alaska\"]")).click();

        Thread.sleep(1000);
        driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver")).click();

        Thread.sleep(1000);
        driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver:0:Driver-textEl")).click();

        Thread.sleep(1000);
        WebElement costAmt = driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:CostNew_DV-inputEl"));
        costAmt.sendKeys("200");
        Thread.sleep(1000);
    }

    public void clickOnNextBtnFromPACoveragesPageAndClickOnNextFromRiskAnalysisPage() throws InterruptedException {

        driver.findElement(By.id("SubmissionWizard:Next-btnInnerEl")).click();

        Thread.sleep(1000);
        driver.findElement(By.id("SubmissionWizard:Next-btnInnerEl")).click();

        Thread.sleep(1000);
        driver.findElement(By.id("SubmissionWizard:Next-btnInnerEl")).click();
        Thread.sleep(1000);
    }

    public void clickOnQuoteFromPolicyReviewPageAndSelectBindingOptions() throws InterruptedException {

        driver.findElement(By.id("SubmissionWizard:SubmissionWizard_PolicyReviewScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions-btnInnerEl']")).click();

    }


    public void selectIssuePolicyAndClickOkayButton() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id=\"SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions:BindAndIssue-textEl\"]")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'OK')]")).click();
        Thread.sleep(6000);
    }

    public void clickViewYourPolicyAndValidateSummaryPolicyTable() throws InterruptedException {
        // View Your Policy

        System.out.println("Printed policy");
        WebElement viewYourPolicy = driver.findElement(By.xpath("//div[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl']"));
        String policyNumber = viewYourPolicy.getText();
        System.out.println("The policy Number is :" + policyNumber);
        viewYourPolicy.click();

        // summary Policy Table
        Thread.sleep(2000);
        List<WebElement> summaryTableData = driver.findElements(By.id("PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_AccountDV-table"));
        for (int i = 0; i < summaryTableData.size(); i++) {
            System.out.println("********** The Account Holder Details : " + "/n " + summaryTableData.get(i).getText());
        }

    }


}
