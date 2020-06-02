package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class commonPage {

    @FindBy(how=How.LINK_TEXT, using="Sign in")
    public static WebElement signIn;


    @FindBy(how=How.LINK_TEXT, using="Contact us")
    public static WebElement contactUs;


    public void click_sign_in(){
        signIn.click();
    }


    public void click_contact_us(){
        contactUs.click();
    }



}
