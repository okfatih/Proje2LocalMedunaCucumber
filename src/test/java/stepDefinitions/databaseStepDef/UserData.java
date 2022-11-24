package stepDefinitions.databaseStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DataBaseUtility;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class UserData {
    List<Object> actualData;

    @Given("user sets the connection")
    public void user_sets_the_connection() {
        DataBaseUtility.createConnection();

    }

    @Then("user get all registered data {string} and {string}")
    public void user_get_all_registered_data_and(String query, String columnName) {
      actualData =   DataBaseUtility.getColumnData(query,columnName);
        System.out.println(actualData);
    }

    @Then("user verifies the user credentials")
    public void user_verifies_the_user_credentials() {
        assertTrue(actualData.contains("411-73-3731"));

    }
}
