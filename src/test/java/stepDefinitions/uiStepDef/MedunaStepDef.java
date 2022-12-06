package stepDefinitions.uiStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US15;
import utilities.ConfigReader;
import utilities.Driver;

public class MedunaStepDef {
US15 medunaPage = new US15();
    Faker faker = new Faker();
Actions actions = new Actions(Driver.getDriver());

    @Given("User goes to Medunna")
    public void user_goes_to_medunna() {
        Driver.getDriver().get(ConfigReader.getProperty("medunaUrl"));
    }


    @Then("User goes to sign in symbol and clicks on it")
    public void userGoesToSignInSymbolAndClicksOnIt() {
    medunaPage.SignIn.click();



    }

    @And("User clicks on the Sign in button")
    public void userClicksOnTheSignInButton() {
        medunaPage.signin2.click();
    }

    @Then("User fills in correct credentials")
    public void userFillsInCorrectCredentials() {




      actions.click(medunaPage.username).sendKeys(faker.name().username()).
      sendKeys(Keys.TAB).sendKeys(faker.internet().password()).
              sendKeys(Keys.TAB)
              .sendKeys(Keys.TAB)
              .sendKeys(Keys.TAB)
              .sendKeys(Keys.ENTER)
              .perform();


    }

    @And("User fills in the Registiration form")
    public void userFillsInTheRegistirationForm() {
        medunaPage.ssnNo.sendKeys(ConfigReader.getProperty("PatientSsn"));
        actions.click(medunaPage.firstName).sendKeys(faker.name().username())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().username())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("PatientPass"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("PatientPass"))
                .sendKeys(Keys.TAB,Keys.ENTER).perform();



    }
}
