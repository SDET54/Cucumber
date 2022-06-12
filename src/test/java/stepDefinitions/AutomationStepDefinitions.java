package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage;
import utilities.Driver;

public class AutomationStepDefinitions {
    AutomationPage atp = new AutomationPage();
    Faker faker = new Faker();
    String firstName = faker.name().firstName();

    @Given("user sign in linkine tiklar")
    public void user_sign_in_linkine_tiklar() {
        atp.signInButonElement.click();
    }

    @Given("user Create and account bolumune email adresi girer")
    public void user_create_and_account_bolumune_email_adresi_girer() {
        atp.emailKutusuElement.sendKeys(faker.internet().emailAddress());
    }

    @Given("Create an Account butonuna basar")
    public void create_an_account_butonuna_basar() {
        atp.createAccountButonElement.click();
    }

    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        Actions actions = new Actions(Driver.getDriver());

        actions.click(atp.mrGenderElement).sendKeys(Keys.TAB)
                .sendKeys(firstName, Keys.TAB)
                .sendKeys(faker.name().lastName(), Keys.TAB, Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys("4", Keys.TAB)
                .sendKeys("February", Keys.TAB)
                .sendKeys("1988", Keys.TAB)
                .sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB)
                .sendKeys(faker.company().name(), Keys.TAB)
                .sendKeys(faker.address().fullAddress(), Keys.TAB, Keys.TAB)
                .sendKeys(faker.address().city(), Keys.TAB)
                .sendKeys("Alaska", Keys.TAB)
                .sendKeys("50000", Keys.TAB)
                .sendKeys("United States", Keys.TAB)
                .sendKeys(faker.lorem().sentence(5), Keys.TAB, Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone(), Keys.TAB)
                .sendKeys("Home")
                .perform();
    }

    @Given("user Register butonuna basar")
    public void user_register_butonuna_basar() {
        atp.registerButonElement.click();
    }

    @Then("hesap olustugunu dogrular")
    public void hesap_olustugunu_dogrular() {
        String actualName = atp.profilIsmiElement.getText();
        Assert.assertTrue(actualName.contains(firstName));
    }
}
