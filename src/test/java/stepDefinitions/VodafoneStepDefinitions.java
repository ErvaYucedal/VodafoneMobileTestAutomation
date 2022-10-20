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

    @And("Login to the “Yanımda” as a VF customer")
    public void loginToTheYanımdaAsAVFCustomer() {
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
            System.out.println("Vodafenulu olarak giriş yapildigi icin dogrudan devam edildi");
        }
        }

    @Then("User clicks {string} application")
    public void userClicksApplication(String arg0) {
        tapOn(vodafoneScreen.herseyYanimda);}

    @And("User clicks {string} page")
    public void userClicksPage(String arg0) {
        tapOn(vodafoneScreen.gununTeklifleri);
    }
    @And("User clicks {string} section")
    public void userClicksSection(String title) {
        tapOnText(title);
    }
    @And("User clicks Fiyat Araligi")
    public void userClicksFiyatAraligi() {
        waitFor(3);
      //  ta.tap(TapOptions.tapOptions(1015,395)).waitAction(waitOptions(ofMillis(250))).perform();;
        ta.press(PointOption.point(1015,395)).release().perform();
    }

    @And("User lists the products from the {string} between {string}-{string} TL")
    public void userListsTheProductsFromTheBetweenTL(String arg0, String aralik1, String aralik2) {
        ta.tap(PointOption.point(90,367)).perform();
        ReusableMethods.setNumber(aralik1);
        waitFor(3);
        ta.tap(PointOption.point(618,367)).perform();
        waitFor(3);
        ReusableMethods.setNumber(aralik2);
        waitFor(3);
        ta.tap(PointOption.point(537,1571)).perform();
    }


    @Then("User clicks {string} and chooses {string}")
    public void userClicksAndChooses(String arg0, String arg1) {

    }


    @And("User adds the cheapest product to his-her favorites.")
    public void userAddsTheCheapestProductToHisHerFavorites() {
    }

    @And("User adds the most expensive product to his-her basket.")
    public void userAddsTheMostExpensiveProductToHisHerBasket() {
    }


}
   /*@Test
    public void str(){
        String myString="Vodafone Yanımda uygulamasına 9396 tek kullanımlık şifrenizle giriş yapabilirsiniz. B003";
        String numString=myString.substring(30,35);
        System.out.println(numString); // send keys yapacagın yereyaz




    }

        yanımdaki uygulamayı aç
        kayıtlı olmayan vodofone musterisi
        telefon numarası giriş yap
        kod gelecek
        ana sayfa düğmesine bas
       orda mesaja tıkla
       mesajı locate et
       icindeki text i al
       ana sayfaya gel yanımda uygulamasın aç
       substing sayısını giricem
         */

     /*TouchAction ta=new TouchAction<>(Driver.getAppiumDriver());
        ta.tap(PointOption.point(537,2334)).perform();  // anasayfa
        TouchAction ta=new TouchAction<>(Driver.getAppiumDriver());  //mesaj
        ta.tap(PointOption.point(673,875)).perform();

      */

// ekranı yukarı kaydırma

     /*   ta.press(PointOption.point(545,2322)).
                waitAction(new WaitOptions().withDuration(Duration.ofMillis(3000)))
                .moveTo(PointOption.point(545,2658))
                .release()
                .perform();

*/

  /*

    @Then("User clicks {string} and chooses {string}")
    public void userClicksAndChooses(String arg0, String arg1) {
        tapOnText("Sırala");
        ta.tap(point(61,1753)).perform();

    }


    @And("User adds the most expensive product to his\\/her basket.")
    public void userAddsTheMostExpensiveProductToHisHerBasket() {
        tapOnText("Sırala");
        waitFor(3);
        ta.tap(point(73,1857)).perform();
        waitFor(3);
        tapOn(vodafoneScreen.mostExpensiveProduct);
        waitFor(3);
        tapOn(vodafoneScreen.sepeteEkle);
    }
*/


