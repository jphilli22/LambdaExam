package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDropSliders_PO extends Base_PO {
    public DragAndDropSliders_PO() {
        super();
    }

    private @FindBy(xpath = "//div[@id='slider3']//div/input") WebElement input_Slider;
    private @FindBy(xpath = "//output[@id='rangeSuccess']") WebElement output_Value;


    public void validateDragAndDropURL(String text) throws Exception {
        validateURLContainsText(text);
    }

    public void validateOutputValue() {
        validateTextMatches(output_Value, "95");
    }

    public void dragAndDropSlider() throws InterruptedException {
        Actions moveSlider = new Actions(getDriver());
        int offset = 100;
        do {
            moveSlider.dragAndDropBy(input_Slider, offset, 0).perform();
            offset = offset + 5;
        } while (!output_Value.getText().equals("95"));
    }

}
