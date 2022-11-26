package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US15;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JsUtils;
import utilities.ObjectMapperUtils;


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


}
