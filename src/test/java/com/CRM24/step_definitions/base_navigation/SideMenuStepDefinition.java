package com.CRM24.step_definitions.base_navigation;

import com.CRM24.pages.base_navigation_page.SideMenu;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SideMenuStepDefinition{

    SideMenu menu = new SideMenu();



    @When("^user hovers over (.*) and clicks on edit icon$")
    public void userHoversOverItemAndClicksOnEditIcon(String item) {
        menu.hover_item_edit(item);
        menu.click_menu_edit(item);
    }

    @And("^user clicks edit option (.*)$")
    public void userClicksEditOption(String option) {
        menu.click_edit_option(option);
    }

    @Then("^(.*) page should load$")
    public void newHomePageShouldLoad(String home) {
        Assert.assertEquals(home,menu.get_homepage());
    }

    @And("user clicks menu {string}")
    public void userClicksMenu(String item) {

    }


}
