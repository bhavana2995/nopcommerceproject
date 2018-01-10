Feature: Search
  As a End user
  I want to search for products
  So that i can view related products

  Scenario: Search for product
    Given I am homepage
    When I search for product "nike"
    Then I should see all "nike" products