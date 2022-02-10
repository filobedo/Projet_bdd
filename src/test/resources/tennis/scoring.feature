Feature: tennis game

  Scenario: First point for player one
    Given Score is "love" - "love"
    When Player "one" score
    Then The score is "15" - "love"

  Scenario: Second point for player one
    Given Score is "15" - "love"
    When Player "one" score
    Then The score is "30" - "love"

  Scenario: Third point for player one
    Given Score is "30" - "love"
    When Player "one" score
    Then The score is "40" - "love"

  Scenario: First point for player two
    Given Score is "40" - "love"
    When Player "two" score
    Then The score is "40" - "15"

  Scenario: Second point for player two
    Given Score is "40" - "15"
    When Player "two" score
    Then The score is "40" - "30"

  Scenario: Third point for player two
    Given Score is "40" - "30"
    When Player "two" score
    Then The score is "deuce"

  Scenario: Point for player one
    Given Score is "deuce"
    When Player "one" score
    Then The score is "advantage" - "40"

  Scenario: Point for player two
    Given Score is "advantage" - "40"
    When Player "two" score
    Then The score is "deuce"

  Scenario: Point for player one
    Given Score is "deuce"
    When Player "one" score
    Then The score is "advantage" - "40"

  Scenario: Final point for player one
    Given Score is "advantage" - "40"
    When Player "one" score
    Then Player "one" win the point and win the game

