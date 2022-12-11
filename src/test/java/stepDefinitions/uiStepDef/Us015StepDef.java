package stepDefinitions.uiStepDef;

import com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US15;
import pojos.MedunaPatientPojo;
import utilities.*;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static utilities.DataBaseUtility.patientPojosu;


public class Us015StepDef {

 public static    List<Object> actualData;

    US15 medunaPage = new US15();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    @Then("Admin goes to sign in symbol and click on it")
    public void adminGoesToSignInSymbolAndClickOnIt() {
        medunaPage.SignIn.click();
        medunaPage.signin2.click();
    }

    @And("Admin fills in username and password then clicks sign in")
    public void adminFillsInUsernameAndPasswordThenClicksSignIn() {
        actions.click(medunaPage.username)
                .sendKeys(ConfigReader.getProperty("adminUserName"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("adminPass"))
                .sendKeys(Keys.TAB)
                .perform();
        medunaPage.signInButton.click();
    }

    @And("Admin clicks on the Administration")
    public void adminClicksOnTheAdministration() {
        medunaPage.adminMenu.click();
        medunaPage.itemsTitles.click();
        medunaPage.patient.click();
    }

    @Then("Admin navigates to Create a new patient and clicks on it")
    public void adminNavigatesToCreateANewUserAndClicksOnIt() {
        medunaPage.createPatient.click();


        String ilkAd = faker.name().firstName();
        patientPojosu = new MedunaPatientPojo();
        patientPojosu.setFirstName(ilkAd);

        medunaPage.firstName.sendKeys(ilkAd);

        medunaPage.lastname.sendKeys(faker.name().lastName());


        medunaPage.email.sendKeys(faker.internet().emailAddress());


        String year = "03/01/2012";
        String hour = "10:11";
        String tm = "PM";
        medunaPage.patientBirthdate.sendKeys(year, Keys.TAB, hour + tm);
        //    medunaPage.email.sendKeys(faker.internet().emailAddress());
        medunaPage.patientPhone.sendKeys("2222222223");
        medunaPage.patientGender.sendKeys("FEMALE");
        medunaPage.patientBloodG.sendKeys("B+");
        medunaPage.patientAddress.sendKeys(faker.address().fullAddress());
        medunaPage.description.sendKeys(faker.rickAndMorty().quote());
        medunaPage.patientsCountry.sendKeys(faker.country().name());
        medunaPage.patientState.sendKeys("Hicip");
        JSExecutor.clickElementByJS(medunaPage.saveButton);


    }

    @And("Admin saves the new Patient")
    public void adminSavesTheNewPatient() {
        JsUtils.JSUtils.clickElementByJS(medunaPage.saveButton);


    }


    @And("Admin enters a {string} for name")
    public void adminEntersAForName(String username) {
        medunaPage.formLogin.sendKeys(username);

    }

    @Then("Admin enters a {string} for first name")
    public void adminEntersAForFirstName(String firstname) {
        medunaPage.firstName.sendKeys(firstname);
    }

    @And("Admin enters a {string} for last name")
    public void adminEntersAForLastName(String lastname) {
        medunaPage.lastname.sendKeys(lastname);

    }

    @And("enters an {string} for email")
    public void entersAnForEmail(String email) {
        medunaPage.email.sendKeys(email);

    }

    @And("enter an {string} for ssn")
    public void enterAnForSsn(String ssn) {
        medunaPage.ssn.sendKeys(ssn);


    }

    @And("enters a {string} for language")
    public void entersAForLanguage(String language) {
        medunaPage.language.sendKeys(language);
    }

    @And("selects a {string}for patient")
    public void selectsAForPatient(String role) {
        Select select = new Select(medunaPage.Profiles);
        select.selectByValue(role);

    }

    @Then("saves it and closes the webpage")
    public void savesItAndClosesTheWebpage() {
        JSExecutor.clickElementByJS(medunaPage.saveButton);
        Driver.closeDriver();

    }

    @Then("user gets all registered data {string} and {string}")
    public void user_gets_all_registered_data_and(String query, String columnName) {
        actualData = DataBaseUtility.getColumnData(query, columnName);
        System.out.println("actualData = " + actualData);
    }

    @Then("Admin navigates to Create a new user")
    public void adminNavigatesToCreateANewUser() {
        medunaPage.createUser.click();
    }

    @And("user verifies the required data")
    public void userVerifiesTheRequiredData() {

        assertTrue(actualData.contains(patientPojosu.getFirstName()));
        System.out.println("actualData = " + actualData);

    }

}
