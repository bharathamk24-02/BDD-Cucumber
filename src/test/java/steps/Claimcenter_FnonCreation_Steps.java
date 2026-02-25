package steps;

import hooks.Hooks;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Claimcenter_FnonCreation_Steps {

    WebDriver driver;

    String userNameAndPassword = "exp_test";
    String url = "http://10.192.209.132:8080/cc/ClaimCenter.do";

    public Claimcenter_FnonCreation_Steps() {
        driver = Hooks.getDriver();
    }

    public void claimLogin() throws InterruptedException {
        driver.get(url);
        Thread.sleep(1000);

    }

    public void sendUsernameAndPassword() throws InterruptedException {

        WebElement userName = driver.findElement(By.xpath("//input[@id=\"Login:LoginScreen:LoginDV:username-inputEl\"]"));
        userName.sendKeys(userNameAndPassword);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\"Login:LoginScreen:LoginDV:password-inputEl\"]")).sendKeys(userNameAndPassword);
        Thread.sleep(2000);

    }

    public void loginBtn() throws InterruptedException {
        driver.findElement(By.xpath("//span[@id=\"Login:LoginScreen:LoginDV:submit-btnInnerEl\"]")).click();
        Thread.sleep(1000);
    }

    public void userClickOnClaimButtonAndClickNewClaim() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement dropdown = driver.findElement(By.xpath("//span[contains(@id,'TabBar:ClaimTab-btnWrap')]")
        );
        actions.moveToElement(dropdown, 30, 0).click().perform();
        Thread.sleep(2000);

        driver.findElement(By.id("TabBar:ClaimTab:ClaimTab_FNOLWizard-textEl")).click();
    }

    public void clickCreateUnverifiedpolicy() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//input[@id='FNOLWizard:FNOLWizard_FindPolicyScreen:ScreenMode_false-inputEl']")
                )
        );

        element.click();
        Thread.sleep(1000);
    }

    public void userEntersThePolicyNumberTypeAndLossdateEffectiveDateExpirationdate() throws InterruptedException {
        WebElement policyNum = driver.findElement(By.xpath("//input[@id='FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:PolicyNumber-inputEl']"));
        String ranPolicyNum = RandomStringUtils.randomNumeric(8);
        policyNum.sendKeys(ranPolicyNum);

        Thread.sleep(1000);
        WebElement LossDate = driver.findElement(By.xpath("//input[@id=\"FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:Claim_LossDate-inputEl\"]"));
        LossDate.sendKeys("02/10/2026");

        By typeLocator = By.xpath("//input[@id='FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:Type-inputEl']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.refreshed(
                ExpectedConditions.elementToBeClickable(typeLocator)
        ));
        element.click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[text()='Personal Auto']")).click();

//        WebElement effectiveDate = driver.findElement(By.xpath("//input[@id='FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:NewClaimPolicyGeneralPanelSet:NewClaimPolicyGeneralDV:EffectiveDate-inputEl']"));
//        effectiveDate.sendKeys("02/11/2025");

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(25));

        WebElement effectiveDate = wait2.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//input[contains(@id,'EffectiveDate')]")
                )
        );

        effectiveDate.clear();
        effectiveDate.sendKeys("02/16/2025");

        Thread.sleep(1000);
        WebElement expirationDate = driver.findElement(By.xpath("//input[@id=\"FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:NewClaimPolicyGeneralPanelSet:NewClaimPolicyGeneralDV:ExpirationDate-inputEl\"]"));
        expirationDate.sendKeys("02/12/2027");
        Thread.sleep(1000);
    }


    public void selectNameAndAddPerson() throws InterruptedException {

        driver.findElement(By.xpath("//a[@id=\"FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:NewClaimPolicyGeneralPanelSet:NewClaimPolicyGeneralDV:Insured_Name:Insured_NameMenuIcon\"]")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[@id=\"FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:NewClaimPolicyGeneralPanelSet:NewClaimPolicyGeneralDV:Insured_Name:ClaimNewContactPickerMenuItemSet:NewContactPickerMenuItemSet_NewPerson-textEl\"])")).click();


    }

    public void userEnterusernamePassowrdAddressAndZipcode() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement firstName = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("input[id*='FirstName']")
                )
        );

        firstName.sendKeys("Bharath");


        Thread.sleep(1000);
        WebElement lastName = driver.findElement(By.xpath("//input[@id=\"NewContactPopup:ContactDetailScreen:ContactBasicsDV:PersonNameInputSet:GlobalPersonNameInputSet:LastName-inputEl\"]"));
        lastName.sendKeys("M");

        Thread.sleep(1000);
        WebElement zipCode = driver.findElement(By.xpath("//input[@id=\"NewContactPopup:ContactDetailScreen:ContactBasicsDV:PrimaryAddressInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:PostalCode-inputEl\"]"));
        zipCode.sendKeys("99501");

        Thread.sleep(1000);
        driver.findElement(By.id("NewContactPopup:ContactDetailScreen:ContactBasicsDV_tb:ContactDetailToolbarButtonSet:CustomUpdateButton-btnInnerEl")).click();
    }

    public void userClickNextBtnAndSelectName() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.id("FNOLWizard:Next-btnInnerEl")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:ReportedBy_Name-inputEl']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[text()='Bharath M']")).click();

    }

    public void userClickNextBtnSelectLoseCauseAndSelectLocation() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.id("FNOLWizard:Next-btnInnerEl")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='NewClaimDuplicatesWorksheet:NewClaimDuplicatesScreen:NewClaimDuplicatesWorksheet_CloseButton-btnInnerEl']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:Claim_LossCause-inputEl']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[text()='Collision while turning left']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id=\"FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:AddressDetailInputSetRef:CCAddressInputSet:globalAddressContainer:Address_Picker-inputEl\"]")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[text()='Anchorage, AK 99501']")).click();

        //step 4 Nxt Btn
        Thread.sleep(2000);
        driver.findElement(By.id("FNOLWizard:Next-btnInnerEl")).click();

    }

    public void clickOnNextBtnFromServicesPageAndClickFinish() throws InterruptedException {
        //step 5 Next Btn
        Thread.sleep(1000);
        driver.findElement(By.id("FNOLWizard:Next-btnInnerEl")).click();

        //Finish Btn
        Thread.sleep(1000);
        driver.findElement(By.id("FNOLWizard:Finish-btnInnerEl")).click();

        Thread.sleep(1000);

    }

    public void userValidateClaimNumberAndClickOnTheClaimNumberToValidateDetails() throws InterruptedException {
        WebElement claimNumAndSuccessMsg = driver.findElement(By.xpath("//table[@id=\"NewClaimSaved:NewClaimSavedScreen:NewClaimSavedDV-table\"]//td[1]"));
        System.out.println("***************** Claim Is Successfully Created **********************");
        System.out.println("The claimNumber is :" + claimNumAndSuccessMsg.getText());

        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id=\"NewClaimSaved:NewClaimSavedScreen:NewClaimSavedDV:GoToClaim-inputEl\"]")).click();
        Thread.sleep(1000);
        List<WebElement> summaryDetails = driver.findElements(By.xpath("//span[@class='infobar_elem_val']"));
        for (
                int i = 0; i < summaryDetails.size(); i++) {
            System.out.println("The summary Details :" + summaryDetails.get(i).getText());
        }

    }


    public void clickOnTheActionButtonSelectByCoverageSelectcSelectCollision() throws InterruptedException {

        Actions actions = new Actions(driver);
        //Actions Btn
        Thread.sleep(1000);
        WebElement actionBtn = driver.findElement(By.id("Claim:ClaimMenuActions-btnWrap"));
        actions.moveToElement(actionBtn, 30, 0).click().perform();

        //Get BY COVERAGE
        Thread.sleep(1000);
        driver.findElement(By.id("Claim:ClaimMenuActions:ClaimMenuActions_NewExposure:NewExposureMenuItemSet:NewExposureMenuItemSet_ByCoverageType-textEl")).click();

        // CBtn
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='Claim:ClaimMenuActions:ClaimMenuActions_NewExposure:NewExposureMenuItemSet:NewExposureMenuItemSet_ByCoverageType:0:item-itemEl']")).click();

        // Collision
        Thread.sleep(1000);
        driver.findElement(By.id("Claim:ClaimMenuActions:ClaimMenuActions_NewExposure:NewExposureMenuItemSet:NewExposureMenuItemSet_ByCoverageType:0:item:0:item-textEl")).click();
    }

    public void selectClaimantAndSelectVehicleNewIncident() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='NewExposure:NewExposureScreen:NewExposureDV:NewClaimVehicleDamageDV:Claimant_Picker-inputEl']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[text()='Bharath M']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='NewExposure:NewExposureScreen:NewExposureDV:NewClaimVehicleDamageDV:Claimant_Type-inputEl']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[text()=\"Insured\"]")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='NewExposure:NewExposureScreen:NewExposureDV:NewClaimVehicleDamageDV:Vehicle_Incident:Vehicle_IncidentMenuIcon']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id=\"NewExposure:NewExposureScreen:NewExposureDV:NewClaimVehicleDamageDV:Vehicle_Incident:NewClaimVehicleDamageDV_NewIncidentMenuItem-textEl\"]")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id=\"NewVehicleIncidentPopup:NewVehicleIncidentScreen:VehIncidentDetailDV:VehicleIncidentDV:Vehicle_Picker-inputEl\"]")).click();

    }

    public void selectVehicleEnterYearMakeModelAndSelectDriver() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[text()='New...']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id=\"NewVehicleIncidentPopup:NewVehicleIncidentScreen:VehIncidentDetailDV:VehicleIncidentDV:Vehicle_Year-inputEl\"]")).sendKeys("2014");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id=\"NewVehicleIncidentPopup:NewVehicleIncidentScreen:VehIncidentDetailDV:VehicleIncidentDV:Vehicle_Make-inputEl\"]")).sendKeys("Honda");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id=\"NewVehicleIncidentPopup:NewVehicleIncidentScreen:VehIncidentDetailDV:VehicleIncidentDV:Vehicle_Model-inputEl\"]")).sendKeys("CB350 RS");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id=\"NewVehicleIncidentPopup:NewVehicleIncidentScreen:VehIncidentDetailDV:VehicleIncidentDV:Driver_Picker-inputEl\"]")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[text()='Bharath M']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id=\"NewVehicleIncidentPopup:NewVehicleIncidentScreen:VehIncidentDetailDV:VehicleIncidentDV:LossOccured-inputEl\"]")).click();
    }

    public void selectLossOccuredAndClickOk() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[text()='At premises']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='NewVehicleIncidentPopup:NewVehicleIncidentScreen:Update-btnInnerEl']")).click();

    }

    public void clickOkayAndValidateDriverDetails() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id("NewExposure:NewExposureScreen:Update-btnWrap")).click();

        System.out.println(" ****************** Exposure Added SuccessFully ************************** ");

        Thread.sleep(1000);
        List<WebElement> exposureDetails = driver.findElements(By.xpath("//div[@id=\"ClaimExposures:ClaimExposuresScreen:ExposuresLV-body\"]//td"));
        for (int i = 0; i < exposureDetails.size(); i++) {
            System.out.println("The Exposure Details : " + exposureDetails.get(i).getText());
        }


    }

}






