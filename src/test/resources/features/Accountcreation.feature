Feature: Account Creation Test cases

  @UI @Regression
  Scenario: To verify the account creation in Guideware

    Given User on the Guidware application
    When user enters the username and password
    And user click on the okay Button
    And user click on Account button and click New account creation
    And user enters the firstname ,lastname
    And user click on the search button
    And user click on the create new account button and select account type
    And user enters the account details as firstname,lastaname,address,zipcode,addresstypeand select organization
    And user enters the organization name and click on search button,select the organization
    And user click on the update button
    And validate the account summary page details