package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Selenium {

    // Scenario 1
    static void main() throws InterruptedException {

//        try {
//            WebDriver driver = new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.get("https://www.orangehrm.com/");
//            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//            driver.findElement(By.xpath("//button[text()='Allow selection']")).click();
//            Thread.sleep(2000);
//            driver.findElement(By.xpath("//a[text()='Solutions']")).click();
//            Thread.sleep(1000);
//            driver.findElement(By.xpath("//a[text()='Starter (Open Source)']")).click();
//
//            List<WebElement> serviceName = driver.findElements(By.xpath("//div[@class='card-title-menu']"));
//            for (int i = 0; i < serviceName.size(); i++) {
//                System.out.println("******* The serviceName is : **********" + serviceName.get(i).getText());
//            }
//            driver.close();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//    }


        // Scenario 2
//        try {
//
//            String userNameAndPassword = "exp_test";
//            WebDriver driver = new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.get("http://10.192.190.131:8180/pc/PolicyCenter.do");
//            Thread.sleep(1000);
//            WebElement userName = driver.findElement(By.xpath("//input[@id=\"Login:LoginScreen:LoginDV:username-inputEl\"]"));
//            userName.sendKeys(userNameAndPassword);
//            Thread.sleep(2000);
//            driver.findElement(By.xpath("//input[@id=\"Login:LoginScreen:LoginDV:password-inputEl\"]")).sendKeys(userNameAndPassword);
//            Thread.sleep(2000);
//            driver.findElement(By.xpath("//span[@id=\"Login:LoginScreen:LoginDV:submit-btnInnerEl\"]")).click();
//            Thread.sleep(2000);
//
//            driver.quit();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//
//    }}
        //Scenario 3

//        try {
//            WebDriver driver = new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.get("https://www.orangehrm.com/");
//            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//            driver.findElement(By.xpath("//button[text()='Allow selection']")).click();
//            Thread.sleep(2000);
//            driver.findElement(By.xpath("//a[text()='Solutions']")).click();
//            Thread.sleep(1000);
//            List<WebElement> sourceList = driver.findElements(By.xpath("//div[@class=\"left-sub-menu\"]"));
//            for (int i =0 ;i<sourceList.size();i++){
//                System.out.println(sourceList.get(i).getText().trim());
//            }
//            driver.close();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        } {



        //Guideware Account Creation

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
            enterLastname.sendKeys("kumar");

            WebElement clickSubmitbtn = driver.findElement(By.xpath("//a[@id=\"NewAccount:NewAccountScreen:NewAccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search\"]"));
            clickSubmitbtn.click();

            Thread.sleep(1000);
            driver.findElement(By.id("NewAccount:NewAccountScreen:NewAccountButton-btnInnerEl")).click();
            System.out.println("Printed -1");
            Thread.sleep(1000);

            driver.findElement(By.id("NewAccount:NewAccountScreen:NewAccountButton:NewAccount_Person-textEl]")).click();
            System.out.println("printed-3");
            Thread.sleep(1000);
            System.out.println("printed-2");


//            WebElement enterAddress = driver.findElement(By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
//            String address = RandomStringUtils.randomAlphabetic(3);
//            System.out.println(address);
//            enterAddress.sendKeys("Test-"+ address);;
//
//            WebElement pincode = driver.findElement(By.xpath("//input[@id=\"CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl\"]"));
//            pincode.sendKeys("99501");
//            Thread.sleep(3000);
//              driver.findElement(By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressDescription-inputEl")).click();
//
//              driver.findElement(By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressType-inputEl")).click();
//              Thread.sleep(1000);
//            System.out.println("Printed_sample-1");
//            driver.findElement(By.xpath("(//li[contains(text(),'Billing')])")).click();
//            Thread.sleep(1000);
//
//            driver.findElement(By.xpath("//div[@id=\"CreateAccount:CreateAccountScreen:CreateAccountDV:ProducerSelectionInputSet:Producer:SelectOrganization\"]")).click();
//            Thread.sleep(1000);
//            driver.findElement(By.xpath("//input[@id=\"OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:GlobalContactNameInputSet:Name-inputEl\"]")).sendKeys("a");
//            driver.findElement(By.xpath("//a[@id=\"OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search\"]")).click();
//            Thread.sleep(1000);
//            driver.findElement(By.xpath("//a[@id=\"OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchResultsLV:0:_Select\"]")).click();
//            Thread.sleep(1000);
//            driver.findElement(By.xpath("//span[@id=\"CreateAccount:CreateAccountScreen:Update-btnInnerEl\"]")).click();
//            Thread.sleep(5000);
//
//            WebElement expectedAccNum =driver.findElement(By.xpath("//div[@id=\"AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AccountNumber-bodyEl\"]"));
//            System.out.println("AccountNum :"+ expectedAccNum.getText());
//
//            Thread.sleep(1000);
//            List<WebElement> expectedAccName =driver.findElements(By.xpath("//div[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:Name-inputEl']"));
//            for (int i =0 ;i<expectedAccName.size();i++) {
//                System.out.println("Address :" + expectedAccName.get(i).getText());
//            }
//
//            Thread.sleep(1000);
//
//            List<WebElement> expectedAddress =driver.findElements(By.xpath("//div[@id=\"AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AddressShortInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-inputEl\"]"));
//            for (int i =0 ;i<expectedAddress.size();i++){
//                System.out.println("Address :"+ expectedAddress.get(i).getText());
//            }
//
//            Thread.sleep(1000);
//
//            // Policy Creation
//
//            WebElement actionsBtn = driver.findElement(By.xpath("//span[@id=\"AccountFile:AccountFileMenuActions-btnEl\"]"));
//            actions.moveToElement(actionsBtn,30,0).click().perform();
//
//            driver.findElement(By.xpath("//span[@id=\"AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewSubmission-textEl\"]")).click();
//
//            Thread.sleep(1000);
//            // organization
//            driver.findElement(By.xpath("//a[@id=\"NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:7:addSubmission\"]")).click();
//
//            Thread.sleep(1000);
//            //Next Btn
//            driver.findElement(By.xpath("//span[@id=\"SubmissionWizard:Next-btnInnerEl\"]")).click();
//
//            Thread.sleep(1000);
////            driver.findElement(By.xpath("//ul[contains(@id,'boundlist')]//li[contains(text(),'Basic Program')]")).click();
//            driver.findElement(By.xpath("//input[@id=\"SubmissionWizard:OfferingScreen:OfferingSelection-inputEl\"]"))
//                    .sendKeys("Basic Program", Keys.ENTER);
//
//
//
////            Thread.sleep(1000);
//         driver.findElement(By.xpath("//span[@id=\"SubmissionWizard:Next-btnInnerEl\"]")).click();
//
//
//        WebElement nextbtn = driver.findElement(By.xpath("(//span[contains(text(),'Next')][@id=\"SubmissionWizard:Next-btnInnerEl\"])"));
////            nextbtn.wait(1000);
////            nextbtn.click();
////
////            Thread.sleep(1000);
////            driver.findElement(By.xpath("a[contains(@componentid,'SubmissionWizard:Next')]//span[contains(text(),'Next >')]")).click();
////
////            nextbtn.click();
////            Thread.sleep(1000);
//
//            By nextBtnLocator = By.xpath("//a[contains(@componentid,'SubmissionWizard:Next')]");
//
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//
//            for (int i = 0; i < 3; i++) {
//
//                WebElement nextBtn = wait.until(
//                        ExpectedConditions.elementToBeClickable(nextBtnLocator)
//                );
//
//                nextBtn.click();
//
//                // Wait for page transition (very important)
//                wait.until(ExpectedConditions.stalenessOf(nextBtn));
//            }
//
//
////            a[contains(@componentid,'SubmissionWizard:Next')]//span[contains(text(),'Next >')]
////
////            Thread.sleep(1000);
//           driver.findElement(By.xpath("//span[@id=\"SubmissionWizard:Next-btnInnerEl\"]")).click();
//
//            Thread.sleep(1000);
//            driver.findElement(By.xpath("//span[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver-btnInnerEl\"]")).click();
//
//            Thread.sleep(1000);
//            driver.findElement(By.xpath("//span[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddExistingContact-textEl\"]")).click();
//
//            Thread.sleep(1000);
//            driver.findElement(By.xpath("//span[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddExistingContact:0:UnassignedDriver-textEl\"]")).click();
//
//            WebElement dob = driver.findElement(By.xpath("//input[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:DateOfBirth-inputEl\"]"));
//            dob.sendKeys("02/24/1952");
//
//            driver.findElement(By.xpath("//li[text()='Alaska']")).click();
//
//            WebElement License = driver.findElement(By.xpath("//input[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:LicenseInputSet:LicenseNumber-inputEl\"]"));
//            String licenseNum = RandomStringUtils.randomNumeric(8);
//            License.sendKeys(licenseNum);
//
//            driver.findElement(By.xpath("//span[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:RolesCardTab-btnInnerEl\"]")).click();
//
//            WebElement licensedYear = driver.findElement(By.xpath("//input[@id=\"SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PolicyDriverInfoDV:yearlicensed-inputEl\"]"));
//            licensedYear.sendKeys("2016");
//
//            driver.findElement(By.xpath("//div[@id=\"ext-element-335\"]")).click();
//
//            driver.findElement(By.xpath("//div[contains(@class,'x-grid-cell-inner') and text()='0']")).click();
//
//            driver.findElement(By.xpath("//div[@id=\"ext-element-339\"]")).click();
//
//             driver.findElement(By.xpath("(//div[contains(@class,'x-grid-cell-inner') and text()='0'])[2]")).click();
//
//            driver.findElement(By.xpath("//div[@id=\"ext-element-388\"]")).click();
//
//            //x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box
//
//            driver.findElement(By.xpath("(//div[@class=\"x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box\"]//li[text()='0'])[1]")).click();
//            driver.findElement(By.xpath("(//div[@class=\"x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box\"]//li[text()='0'])[2]")).click();
//
//
//
//
            driver.close();
        } catch (Exception e) {
            throw new RuntimeException(e);

        }


    }}






