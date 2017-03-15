Feature: Ebay cart

  Scenario:checking "Add to cart" feature on www.ebay.com
    Given I set search request "SUOB705" and perform search
    When I add to cart
    Then item "SUOB705" is added to Cart

  Scenario Outline: Running a Full Text Quick Search
    Given I set search request "<request>" and perform search
    When I add to cart
    Then item "<request>" is added to Cart

    Examples:
      | request  |
      | SUOB714 |
      | SUOB719 |


