package step_definitions;

import static org.junit.Assert.assertEquals;

import Helper.testBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import pages.accountPage;
import pages.commonPage;
import pages.loginPage;

import java.io.File;
import java.io.IOException;

public class signin extends testBase {

	@Before
	public void setup() throws IOException {
		initialize();
	}

	@Given("^I click on the sign in link$")
	public void i_click_on_the_sign_in_link() throws Throwable {
		commonPage commonpage = PageFactory.initElements(driver, commonPage.class);
		commonpage.click_sign_in();
	}


	@When("^I click the login button$")
	public void i_click_the_login_button() throws Throwable {
		loginPage loginpage = PageFactory.initElements(driver, loginPage.class);
		loginpage.clickSubmitBtn();
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

	@When("^I search for dress$")
	public void i_search_for_dress() throws Throwable {
		driver.findElement(By.id("search_query_top")).click();
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		driver.findElement(By.name("submit_search")).click();
	}

	@When("^I select dress from the list$")
	public void i_select_dress_from_the_list() throws Throwable {
		driver.findElement(By.xpath("//img[@alt='Printed Dress']")).click();
		Thread.sleep(2000);
	}

	@When("^I add item to cart$")
	public void i_add_item_to_cart() throws Throwable {
//		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("#add_to_cart > button > span")).click();
		Thread.sleep(3000);
	}

	@When("^proceed to checkout$")
	public void proceed_to_checkout() throws Throwable {
		driver.findElement(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span")).click();

	}

	@When("^view summary and proceed to checkout$")
	public void view_summary_and_proceed_to_checkout() throws Throwable {
		driver.findElement(By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium > span")).click();
		driver.findElement(By.cssSelector("#center_column > form > p > button > span")).click();

	}

	@When("^I click check box to accept terms of service and click Pay$")
	public void i_click_check_box_to_accept_terms_of_service_and_click_Pay() throws Throwable {
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.xpath("//*[@id='form']/p/button/span")).click();

	}

	@When("^I choose check as payment method$")
	public void i_choose_check_as_payment_method() throws Throwable {
		driver.findElement(By.xpath("//*[@id='HOOK_PAYMENT']/div[2]/div/p/a")).click();

	}

	@When("^I click confirm order$")
	public void i_click_confirm_order() throws Throwable {
		driver.findElement(By.cssSelector("#cart_navigation > button > span")).click();

	}

	@Then("^I verify order is complete and successful$")
	public void i_verify_order_is_complete_and_successful() throws Throwable {
		//assertEquals("Your order on CarGuruji Shop is complete.", driver.findElement(By.xpath("//div[@id='center_column']/p")).getText());
		assertEquals("Your order on My Store is complete.", driver.findElement(By.xpath("//div[@id='center_column']/p")).getText());
	}

	@Then("^I took a screenshot$")
	public void i_took_a_screenshot() throws Throwable {
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./TakesScreenshot/CarGuruji-master.png"));
		System.out.println("Screenshot Taken Successfully");
	}



	@When("^I enter my email \"([^\"]*)\" in the email field$")
	public void iEnterMyEmailInTheEmailField(String email) throws Throwable {
		loginPage loginpage = PageFactory.initElements(driver, loginPage.class);
		loginpage.enterEmail(email);
	}

	@And("^I enter my password \"([^\"]*)\" in the password field$")
	public void iEnterMyPasswordInThePasswordField(String password) throws Throwable {
		loginPage loginpage = PageFactory.initElements(driver, loginPage.class);
		loginpage.enterPassword(password);
	}
}
