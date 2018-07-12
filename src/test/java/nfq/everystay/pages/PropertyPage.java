package nfq.everystay.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.*;
import java.util.List;

@DefaultUrl("https://uat.owner.everystay.com/properties")

public class PropertyPage extends PageObject{

    @FindBy(name="house-name")
    WebElement fieldpropertyName;

    @FindBy(css=".required.field.en .ui.search.selection.dropdown")
    WebElement fieldcounTry;

    @FindBy(css=".menu.transition.visible")
    WebElement listcounTry;

    @FindBy(name="city")
     WebElement fieldCity;

    @FindBy(name="house_number")
     WebElement fieldHouseNumber;

    @FindBy(name = "address")
     WebElement fieldAddressLine1;

    @FindBy(xpath = "//div[@class='seven wide field']/div/div/div/div/div/input[@placeholder='Search places...']")
     WebElement fieldSearchPlaces;

    @FindBy(name="region")
     WebElement fieldRegion;

    @FindBy(name="sub-region")
     WebElement fieldSubRegion;

    @FindBy(css=".nav-bar .ui.menu.nav-bar-menu .item a.active")
    WebElement labelProperties;

    @FindBy(className="btn-save-continue")
    WebElement btnSaveAndContinue;

    @FindBy(css=".page-header .ui.basic.primary.button, .page-header .ui.primary.button")
    WebElement btnCreateNewProperty;

    public void select_dropdownlist(String value)
    {
        fieldcounTry.click();
        List<WebElement> options = getDriver().findElements(By.xpath("//span[contains(@class,'text')]")) ;
        for (WebElement option : options)
        {
            if (option.getText().equals(value))
            {
                option.click();
            }
        }

    }


    public void input_value(String fields, String values) {
        switch (fields)
        {
            case "Property Name": fieldpropertyName.sendKeys(values);
            case "Country": select_dropdownlist(values);
            case "City": fieldCity.sendKeys(values);
            waitABit(2000);
//            case "House Number": fieldHouseNumber.sendKeys(values);
//                //fieldHouseNumber.sendKeys(Keys.ENTER);
//                waitABit(2000);
//            case "Address line 1": fieldAddressLine1.sendKeys(values);
//               // fieldAddressLine1.sendKeys(Keys.ENTER);
//                waitABit(2000);
//            case "Search places": fieldSearchPlaces.sendKeys(values);
//                fieldSearchPlaces.sendKeys(Keys.ENTER);
//                waitABit(2000);
//            case "Region": fieldRegion.sendKeys(values);
//                fieldRegion.sendKeys(Keys.ENTER);
//                waitABit(2000);
//            case "Sub region": fieldSubRegion.sendKeys(values);
//                fieldSubRegion.sendKeys(Keys.ENTER);
//                waitABit(2000);

        }
    }
    
    

    public void click_button_Save_and_Continue() {
        btnSaveAndContinue.click();
    }

    public void check_is_on_property_type_and_amenities() {
        String URL = getDriver().getCurrentUrl();
        char last = URL.charAt(URL.length()-1);

        Assert.assertEquals(last,"2");
        waitABit(30000);
        waitForLoad(getDriver());
    }

    public void waitForLoad(WebDriver driver)
    {
        ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");

                    }
                };
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(pageLoadCondition);
    }

    public void open_name_and_location_page() {
        //labelProperties.click();
        btnCreateNewProperty.click();
        String URL = getDriver().getCurrentUrl();
        Assert.assertEquals(URL,"https://uat.owner.everystay.com/properties/new");

        //waitForLoad(getDriver());
        waitABit(10000);

    }
}
