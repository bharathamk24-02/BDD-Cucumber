package sample;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.util.List;

public class PolicyCreation {


   // public void policyCreation_1(){

        // Policy Creation
    public static void main(String[] args) {


        try {

            String userNameAndPassword = "exp_test";
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://10.192.190.131:8180/pc/PolicyCenter.do");
            Thread.sleep(1000);
            WebElement userName = driver.findElement(By.xpath("//input[@id=\"Login:LoginScreen:LoginDV:username-inputEl\"]"));
            userName.sendKeys(userNameAndPassword);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@id=\"Login:LoginScreen:LoginDV:password-inputEl\"]")).sendKeys(userNameAndPassword);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//span[@id=\"Login:LoginScreen:LoginDV:submit-btnInnerEl\"]")).click();
            Thread.sleep(1000);

            Actions actions = new Actions(driver);
            WebElement dropdown = driver.findElement(
                    By.xpath("//span[contains(@id,'AccountTab-btnEl')]")
            );


            actions.moveToElement(dropdown,30,0).click().perform();
            Thread.sleep(2000);

            driver.findElement(By.xpath("//span[@id=\"TabBar:AccountTab:AccountTab_NewAccount-textEl\"]")).click();

            Thread.sleep(1000);
            WebElement enterFirstName = driver.findElement(By.xpath("//input[@id=\"NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalPersonNameInputSet:FirstName-inputEl\"]"));
            enterFirstName.sendKeys("Bharath");

            WebElement enterLastname = driver.findElement(By.xpath("//input[@id=\"NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalPersonNameInputSet:LastName-inputEl\"]"));
            String randUsername = RandomStringUtils.randomAlphabetic(3);
            enterLastname.sendKeys("kumar"+ randUsername);

            WebElement clickSubmitbtn = driver.findElement(By.xpath("//a[@id=\"NewAccount:NewAccountScreen:NewAccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search\"]"));
            clickSubmitbtn.click();
            Thread.sleep(1000);

            driver.findElement(By.id("NewAccount:NewAccountScreen:NewAccountButton-btnInnerEl")).click();


            Thread.sleep(2000);
            driver.findElement(By.xpath("(//span[contains(text(),'Person')][@id='NewAccount:NewAccountScreen:NewAccountButton:NewAccount_Person-textEl'])")).click();

            Thread.sleep(1000);
            WebElement enterAddress = driver.findElement(By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
            String address = RandomStringUtils.randomAlphabetic(3);
            System.out.println(address);
            enterAddress.sendKeys("Test-"+ address);;

            WebElement pincode = driver.findElement(By.xpath("//input[@id=\"CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl\"]"));
            pincode.sendKeys("99501");
            Thread.sleep(3000);
            driver.findElement(By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressDescription-inputEl")).click();

            driver.findElement(By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressType-inputEl")).click();
            Thread.sleep(1000);
            System.out.println("Printed_sample-1");
            driver.findElement(By.xpath("(//li[contains(text(),'Billing')])")).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath("//div[@id=\"CreateAccount:CreateAccountScreen:CreateAccountDV:ProducerSelectionInputSet:Producer:SelectOrganization\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id=\"OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:GlobalContactNameInputSet:Name-inputEl\"]")).sendKeys("a");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//a[@id=\"OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//a[@id=\"OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchResultsLV:0:_Select\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[@id=\"CreateAccount:CreateAccountScreen:Update-btnInnerEl\"]")).click();
            Thread.sleep(3000);

            WebElement expectedAccNum =driver.findElement(By.xpath("//div[@id=\"AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AccountNumber-bodyEl\"]"));
            System.out.println("AccountNum :"+ expectedAccNum.getText());

            Thread.sleep(1000);
            List<WebElement> expectedAccName =driver.findElements(By.xpath("//div[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:Name-inputEl']"));
            for (int i =0 ;i<expectedAccName.size();i++) {
                System.out.println("Address :" + expectedAccName.get(i).getText());
            }

            Thread.sleep(1000);
            List<WebElement> expectedAddress =driver.findElements(By.xpath("//div[@id=\"AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AddressShortInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-inputEl\"]"));
            for (int i =0 ;i<expectedAddress.size();i++){
                System.out.println("Address :"+ expectedAddress.get(i).getText());
            }

            Thread.sleep(1000);

            //Guideware.feature  Tab

            WebElement actionsBtn = driver.findElement(By.xpath("//span[@id=\"AccountFile:AccountFileMenuActions-btnEl\"]"));
            actions.moveToElement(actionsBtn, 30, 0).click().perform();

            driver.findElement(By.xpath("//span[@id=\"AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewSubmission-textEl\"]")).click();

            // organization
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[@id=\"NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:7:addSubmission\"]")).click();

            Thread.sleep(1000);
            driver.navigate().refresh();
            driver.findElement(By.id("SubmissionWizard:Next-btnInnerEl")).click();

            Thread.sleep(1000);
            driver.navigate().refresh();
            driver.findElement(By.id("SubmissionWizard:Next-btnInnerEl")).click();

            Thread.sleep(1000);
            driver.findElement(By.id("SubmissionWizard:Next-btnInnerEl")).click();

            //Add Btn
            Thread.sleep(1000);
            driver.findElement(By.xpath("(//span[contains(text(),'Add')][@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver-btnInnerEl\"])")).click();


            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddExistingContact-textEl\"]")).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddExistingContact:0:UnassignedDriver-textEl\"]")).click();

            Thread.sleep(1000);
            WebElement dob = driver.findElement(By.xpath("//input[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:DateOfBirth-inputEl\"]"));
            dob.click();
            dob.clear();
            dob.sendKeys("02/24/1952");

            WebElement License = driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:LicenseInputSet:LicenseNumber-inputEl"));
            String licenseNum = RandomStringUtils.randomNumeric(8);
            License.sendKeys(licenseNum);

            driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:LicenseInputSet:LicenseState-inputEl")).click();

            driver.findElement(By.xpath("//li[contains(text(),'Alaska')]")).click();

            //Roles Btn
            driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:RolesCardTab-btnInnerEl")).click();
            Thread.sleep(1000);

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


          //  ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

            Thread.sleep(1000);
           driver.findElement(By.xpath("((//div[@class='x-grid-item-container'])[4]//div[@class='x-grid-cell-inner '])[6]")).click();


            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[@class=\"x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box x-boundlist-above\"]//li[text()=\"0\"]")).click();


            Thread.sleep(1000);
            driver.findElement(By.xpath("((//div[@class='x-grid-item-container'])[4]//div[@class='x-grid-cell-inner '])[7]")).click();


            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[@class=\"x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box x-boundlist-above\"]//li[text()=\"0\"]")).click();

            Thread.sleep(1000);
            driver.findElement(By.id("SubmissionWizard:Next-btnInnerEl")).click();

            Thread.sleep(1000);
            driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel_tb:Add-btnInnerEl")).click();

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
            WebElement costAmt =  driver.findElement(By.id("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:CostNew_DV-inputEl"));
            costAmt.sendKeys("200");

            Thread.sleep(1000);
            driver.findElement(By.id("SubmissionWizard:Next-btnInnerEl")).click();

            Thread.sleep(1000);
            driver.findElement(By.id("SubmissionWizard:Next-btnInnerEl")).click();

            Thread.sleep(1000);
            driver.findElement(By.id("SubmissionWizard:Next-btnInnerEl")).click();

            Thread.sleep(1000);
            driver.findElement(By.id("SubmissionWizard:SubmissionWizard_PolicyReviewScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl")).click();

            //Binding Options Btn
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions-btnInnerEl']")).click();

            //issue Policy
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[@id=\"SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions:BindAndIssue-textEl\"]")).click();

            //Ok Button
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[contains(text(),'OK')]")).click();

            // View Your Policy
            Thread.sleep(5000);
            System.out.println("Printed policy");
            WebElement viewYourPolicy = driver.findElement(By.xpath("//div[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl']"));
            String policyNumber = viewYourPolicy.getText();
            System.out.println("The policy Number is :" + policyNumber);
            viewYourPolicy.click();

            // summary Policy Table

            List<WebElement> summaryTableData = driver.findElements(By.id("PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_AccountDV-table"));
            for (int i=0 ;i<summaryTableData.size();i++){
                System.out.println("********** The Account Holder Details : " + "/n "+ summaryTableData.get(i).getText());
            }



        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}





//            Thread.sleep(1000);
//            driver.findElement(By.xpath("(//div[@class=\"x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box\"]//li[contains(text(),'0')])[1]]")).click();


//            driver.findElement(By.xpath("(//div[@class=\"x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box\"]//li[text()='0'])[1]")).click();
//            driver.findElement(By.xpath("(//div[@class=\"x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box\"]//li[text()='0'])[2]")).click();