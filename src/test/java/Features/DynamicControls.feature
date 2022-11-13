Feature: DynamicControlsFeature

  Scenario: user tests the two dynamic features remove/add and Enable/disable to check if it's working as expected
    Given user navigates to wanted site "dynamic_controls"
    And verifies that it is the wanted site
    Then user verifies that controls "Remove/add" subheaders are showing
    When user checks checkbox
    When user clicks on "Remove" button
    Then waits for action to be done
    And verifies that the action was executed and confirmation message is present
    When user clicks on "Add" button
    Then waits for action to be done
    And verifies that the check box is back and confirmation message is present
    Then user verifies that controls "Enable/disable" subheaders are showing
    When user clicks on "Enable" button
    Then waits for action to be done
    And verifies that the action was executed and confirmation message is present
    And writes "test" in the enabled empty field
    Then user verifies that controls "Enable/disable" subheaders are showing
    When user clicks on "Disable" button
    Then waits for action to be done
    And verifies that the action was executed and confirmation message is present
