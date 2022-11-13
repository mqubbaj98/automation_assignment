Feature: AddandRemoveFeature

  Scenario: user to check if the Add and remove buttons are functional
    Given user navigates to wanted site "add_remove_elements/"
    And verifies that it is the wanted site
    When user clicks on add element button
    Then user should see a new element being added that can be deleted
    When user tries to delete new created element
    Then user should see the same site seen when first navigating to site