package sample;

import com.sun.jna.platform.win32.WinDef;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.List;

public class ClaimCreation {



    //public static void main(String[] args) {

    public  void claimCreation(){
        try {

            String userNameAndPassword = "exp_test";
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://10.192.209.132:8080/cc/ClaimCenter.do");
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
                    By.xpath("//span[contains(@id,'TabBar:ClaimTab-btnWrap')]")
            );
            actions.moveToElement(dropdown,30,0).click().perform();
            Thread.sleep(2000);

            driver.findElement(By.id("TabBar:ClaimTab:ClaimTab_FNOLWizard-textEl")).click();
            Thread.sleep(1000);


            WebElement radioBtn = driver.findElement(By.xpath("//input[@id=\"FNOLWizard:FNOLWizard_FindPolicyScreen:ScreenMode_false-inputEl\"]"));
            radioBtn.click();

            Thread.sleep(1000);
            WebElement policyNum =driver.findElement(By.xpath("//input[@id='FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:PolicyNumber-inputEl']"));
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

            Thread.sleep(1000);
            WebElement effectiveDate = driver.findElement(By.xpath("//input[@id='FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:NewClaimPolicyGeneralPanelSet:NewClaimPolicyGeneralDV:EffectiveDate-inputEl']"));
            effectiveDate.sendKeys("02/11/2025");

            Thread.sleep(1000);
            WebElement expirationDate = driver.findElement(By.xpath("//input[@id=\"FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:NewClaimPolicyGeneralPanelSet:NewClaimPolicyGeneralDV:ExpirationDate-inputEl\"]"));
            expirationDate.sendKeys("02/12/2027");


            Thread.sleep(1000);
            driver.findElement(By.xpath("//a[@id=\"FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:NewClaimPolicyGeneralPanelSet:NewClaimPolicyGeneralDV:Insured_Name:Insured_NameMenuIcon\"]")).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("(//span[@id=\"FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:NewClaimPolicyGeneralPanelSet:NewClaimPolicyGeneralDV:Insured_Name:ClaimNewContactPickerMenuItemSet:NewContactPickerMenuItemSet_NewPerson-textEl\"])")).click();

            Thread.sleep(1000);
            WebElement firstName = driver.findElement(By.xpath("//input[@id=\"NewContactPopup:ContactDetailScreen:ContactBasicsDV:PersonNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl\"]"));
            firstName.sendKeys("Bharath kumar");

            Thread.sleep(1000);
            WebElement lastName = driver.findElement(By.xpath("//input[@id=\"NewContactPopup:ContactDetailScreen:ContactBasicsDV:PersonNameInputSet:GlobalPersonNameInputSet:LastName-inputEl\"]"));
            lastName.sendKeys("M");

            Thread.sleep(1000);
            WebElement zipCode = driver.findElement(By.xpath("//input[@id=\"NewContactPopup:ContactDetailScreen:ContactBasicsDV:PrimaryAddressInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:PostalCode-inputEl\"]"));
            zipCode.sendKeys("99501");

            Thread.sleep(1000);
            driver.findElement(By.id("NewContactPopup:ContactDetailScreen:ContactBasicsDV_tb:ContactDetailToolbarButtonSet:CustomUpdateButton-btnInnerEl")).click();

            Thread.sleep(1000);
            driver.findElement(By.id("FNOLWizard:Next-btnInnerEl")).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:ReportedBy_Name-inputEl']")).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("//li[text()='Bharath kumar M']")).click();

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
            Thread.sleep(1000);
            driver.findElement(By.id("FNOLWizard:Next-btnInnerEl")).click();

            //step 5 Next Btn
            Thread.sleep(1000);
            driver.findElement(By.id("FNOLWizard:Next-btnInnerEl")).click();

            //Finish Btn
            Thread.sleep(1000);
            driver.findElement(By.id("FNOLWizard:Finish-btnInnerEl")).click();

            Thread.sleep(1000);
            WebElement claimNumAndSuccessMsg = driver.findElement(By.xpath("//table[@id=\"NewClaimSaved:NewClaimSavedScreen:NewClaimSavedDV-table\"]//td[1]"));
            System.out.println("***************** Claim Is Successfully Created **********************");
            System.out.println("The claimNumber is :" + claimNumAndSuccessMsg.getText());

            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[@id=\"NewClaimSaved:NewClaimSavedScreen:NewClaimSavedDV:GoToClaim-inputEl\"]")).click();
            Thread.sleep(1000);
            List<WebElement> summaryDetails = driver.findElements(By.xpath("//span[@class='infobar_elem_val']"));

            for (int i=0 ;i<summaryDetails.size();i++){
                System.out.println("The summary Details :" +summaryDetails.get(i).getText());
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }}
