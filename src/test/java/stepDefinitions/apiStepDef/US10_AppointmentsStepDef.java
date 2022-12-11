package stepDefinitions.apiStepDef;

import com.github.javafaker.App;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matcher;
import pojos.*;
import utilities.ConfigReader;
import utilities.ObjectMapperUtils;

import java.util.HashMap;

import static base_urls.MedunaBaseUrl.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class US10_AppointmentsStepDef {
    Response response;
    Appointment_Pojo appointmentPojo;

    static MedunnaCountryPojo actualData;
    static Appointment_Pojo expectedData;
    static UserPojo user;
    static Patient_Pojo patient;

    static PhysicianPojo physician;


    @When("User sends a get request to access to doctor appointments")
    public void user_sends_a_get_request_to_access_to_doctor_appointments() {

        spec1.pathParams("first", "api", "second", "appointments");

        String patientEndPoint = ConfigReader.getProperty("US10EndPoint");
        response = given()
                .headers("Authorization", "Bearer " + generateToken())
                .contentType(ContentType.JSON)
                .spec(spec1)
                .contentType(ContentType.JSON)
                .when()

                .get("/{first}/{second}/" + 4671);
        //.get(patientEndPoint);
        //     response.prettyPrint();

    }

    @Then("User validates the doctor appointments with API")
    public void user_validates_the_doctor_appointments_with_api() {
//        HashMap<String, String> actualData = response.as(HashMap.class);
//        System.out.println("actualData = " + actualData);


        user = new UserPojo("anonymousUser", "2022-11-15T13:16:32.261615Z", 300780, "hastaosbt", "doctornesibe",
                "TOKLUCU", "hastaosb@gmail.com", true, "en", null, null, "751-01-3536");

        patient = new Patient_Pojo("hastaosbt", "2022-11-15T13:51:33.044901Z", 300396, "emir",
                "TOKLUCU", null, "555-666-5566", "MALE", "Apositive", "", "hastaosb@gmail.com",
                "null", user, null, null, null);

        physician = new PhysicianPojo("adminosbt", "2022-11-16T10:01:39.404884Z", 286097, "Prof.Dr. Oğuz",
                "TOKLUCU", "1990-12-31T22:00:00Z", "444-444-4444", "MALE", "Apositive", "",
                "Professor Doctor", user, "OPHTHALMOLOGY", null, null, 200, "", "image/png");

        expectedData = new Appointment_Pojo("anonymousUser", "2022-11-16T10:19:30.334695Z", 302324,
                "2022-11-21T00:00:00Z", "2022-11-21T01:00:00Z", "COMPLETED", "Gecmis rahatsizligi bulunmamakta",
                "gozluk + Goz damlasi", "0.50 Astigmat", "0.50 Astigmat gozluk, aqua goz damlasi gunde 5 damla",
                "", physician, patient, null);


        Appointment_Pojo actualData = response.as(Appointment_Pojo.class);
        //System.out.println("actualData = " + actualData);

        //JsonPath ile doğrulama
        JsonPath json = response.jsonPath();
        assertEquals(json.getString("createdBy"), expectedData.getCreatedBy());
        System.out.println("Json Path ile gelen created by datası: = " + json.getString("createdBy"));
        assertEquals(json.getString("createdBy"), user.getCreatedBy());
        // En amele doğrulama
        response.then().assertThat()
                .body("physician.id", equalTo(physician.getId()))
                .body("physician.user.firstName", equalTo(user.getFirstName()))
                .body("patient.firstName", equalTo(patient.getFirstName()));
        System.out.println("User first name :" + user.getFirstName());




    }
}
