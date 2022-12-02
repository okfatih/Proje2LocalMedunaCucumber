package stepDefinitions.databaseStepDef;

import io.cucumber.java.en.Then;
import utilities.DataBaseUtility;

import javax.xml.crypto.Data;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class US10_StepDef {

    @Then("user gets all the registered appointments {string}")
    public void user_gets_all_the_registered_appointments(String string) {
        List<List<Object>> queryResults = DataBaseUtility.getQueryResultList(string);
        System.out.println("queryResults = " + queryResults);
    }

    @Then("User verifies the appointment with column names {string} and {string}")
    public void userVerifiesTheAppointmentWithColumnNamesAnd(String query, String columnName) {
        List<Object> appointmentIds = DataBaseUtility.getColumnData(query,columnName);
        System.out.println("appointmentIds = " + appointmentIds);
        if (appointmentIds.contains(3404)){
            System.out.println("3404 var");
        }else{
            System.out.println("yok");
        }

    }
}
