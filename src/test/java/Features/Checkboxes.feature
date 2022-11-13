Feature: CheckBoxesFeature

  Scenario: user has to check the boxes to see if they are working as inteded
    Given user navigates to wanted site "checkboxes"
    And make sure that i navigated to the right site
    When user clicks on first checkbox
    And user clicks on second checkbox
    Then the checkbox is checked