package org.framework.bdd.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.framework.bdd.models.Gadget;
import org.framework.bdd.utils.ConfigFactory;
import org.junit.Assert;

import static io.restassured.RestAssured.given;
import static org.framework.bdd.constants.Endpoints.ENDPOINT;

public class ApiStepsGet extends AbstractSteps {
    @Given("a get request is made for fetching details for object with {string}")
    public void aGetRequestIsMadeForFetchingDetailsForObjectWith(String id) {
        // Todo: improve this block - use request specs
        final Response response = getContext().getRequest().get(ENDPOINT + id);
        getContext().setResponse(response);
    }

    @When("response has status {int}")
    public void responseHasStatus(int statusCode) {
        Assert.assertEquals(getContext().getResponse().getStatusCode(), statusCode);
    }

    @Then("response has valid schema")
    public void responseHasValidSchema() {
    }

    @And("response contains the following {string}")
    public void responseContainsTheFollowing(String name) {
        Assert.assertEquals(getContext().getResponse().body().as(Gadget.class).getName(), name);
    }
}
