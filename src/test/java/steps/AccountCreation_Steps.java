package steps;

import api.Put;
import hooks.Hooks;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reusablemethods.CommonMethods;

public class AccountCreation_Steps extends CommonMethods {

    WebDriver driver;

    @FindBy(xpath = "//input[@id='Login:LoginScreen:LoginDV:username-inputEl']")
    private WebElement userName;

    @FindBy(xpath = "//input[@id='Login:LoginScreen:LoginDV:password-inputEl']")
    private WebElement passWord;

    @FindBy(xpath = "//span[@id='Login:LoginScreen:LoginDV:submit-btnInnerEl']")
    private WebElement loginBtn;


    String policyCreationUrl = "http://10.192.190.131:8180/pc/PolicyCenter.do";
    String userNameAndPassword = "exp_test";

    public AccountCreation_Steps() {
        driver = Hooks.getDriver();
    }

    public void login() throws InterruptedException {
        driver.get(policyCreationUrl);
        Thread.sleep(1000);

    }

    public void enterUserNameAndPassword() throws InterruptedException {

        WebElement userName = driver.findElement(By.xpath("//input[@id=\"Login:LoginScreen:LoginDV:username-inputEl\"]"));
        userName.sendKeys(userNameAndPassword);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\"Login:LoginScreen:LoginDV:password-inputEl\"]")).sendKeys(userNameAndPassword);
        Thread.sleep(2000);
    }

    public void loginButton() throws InterruptedException {
        driver.findElement(By.xpath("//span[@id=\"Login:LoginScreen:LoginDV:submit-btnInnerEl\"]")).click();
        Thread.sleep(1000);
    }

    public void clickAccountBtn() throws InterruptedException {

        Actions actions = new Actions(driver);
        WebElement dropdown = driver.findElement(
                By.xpath("//span[contains(@id,'AccountTab-btnEl')]"));
        actions.moveToElement(dropdown, 30, 0).click().perform();
        Thread.sleep(2000);
    }

    public void clickNewAccountBtn() throws InterruptedException {
        driver.findElement(By.xpath("//span[@id=\"TabBar:AccountTab:AccountTab_NewAccount-textEl\"]")).click();
        Thread.sleep(1000);
    }

    public void enterFirstName() throws InterruptedException {
        WebElement enterFirstName = driver.findElement(By.xpath("//input[@id=\"NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalPersonNameInputSet:FirstName-inputEl\"]"));
        enterFirstName.sendKeys("Bharath");
    }

    public void enterLastName() throws InterruptedException {
        WebElement enterLastname = driver.findElement(By.xpath("//input[@id=\"NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalPersonNameInputSet:LastName-inputEl\"]"));
        String randUsername = RandomStringUtils.randomAlphabetic(3);
        enterLastname.sendKeys("kumar" + randUsername);
    }


    public void clickSubmitbtn() throws InterruptedException {
        Thread.sleep(1000);
        WebElement clickSubmitbtn = driver.findElement(By.xpath("//a[@id=\"NewAccount:NewAccountScreen:NewAccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search\"]"));
        clickSubmitbtn.click();
        ;
    }

    public void clickNewAccountCreationBtnAndSelectPerson() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id("NewAccount:NewAccountScreen:NewAccountButton-btnInnerEl")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("NewAccount:NewAccountScreen:NewAccountButton:NewAccount_Person-textEl")).click();
        Thread.sleep(1000);
    }

    public void enterAddress() throws InterruptedException {
        WebElement enterAddress = driver.findElement(By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
        String address = RandomStringUtils.randomAlphabetic(3);
        System.out.println(address);
        enterAddress.sendKeys("Test-" + address);
        ;
    }

    public void enterPincode() throws InterruptedException {
        WebElement pincode = driver.findElement(By.xpath("//input[@id=\"CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl\"]"));
        pincode.sendKeys("99501");
        Thread.sleep(3000);
    }

    public void selectAddressType() throws InterruptedException {
        driver.findElement(By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressDescription-inputEl")).click();
        driver.findElement(By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressType-inputEl")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//li[contains(text(),'Billing')])")).click();
        Thread.sleep(1000);
    }

    public void selectOrganisation() throws InterruptedException {
        driver.findElement(By.xpath("//div[@id=\"CreateAccount:CreateAccountScreen:CreateAccountDV:ProducerSelectionInputSet:Producer:SelectOrganization\"]")).click();
        Thread.sleep(1000);
    }

    public void entersOrganisationName() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id=\"OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:GlobalContactNameInputSet:Name-inputEl\"]")).sendKeys("a");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id=\"OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id=\"OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchResultsLV:0:_Select\"]")).click();
        Thread.sleep(1000);
    }

    public void clickOrganisationUpdateBtn() throws InterruptedException {
        driver.findElement(By.xpath("//span[@id=\"CreateAccount:CreateAccountScreen:Update-btnInnerEl\"]")).click();
        Thread.sleep(3000);
    }

    public void validateAccountDetails() throws InterruptedException {
        WebElement expectedAccNum = driver.findElement(By.xpath("//div[@id=\"AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AccountNumber-bodyEl\"]"));
        System.out.println("AccountNum :" + expectedAccNum.getText());
        Thread.sleep(1000);
    }





}
