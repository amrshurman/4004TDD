@backgroundExample
Feature: Client
  I want to use this template for my feature file

  @client2
  Scenario: Client2
    Given I am playing Yahtzee and run client 2
    When I connect player 2 to the server
    Then check that player 2 finishes game correctly

  @client2Scores
  Scenario Outline: client2Scores
    Given I have finished playing a full game of yahtzee with Player 2
    Then check that P2 scored <Category> correctly

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
