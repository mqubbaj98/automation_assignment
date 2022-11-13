Feature: BasicLoginFeature

  Scenario: user has to log in with correct credentials to pass
    Given user navigates to wanted site "basic_auth"
    When user enters the following given credentials in the URL
        |Username | Password |
        |admin    |admin     |
    Then user should see confirmation page