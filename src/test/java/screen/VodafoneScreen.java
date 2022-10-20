package screen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VodafoneScreen {

    public VodafoneScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()),this);
    }

    @AndroidFindBy(id = "com.vodafone.selfservis:id/ivClose")
    public MobileElement cerezKapat;

    @AndroidFindBy(xpath ="(//android.widget.TextView[@text='Giriş yap'])[1]")
    public MobileElement vodafoneluGirisYap;

    @AndroidFindBy (id="com.vodafone.selfservis:id/mobile_service_view")
    public MobileElement mobilHesabim;

    @AndroidFindBy(id= "com.vodafone.selfservis:id/loginEmailTxt")
    public MobileElement telefonNumarasi;

    @AndroidFindBy(id="com.vodafone.selfservis:id/loginPassTxt")
    public MobileElement sifre;

    @AndroidFindBy(id="com.vodafone.selfservis:id/loginRememberToggle")
    public MobileElement beniHatirla;

    @AndroidFindBy(id="com.vodafone.selfservis:id/confirmationButton")
    public MobileElement beniHatirla2;
    @AndroidFindBy(id="com.vodafone.selfservis:id/loginLoginButton")
    public MobileElement girisYap;

    @AndroidFindBy(id= "com.android.mms:id/message_body")
    public MobileElement messageParse;

    @AndroidFindBy(id="com.android.mms:id/button_dismiss")
    public MobileElement messageKapatma;
    @AndroidFindBy(id="com.vodafone.selfservis:id/firstItemTitleTv")
    public MobileElement herseyYanimda;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Tümü\"]/android.widget.TextView")
    public MobileElement gununTeklifleri;

    @AndroidFindBy(id="com.vodafone.selfservis:id/loginSMSCodeValid")
    public MobileElement dogrulamaKodu;

    @AndroidFindBy(id = "com.vodafone.selfservis:id/privacyPolicyOneCB")
    public MobileElement kisiselVeriKabul;

    @AndroidFindBy(id="com.vodafone.selfservis:id/privacyPolicyTwoCB")
    public MobileElement haklar;

    @AndroidFindBy(id="com.vodafone.selfservis:id/btnSendCode")
    public MobileElement sendCode;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Tümü\"]/android.widget.TextView")
    public MobileElement favoriUrunler;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/" +
            "android.view.View/android.view.View/android.view.View[6]/android.view.View[2]/android.view.View/android.view.View[1]/android.widget.Button")
    public MobileElement favoriteAdd;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/" +
            "android.webkit.WebView/android.view.View/android.view.View/android.view.View[6]/android.view.View[2]/android.view.View/android.view.View[1]")
    public MobileElement mostExpensiveProduct;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Sepete ekle']")
    public MobileElement sepeteEkle;


    @AndroidFindBy(id="com.vodafone.selfservis:id/btnLogin")
    public MobileElement musteriOlmadanGirisYap;

    @AndroidFindBy(id="com.vodafone.selfservis:id/otpET")
    public MobileElement telefonaGelenKod;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='En az'")
            public MobileElement endusukfiyat;












}
