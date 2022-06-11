package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HotelmycampPage;
import utilities.ConfigReader;

public class HotelmycampStepDefinitions {

    HotelmycampPage hmc = new HotelmycampPage();

    @Then("Log in yazisina tiklar")
    public void log_in_yazisina_tiklar() {
        hmc.ilkLoginTusuElementi.click();
    }

    @And("gecerli username girer")
    public void gecerliUsernameGirer() {
        hmc.userNameKutusuElementi.sendKeys(ConfigReader.getProperty("hMcUsername"));
    }

    @And("gecerli password girer")
    public void gecerliPasswordGirer() {
        hmc.passwordKutusuElementi.sendKeys(ConfigReader.getProperty("hMcPassword"));
    }

    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        hmc.girisLoginTusuElementi.click();
    }

    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
        Assert.assertTrue(hmc.usernameAfterLogin.isDisplayed());
    }


    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        hmc.passwordKutusuElementi.sendKeys(ConfigReader.getProperty("hMcWrongPassword"));
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(hmc.girisYapilamadiElementi.isDisplayed());
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        hmc.userNameKutusuElementi.sendKeys(ConfigReader.getProperty("hMcWrongUsername"));
    }

    @And("gecersiz username icin {string} girer")
    public void gecersizUsernameIcinGirer(String userName) {
        hmc.userNameKutusuElementi.sendKeys(userName);
    }

    @And("gecersiz password icin {string}girer")
    public void gecersizPasswordIcinGirer(String password) {
        hmc.passwordKutusuElementi.sendKeys(password);
    }


}
