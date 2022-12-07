package stepDefinitions.apiStepDef;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.MedunnaRoomPojo;
import pojos.RoomPost;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class Room_CreationApiStepDef {
    Response responsePostTest;
    static RoomPost roomExpectedData;
    static MedunnaRoomPojo roomActualData;
    RequestSpecification spec;

    @Given("User sends a post request for rooms")
    public void user_sends_a_post_request_for_rooms() {
        // Room data oluşturma
         roomExpectedData = new RoomPost(6781231,"DAYCARE",true,12312312);

//        roomActualData = new MedunnaRoomPojo();  İbrahim hocanın methoduyla boş constructorlı roompojosunu çağırıp değerlerini set ederek de post edebiliriz
//        roomActualData.setRoomType("TWIN");
//        roomActualData.setPrice(1200);
//        roomActualData.setStatus(true);
//        roomActualData.setRoomNumber(32598);

        responsePostTest = given()
                .headers("Authorization", "Bearer " + generateToken())
                .contentType(ContentType.JSON)
                .body(roomExpectedData)

                .post("https://www.medunna.com/api/rooms");
        responsePostTest.prettyPrint();


    }

    @Given("the user get the room data and does validation")
    public void the_user_get_the_room_data_and_does_validation() {
        // responsePostTest.prettyPrint();
        roomActualData = responsePostTest.as(MedunnaRoomPojo.class);
        System.out.println("roomActual = " + roomActualData);
        assertEquals(roomExpectedData.getRoomType(), roomActualData.getRoomType());
        System.out.println("room.getPrice() = " + roomExpectedData.getPrice());
        System.out.println("Expected Room = " + roomExpectedData);
    }
}
