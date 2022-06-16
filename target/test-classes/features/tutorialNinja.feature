@tekrar1
Feature: Tutorialsninja Phones

  Scenario: TC00 kullanici tutorialsninja sayfasinda telefonlari kontrol eder
    Given Navigate to tutorialsninja
    Then click on Phones & PDAs
    And get the brandName of phones
    Then click on add to button for all elements
    Then click on black total added cart button
    And get the names of list from the cart
    And compare the names from displaying list and cart list
    And close page

