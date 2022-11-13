Feature: FloatingMenuFeature

  Scenario: user clicks on all 4 floating menus and makes sure that the URL is dynamic and changes when clicking
    Given user navigates to wanted site "floating_menu"
    And verifies that it is the wanted site
    When user clicks on "Home"
    Then user checks url to see "home" was added there
    When user clicks on "News"
    Then user checks url to see "news" was added there
    When user clicks on "Contact"
    Then user checks url to see "contact" was added there
    When user clicks on "About"
    Then user checks url to see "about" was added there