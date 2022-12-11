package stepDefinitions.uiStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import pages.RegistrationPage;
import utilities.ConfigReader;

public class Appointments {
Faker faker;
    RegistrationPage registrationPage = new RegistrationPage();
    @When("Patient clicks on sign in button and fills in username and password")
    public void patientClicksOnSignInButtonAndFillsInUsernameAndPassword() {
        registrationPage.accountMenu.click();
        registrationPage.signInIcon.click();
        registrationPage.usernameTextbox.sendKeys(ConfigReader.getProperty("PatientName"));
        registrationPage.passWord.sendKeys(ConfigReader.getProperty("PatientPass2"));
        registrationPage.signInSubmit.click();

    }


    @When("Patient clicks on My pages and then goes to make an appointment button and clicks it")
    public void patient_clicks_on_my_pages_and_then_goes_to_make_an_appointment_button_and_clicks_it() {

        registrationPage.myPages.click();
        registrationPage.makenAnAppointment.click();
    }

    @When("Patient enters the {string} and date")
    public void patient_enters_the_and_date(String telefon) {
        String date = "01/01/2023";
        registrationPage.phoneTextBox.sendKeys("444-333-5555");
        registrationPage.DateAppointment.sendKeys(date);

    }

    @Then("Patient clicks on Send an Appointment Request buton and patient signs out")
    public void patient_clicks_on_send_an_appointment_request_buton() {

        registrationPage.registerSubmit.click();
        registrationPage.accountMenu.click();
        registrationPage.signOut.click();
    }


    @And("Arts signs in the system to see his or her appointments")
    public void artsSignsInTheSystemToSeeHisOrHerAppointments() {
        registrationPage.accountMenu.click();
        registrationPage.signInIcon.click();
        registrationPage.usernameTextbox.sendKeys("ArtsMoniek");
        registrationPage.passWord.sendKeys(ConfigReader.getProperty("MoniekPass"));
        registrationPage.signInSubmit.click();

    }

    @Then("Art approves the waiting appointment")
    public void artApprovesTheWaitingAppointment() {
        registrationPage.myPages.click();
        registrationPage.myAppo.click();
    }
}

/*
 String year = "03/01/2012";
        String hour = "10:11";
        String tm = "PM";
        us15.birthdate.sendKeys(year, Keys.TAB, hour + tm);
        us15.patientCountry.sendKeys("Peru");
        JSExecutor.clickElementByJS(us15.saveButtonend);

 */