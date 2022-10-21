package stepDefinitions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.*;
import screen.VodafoneScreen;
import utilities.Driver;
import utilities.ReusableMethods;
import static io.appium.java_client.touch.offset.PointOption.point;
import static utilities.ReusableMethods.*;

public class VodafoneStepDefinitions {

    VodafoneScreen vodafoneScreen = new VodafoneScreen();
    TouchAction ta=new TouchAction<>(Driver.getAppiumDriver());

    @Given("Opening app with Appium")
    public void opening_app_with_appium() throws InterruptedException {
        Driver.getAppiumDriver();
    }

    @And("Login to the Yanimda as a VF customer")
    public void loginToTheYanimdaAsAVFCustomer() {
        try{
            if (vodafoneScreen.vodafoneluGirisYap.isDisplayed())
            {
                waitFor(5);
                tapOn(vodafoneScreen.vodafoneluGirisYap);
                waitFor(2);
                tapOn(vodafoneScreen.mobilHesabim);
                waitFor(5);
                vodafoneScreen.telefonNumarasi.sendKeys("5342621516");
                waitFor(7);
                vodafoneScreen.sifre.sendKeys("69053980");
                waitFor(2);

                if (vodafoneScreen.beniHatirla.getAttribute("checked").equals("false")){
                    tapOn(vodafoneScreen.beniHatirla);}
                tapOn(vodafoneScreen.girisYap);
                waitFor(8);
                //Although the 'Beni Hatırla' box is active, it asks if you want to use the 'Beni Hatırla' feature again after logging in
                tapOn(vodafoneScreen.beniHatirla2);
                waitFor(5);
                ta.tap(point(878,372)).release().perform();
                String myString =vodafoneScreen.messageParse.getText();
                String numString = myString.substring(30, 34);
                System.out.println(numString);
                waitFor(5);
                vodafoneScreen.messageKapatma.click();
                waitFor(5);
                vodafoneScreen.dogrulamaKodu.sendKeys(numString);
            }}catch (Exception e){
            System.out.println("It is logging diretly because it was logging as a Vodafone customer before.");
        }
    }

    @Then("Customer clicks Her Sey Yanimda application")
    public void customerClicksHerSeyYanimdaApplication() {
        tapOn(vodafoneScreen.herseyYanimda);
    }
    @And("Customer clicks Gunun Teklifleri page")
    public void customerClicksGununTeklifleriPage() {
        waitFor(5);
        tapOn(vodafoneScreen.gununTeklifleri);
    }

    @And("Customer clicks {string} section")
    public void customerClicksSection(String title) {
        waitFor(5);
        tapOnText(title);
        waitFor(3);
    }

    @And("Customer clicks Fiyat Araligi")
    public void customerClicksFiyatAraligi() {
        ta.press(PointOption.point(1015,395)).release().perform();
    }

    @And("Customer lists the products from the Gunun Teklifleri between {string}-{string} TL")
    public void customerListsTheProductsFromTheGununTeklifleriBetweenTL(String aralik1, String aralik2) {
        ta.tap(PointOption.point(90,367)).perform();
        ReusableMethods.setNumber(aralik1);
        waitFor(3);
        ta.tap(PointOption.point(618,367)).perform();
        waitFor(3);
        ReusableMethods.setNumber(aralik2);
        waitFor(3);
        ta.tap(PointOption.point(537,1571)).perform();
        waitFor(3);
        ta.tap(PointOption.point(771,2125)).perform();
    }

    @Then("Customer clicks Sirala and chooses En Dusuk Fiyat")
    public void customerClicksSiralaAndChoosesEnDusukFiyat() {
        tapOn(vodafoneScreen.sirala);
        waitFor(3);
        ta.press(PointOption.point(39,1752)).release().perform();
    }

    @And("Customer adds the cheapest product to his-her favorites.")
    public void customerAddsTheCheapestProductToHisHerFavorites() {
        waitFor(3);
        tapOn(vodafoneScreen.favorite);
    }

    @And("Customer clicks Sirala and chooses En Yuksek Fiyat")
    public void customerClicksSiralaAndChoosesEnYuksekFiyat() {
        tapOn(vodafoneScreen.sirala);
        waitFor(3);
        ta.press(PointOption.point(73,1861)).release().perform();

    }

    @And("Customer adds the most expensive product to his-her basket.")
    public void customerAddsTheMostExpensiveProductToHisHerBasket() {
        tapOn(vodafoneScreen.mostExpensiveProduct);
        waitFor(3);
        tapOn(vodafoneScreen.sepeteEkle);
    }

}


