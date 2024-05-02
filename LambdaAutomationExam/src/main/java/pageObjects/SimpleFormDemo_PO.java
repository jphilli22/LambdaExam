package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SimpleFormDemo_PO extends Base_PO {
    public SimpleFormDemo_PO() {
        super();
    }

    private @FindBy(xpath = "//input[@id='user-message']") WebElement input_UserMessage;
    private @FindBy(xpath = "//button[@id='showInput']") WebElement button_GetCheckedValue;
    private @FindBy(xpath = "//p[@id='message']") WebElement text_CheckedValue;

    public void validateSimpleFormsURL(String text) throws Exception {
        validateURLContainsText(text);
    }

    public void validateCheckedValue(String text) {
        validateTextMatches(text_CheckedValue, text);
    }

    public void typeUserMessage(String text) {
        sendKeys(input_UserMessage, text);
    }

    public void clickGetCheckedValue() {
        waitForWebElementAndClick(button_GetCheckedValue);
    }
}
