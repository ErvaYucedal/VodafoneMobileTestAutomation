package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screen.VodafoneScreen;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.*;

public class VodafoneStepDefinitions {

    VodafoneScreen vodafoneScreen = new VodafoneScreen();
    Driver driver=new Driver();
    @Given("Opening app with Appium")
    public void opening_app_with_appium() throws InterruptedException {
        Driver.getAppiumDriver();
        System.out.println(Driver.getAppiumDriver().getPageSource());
    }

    @And("Login to the “Yanımda” from {string} button")
    public void loginToTheYanımdaFromButton(String arg0) {

        ReusableMethods.waitFor(5);
        tapOn(vodafoneScreen.girisyap);
        /*
        ReusableMethods.waitFor(5);
       vodafonePage.telefonNumarasi.sendKeys("5521572486");
        ReusableMethods.waitFor(3);
        tapOn(vodafonePage.kisiselVeriKabul);
        ReusableMethods.waitFor(3);
       tapOn(vodafonePage.haklar);
        ReusableMethods.waitFor(3);
        tapOn(vodafonePage.sendCode);
        ReusableMethods.waitFor(3);
        tapOn(vodafonePage.telefonaGelenKod);

*/
        waitFor(5);
        tapOnText("Giriş");
        waitFor(5);
    }

    @Then("User clicks {string} application")
    public void userClicksApplication(String arg0) {
        waitFor(3);
        tapOn(vodafoneScreen.herseyYanimda);
    }

    @And("User clicks {string}")
    public void userClicks(String arg0) {
        waitFor(3);
        tapOnText("Kategoriler");
        waitFor(8);
        tapOnText("Kozmetik ve Kişisel Bakım");


    }

    @When("User enters {string}")
    public void userEnters(String arg0) {
        waitFor(8);
        tapOn(vodafoneScreen.favoriUrunler);
        tapOnText("Filtrele");
        waitFor(5);

        TouchAction ta=new TouchAction<>(Driver.getAppiumDriver());
        ta.tap(PointOption.point(1005,391)).perform();


    }

    @And("User lists the products from the “Favori Ürünler” between {int}{int} TL")
    public void userListsTheProductsFromTheFavoriÜrünlerBetweenTL(int arg0, int arg1) {
        waitFor(5);

        TouchAction ta=new TouchAction<>(Driver.getAppiumDriver());
        ta.tap(PointOption.point(100,375)).perform();




    }

    @Then("User clicks {string} and chooses {string}")
    public void userClicksAndChooses(String arg0, String arg1) {
        tapOnText("Sırala");
        TouchAction ta=new TouchAction<>(Driver.getAppiumDriver());
        ta.tap(PointOption.point(61,1753)).perform();
    }


    @And("User adds the cheapest product to his\\/her favorites.")
    public void userAddsTheCheapestProductToHisHerFavorites() {
        waitFor(3);
        tapOn(vodafoneScreen.favoriteAdd);
    }

    @And("User adds the most expensive product to his\\/her basket.")
    public void userAddsTheMostExpensiveProductToHisHerBasket() {
        tapOnText("Sırala");
        waitFor(3);
        TouchAction ta=new TouchAction<>(Driver.getAppiumDriver());
        ta.tap(PointOption.point(73,1857)).perform();
        waitFor(3);
        tapOn(vodafoneScreen.mostExpensiveProduct);
        waitFor(3);
        tapOn(vodafoneScreen.sepeteEkle);

    }
}





