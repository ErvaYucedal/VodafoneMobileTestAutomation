package utilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Arrays;

public class ReusableMethods {


    public static void tapOn(MobileElement element) {
        waitToBeClickable(element, 15);
        element.click();
    }
    public static void tapOnText(String text) {
        waitToBeClickable((MobileElement) Driver.getAppiumDriver().findElementByXPath("//android.widget.TextView[@text='" + text + "']"), 10);
        Driver.getAppiumDriver().findElementByXPath("//android.widget.TextView[@text='" + text + "']").click();
    }

    public static void waitToBeClickable(MobileElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getAppiumDriver(),timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    //   HARD WAIT WITH THREAD.SLEEP
//   waitFor(5);  => waits for 5 second
    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void setNumber(String no){
        TouchAction touchAction=new TouchAction<>(Driver.getAppiumDriver());
        String[]sayi=no.split("");
        System.out.println(Arrays.toString(sayi));
        for (int i = 0; i <sayi.length ; i++) {
            ReusableMethods.waitFor(2);
            switch (sayi[i]){
                case "0":
                    touchAction.tap(PointOption.point(414,2138)).perform();
                    break;
                case "1":
                    touchAction.tap(PointOption.point(133,1797)).perform();
                    break;
                case "2":
                    touchAction.tap(PointOption.point(402,1797)).perform();
                    break;
                case "3":
                    touchAction.tap(PointOption.point(680,1797)).perform();
                    break;
                case "4":
                    touchAction.tap(PointOption.point(133,1916)).perform();
                    break;
                case "5":
                    touchAction.tap(PointOption.point(402,1916)).perform();
                    break;
                case "6":
                    touchAction.tap(PointOption.point(680,1916)).perform();
                    break;
                case "7":
                    touchAction.tap(PointOption.point(133,2064)).perform();
                    break;
                case "8":
                    touchAction.tap(PointOption.point(402,2064)).perform();
                    break;
                case "9":
                    touchAction.tap(PointOption.point(680,2064)).perform();
                    break;

            }

        }
    }
}
