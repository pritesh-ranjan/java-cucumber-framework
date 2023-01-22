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
import static org.framework.bdd.constants.Endpoints.GET_SINGLE_OBJECT;

public class ApiSteps extends AbstractSteps {
    @Given("a get request is made for fetching details for object with {string}")
    public void aGetRequestIsMadeForFetchingDetailsForObjectWith(String id) {
        // Todo: improve this block
        final Response response = given().log().all().when().contentType(ContentType.JSON)
                .get(ConfigFactory.getConfig().baseUri() + GET_SINGLE_OBJECT + id);
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
