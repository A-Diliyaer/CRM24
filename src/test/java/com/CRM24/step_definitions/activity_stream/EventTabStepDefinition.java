package com.CRM24.step_definitions.activity_stream;

import com.CRM24.pages.activity_stream_page.EventTab;
import com.CRM24.util.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class EventTabStepDefinition {

    EventTab event = new EventTab();

    @And("user writes event title {string} event content {string}")
    public void userWritesEventTitleEventContent(String title, String content) {
        event.enterTitle(title);
        event.enterContent(content);
        BrowserUtils.wait(1);
    }

    @Then("user enters event {string} date {string}")
    public void userEntersEventDate(String toFrom, String date) {
        event.selectDate(toFrom,date);
        BrowserUtils.wait(1);
    }

    @Then("user enters event {string} time {string}")
    public void userEntersEventTime(String toFrom, String time) {
        event.selectTime(toFrom,time);
        BrowserUtils.wait(1);
    }

    @Then("user selects from dropdown {string} option {string}")
    public void userSelectsFromDropdownOption(String category, String option) {
        event.selectFromDropDown(category,option);
        BrowserUtils.wait(1);
    }

    @And("user clicks addMore option")
    public void userClicksAddMoreOption() {
        event.clickAddMore();
        BrowserUtils.wait(1);
    }
}
