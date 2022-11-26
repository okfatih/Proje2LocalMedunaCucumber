import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.RegistrationPage;
import pages.US15;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSExecutor;
import utilities.JsUtils;

public class RegistirationSteps {
    US15 us15 = new US15();
    Faker faker = new Faker();
    RegistrationPage registrationPage = new RegistrationPage();

    @Given("user is on registration page")
    public void userIsOnRegistrationPage() {
        Driver.getDriver().get("https://medunna.com/account/register");

    }

    @And("user enters ssn number as {string}")
    public void userEntersSsnNumberAs(String ssn) {
        //   ssn = faker.idNumber().ssnValid();

        registrationPage.firstNametextBox.sendKeys(ssn);

    }

    @Then("user enters firstname and lastname as {string} and {string}")
    public void userEntersFirstnameAndLastnameAsAnd(String firstname, String lastname) {
    }

    @And("user provides a username {string}")
    public void userProvidesAUsername(String arg0) {
    }

    @Then("user provides email id as {string}")
    public void userProvidesEmailIdAs(String arg0) {
    }

    @And("user enters the password as {string}")
    public void userEntersThePasswordAs(String arg0) {
    }

    @Then("user confirms the new password {string}")
    public void userConfirmsTheNewPassword(String arg0) {
    }

    @Then("user clicks on register button and  sees the success message as {string}")
    public void userClicksOnRegisterButtonAndSeesTheSuccessMessageAs(String arg0) {
    }

    @Then("user reads all registrant data")
    public void userReadsAllRegistrantData() {
    }


}
