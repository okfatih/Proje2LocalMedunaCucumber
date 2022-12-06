package stepDefinitions.apiStepDef;

import base_urls.MedunaBaseUrl;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.MedunnaRoomPojo;
import pojos.RoomPost;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class Room_CreationApiStepDef {
    Response response;
    static RoomPost room;
    RequestSpecification spec;

    @Given("User sends a post request for rooms")
    public void user_sends_a_post_request_for_rooms() {
        // Room data oluşturma
        room = new RoomPost(325486,"TWIN",true,65897);


        response = given()
                .headers("Authorization", "Bearer " + generateToken())
                .contentType(ContentType.JSON)
                .body(room)

                .post("https://www.medunna.com/api/rooms");
        response.prettyPrint();

    }

    @Given("the user get the room data and does validation")
    public void the_user_get_the_room_data_and_does_validation() {
        response.prettyPrint();


    }
}
