Feature: LoginPageFeature

  Scenario: user navigates to log in page and logs in using the right and wrong credentials
    Given user navigates to wanted site "login"
    And verifies that it is the wanted site
    When user enters the credentials "tomsmith" and "SuperSecretPassword!"
    And submits
    Then user should see a verification message "secure" and login or logout button
    When user enters the credentials "test" and "fails"
    And submits
    Then user should see a verification message "login" and login or logout button
