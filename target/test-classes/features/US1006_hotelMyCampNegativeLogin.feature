@tekrar1
Feature: US1006 yanlis bilgilerle siteye giris yapilamaz

  Scenario: TC09 yanlis password ile giris yapilamaz
    Given kullanici "hMcUrl" sayfasinda
    Then Log in yazisina tiklar
    And gecerli username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir

  Scenario: TC10 yanlis kullanici adi ile giris yapilamaz
    Given kullanici "hMcUrl" sayfasinda
    Then Log in yazisina tiklar
    And gecersiz username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir

  Scenario: TC11 yanlis kullanici adi ve yanlis sifre ile giris yapilamaz
    Given kullanici "hMcUrl" sayfasinda
    Then Log in yazisina tiklar
    And gecersiz username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir