package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPage {

    @FindBy(how= How.ID, using="email")
    public static WebElement myEmail;

    @FindBy(how= How.ID, using="passwd")
    public static WebElement myPassword;

    @FindBy(how= How.CSS, using="#SubmitLogin > span")
    public static WebElement submitBtn;

    @FindBy(how= How.LINK_TEXT, using="Forgot your password?")
    public static WebElement forgotPssLink;


    public void enterEmail(String email){
        myEmail.sendKeys(email);
    }

    public void enterPassword(String password){
        myPassword.sendKeys(password);
    }

    public void clickSubmitBtn(){
        submitBtn.click();
    }


}
