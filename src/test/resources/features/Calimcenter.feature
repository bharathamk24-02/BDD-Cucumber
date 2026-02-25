Feature: Claim center Test Scenarios

  @UI @claimcenterTest
  Scenario: To verify the claimcenter FNON creation in Guideware

    Given User on the Guidware claim application
    When  user enters the username and password
    And user click on the okay Button
    And user click on claim button and click New claim
    And click create unverifiedpolicy
    And user enters the policy number ,type ,and loss date ,effective date ,expiration date
    And select name and add person
    And user enters the new person information as firstname ,lastaname,zipcode and click update button
    And user click next btn and select name
    And user click next btn ,select lose cause and select location
    And click on next btn from sevices page and click finish
    Then validate claim number and click on the claim number to validate details

  @UI @Regression @claimcenterTest
  Scenario: To verify the claimcenter Exposure creation in Guideware
    Given User on the Guidware claim application
    When  user enters the username and password
    And user click on the okay Button
    And user click on claim button and click New claim
    And click create unverifiedpolicy
    And user enters the policy number ,type ,and loss date ,effective date ,expiration date
    And select name and add person
    And user enters the new person information as firstname ,lastaname,zipcode and click update button
    And user click next btn and select name
    And user click next btn ,select lose cause and select location
    And click on next btn from sevices page and click finish
    Then validate claim number and click on the claim number to validate details
    And click on the action button ,select by coverage,select c ,select collision
    And select claimant and select vehicle,new incident
    And select vehicle ,enter year ,make,model and select driver
    And select loss occured and click ok
    Then click okay and validate driver details
