package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.DragAndDropSliders_PO;
import pageObjects.Playground_PO;

public class DragAndDropSlidersSteps extends Base_PO {
    private DragAndDropSliders_PO dragAndDrop;
    private Playground_PO playground;

    public DragAndDropSlidersSteps(DragAndDropSliders_PO dragAndDrop, Playground_PO playground) {
        this.dragAndDrop = dragAndDrop;
        this.playground = playground;
    }

    @When("I click Drag & Drop Sliders under Progress Bars & Sliders")
    public void i_click_drag_drop_sliders_under_progress_bars_sliders() {
        playground.clickDragAndDropSliders();
    }

    @Then("I should see the Drag & Drop Sliders page {string}")
    public void i_should_see_the_drag_drop_sliders_page(String text) throws Exception {
        dragAndDrop.validateDragAndDropURL(text);
    }

    @When("I select the slider that is set to default value {int} and drag the bar to {int}")
    public void i_select_the_slider_that_is_set_to_default_value_and_drag_the_bar_to(int startValue, int endValue) throws InterruptedException {
        dragAndDrop.dragAndDropSlider();
    }

    @Then("The value should now show {int}")
    public void the_value_should_now_show(Integer int1) throws InterruptedException {
        dragAndDrop.validateOutputValue();

    }
}
