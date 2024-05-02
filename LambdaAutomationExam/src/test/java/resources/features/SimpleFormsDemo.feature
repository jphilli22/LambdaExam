@simple-forms
Feature: Simple Forms Demo

  Scenario: Validate the Simple Forms Demo features

    Given I open LambdaTest's Selenium Playground

    When I click Simple Form Demo under Input Forms
    Then I should be on the Simple Form Demo page "simple-form-demo"

    When I enter a value in the Enter Message text box "Welcome to LambdaTest"
    And I click Get Checked Value
    Then I should see the same text message displayed in the right-hand panel under the Your Message: section "Welcome to LambdaTest"


