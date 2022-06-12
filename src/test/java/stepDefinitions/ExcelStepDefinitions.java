package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelStepDefinitions {
    Workbook workbook;

    @Given("kullanici excel dosyasini kullanilabilir hale getirir")
    public void kullanici_excel_dosyasini_kullanilabilir_hale_getirir() throws IOException {
        String ulkelerExcelDosyaYolu = "src/test/resources/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(ulkelerExcelDosyaYolu);
        workbook = WorkbookFactory.create(fis);
    }

    @Then("{int}.satirdaki {int}.hucreyi yazdirir")
    public void satirdaki_hucreyi_yazdirir(Integer satir, Integer sutun) {
        System.out.println(workbook.getSheet("Sayfa1").
                getRow(satir - 1).
                getCell(sutun - 1));
    }

    @Then("baskenti Jakarta olan ulke ismini yazdirir")
    public void baskenti_jakarta_olan_ulke_ismini_yazdirir() {
        int sonSatirIndeksi = workbook.getSheet("Sayfa1").getLastRowNum();
        for (int i = 0; i <= sonSatirIndeksi; i++) {
            if (workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString().equals("Jakarta")) {
                System.out.println(workbook.getSheet("Sayfa1").getRow(i).getCell(0));
            }
        }
    }

    @Then("Ulke sayisinin {int} oldugunu test eder")
    public void ulke_sayisinin_oldugunu_test_eder(Integer ulkeSayisi) {
        Integer actualUlkeSayisi = workbook.getSheet("Sayfa1").getLastRowNum();
        Assert.assertEquals(ulkeSayisi, actualUlkeSayisi);
    }

    @Then("Fiziki olarak kullanilan satir sayisinin {int} oldugunu test eder")
    public void fiziki_olarak_kullanilan_satir_sayisinin_oldugunu_test_eder(Integer kullanilanSatirSayisi) {
        Integer actualKullanilanSatirSayisi = workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();
        Assert.assertEquals(kullanilanSatirSayisi, actualKullanilanSatirSayisi);
    }

}
