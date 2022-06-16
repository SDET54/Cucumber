@tekrar2
Feature: US1007 kullanici amazonda istedigi kelimeleri aratir

  Scenario Outline: TC12 amazonda listedeki elementleri aratma
    Given kullanici "amazonUrl" sayfasinda
    Then kullanici "<istenenKelime>" icin arama yapar
    And sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And sayfayi kapatir

    Examples:
      | istenenKelime | istenenKelimeKontrol |
      | nutella       | nutella              |
      | java          | java                 |
      | elma          | elma                 |
      | armut         | armut                |