package steps;

import Helper.testBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

import java.io.IOException;

public class common  extends testBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }

    @Given("^I am on the homepage$")
    public void i_am_on_the_homepage() throws Throwable {
        driver.get(CONFIG.getProperty("testSitaName"));
    }
}
