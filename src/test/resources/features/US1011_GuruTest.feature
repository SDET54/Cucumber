@tekrar2
Feature: US1011 web tablasundaki istenen sutunu yazdirma

  Scenario:TC16 kullanici sutun basligi ile liste alabilmeli
    Given kullanici "guruUrl" sayfasinda
    And kullanici 3 sn bekler
    And "Company", sutunundaki tum degerleri yazdirir
    Then sayfayi kapatir
