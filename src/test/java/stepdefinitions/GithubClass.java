package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.GithubSteps;


public class GithubClass {

    GithubSteps steps = new GithubSteps();


    @Given("User sets GitHub base URI")
    public void userSetsGitHubBaseURI() {
    steps.launchEndpoint();
    }

    @And("User sets Authorization token")
    public void userSetsAuthorizationToken() {

    }

    @When("User sends POST request to create issue")
    public void userSendsPOSTRequestToCreateIssue() {
    steps.sendPostRequest();
    }

    @Then("Response status code should be {int}")
    public void responseStatusCodeShouldBe(int expectedStatusCode) {
        steps.verifyStatusCode(expectedStatusCode);
    }
}

