@tekrar2
Feature: US1009 Datatables sitesine 5 farkli giris yapalim

  Scenario Outline: TC14 kullanici 5 farkli kayit girisi yapabilmeli
    Given kullanici "datatablesUrl" sayfasinda
    Then new butonuna basar
    And kullanici "<firstName>" "<lastName>" "<position>" "<office>" "<extension>" "<startDate>" "<salary>"
    And Create tusuna basar
    When kullanici "<firstName>" ile arama yapar
    Then isim bolumunde "<firstName>" oldugunu dogrular
    And sayfayi kapatir

    Examples:
      | firstName | lastName | position | office | extension | startDate  | salary |
      | Alim      | Alim     | qa       | ankara | UI        | 2021-10-11 | 10000  |
      | Berk      | Can      | tester   | ankara | api       | 2022-05-05 | 11000  |
      | Huseyin   | Kacmaz   | BA       | berlin | -         | 2022-07-10 | 40000  |
      | Fatih     | Sahin    | PO       | berlin | -         | 2022-03-12 | 45000  |
      | Ahmet     | Kaya     | Tester   | ankara | database  | 2022-06-06 | 11000  |
