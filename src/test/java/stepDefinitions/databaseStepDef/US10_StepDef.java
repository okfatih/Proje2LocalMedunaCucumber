package stepDefinitions.databaseStepDef;

import io.cucumber.java.en.Then;
import utilities.DataBaseUtility;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;

public class US10_StepDef {

    @Then("user gets all the registered appointments {string}")
    public void user_gets_all_the_registered_appointments(String string) {
        List<List<Object>> queryResults = DataBaseUtility.getQueryResultList(string);
        //      System.out.println("queryResults = " + queryResults);
    }


    @Then("user closes the connection")
    public void userClosesTheConnection() {
        DataBaseUtility.closeConnection();
    }


    @Then("User verifies the appointment with column names {string} and {string}")
    public void userVerifiesTheAppointmentWithColumnNamesAnd(String query, String columnName) {

        List<Object> appointmentIds = DataBaseUtility.getColumnData(query, columnName);
        //  System.out.println("appointmentIds = " + appointmentIds);
        String query1 = "Select * from appointment";
        List<String> sutunAdlari = DataBaseUtility.getColumnNames(query1);
        //     System.out.println("sutunAdlari = " + sutunAdlari);
        String query3 = "select * from appointment where id = 4671";
        String query4 = "select * from jhi_user";
        List<Object> userSSns = DataBaseUtility.getColumnData(query4, "ssn");
        //    System.out.println("userSSns = " + userSSns);


        Object cellResult = DataBaseUtility.getCellValue(query3);


        List<Map<String, Object>> queryResultMap = DataBaseUtility.getQueryResultMap(query1);
      //  System.out.println("queryResultMap = " + queryResultMap);

        List<String> yeniList = appointmentIds.stream().map(Object::toString).toList();

        //      System.out.println("yeniList = " + yeniList);
        assertTrue(yeniList.contains("3404"));

    }
}
