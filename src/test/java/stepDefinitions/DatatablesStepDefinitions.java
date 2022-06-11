package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DatatablesPage;
import utilities.Driver;

public class DatatablesStepDefinitions {

    DatatablesPage dt = new DatatablesPage();

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        dt.newButonElement.click();
    }

    @Then("kullanici {string} {string} {string} {string} {string} {string} {string}")
    public void kullanici(String firstname, String lastname, String position, String office, String extension, String startdate, String salary) {
        Actions actions = new Actions(Driver.getDriver());

        actions.click(dt.firstNameKutuElement)
                .sendKeys(firstname + Keys.TAB)
                .sendKeys(lastname + Keys.TAB)
                .sendKeys(position + Keys.TAB)
                .sendKeys(office + Keys.TAB)
                .sendKeys(extension + Keys.TAB)
                .sendKeys(startdate + Keys.TAB)
                .sendKeys(salary).perform();
    }

    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        dt.createButonElement.click();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstname) {
        dt.aramaKutusuElement.sendKeys(firstname);
    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String firstname) {
        String actualSonuc = dt.aramaSonucIlkElement.getText();
        Assert.assertTrue(actualSonuc.contains(firstname));
    }
}
