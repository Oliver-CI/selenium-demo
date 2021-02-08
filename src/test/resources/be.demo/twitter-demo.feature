Feature: Twitter

  Scenario: Tweet during workshop
    Given I log in in twitter
    When I tweet a message with content ""
    Then my message should be visible on my feed
