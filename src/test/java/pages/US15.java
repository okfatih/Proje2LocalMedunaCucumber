package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US15 {
    public US15() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@id='account-menu']//following::a[@href=\"/account/register\"]")
    public WebElement accounreg;

    @FindBy (css = "#patient-phone")
    public WebElement patientPhone;

    @FindBy (css = "#patient-bloodGroup")
    public WebElement patientBloodG;

    @FindBy (css = "#patient-cstate")
    public WebElement patientState;

    @FindBy (css = "#patient-adress")
    public WebElement patientAddress;

    @FindBy (css = "#patient-description")
    public WebElement description;

    @FindBy (css = "#patient-country")
    public WebElement patientsCountry;







    @FindBy (css = "#patient-gender")
    public WebElement patientGender;

    @FindBy (xpath = "//span[text()='Items&Titles']")
    public WebElement itemsTitles;

    @FindBy (xpath = "//div[@class='dropdown-menu dropdown-menu-right show']/a[contains(@href,'/pat')]")
    public WebElement patient;

    @FindBy(xpath = "//*[@id='account-menu']")
    public WebElement SignIn;

    @FindBy(xpath = "//a[starts-with(@id,'login')]")
    public WebElement signin2;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnNo;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@id='entity-menu']")
    public WebElement mypages;

    @FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']")
    public List<WebElement> pagesDdm;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement myAppointments;

    @FindBy(xpath = "//thead//tr//th")
    public List<WebElement> appointmentTitles;

    @FindBy(xpath = "//*[text()=\"User management\"]")
    public WebElement userManagement;

    @FindBy(xpath = "//*[@id=\"admin-menu\"]")
    public WebElement adminMenu;
    @FindBy (css = "#jh-create-entity")
    public WebElement createPatient;

    @FindBy(xpath = "//*[text()='Create a new user']")
    public WebElement createUser;

    @FindBy(xpath = "//li[@class=\"nav-item\"]//a[starts-with(@href,\"/ab\")]")
    public WebElement about;

    @FindBy(xpath = "//div[@class=\"gallery-item\"]/a[contains(@href,'1')]")
    public WebElement resim1;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement formLogin;

    @FindBy (css = "#patient-birthDate")
    public WebElement patientBirthdate;

    @FindBy(css = "#patient-lastName")
    public WebElement lastname;

    @FindBy (css = "#email")
    public WebElement email;

    @FindBy (css = "#ssn")
    public  WebElement ssn;

    @FindBy (css = "#langKey")
    public WebElement language;

    @FindBy (xpath = "//select[@id='authorities']")
    public WebElement Profiles;

    @FindBy(xpath = "//select[@id='langKey']")
    public WebElement dilClick;

    @FindBy(xpath = "//select[@id='langKey']/option[text()='English']")
    public WebElement english;

    @FindBy(xpath = "//select[@id='langKey']/option[text()='Türkçe']")
    public WebElement turkish;

    @FindBy(xpath = "//select[@id='authorities']/option[text()='ROLE_PATIENT']")
    public WebElement rolePatient;


    @FindBy(xpath = "//button[@type=\"submit\"]/span[text()=\"Save\"]")
    public WebElement saveButton;


}
