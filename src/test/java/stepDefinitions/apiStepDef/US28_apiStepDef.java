package stepDefinitions.apiStepDef;

import base_urls.MedunaBaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pojos.CountryStateInnerPojo;
import pojos.CountryStateOuterPojo;
import utilities.ObjectMapperUtils;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class US28_apiStepDef extends MedunaBaseUrl {
    Response response;

    @Given("User gets the c-state info whoose id is = {int}")
    public void user_gets_the_c_state_info_whoose_id_is(Integer id) {
        response = given()
                .headers("Authorization", "Bearer " + generateToken())
                .when()
                .get("https://www.medunna.com/api/c-states/" + id);
        response.prettyPrint();

    }

    @Then("User validates that state status code is {int}")
    public void userValidatesThatStateStatusNumberIs(Integer expectedStatusCode) {

        Integer actualStatusCode = response.getStatusCode();
        assertEquals(expectedStatusCode, actualStatusCode);
        response.prettyPrint();

    }


    @Then("User validates the cs-state's info")
    public void user_validates_the_cs_state_s_info() {
        CountryStateInnerPojo country = new CountryStateInnerPojo(1201, "Türkiye");
        CountryStateOuterPojo expectedData = new CountryStateOuterPojo(1255, "İzmir", country);

        CountryStateOuterPojo actualData = ObjectMapperUtils.convertJsontoJava(response.asString(), CountryStateOuterPojo.class);
        System.out.println("expectedData = " + expectedData);
        System.out.println("actualData = " + actualData);
        assertEquals(expectedData.getId(),actualData.getId());
        assertEquals(expectedData.getName(),actualData.getName());

        assertEquals(expectedData.getCountry().getId(),actualData.getCountry().getId());

    }


}
