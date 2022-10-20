Feature: Vodafone user should be able to access "Favori Ürünler" by logging into "Yanımda"

  @yanimda
  Scenario: Vodafone user should be able to access "Favori Ürünler" by logging into "Yanımda"
    Given Opening app with Appium
    And  Login to the “Yanımda” from "Vodafonelu değilim" button
    Then User clicks "Her Sey Yanımda" application
    And User clicks "Kategoriler"
    And User clicks "Kozmetik ve Kişisel Bakım"
    When User enters "Favori Ürünler"
    And User clicks "Filtrele"
    And User clicks "Fiyat Aralığı"
    And User lists the products from the “Favori Ürünler” between 150-200 TL
    Then User clicks "Sırala" and chooses "En Düşük Fiyat"
    And User adds the cheapest product to his/her favorites.
    And User clicks "Sırala" and chooses "En Yüksek Fiyat"
    And User adds the most expensive product to his/her basket.





