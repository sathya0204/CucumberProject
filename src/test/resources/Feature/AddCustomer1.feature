Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Title of your scenario
    Given The user is in Telecom Home Page
    And The User Click on Add Customer
    When The User Fill All Details
      | FirstName | Sathya                        |
      | LastName  | Narayanan                     |
      | EmailID   | Sathyanarayanan0204@gmail.com |
      | Address   | Madipakkam                    |
      | Phon      |                    7418480262 |
    And The Click a Submit Button
    Then The User Get The ID Number
