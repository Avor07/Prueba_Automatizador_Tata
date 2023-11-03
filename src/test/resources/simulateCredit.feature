Feature: Simulate credit

  Simulate motorcycle credit on Bancolombia page

  Scenario: Successful credit simulation
    Given The user is on simulating page
    When The user types the credit values
    Then The user should see the simulation