package nfq.everystay.steps.serenity;


import nfq.everystay.pages.OwnerPage;
import nfq.everystay.pages.PropertyPage;


public class OwnerSteps  {

    //private static final long serialVersionUID = 1L ;
    OwnerPage ownerPage ;
    PropertyPage propPage ;
    public void open_home_page() {
        ownerPage.open();
    }


    public void input_email(String email) {
        ownerPage.input_email(email);

    }


    public void input_password(String password) {
        ownerPage.input_password(password);
    }



    public void click_button(String btnName) {
        ownerPage.clickOn(ownerPage.element(btnName));

    }

    public void check_is_on_homepage() {
        ownerPage.check_is_on_homepage();
    }

    public void click_button_Login() {
        ownerPage.click_button_Login();
    }

    public void open_name_and_location_page() {
        propPage.open();
        propPage.open_name_and_location_page();

    }

    public void input_value(String fields, String values) {
        propPage.input_value(fields,values);
    }

    public void click_button_Save_and_Continue() {
        propPage.click_button_Save_and_Continue();
    }

    public void check_is_on_property_type_and_amenities() {
        propPage.check_is_on_property_type_and_amenities() ;
    }
}
