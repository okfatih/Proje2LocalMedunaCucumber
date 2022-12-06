package stepDefinitions.apiStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.MedunnaCountryPojo;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US28_CountryUpdate {
    Response response;
    @Given("User gets country whoose id is {int}")
    public void user_gets_country_whoose_id_is(Integer id) {
        response = given()
                .headers("Authorization", "Bearer " + generateToken())
                .when()
                .get("https://www.medunna.com/api/countries/" +id);
        response.prettyPrint();

    }

    @Then("User updates the country name")
    public void user_updates_the_country_name() {
     //Pat

        MedunnaCountryPojo expectedData = new MedunnaCountryPojo(null,"Kelkit");
        response = given()
                .headers("Authorization", "Bearer " + generateToken())
                .contentType(ContentType.JSON)
                .body(expectedData)
                .post("https://www.medunna.com/api/countries");
    }

    @Then("User verifies that county has been updated")
    public void user_verifies_that_county_has_been_updated() {
       response.prettyPrint();
    }

}
