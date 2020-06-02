package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class accountPage {

    @FindBy(how= How.LINK_TEXT, using="Sign out")
    public static WebElement signOut;


    public void verify_sign_out(){
        signOut.isDisplayed();
    }

    public void click_sign_out(){
        signOut.click();
    }
}
