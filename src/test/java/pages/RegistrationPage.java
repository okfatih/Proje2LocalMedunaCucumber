package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {
    public RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (name ="firstName")
    public WebElement firstNametextBox;

    @FindBy (name ="lastName")
    public WebElement lastnameTextBox;

    @FindBy (name = "username")
        public WebElement usernameTextbox;

    @FindBy (id="email")
    public WebElement emailTextBox;

    @FindBy (name = "firstPassword")
    public WebElement firstPassTextBox;

    @FindBy (name = "secondPassword")
    public WebElement newPassTextBox;

    @FindBy (id="register-submit")
    public WebElement registerButton;






}
