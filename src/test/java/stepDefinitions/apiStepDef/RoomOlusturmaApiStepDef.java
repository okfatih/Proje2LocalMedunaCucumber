package stepDefinitions.apiStepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.asserts.SoftAssert;
import pojos.MedunnaRoomPojo;
import pojos.RoomPost;
import pojos.RoomPostSettarH;

import java.util.HashMap;

import static base_urls.MedunaBaseUrl.spec;
import static base_urls.MedunaBaseUrl.spec1;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class RoomOlusturmaApiStepDef {
    Response response;
    RoomPostSettarH room = new RoomPostSettarH();

    @When("User sends a post request to create a room")
    public void user_sends_a_post_request_to_create_a_room() {
        //End pointimiz baseurl + path params + query params
        // baseurl and endpoint: https://medunna.com/api/rooms

        spec1.pathParams("first", "api", "second", "rooms"); //İbrahim hocanın dersi için baseUrl de spec1 oluşturdum
        //İbrahim hocayla beraber oluyşturuduğumuz pojodan room data oluşturma

        room.setStatus(true);
        room.setRoomNumber(27489);
        room.setRoomType("TWIN");
        room.setDescription("Waikiki");
        room.setPrice(1251452);

        response = given()
                .headers("Authorization", "Bearer " + generateToken(), "Content-Type", ContentType.JSON,
                       "Accept", ContentType.JSON) //Buradaki content type Jsonlar  authorization için aşağıdaki ise post işlemi için
                .spec(spec1).contentType(ContentType.JSON).body(room).when().post("/{first}/{second}");


    }

    @Then("After that user gets the info of a new room and validates it")
    public void after_that_user_gets_the_info_of_a_new_room_and_validates_it() {
        response.prettyPrint();
        //Validation 1
        response.then().assertThat().statusCode(201);
        response.then().assertThat()
                .body("roomNumber", equalTo(room.getRoomNumber()))
                .body("roomType", equalTo(room.getRoomType()))
                .body("description", equalTo(room.getDescription()))
                .body("price", equalTo(room.getPrice()))
                .body("status", equalTo(room.isStatus()));

        //Validation 2
        JsonPath json = response.jsonPath();
        assertEquals(json.getInt("roomNumber"), room.getRoomNumber());
        assertEquals(json.getString("roomType"), room.getRoomType());
        assertEquals(json.getInt("price"), room.getPrice());
        assertEquals(json.getBoolean("status"), room.isStatus());
        assertEquals(json.getString("description"), room.getDescription());


        //Validation 3
        // Response u hashmap e çevirerek almak
        HashMap<String, Object> actualData = response.as(HashMap.class);

        assertEquals(room.getRoomNumber(), actualData.get("roomNumber"));
        assertEquals(room.getRoomType(), actualData.get("roomType"));
        assertEquals(room.getPrice(), actualData.get("price"));
        assertEquals(room.isStatus(), actualData.get("status"));
        assertEquals(room.getDescription(), actualData.get("description"));

        //Validation 4
        // Soft assertion
        MedunnaRoomPojo actualRoom = response.as(MedunnaRoomPojo.class);
       SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(room.getRoomNumber(),actualRoom.getRoomNumber());
        softAssert.assertEquals(room.getRoomType(),actualRoom.getRoomType());
        softAssert.assertEquals(room.getPrice(),actualRoom.getPrice());
        softAssert.assertEquals(room.getDescription(),actualRoom.getDescription());

        System.out.println("Description from Pojo room " + actualRoom.getDescription());
        System.out.println("From Map = " + actualData.get("description"));


    }

}

