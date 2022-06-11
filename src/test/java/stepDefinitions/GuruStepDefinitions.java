package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {

    GuruPage guruPage = new GuruPage();

    @Given("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundaki_tum_degerleri_yazdirir(String istenenBaslik) {

        int istenenIndex = -3;
        for (int i = 0; i < guruPage.headElementList.size(); i++) {
            if (guruPage.headElementList.get(i).getText().equals(istenenBaslik)) {
                istenenIndex = i + 1;
                break;
            }
        }
        if (istenenIndex != -3) {

            List<WebElement> istenenHeadElementleri = Driver.getDriver().findElements(By.xpath("//table//tr//td[" + istenenIndex + "]"));
            for (WebElement each : istenenHeadElementleri) {
                System.out.println(each.getText());
            }
        } else {
            System.out.println("istenen baslik bulunamadi");
        }

    }
}
