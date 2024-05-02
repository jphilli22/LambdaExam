package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.Playground_PO;
import pageObjects.SimpleFormDemo_PO;

public class SimpleFormsDemoSteps extends Base_PO {
    private SimpleFormDemo_PO simpleForm;
    private Playground_PO playground;

    public SimpleFormsDemoSteps(SimpleFormDemo_PO simpleForm, Playground_PO playground) {
        this.simpleForm = simpleForm;
        this.playground = playground;
    }

    @When("I click Simple Form Demo under Input Forms")
    public void i_click_simple_form_demo_under_input_forms() {
        playground.clickSimpleFormDemo();
    }

    @Then("I should be on the Simple Form Demo page {string}")
    public void i_should_be_on_the_simple_form_demo_page(String text) throws Exception {
        simpleForm.validateSimpleFormsURL(text);
    }

    @When("I enter a value in the Enter Message text box {string}")
    public void i_enter_a_value_in_the_enter_message_text_box(String string) {
        simpleForm.typeUserMessage(string);
    }

    @When("I click Get Checked Value")
    public void i_click_get_checked_value() {
        simpleForm.clickGetCheckedValue();
    }

    @Then("I should see the same text message displayed in the right-hand panel under the Your Message: section {string}")
    public void i_should_see_the_same_text_message_displayed_in_the_right_hand_panel_under_the_your_message_section(String text) {
        simpleForm.validateCheckedValue(text);
    }
}
