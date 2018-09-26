package steps;

import aqa.assertion.AqaAssert;
import cucumber.api.java.en.Then;
import project.pages.StartPage;

public class StartPageSteps {

    private StartPage startPage = new StartPage();

    @Then("^Start page is opened$")
    public void startPageIsOpened() {
        AqaAssert.isTrue(startPage.isFormPresent(), "Start page is opened");
    }
}
