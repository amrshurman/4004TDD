@backgroundExample
Feature: Server
  I want to use this template for my feature file

  @server
  Scenario: Server
    Given I am playing Yahtzee and I run the server
    When I connect all 3 players to the server
    Then check that game connects with all players and players score correctly

  @exampleTable @join
  Scenario Outline: : ServerJoin
    Given I am playing Yahtzee
    Then check that player <number> has joined the game

    Examples: 
      | number |
      | one    |
      | two    |
      | three  |

  @end
  Scenario Outline: : ServerEnd
    Given a winner is announced after playing Yahtzee
    Then check that player <number> has ended their game

    Examples: 
      | number |
      | one    |
      | two    |
      | three  |
