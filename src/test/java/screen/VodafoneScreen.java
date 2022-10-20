package screen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VodafoneScreen {

    public VodafoneScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()),this);
    }

    @AndroidFindBy(id = "com.vodafone.selfservis:id/ivClose")
    public MobileElement cerezKapat;

    @AndroidFindBy(id = "com.vodafone.selfservis:id/btnNonVf")
    public MobileElement vodafoneluDegilim;

    @AndroidFindBy(id = "com.vodafone.selfservis:id/etInput")
    public MobileElement telefonNumarasi;

    @AndroidFindBy(id = "com.vodafone.selfservis:id/privacyPolicyOneCB")
    public MobileElement kisiselVeriKabul;

    @AndroidFindBy(id="com.vodafone.selfservis:id/privacyPolicyTwoCB")
    public MobileElement haklar;

    @AndroidFindBy(id="com.vodafone.selfservis:id/btnSendCode")
    public MobileElement sendCode;

    @AndroidFindBy(xpath = "(//*[@resource-id='com.vodafone.selfservis:id/noticeLL'])[2]")
    public MobileElement herseyYanimda;

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
    @AndroidFindBy(xpath ="(//android.widget.TextView[@text='Giriş yap'])[2]")
    public MobileElement girisyap;

    @AndroidFindBy(id="com.vodafone.selfservis:id/btnLogin")
    public MobileElement musteriOlmadanGirisYap;

    @AndroidFindBy(id="com.vodafone.selfservis:id/otpET")
    public MobileElement telefonaGelenKod;












}
