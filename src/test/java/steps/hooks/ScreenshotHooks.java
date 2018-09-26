package steps.hooks;

import aqa.selenium.browser.Browser;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import io.qameta.allure.Attachment;

public class ScreenshotHooks {

    @After(order = 1)
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) scenario.embed(attachScreenshots(), "image/png");
        Browser.quit();
    }

    @Attachment(value = "Failure screenshot:", type = "image/png")
    private byte[] attachScreenshots() {
        return Browser.getScreenshot();
    }
}
