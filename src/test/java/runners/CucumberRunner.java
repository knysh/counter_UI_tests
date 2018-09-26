package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        plugin = {"io.qameta.allure.cucumber2jvm.AllureCucumber2Jvm"},
        features = {"src/test/java/features"},
        glue = {"steps"}
)
public class CucumberRunner extends AbstractTestNGCucumberTests {
}
