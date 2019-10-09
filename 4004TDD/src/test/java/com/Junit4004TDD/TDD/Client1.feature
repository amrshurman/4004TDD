 @backgroundExample
Feature: Client
  I want to use this template for my feature file
     @client1
   Scenario: Client
    Given I am playing Yahtzee and run client 1
    When I connect player 1 to the server
    Then check that player 1 finishes game correctly
@exampleTable

@client1Scores
Scenario Outline:
Given I have finished playing a full game of yahtzee with Player 1
Then check that P1 scored <Category> correctly
        Examples:
    |Category|
    |Ones| 
    |Twos|
    |Threes|
    |Fours|
    |Fives|
    |Sixes|
    |Bonus|
    |Three of a Kind|
    |Four of a Kind|
    |Full House|
    |Small Straight|
    |Long Straight|
    |Yahtzee|
    |Chance|