package org.framework.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static org.framework.bdd.constants.Endpoints.ENDPOINT;

public class ApiStepsPost extends AbstractSteps {

    @Given("a POST request is made with {string} and default data")
    public void aPOSTRequestIsMadeWithAndDefaultData(String arg0) {
        // Todo: Build payload
        final Response response = getContext().getRequest().post(ENDPOINT);
        getContext().setResponse(response);
    }

    @Then("verify if object is created by creating a GET request with id of response")
    public void verifyIfObjectIsCreatedByCreatingAGETRequestWithIdOfResponse() {

    }

}
