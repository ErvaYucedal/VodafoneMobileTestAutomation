package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.Driver;

public class VodafoneStepDefinitions {
    @Given("Opening app with Appium")
    public void opening_app_with_appium() throws InterruptedException {
        Driver.getAppiumDriver();

    }
}
