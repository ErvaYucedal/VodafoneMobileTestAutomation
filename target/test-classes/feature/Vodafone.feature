Feature: Vodafone user should be able to access "Favori Ürünler" by logging into "Yanımda"

  @yanimda
  Scenario: Vodafone user should be able to access "Favori Ürünler" by logging into "Yanımda"
    Given Opening app with Appium
    And  Login to the “Yanımda” as a VF customer
    Then User clicks "Her Sey Yanımda" application
    And User clicks "Günün Teklifleri" page
    And User clicks "Filtrele" section
    And User clicks Fiyat Araligi
    And User lists the products from the "Günün Teklifleri" between "15O"-"2OO" TL
    Then User clicks "Sırala" and chooses "En Düşük Fiyat"
    And User adds the cheapest product to his-her favorites.
    And User clicks "Sırala" and chooses "En Yüksek Fiyat"
    And User adds the most expensive product to his-her basket.




