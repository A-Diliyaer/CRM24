package com.CRM24.step_definitions.login;

import com.CRM24.pages.login_page.LoginPage;
import com.CRM24.util.ConfigurationReader;
import com.CRM24.util.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition {

    LoginPage login = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        String URL = ConfigurationReader.getProperty("URL");
        Driver.getDriver().get(URL);
    }

    /**
     * (helpdesk|marketing|hr)->limits argument to only those three
     * (.*) -> pass anything
     * a?n? -> for better feature write up -> a hr / an admin
     * @param role
     */
    @When("^user logs in as (.*)$")
    public void user_logs_in_as_role(String role) {
        login.login(role);
    }

    @When("^user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) {
        login.login(username,password);
    }

    @Then("user should verify title is Portal")
    public void user_should_verify_title_is_Portal() {
       Assert.assertTrue(login.get_title().contains("Portal"));
    }

    @Then("^user name should be (.*)$")
    public void user_name_should_be(String name) {
        Assert.assertEquals(name,login.get_current_user());
    }

    @Then("user should verify errorMsg")
    public void userShouldVerifyErrorMsg() {
        Assert.assertEquals("Incorrect login or password", login.get_error_msg());
    }
}
