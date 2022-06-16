@tekrar1
Feature: US1004 kullanici parametre ile configuration file'i kullanabilmeli

  Scenario: TC07 configuration properties dosyasindan parametre kullanimi
    Given kullanici "techproeducationUrl" sayfasinda
    Then kullanici 3 sn bekler
    And url'in "techpro" icerdigini test eder
    Then sayfayi kapatir