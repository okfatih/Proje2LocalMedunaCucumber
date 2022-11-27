package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US15;
import utilities.*;


public class Us015StepDef {

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
        medunaPage.userManagement.click();
    }

    @Then("Admin navigates to Create a new user and clicks on it")
    public void adminNavigatesToCreateANewUserAndClicksOnIt() {
        medunaPage.createUser.click();

        actions.click(medunaPage.formLogin)
                .sendKeys(ConfigReader.getProperty("PatientuserName"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("PatientName"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("PatientLastName"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("PatientEmail"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("PatientSsn"))
                .perform();
        medunaPage.turkish.click();
        actions.sendKeys(Keys.TAB).perform();
        medunaPage.rolePatient.click();






//      medunaPage.turkish.click();
//      medunaPage.rolePatient.click();
//      actions.sendKeys(Keys.TAB).perform();
//
//      medunaPage.submitButton.click();




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

    @Then("Admin navigates to Create a new user")
    public void adminNavigatesToCreateANewUser() {
        medunaPage.createUser.click();
    }


}
