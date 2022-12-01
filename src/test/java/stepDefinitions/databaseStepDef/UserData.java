package stepDefinitions.databaseStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DataBaseUtility;

import javax.xml.crypto.Data;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class UserData {
    List<Object> actualData;
    List<List<Object>> arananHasta;

    @Given("user sets the connection")
    public void user_sets_the_connection() {
        DataBaseUtility.createConnection();


    }

    @Then("user gets all registered data {string} and {string}")
    public void user_gets_all_registered_data_and(String query, String columnName) {
        actualData = DataBaseUtility.getColumnData(query, columnName);
        System.out.println(actualData);
    }

    @Then("user verifies the user credentials")
    public void user_verifies_the_user_credentials() {
        assertTrue(actualData.contains("411-73-3731"));

    }

    @Then("user gets all the required data {string}")
    public void userGetsAllTheRequiredData(String query, String columnName) {
        actualData = DataBaseUtility.getColumnData(query, columnName);
        System.out.println(actualData);

    }

    @And("user executes the {string}")
    public void userExecutesThe(String query) {

     //   DataBaseUtility.executeQuery(query);
        arananHasta = DataBaseUtility.getQueryResultList(query);

        System.out.println("result = " + arananHasta);

    }

    @Then("user verifies the exsistence of patient in the database")
    public void userVerifiesTheExsistenceOfPatientInTheDatabase() {
        //Step 1


        String query = "select * from patient where id = 361241";
        arananHasta = DataBaseUtility.getQueryResultList(query);
        System.out.println("result = " + arananHasta);
        arananHasta.stream().forEach(t -> System.out.println(t));


        String query3 = "select * from patient";

        List<Object> allPatientIds = DataBaseUtility.getColumnData(query3,"id");
        assertTrue(allPatientIds.contains(arananHasta.get(0).get(0)));
    }
}
