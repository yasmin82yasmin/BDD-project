Feature: Payment Gateway functional test
@smoke @regression
  Scenario: Verify that the user can order a product

    Given The user wants to see payment gateway website  http://demo.guru99.com/payment-gateway/index.php
    When The user wants to buy elephant toy
    Then The user wants to enter payment information as
      |CNumber|44443333555588886666|
      |EMonth |12                  |
      |EYear  |2026                |
      |CVV    |777                 |
    Then The user wants to pay now
    And  The user wants to verify message as "Payment successfull!"
