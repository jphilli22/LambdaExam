@input-form-submit
Feature: Input Form Submit

  Scenario: Validate Input Form Submit features

    Given I open LambdaTest's Selenium Playground

    When I click Input Form Submit under Input Forms
    Then I should see the Input Form Submit page "input-form-demo"

    When I click Submit without filling in any information in the form
    Then I should see an error message "Please fill in the fields"

    When I fill in the Name field "Jack Phillips"
    And I fill in the Email field "jack.phillips@radixbay.com"
    And I fill in the Password field "password"
    And I fill in the Company Field "Fake Company LLC"
    And I fill in the Website field "https://fakecompanyllc.com"
    And I select United States from the Country dropdown
    And I fill in the City field "Fake City"
    And I fill in the first Address field "123 Fake Street"
    And I fill in the second Address field "Suite B"
    And I fill in the State "NY"
    And I fill in the Zip Code "12345"
    And I select United States from the Country dropdown
    And I click the Submit button
    Then I should see a success message "Thanks for contacting us, we will get back to you shortly."