package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.US15;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class DoctorRandevuStepDef {

Actions actions = new Actions(Driver.getDriver());
    US15 medunaPage = new US15();

    @Then("Doctor fills in the correct credentials")
    public void doctor_fills_in_the_correct_credentials() {
       actions.click(medunaPage.username)
               .sendKeys(ConfigReader.getProperty("doctorUserName"))
               .sendKeys(Keys.TAB)
               .sendKeys(ConfigReader.getProperty("doctorPass"))
               .sendKeys(Keys.TAB)
               .perform();
       medunaPage.signInButton.click();

    }

    @And("Doctor clicks on my pages and goes to appointments")
    public void doctorClicksOnMyPagesAndGoesToAppointments() {
       medunaPage.mypages.click();

       List<WebElement>ddm= medunaPage.pagesDdm;
       ddm.stream().forEach(t-> System.out.println(t.getText()));

        medunaPage.myAppointments.click();



    }

    @Then("Doctor verifies the appointment titles")
    public void doctorVerifiesTheAppointmentTitles() {
        List<WebElement>appTitles = medunaPage.appointmentTitles;
        appTitles.stream().forEach(t-> System.out.println(t.getText()));

    }

    @And("Doctor gets all the values printed under {string}")
    public void doctorGetsAllTheValuesPrintedUnder(String istenenSutun) {
        List<WebElement>appTitles = medunaPage.appointmentTitles;
        int istenenBaslikIndexi = -1;
        for (int i = 0; i <appTitles.size() ; i++) {
            if (appTitles.get(i).getText().equals(istenenSutun)){
                istenenBaslikIndexi = i+1;
                break;
            }

        }
        if (istenenBaslikIndexi!=-2){
            List<WebElement>istenenSutundakiElementler =
                    Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+istenenBaslikIndexi +"]"));
            istenenSutundakiElementler.forEach(t-> System.out.println(t.getText()));
        }else{
            System.out.println("istenen baslik bulunamadi");
        }
    }
}
