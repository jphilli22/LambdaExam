package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.InputFormSubmit_PO;
import pageObjects.Playground_PO;

public class InputFormSubmitSteps extends Base_PO {
    private InputFormSubmit_PO inputForm;
    private Playground_PO playground;

    public InputFormSubmitSteps(InputFormSubmit_PO inputForm, Playground_PO playground) {
        this.inputForm = inputForm;
        this.playground = playground;
    }

    @Given("I open LambdaTest's Selenium Playground")
    public void i_open_lambda_test_s_selenium_playground() {
        getDriver().get("https://www.lambdatest.com/selenium-playground");
    }

    @When("I click Input Form Submit under Input Forms")
    public void i_click_input_form_submit_under_input_forms() {
        playground.clickInputFormSubmit();
    }

    @Then("I should see the Input Form Submit page {string}")
    public void i_should_see_the_input_form_submit_page(String text) throws Exception {
        inputForm.validateInputFormSubmitURL(text);
    }

    @When("I click Submit without filling in any information in the form")
    public void i_click_submit_without_filling_in_any_information_in_the_form() {
        inputForm.clickSubmitButton();
    }

    @Then("I should see an error message {string}")
    public void i_should_see_an_error_message(String string) {
        inputForm.validateFailedFormSubmission();
    }

    @When("I fill in the Name field {string}")
    public void i_fill_in_the_name_field(String string) {
        inputForm.enterName(string);
    }

    @When("I fill in the Email field {string}")
    public void i_fill_in_the_email_field(String string) {
        inputForm.enterEmail(string);
    }

    @When("I fill in the Password field {string}")
    public void i_fill_in_the_password_field(String string) {
        inputForm.enterPassword(string);
    }

    @When("I fill in the Company Field {string}")
    public void i_fill_in_the_company_field(String string) {
        inputForm.enterCompany(string);
    }

    @When("I fill in the Website field {string}")
    public void i_fill_in_the_website_field(String string) {
        inputForm.enterWebsite(string);
    }

    @When("I select United States from the Country dropdown")
    public void i_select_united_states_from_the_country_dropdown() {
        inputForm.clickCountryDropdown();
        inputForm.clickUSOption();
    }

    @When("I fill in the City field {string}")
    public void i_fill_in_the_city_field(String string) {
        inputForm.enterCity(string);
    }

    @When("I fill in the first Address field {string}")
    public void i_fill_in_the_first_address_field(String string) {
        inputForm.enterAddress1(string);
    }

    @When("I fill in the second Address field {string}")
    public void i_fill_in_the_second_address_field(String string) {
        inputForm.enterAddress2(string);
    }

    @When("I fill in the State {string}")
    public void i_fill_in_the_state(String string) {
        inputForm.enterState(string);
    }

    @When("I fill in the Zip Code {string}")
    public void i_fill_in_the_zip_code(String string) {
        inputForm.enterZip(string);
    }

    @When("I click the Submit button")
    public void i_click_the_submit_button() {
        inputForm.clickSubmitButton();
    }

    @Then("I should see a success message {string}")
    public void i_should_see_a_success_message_thanks_for_contacting_us_we_will_get_back_to_you_shortly(String string) {
        inputForm.validateSuccessfulFormSubmission(string);
    }
}
