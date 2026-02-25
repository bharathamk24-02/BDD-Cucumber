Feature: API TEST SCENARIOS

  @API @Regression
  Scenario: Create, Update, Get and Delete Training

    Given user creates a new training record
    When user updates the training record
    And user fetches the training record
    Then user deletes the training record

  @API @Regression @Sample
  Scenario: Create a new GitHub issue using token
    Given User sets GitHub base URI
    And User sets Authorization token
    When User sends POST request to create issue
    Then Response status code should be 201