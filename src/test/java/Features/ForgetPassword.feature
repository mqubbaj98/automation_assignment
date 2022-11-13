Feature: ForgetPasswordFeature

  Scenario: user enters their email to reset password
    Given user navigates to wanted site "forgot_password"
    And verifies that it is the wanted site
    When user enters in their email "mqubbaj+1@atypon.com"
    And user clicks on retrieve password button
    Then navigates to confirmation page