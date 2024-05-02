package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputFormSubmit_PO extends Base_PO {
    public InputFormSubmit_PO() {
        super();
    }

    private @FindBy(xpath = "//form[@id='seleniumform']//button[@type='submit']") WebElement button_Submit;
    private @FindBy(xpath = "//input[@id='name']") WebElement input_Name;
    private @FindBy(xpath = "//input[@id='inputEmail4']") WebElement input_Email;
    private @FindBy(xpath = "//input[@id='inputPassword4']") WebElement input_Password;
    private @FindBy(xpath = "//input[@id='company']") WebElement input_Company;
    private @FindBy(xpath = "//input[@id='websitename']") WebElement input_Website;
    private @FindBy(xpath = "//input[@id='inputCity']") WebElement input_City;
    private @FindBy(xpath = "//input[@id='inputAddress1']") WebElement input_Address1;
    private @FindBy(xpath = "//input[@id='inputAddress2']") WebElement input_Address2;
    private @FindBy(xpath = "//input[@id='inputState']") WebElement input_State;
    private @FindBy(xpath = "//input[@id='inputZip']") WebElement input_Zip;
    private @FindBy(xpath = "//select[@name='country']") WebElement select_Country;
    private @FindBy(xpath = "//option[@value='US']") WebElement option_US;
    private @FindBy(xpath = "//div[contains(@class,'loginform')]") WebElement message_Success;

    public void validateInputFormSubmitURL(String text) throws Exception {
        validateURLContainsText(text);
    }

    public void validateSuccessfulFormSubmission(String text) {
        validateTextMatches(message_Success, text);
    }

    public void validateFailedFormSubmission() {
        validateElementIsDisabled(message_Success);
    }

    public void clickSubmitButton() {
        waitForWebElementAndClick(button_Submit);
    }

    public void clickCountryDropdown() {
        waitForWebElementAndClick(select_Country);
    }

    public void clickUSOption() {
        waitForWebElementAndClick(option_US);
    }

    public void enterName(String text) {
        sendKeys(input_Name, text);
    }

    public void enterEmail(String text) {
        sendKeys(input_Email, text);
    }

    public void enterPassword(String text) {
        sendKeys(input_Password, text);
    }

    public void enterCompany(String text) {
        sendKeys(input_Company, text);
    }

    public void enterWebsite(String text) {
        sendKeys(input_Website, text);
    }

    public void enterCity(String text) {
        sendKeys(input_City, text);
    }

    public void enterAddress1(String text) {
        sendKeys(input_Address1, text);
    }

    public void enterAddress2(String text) {
        sendKeys(input_Address2, text);
    }

    public void enterState(String text) {
        sendKeys(input_State, text);
    }

    public void enterZip(String text) {
        sendKeys(input_Zip, text);
    }

}
