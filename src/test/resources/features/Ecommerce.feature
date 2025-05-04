@SmokeTest @RegressionTest
Feature: E-Commerce Shopping

  Background: User is logged in
    Given user navigates to login page
    When user logs in with username "testuser" and password "testpass"
    Then user should see the home page

  @Search
  Scenario Outline: Search and add product to cart
    When user searches for product "<product>"
    And user adds the product to the cart
    Then the cart should contain "<product>"

    Examples:
      | product    |
      | iPhone 16  |
      | Samsung TV |
