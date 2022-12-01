package stepDefinitions.apiStepDef;

import base_urls.MedunaBaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pojos.CountryInnerPojo;
import pojos.CountryOuterPojo;
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

    }


    @Then("User validates the cs-state's info")
    public void user_validates_the_cs_state_s_info() {
        CountryInnerPojo country = new CountryInnerPojo(1201, "Türkiye");
        CountryOuterPojo expectedData = new CountryOuterPojo(1255, "İzmir", country);

        CountryOuterPojo actualData = ObjectMapperUtils.convertJsontoJava(response.asString(), CountryOuterPojo.class);
        System.out.println("expectedData = " + expectedData);
        System.out.println("actualData = " + actualData);
        assertEquals(expectedData.getId(),actualData.getId());
        assertEquals(expectedData.getName(),actualData.getName());

        assertEquals(expectedData.getCountry().getId(),actualData.getCountry().getId());

    }


}
