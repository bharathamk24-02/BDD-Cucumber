Feature: Policy Creation Test Cases

  @UI
  @Regression @PolicycreationTest
  Scenario: To verify the policy creation in Guideware

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
    And click on the action button and select new submission
    And select the organisation
    And select Next from offering page and select next from qualifications page
    And select next from policy info page and click on add button from drivers
    And select existing driver and enter the license#
    And select the license state and click on the roles section
    And enter the year first licensed and enter no of violations ,no of accidents field
    And click on next button from drivers page and click on create vehicle
    And enter the vin number ,select license state and add existing driver ,enter the cost value
    And click on next btn from PA coverages page and click on next from risk analysis page
    And click on quote from policy review page and select binding options
    And select issue policy and click okay button
    Then click view your policy and validate summary policy table