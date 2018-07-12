package nfq.everystay.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.DataTable;

import java.util.ArrayList;
import java.util.List;

import nfq.everystay.Models.PropertyList;
import nfq.everystay.steps.serenity.OwnerSteps;

public class OwnerLoginDefinitionSteps {
    @Steps
    OwnerSteps owner ;

    @Given("^owner is on home page$")
    public void owner_is_on_home_page() throws Exception {
        owner.open_home_page();

    }

    @When("^owner input email as \"([^\"]*)\"$")
    public void owner_input_email_as(String email) throws Exception {
        owner.input_email(email);

    }


    @When("^owner input password as \"([^\"]*)\"$")
    public void owner_input_password_as(String password) throws Exception {
        owner.input_password(password);
    }

    @When("^owner click button 'Login'$")
    public void owner_click_button_Login() throws Exception {
        owner.click_button_Login();

    }




    @Then("^owner will be redirected to home page$")
    public void owner_will_be_redirected_to_home_page() throws Exception {
        owner.check_is_on_homepage();
    }

    @Given("^owner is on 'Name and Location' page$")
    public void owner_is_on_Name_and_Location_page() throws Exception {
        owner.open_name_and_location_page();
    }

    List<PropertyList> propList = new ArrayList<PropertyList>() ;

    @When("^owner input all valid data like$")
    public void owner_input_all_valid_data_like(DataTable tbNameAndLocation) throws Exception {
        propList = tbNameAndLocation.asList(PropertyList.class);
        for (PropertyList propertyList : propList)
        {
            owner.input_value(propertyList.getFields(),propertyList.getValues());
        }

    }

    @When("^owner click button 'Save and Continue'$")
    public void owner_click_button_Save_and_Continue() throws Exception {
        owner.click_button_Save_and_Continue();
    }

    @Then("^owner will be navigated to 'Property type and amenities' page$")
    public void owner_will_be_navigated_to_Property_type_and_amenities_page() throws Exception {
        owner.check_is_on_property_type_and_amenities();

    }

}