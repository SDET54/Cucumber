package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DatatablesPage {
    public DatatablesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='dt-button buttons-create']")
    public WebElement newButonElement;

    @FindBy(xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement firstNameKutuElement;

    @FindBy(xpath = "//button[@class='btn']")
    public WebElement createButonElement;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement aramaKutusuElement;

    @FindBy(xpath = "(//tbody//tr//td[2])[1]")
    public WebElement aramaSonucIlkElement;

}
