package pageObjects;

import driver.DriverFactory;
import net.bytebuddy.implementation.bytecode.Throw;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Base_PO {
    public Base_PO() {
        PageFactory.initElements(getDriver(), this);
    }

    public WebDriver getDriver() {
        return DriverFactory.getDriver();
    }

    private int retries = 0;
    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

    /* BASIC FUNCTIONS (CLICK, SEND KEYS) */

    public void waitForWebElementAndClick(WebElement element) {
        try {
            if (!element.isDisplayed()) {
                // Scroll to the element using Actions
                new Actions(getDriver()).moveToElement(element).perform();
            }
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
            retries = 0;
        } catch (StaleElementReferenceException | ElementClickInterceptedException | MoveTargetOutOfBoundsException |
                 NoSuchElementException e) {
            if (retries < 1000) {
                retries++;
                WebElement newElement = element;
                waitForWebElementAndClick(newElement);
            } else {
                throw e;
            }
        }
    }

    public void sendKeys(WebElement element, String textToType) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(textToType);
        while (!element.getAttribute("value").equals(textToType)) {
            element.clear();
            sendKeys(element, textToType);
        }
    }

    /* VALIDATION METHODS */

    public void validateTextMatches(WebElement element, String expectedText) {
        try {
            wait.until(ExpectedConditions.textToBePresentInElement(element, expectedText));
            retries = 0;
        } catch (StaleElementReferenceException a) {
            if (retries < 100) {
                retries++;
                validateTextMatches(element, expectedText);
            }
        } catch (TimeoutException e) {
            System.out.println("\n" + e + "\n\nExpected Text: " + expectedText + "\nDiscovered Text: " + element.getText() + "\n");
            Assert.fail(e.getMessage());
        }
    }

    public void validateURLContainsText(String expectedText) throws Exception {
        String currentURL = getDriver().getCurrentUrl();
        if (!currentURL.contains(expectedText)) {
            throw new Exception("Expected Text \"" + expectedText + "\" not found in URL \"" + currentURL + "\"");
        }

    }

    public boolean validateElementIsDisabled(WebElement element) {
        if (!element.isEnabled()) return true;
        return false;
    }


}
