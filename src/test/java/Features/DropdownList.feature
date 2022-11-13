Feature: DropDownFeature


  Scenario: user tests the drop down list option and fuctionality
    Given user navigates to wanted site "dropdown"
    And verifies that it is the wanted site
    When user clicks on the dropdown list options and chooses option "1"
    Then verifies that options "1" was chosen
    When user clicks on the dropdown list options and chooses option "2"
    Then verifies that options "2" was chosen