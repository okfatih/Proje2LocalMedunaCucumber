package stepDefinitions.databaseStepDef;

import io.cucumber.java.en.And;
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

    @Then("user gets all registered data {string} and {string}")
    public void user_gets_all_registered_data_and(String query, String columnName) {
      actualData =   DataBaseUtility.getColumnData(query,columnName);
        System.out.println(actualData);
    }

    @Then("user verifies the user credentials")
    public void user_verifies_the_user_credentials() {
        assertTrue(actualData.contains("411-73-3731"));

    }

    @Then("user gets all the required data {string}")
    public void userGetsAllTheRequiredData(String query, String columnName) {
actualData =       DataBaseUtility.getColumnData(query,columnName);
        System.out.println(actualData);

    }

    @And("user executes the {string}")
    public void userExecutesThe(String query) {

       DataBaseUtility.executeQuery(query);
List<List<Object>> result =  DataBaseUtility.getQueryResultList(query);
        System.out.println("result = " + result);

    }

    @Then("user verifies the exsistence of patient in the database")
    public void userVerifiesTheExsistenceOfPatientInTheDatabase() {
      String query = "select * from patient where id = 361241";
        List<List<Object>> result =  DataBaseUtility.getQueryResultList(query);
        System.out.println("result = " + result);
       result.stream().forEach(t-> System.out.println(t));
    }
}
