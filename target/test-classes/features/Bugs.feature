@Bugs
  Feature: bugs_feature
    Background: set_up
      Given  user goes to webpage  "https://qa-recruitment-task.netlify.app/"

  @bug01
    Scenario: bug01
    Then user clicks more than two hundred dollars price filter
    And user clicks art filter
    Then user sees no result


  @bug02
    Scenario: bug02
  When user goes to product list
  Then user verify that product list contains 6 artworks on the page

    @bug03
    Scenario: bug03
    When user clicks any Add to Chart bar
    And  user clicks Clear button
    Then counter badge only if the cart includes some items

    @bug04
    Scenario: bug04
      Then counter badge only if the cart includes some items