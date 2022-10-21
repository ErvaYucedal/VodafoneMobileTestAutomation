Feature: Vodafone customer should be able to do shopping with filtering and listing

  @yanimda
  Scenario: Vodafone customer do shopping with filtering and listing
    Given Opening app with Appium
    And  Login to the Yanimda as a VF customer
    Then Customer clicks Her Sey Yanimda application
    And Customer clicks Gunun Teklifleri page
    And Customer clicks "Filtrele" section
    And Customer clicks Fiyat Araligi
    And Customer lists the products from the Gunun Teklifleri between "150"-"200" TL
    Then Customer clicks Sirala and chooses En Dusuk Fiyat
    And Customer adds the cheapest product to his-her favorites.
    And Customer clicks Sirala and chooses En Yuksek Fiyat
    And Customer adds the most expensive product to his-her basket.




