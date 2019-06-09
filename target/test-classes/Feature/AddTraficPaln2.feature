
Feature: Title of your feature
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Title of your scenario outline
    Given The User is In ADD Trafic Plan
    When The User Enter Vaild Plan Details "<MonthlyRenatal>","<FreeLM>","<FreeInM>","<FreeSMS>","<LocalPer>","<InPerM>","<SMSPer>",
    And The User Click The Submit Button
    Then The User Should See The Sucess Message

    Examples: 
      | MonthlyRenatal | FreeLM | FreeInM  | FreeSMS |LocalPer|InPerM |SMSPer|
      | 1000           |   100  | 100      | 100     |1000    |1000   |10000 |
      | 2000           |   200  | 300      | 500     |2000    |5000   |70000 |   