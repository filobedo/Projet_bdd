

Feature: tennis game

  Scenario: First point for player one
    Given score is love - love
    When Player one score
    Then The score is new "15" - love

  Scenario: Second point for player one
    Given score is "15" - love
    When Player one score
    Then The score is new "30" - love

  Scenario: Third point for player one
    Given score is "30" - love
    When Player one score
    Then The score is new "40" - love

#  Scenario: Fourth point for player one
#    Given score is "40" - love
#    When Player one score
#    Then Player one win the point and win the game

