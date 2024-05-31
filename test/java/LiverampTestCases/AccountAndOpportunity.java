package LiverampTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AccountAndOpportunity extends BaseTest {
    @Test
    public void clickOnAccount() throws InterruptedException {
        login();

        Thread.sleep(10000);

        WebElement accountLinkElement = driver.findElement(By.xpath("//span[text()='Accounts']"));
        waitForVisibility(accountLinkElement, driver, 10, " account link element ");
        moveAndClickAction(accountLinkElement, "account link element");
        Thread.sleep(3000);

        WebElement accountName = driver.findElement(By.xpath("//a[@title='Test _Ram_Account for Automation_00']"));
        waitForVisibility(accountName, driver, 10, "Account name");
        click(accountName, "account name");

        Thread.sleep(10000);

        WebElement oppLinkElement = driver.findElement(By.xpath("//span[text()='Opportunities']"));
        waitForVisibility(oppLinkElement,driver,10,"opp link element 2");
        moveAndClickAction(oppLinkElement,"oppLinkElement");



        WebElement newBtn = driver.findElement(By.xpath("//a[@title='New']"));
        waitForVisibility(newBtn, driver, 10, "new button");
        click(newBtn, "New button");

        WebElement standardOpportunity = driver.findElement(By.xpath("//input[@id='0128W000000RTzTQAW']"));
        waitForVisibility(standardOpportunity, driver, 10, "Standard opportunity");
        click(standardOpportunity, "Standard opportunity");

        WebElement nextBtn2 = driver.findElement(By.xpath("//button[@class='slds-button slds-button_neutral slds-button slds-button--brand']"));
        waitForVisibility(nextBtn2, driver, 10, "Next button");
        click(nextBtn2, "Next button");

        WebElement firstNameTextbox = driver.findElement(By.xpath("(//input[@class='slds-combobox__input slds-input'])[1]"));
        waitForVisibility(firstNameTextbox, driver, 10, "First name text box");
        enterText(firstNameTextbox, "stirum", "First name text box");

        WebElement oppNameTextbox = driver.findElement(By.name("Name"));
        waitForVisibility(oppNameTextbox, driver, 10, "Opportunity name text box");
        enterText(oppNameTextbox, "Testing_Opportunity_001", "Opportunity name text box");

        WebElement closeDate = driver.findElement(By.xpath("//input[@class='slds-input' and @name='Name']"));
        waitForVisibility(closeDate,driver,10,"Close date");
        enterText(closeDate,"4-23-2024","Close date textbox");

        WebElement stageTextbox = driver.findElement(By.xpath("//button[@id='combobox-button-1971']"));
        waitForVisibility(stageTextbox,driver,10,"Stage text box");
        enterText(stageTextbox,"Pre-Qualification","Stage text box");

        scrollDownByJavascript(3);

        WebElement saveButton = driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand' and @name='SaveEdit']"));
        waitForVisibility(saveButton,driver,10,"Save button");
        click(saveButton,"Save button");

        scrollDownByJavascript(5);

        WebElement productDropDown = driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']"));
        waitForVisibility(productDropDown,driver,10,"Product drop down");
        click(productDropDown,"Product drop down");

        WebElement addProduct = driver.findElement(By.xpath(""));
        waitForVisibility(addProduct,driver,10," Add Product");
        click(addProduct,"Add product");
    }
    @Test
    public void introductionStage() throws InterruptedException {
        login();

        Thread.sleep(10000);

        WebElement accountLinkElement = driver.findElement(By.xpath("//span[text()='Accounts']"));
        waitForVisibility(accountLinkElement, driver, 10, " account link element ");
        moveAndClickAction(accountLinkElement, "mouse over account");
        Thread.sleep(3000);

        WebElement accountName = driver.findElement(By.xpath("(//a[contains(@class,'slds-truncate outputLookupLink slds-truncate ')])[1]"));
        waitForVisibility(accountName, driver, 10, "Account name");
        click(accountName, "account name");

        scrollDownByJavascript(2);
        Thread.sleep(10000);
        //  WebElement newBtn = driver.findElement(By.xpath("(//button[@class='slds-button slds-button_neutral'])[7]"));
        WebElement newBtn = driver.findElement(By.xpath("//button[@type='button' and @value='a0Ff200000NE6zNEAT']"));
        waitForVisibility(newBtn, driver, 10, "new button");
        click(newBtn, "New button");

        WebElement standardOpportunity = driver.findElement(By.xpath("//input[@id='0128W000000RTzTQAW']"));
        waitForVisibility(standardOpportunity, driver, 10, "Standard opportunity");
        click(standardOpportunity, "Standard opportunity");

        WebElement nextBtn2 = driver.findElement(By.xpath("//button[@class='slds-button slds-button_neutral slds-button slds-button--brand']"));
        waitForVisibility(nextBtn2, driver, 10, "Next button");
        click(nextBtn2, "Next button");

        WebElement firstNameTextbox = driver.findElement(By.xpath("(//input[@class='slds-combobox__input slds-input'])[1]"));
        waitForVisibility(firstNameTextbox, driver, 10, "First name text box");
        enterText(firstNameTextbox, "stirum", "First name text box");

        WebElement oppNameTextbox = driver.findElement(By.name("Name"));
        waitForVisibility(oppNameTextbox, driver, 10, "Opportunity name text box");
        enterText(oppNameTextbox, "Testing_Opportunity_001", "Opportunity name text box");

        WebElement closeDate = driver.findElement(By.xpath("//input[@class='slds-input' and @name='Name']"));
        waitForVisibility(closeDate,driver,10,"Close date");
        enterText(closeDate,"4-23-2024","Close date textbox");

        WebElement stageTextbox = driver.findElement(By.xpath("//button[@id='combobox-button-1971']"));
        waitForVisibility(stageTextbox,driver,10,"Stage text box");
        enterText(stageTextbox,"Pre-Qualification","Stage text box");

        scrollDownByJavascript(3);

        WebElement saveButton = driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand' and @name='SaveEdit']"));
        waitForVisibility(saveButton,driver,10,"Save button");
        click(saveButton,"Save button");

        scrollDownByJavascript(5);

        WebElement productDropDown = driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']"));
        waitForVisibility(productDropDown,driver,10,"Product drop down");
        click(productDropDown,"Product drop down");

        WebElement addProduct = driver.findElement(By.xpath(""));
        waitForVisibility(addProduct,driver,10," Add Product");
        click(addProduct,"Add product");

        WebElement searchTextbox = driver.findElement(By.xpath("(//input[@class='slds-input' and @type='search'])[1]"));
        waitForVisibility(searchTextbox,driver,10,"Search text box");
        enterText(searchTextbox,"B2b","Search text box");



    }
}
