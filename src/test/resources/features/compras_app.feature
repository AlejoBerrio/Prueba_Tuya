Feature: Customer do login and he finish to buy


  Scenario Outline: Do login in SauceDemo and finish to buy
    When he load the SauceDemo page and he enter his credentials
      | user   | password   |
      | <user> | <password> |
    Given select the product to buy
      | product   |
      | <product> |
    And he do click on shopping cart
    And he do click on button checkout for fill form
      | name   | lastName   | cod   |
      | <name> | <lastName> | <cod> |
    Then customer can finish to pay

    Examples:
      | user          | password     | name      | lastName | cod    | product                |
      | standard_user | secret_sauce | Alejandro | Berrio   | 876453 | Camisa Sauce Labs Bolt |