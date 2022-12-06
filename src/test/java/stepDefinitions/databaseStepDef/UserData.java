package stepDefinitions.databaseStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.US15;
import pojos.MedunaPatientPojo;

import utilities.DataBaseUtility;

import javax.xml.crypto.Data;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static utilities.DataBaseUtility.patientPojosu;

public class UserData {
    MedunaPatientPojo pojomuz = new MedunaPatientPojo();
    List<Object> actualData;
    List<List<Object>> arananHasta;

    List<Object> beklenenData;

    @Given("user sets the connection")
    public void user_sets_the_connection() {
        DataBaseUtility.createConnection();


    }


    @Then("user verifies the user credentials")
    public void user_verifies_the_user_credentials() {
        //assertTrue(actualData.contains("411-73-3731"));
        assertTrue(actualData.contains(pojomuz.getFirstName()));
        String ad = pojomuz.getFirstName();
        System.out.println("ad = " + ad);


    }

    @Then("user gets all the required data {string}")
    public void userGetsAllTheRequiredData(String query, String columnName) {
        actualData = DataBaseUtility.getColumnData(query, columnName);
        //   System.out.println(actualData);

    }

    @And("user executes the {string}")
    public void userExecutesThe(String query) {

        //   DataBaseUtility.executeQuery(query);
        arananHasta = DataBaseUtility.getQueryResultList(query);

        //       System.out.println("result = " + arananHasta);

    }

    @Then("user verifies the exsistence of patient in the database")
    public void userVerifiesTheExsistenceOfPatientInTheDatabase() {
        //Step 1


        String query = "select * from patient where id = 361241";
        arananHasta = DataBaseUtility.getQueryResultList(query);
        System.out.println("result = " + arananHasta);
        arananHasta.stream().forEach(t -> System.out.println(t));


        String query3 = "select * from patient";

        List<Object> allPatientIds = DataBaseUtility.getColumnData(query3, "id");
        assertTrue(allPatientIds.contains(arananHasta.get(0).get(0)));
    }

    @And("user gets the new registered user via {string} and {string}")
    public void userGetsTheNewRegisteredUserViaAnd(String query, String columnName) {
        beklenenData = DataBaseUtility.getColumnData(query, columnName);
        System.out.println("beklenenData = " + beklenenData);

    }

    @Then("user credentials is verified")
    public void userCredentialsIsVerified() {
    }


    @Then("user validates the creation of patient {string}")
    public void userValidatesTheCreationOfPatient(String name) {
        assertTrue(actualData.contains(name));
        System.out.println("name = " + name);
    }
}
