Feature: US1008 kullanici farkli yanlis sifre ve kullanici adi ile giris yapamaz

  @hmcnegative
  Scenario Outline: TC13 yanlis kullanici adi ve sifrelerle ile giris yapilamaz
    Given kullanici "hMcUrl" sayfasinda
    Then Log in yazisina tiklar
    And gecersiz username icin "<username>" girer
    And gecersiz password icin "<password>"girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir

    Examples:
      | username | password  |
      | Manager5 | Manager5! |
      | Manager6 | Manager6! |
      | Manager7 | Manager7! |
      | Manager8 | Manager8! |
      | Manager9 | Manager9! |