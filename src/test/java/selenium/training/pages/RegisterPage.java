package selenium.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.training.utils.Driver;
import selenium.training.utils.GlobalConfigs;

public class RegisterPage extends BasePage{

    @FindBy(className = "ico-register")
    private  WebElement registerButton;


    @FindBy(className = "male")
    private  WebElement gender_radio;

    @FindBy(id = "FirstName")
    private  WebElement name_input;

    @FindBy(id = "LastName")
    private  WebElement lastname_input;

    @FindBy(name = "DateOfBirthDay")
    private  WebElement day_input;

    @FindBy(name = "DateOfBirthMonth")
    private  WebElement month_input;

    @FindBy(name = "DateOfBirthYear")
    private  WebElement year_input;

    @FindBy(id = "Email")
    private  WebElement email_input;

    @FindBy(id = "Company")
    private  WebElement company_input;

    @FindBy(id = "Password")
    private  WebElement pass_input;

    @FindBy(name = "ConfirmPassword")
    private  WebElement pass_validate;

    @FindBy(name = "register-button")
    private WebElement register_button;


    public  void register(String email, String password){
        navigateToRegisterPage();
        registerButton.click();
        gender_radio.click();
        name_input.sendKeys("Mario");
        lastname_input.sendKeys("Muco");
        day_input.sendKeys("30");
        month_input.sendKeys("March");
        year_input.sendKeys("2002");
        email_input.sendKeys(email);
        company_input.sendKeys("Company");
        pass_input.sendKeys(password);
        pass_validate.sendKeys(password);
        register_button.click();
    }

    public static void navigateToRegisterPage() {
        Driver.getDriver().get(GlobalConfigs.URL);
    }
}
