Feature: To check payment without cart

Scenario: To login, search product, cart, pay
    Given user logsin
    When user searches the product
    Then user goes to payment page