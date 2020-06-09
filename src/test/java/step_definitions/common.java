package step_definitions;

import Helper.testBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import pages.RegisterPage;

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

    @Given("^I enter email address in the address field$")
    public void i_enter_email_address_in_the_address_field() throws Throwable {
        random = 100 + (int)(Math.random() * ((100000 - 1) + 1));
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.type_email("maxtest" + random + "@gmail.com");
        System.out.println(random);

    }

    @Given("^I click create new account button$")
    public void i_click_create_new_account_button() throws Throwable {
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.iClick_create_account();
        Thread.sleep(4000);
    }

}
