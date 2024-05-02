@drag-and-drop
Feature: Drag and Drop Sliders

  Scenario: Validate the Drag and Drop Slider features

    Given I open LambdaTest's Selenium Playground

    When I click Drag & Drop Sliders under Progress Bars & Sliders
    Then I should see the Drag & Drop Sliders page "drag-drop-range-sliders-demo"

    When I select the slider that is set to default value 15 and drag the bar to 95
    Then The value should now show 95