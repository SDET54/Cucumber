Feature: US1009 Datatables sitesine 5 farkli giris yapalim

  @datatables
  Scenario Outline: TC14 kullanici 5 farkli kayit girisi yapabilmeli
    Given kullanici "datatablesUrl" sayfasinda
    Then new butonuna basar
    And kullanici "<firstName>" "<lastName>" "<position>" "<office>" "<extension>" "<startDate>" "<salary>"
    And Create tusuna basar
    When kullanici "<firstName>" ile arama yapar
    Then isim bolumunde "<firstName>" oldugunu dogrular
    And sayfayi kapatir
    And amazonUrl1 sayfasina gider

    Examples:
      | firstName | lastName | position | office | extension | startDate  | salary |
      | Alim      | Alim     | qa       | ankara | 3456      | 2021-10-11 | 10000  |
