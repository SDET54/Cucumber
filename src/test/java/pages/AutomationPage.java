package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage {
    public AutomationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "login")
    public WebElement signInButonElement;

    @FindBy(id = "SubmitCreate")
    public WebElement createAccountButonElement;

    @FindBy(id = "email_create")
    public WebElement emailKutusuElement;

    @FindBy(id = "id_gender1")
    public WebElement mrGenderElement;

    @FindBy(id = "submitAccount")
    public WebElement registerButonElement;

    @FindBy(className = "account")
    public WebElement profilIsmiElement;


}
