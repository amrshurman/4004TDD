@backgroundExample
Feature: Client
  I want to use this template for my feature file

  @client3
  Scenario: Client3
    Given I am playing Yahtzee and run client 3
    When I connect player 3 to the server
    Then check that player 3 finishes game correctly

  @client3Scores
  Scenario Outline: client3Scores
    Given I have finished playing a full game of yahtzee with Player 3
    Then check that P3 scored <Category> correctly

    Examples: 
      | Category        |
      | Ones            |
      | Twos            |
      | Threes          |
      | Fours           |
      | Fives           |
      | Sixes           |
      | Bonus           |
      | Three of a Kind |
      | Four of a Kind  |
      | Full House      |
      | Small Straight  |
      | Long Straight   |
      | Yahtzee         |
      | Chance          |
