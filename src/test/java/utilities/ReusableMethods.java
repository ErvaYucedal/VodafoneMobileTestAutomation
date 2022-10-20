package utilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ReusableMethods {
    public static void tapOnElementWithText(String text) {
        List<MobileElement> mobileElementList = Driver.getAppiumDriver().findElementsByClassName("android.widget.TextView");
        for (MobileElement page: mobileElementList) {
            if (page.getText().equals(text)){
                page.click();
            }else{
                scrollWithUiScrollableClick(text);
            }
            break;
        }
    }

    //ikinci alternatif bir method
    public static void clickOnElementWithText(String elementText) throws InterruptedException {
        Thread.sleep(4000);
        List<MobileElement> mobileElementList = Driver.getAppiumDriver().findElementsByXPath("//android.widget.TextView[@text='"+elementText+"']");
        if (mobileElementList.size()>0){
            mobileElementList.get(0).click();
        }else scrollWithUiScrollableClick(elementText);
    }

    public static void scrollWithUiScrollableClick(String elementText) {
        AndroidDriver<MobileElement> driver = (AndroidDriver) Driver.getAppiumDriver();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+elementText+"\"))");
        tapOn(driver.findElementByXPath("//android.widget.TextView[@text='" + elementText + "']"));
    }

    public static void scrollUp() {
        Dimension dimension= Driver.getAppiumDriver().manage().window().getSize();

        int start_x= (int) (dimension.width*0.5);
        int start_y= (int) (dimension.height*0.8);

        int end_x= (int) (dimension.width*0.5);
        int end_y= (int) (dimension.height*0.2);
        TouchAction touchAction=new TouchAction<>(Driver.getAppiumDriver());
        touchAction.press(PointOption.point(start_x,start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x,end_y)).perform();

    }
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
}
