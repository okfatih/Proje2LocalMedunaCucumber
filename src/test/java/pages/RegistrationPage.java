package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {
    public RegistrationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (css = "#appoDate")
    public WebElement DateAppointment;

    @FindBy (xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement myAppo;

    @FindBy (xpath = "//*[text()='Sign out']")
    public WebElement signOut;

    @FindBy (css = "#phone")
    public WebElement phoneTextBox;

    @FindBy (css = "#register-submit")
    public  WebElement registerSubmit;

    @FindBy(css = "#entity-menu")
    public WebElement myPages;

    @FindBy(name = "firstName")
    public WebElement firstNametextBox;

    @FindBy(xpath = "//span[text()='Make an Appointment']")
    public WebElement makenAnAppointment;

    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement signInIcon;


    @FindBy(css = "#password")
    public WebElement passWord;

    @FindBy(name = "lastName")
    public WebElement lastnameTextBox;

    @FindBy(name = "username")
    public WebElement usernameTextbox;

    @FindBy(id = "email")
    public WebElement emailTextBox;

    @FindBy(name = "firstPassword")
    public WebElement firstPassTextBox;

    @FindBy(name = "secondPassword")
    public WebElement newPassTextBox;

    @FindBy(id = "register-submit")
    public WebElement registerButton;

    @FindBy(xpath = "//select[@id='patient-gender']")
    public WebElement genderButtonu;

    @FindBy(xpath = "//input[@id='patient-birthDate']")
    public WebElement calendar;


    @FindBy(css = "#account-menu")
    public WebElement accountMenu;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmit;
}
