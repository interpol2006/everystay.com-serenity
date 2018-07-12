package nfq.everystay.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.annotation.Nullable;


@DefaultUrl("https://uat.owner.everystay.com")

public class OwnerPage extends PageObject {

    @FindBy(name="email")
    WebElement emailField;

    @FindBy(name="password")
    WebElement passwordField ;

    @FindBy(id="btn-submit")
    WebElement btnLogin ;



    public void input_email(String email) {
        emailField.click();
        emailField.clear();
        emailField.sendKeys(email);
    }


    public void input_password(String password) {
        passwordField.sendKeys(password);
    }



    public void check_is_on_homepage() {
        String URL = getDriver().getCurrentUrl();
        Assert.assertEquals(URL,"https://uat.owner.everystay.com/dashboard");
    }




    public void click_button_Login() {
        btnLogin.click();
        //getDriver().getTitle();
        WebDriverWait wait = new WebDriverWait(getDriver(),30);
        wait.until(ExpectedConditions.urlMatches("https://uat.owner.everystay.com/dashboard"));
    }
}
