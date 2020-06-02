package steps;

import Helper.testBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import pages.accountPage;

import java.io.IOException;

public class account extends testBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }

    @Then("^I verify that I am logged in$")
    public void i_verify_that_I_am_logged_in() throws Throwable {
        accountPage accountpage = PageFactory.initElements(driver, accountPage.class);
        accountpage.verify_sign_out();
    }

    @Then("^I sign out$")
    public void i_sign_out() throws Throwable {
        accountPage accountpage = PageFactory.initElements(driver, accountPage.class);
        accountpage.click_sign_out();
    }

}
