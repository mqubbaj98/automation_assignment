Feature: NavigatingAndVerifyingSiteFeature

  Scenario: this feature file includes the first two steps that al the other scenarios will use when they are first ran
    Given user navigates to wanted site "/"
    And verifies that it is the wanted site
