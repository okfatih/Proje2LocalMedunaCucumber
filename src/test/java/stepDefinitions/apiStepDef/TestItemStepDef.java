package stepDefinitions.apiStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.TestitemPost;
import pojos.TestitemsGet;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.replaceFiltersWith;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class TestItemStepDef {
    RequestSpecification spec1;
    RequestSpecification spec2;
    static Response responseGetTest;
    static Response responsePostTest;
    static TestitemsGet expectedDataGetTest;
    static TestitemsGet gercekData;
    static TestitemPost postActualData;
    static TestitemPost postActualData2;
    static TestitemPost postItemExpectedData;
    static JsonPath jsonPathGetReq;
    static JsonPath jsonPathPostReq;


    @Given("User gets the test item with id = {int}")
    public void user_gets_the_test_item_with_id(Integer testId) {
        spec1 = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunaUrl")).build();
        spec1.pathParams("1", "api", "2", "c-test-items");
        responseGetTest = given()
                .spec(spec1)
                .headers("Authorization", "Bearer " + generateToken())
                .when()
                .get("/{1}/{2}/" + testId);

        responseGetTest.prettyPrint();
        jsonPathGetReq = responseGetTest.jsonPath();
    }

    @Then("User validates the status code as {int} and test item")
    public void user_validates_the_status_code_as_and_test_item(Integer int1) {
        expectedDataGetTest = new TestitemsGet("medunnaadmin", "2022-03-16T22:55:47.152296Z",
                30198, "Na111fjkhj3", "", 50.00, "66", "100");
        gercekData = responseGetTest.as(TestitemsGet.class);
        System.out.println("actualData = " + gercekData);
        assertEquals(expectedDataGetTest.getCreatedBy(), gercekData.getCreatedBy());
        assertEquals(expectedDataGetTest.getPrice(), gercekData.getPrice());

    }

    @Given("User creates a new test item with post")
    public void user_creates_a_new_test_item_with_post() {

        TestitemPost testPost = new TestitemPost("kimango", 4.0);
        spec2 = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunaUrl")).build();
        spec2.pathParams("1", "api", "2", "c-test-items");
        responsePostTest = given()
                .spec(spec2)
                .headers("Authorization", "Bearer " + generateToken())
                .contentType(ContentType.JSON)
                .body(testPost)
                .post("/{1}/{2}");
        responsePostTest.prettyPrint();

    }

    @Then("User validates the posted test item")
    public void user_validates_the_posted_test_item() {
        TestitemsGet actul = responsePostTest.as(TestitemsGet.class);
        System.out.println("actul = " + actul);
        TestitemPost expected = new TestitemPost("kimango",4.0);
        assertEquals(expected.getName(),actul.getName());
        assertEquals(expected.getPrice(),actul.getPrice());




    }

}
