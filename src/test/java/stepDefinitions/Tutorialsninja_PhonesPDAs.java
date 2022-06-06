package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.TutorialsninjaPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;
import java.util.stream.Collectors;

public class Tutorialsninja_PhonesPDAs {

    /*
  ~ Navigate to http://tutorialsninja.com/demo/index.php?route=common/home
  ~ click on Phones & PDAs
  ~ get the brandName of phones
  ~ click on add to button for all elements
  ~ click on black total added cart button
  ~ get the names of list from the cart
  ~ compare the names from displaying list and cart list
  */

    TutorialsninjaPage tutorialsninjaPage = new TutorialsninjaPage();

    @Given("Navigate to tutorialsninja")
    public void navigate_to_tutorialsninja() {
        Driver.getDriver().get(ConfigReader.getProperty("tutorialsninjaUrl"));
    }

    @Then("click on Phones & PDAs")
    public void click_on_phones_pd_as() {
        tutorialsninjaPage.phonesPdaElement.click();
    }

    @Then("get the brandName of phones")
    public void get_the_brand_name_of_phones() {
        tutorialsninjaPage.phoneBrandNameElements.forEach(t -> System.out.println(t.getText()));
    }

    @Then("click on add to button for all elements")
    public void click_on_add_to_button_for_all_elements() throws InterruptedException {
        for (WebElement each : tutorialsninjaPage.addToCartElements) {
            each.click();
        }
        Thread.sleep(3000);
    }

    @Then("click on black total added cart button")
    public void click_on_black_total_added_cart_button() {
        tutorialsninjaPage.totalCartElement.click();
    }

    @Then("get the names of list from the cart")
    public void get_the_names_of_list_from_the_cart() {
        tutorialsninjaPage.phoneBrandNameElementsInCart.forEach(t -> System.out.println(t.getText()));
    }

    @Then("compare the names from displaying list and cart list")
    public void compare_the_names_from_displaying_list_and_cart_list() {
        List<String> phoneBrandNameList = tutorialsninjaPage.phoneBrandNameElements.stream().
                map(WebElement::getText).
                collect(Collectors.toList());
        List<String> phoneBrandNameListInCart = tutorialsninjaPage.phoneBrandNameElementsInCart.stream().
                map(WebElement::getText).
                collect(Collectors.toList());

        Assert.assertTrue(phoneBrandNameList.containsAll(phoneBrandNameListInCart));
    }

    @Then("close page")
    public void close_page() {
        Driver.closeDriver();
    }
}
