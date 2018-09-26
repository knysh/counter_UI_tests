package steps.hooks;


import aqa.selenium.browser.Browser;
import cucumber.api.java.Before;
import framework.dataproviders.Configuration;
import org.openqa.selenium.WebDriverException;

import java.net.MalformedURLException;

public class BrowserHooks {

    @Before(order = 2)
    public void startBrowser() throws WebDriverException, MalformedURLException {
        Browser.setUpDriver(Configuration.getCurrentEnvironment().getStartUrl());
    }
}
