package stepDefinitions.apiStepDef;

import base_urls.MedunaBaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pojos.MedunaPatientPojo;
import pojos.MedunaUserPojo;
import testdata.MedunaTestData;
import utilities.ObjectMapperUtils;

import java.util.Map;
import java.util.Optional;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class US15_apiStepDef extends MedunaBaseUrl {
    Response response;

    @Given("User gets the patient info whoose id is {int}")
    public void user_gets_the_patient_info_whoose_id_is(Integer id) {


        response = given()

              .headers("Authorization", "Bearer " + generateToken()).when().get("https://medunna.com/api/patients/" + id);
        response.prettyPrint();

    }

    @Then("User validates that status number is {int}")
    public void user_validates_that_status_number_is(Integer expectedStatusCode) {
        Integer actualStatusCode = response.getStatusCode();

        assertEquals(expectedStatusCode, actualStatusCode);

    }

    @Then("User validates patient's info")
    public void user_validates_patient_s_info() {
        MedunaUserPojo medunaUserPojo = new MedunaUserPojo("anonymousUser", "2022-04-07T14:00:05.828549Z", 55224, "barb.gaylord", "Eli", "Wuckert", "vaughn.donnelly@yahoo.com", true, "en", null, null, "699-50-3044");
        MedunaPatientPojo expectedData = new MedunaPatientPojo("anonymousUser", "2022-04-07T14:00:00.206137Z", 55902, "Eli", "Wuckert", null, "455-455-5555", null, null, null, "teodoro.olson@yahoo.com", null, medunaUserPojo, null, null, null, null);
       // System.out.println("expectedData = " + expectedData);
        MedunaPatientPojo actualData = response.as(MedunaPatientPojo.class);
        response.prettyPrint();
        assertEquals(expectedData.getCreatedBy(), actualData.getCreatedBy());
        assertEquals(expectedData.getUser().getCreatedBy(), actualData.getUser().getCreatedBy());



        Map actualDataasMap = ObjectMapperUtils.convertJsontoJava(response.asString(), Map.class);
        System.out.println("actualDataasMap = " + actualDataasMap);

        MedunaTestData medunaTest = new MedunaTestData();
        Map<String, Object> medunaUser = medunaTest.medunaUserMethod("anonymousUser", "2022-04-07T14:00:05.828549Z", 55224, "barb.gaylord", "Eli", "Wuckert", "vaughn.donnelly@yahoo.com", true, "en", null, null, "699-50-3044");
        Map<String, Object> expectedDat = medunaTest.expectedMethod("anonymousUser", "2022-04-07T14:00:00.206137Z", 55902, "Eli", "Wuckert", null, "455-455-5555", null, null, null, "teodoro.olson@yahoo.com", null, medunaTest.medunaUserMethod("anonymousUser",

                "2022-04-07T14:00:05.828549Z", 55224, "barb.gaylord", "Eli", "Wuckert", "vaughn.donnelly@yahoo.com", true, "en", null, null,
                "699-50-3044"), null, null, null, null);
        System.out.println("expectedDat = " + expectedDat);

        assertEquals(actualDataasMap.get("createdBy"), expectedDat.get("createdBy"));
        assertEquals(actualDataasMap.get("createdDate"), expectedDat.get("createdDate"));
        assertEquals(medunaUser.get("createdBy"), ((Map) actualDataasMap.get("user")).get("createdBy"));

    }

    @Then("User validates that patient http status number is {int}")
    public void userValidatesThatPatientHttpStatusNumberIs(Integer expectedStatusCode) {
        Integer actualStatusCode = response.getStatusCode();
        assertEquals(expectedStatusCode,actualStatusCode);
    }
}
