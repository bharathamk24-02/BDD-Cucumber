package stepdefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.Training_steps;

public class Training_stepdef {

    Training_steps api = new Training_steps();


    @Given("user creates a new training record")
    public void userCreatesANewTrainingRecord() {
        api.createTraining();
    }

    @When("user updates the training record")
    public void userUpdatesTheTrainingRecord() {
        api.updateTraining();
    }

    @And("user fetches the training record")
    public void userFetchesTheTrainingRecord() throws JsonProcessingException {
        api.getMethod();
    }

    @Then("user deletes the training record")
    public void userDeletesTheTrainingRecord() {
        api.deleteMethod();
    }


}


