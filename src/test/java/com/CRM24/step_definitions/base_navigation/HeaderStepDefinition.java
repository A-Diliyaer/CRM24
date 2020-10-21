package com.CRM24.step_definitions.base_navigation;

import com.CRM24.pages.base_navigation_page.Header;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HeaderStepDefinition {

    Header header = new Header();


    @When("user clicks header {string}")
    public void userClicksHeader(String item) {
        header.click_header(item);
    }

    @And("user clicks {string} button on clock popup")
    public void userClicksButtonOnClockPopup(String status) {
        header.clickClock(status);
    }

    @And("user inputs {string} under {string} and submits")
    public void userInputsUnderAndSubmits(String input, String type) {
        header.enterTaskOrEvent(input,type);
    }

    @Then("user inputs start {string} and end {string} for event")
    public void userInputsStartAndEndForEvent(String start, String end) {
        header.enterEventStartEndTime(start,end);
    }
}
