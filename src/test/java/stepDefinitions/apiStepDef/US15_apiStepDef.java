package stepDefinitions.apiStepDef;

import base_urls.MedunaBaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pojos.MedunaPatientPojo;
import pojos.MedunaUserPojo;

import java.util.Optional;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class US15_apiStepDef extends MedunaBaseUrl {
    Response response;
    @Given("User gets the patient info whoose id is {int}")
    public void user_gets_the_patient_info_whoose_id_is(Integer id) {

      response = given()

                .headers("Authorization","Bearer "+generateToken()).when().get("https://medunna.com/api/patients/"+id);
        response.prettyPrint();

    }

    @Then("User validates that status number is {int}")
    public void user_validates_that_status_number_is(Integer expectedStatusCode) {
        Integer actualStatusCode = response.getStatusCode();

        assertEquals(expectedStatusCode, actualStatusCode);

    }

    @Then("User validates patient's info")
    public void user_validates_patient_s_info() {
        MedunaUserPojo medunaUserPojo = new MedunaUserPojo("anonymousUser","2022-04-07T14:00:05.828549Z",55224,"barb.gaylord", "Eli","Wuckert","vaughn.donnelly@yahoo.com",true,"en",null,null,"699-50-3044");
        MedunaPatientPojo expectedData = new MedunaPatientPojo("anonymousUser","2022-04-07T14:00:00.206137Z",55902,"Eli","Wuckert",null,"455-455-5555",null,null,null,"teodoro.olson@yahoo.com",null,medunaUserPojo,null,null,null,null);
        MedunaPatientPojo actualData = response.as(MedunaPatientPojo.class);
        response.prettyPrint();
        assertEquals(expectedData.getCreatedBy(),actualData.getCreatedBy());
        assertEquals(expectedData.getUser().getCreatedBy(),actualData.getUser().getCreatedBy());

    }
}