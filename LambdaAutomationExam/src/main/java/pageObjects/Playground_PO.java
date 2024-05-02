package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Playground_PO extends Base_PO {
    public Playground_PO() {
        super();
    }

    private @FindBy(xpath = "//a[text()='Simple Form Demo']") WebElement link_SimpleFormDemo;
    private @FindBy(xpath = "//a[text()='Drag & Drop Sliders']") WebElement link_DragAndDropSliders;
    private @FindBy(xpath = "//a[text()='Input Form Submit']") WebElement link_InputFormSubmit;

    public void clickSimpleFormDemo() {
        waitForWebElementAndClick(link_SimpleFormDemo);
    }

    public void clickDragAndDropSliders() {
        waitForWebElementAndClick(link_DragAndDropSliders);
    }

    public void clickInputFormSubmit() {
        waitForWebElementAndClick(link_InputFormSubmit);
    }


}
