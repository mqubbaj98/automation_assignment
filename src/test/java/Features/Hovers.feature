Feature: HoversFeature

  Scenario: user hovers over figures and checks if the figure caption is displaying
    Given user navigates to wanted site "hovers"
    And verifies that it is the wanted site
    When user hovers over figure "1"
    Then user should be able to see figure "1"
    When user hovers over figure "2"
    Then user should be able to see figure "2"
    When user hovers over figure "3"
    Then user should be able to see figure "3"
    When user clicks on figure caption "3"
    Then user should be navigated to user "/3" page
