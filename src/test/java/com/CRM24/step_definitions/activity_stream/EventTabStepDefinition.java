package com.CRM24.step_definitions.activity_stream;

import com.CRM24.pages.activity_stream_page.EventTab;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class EventTabStepDefinition {

    EventTab event = new EventTab();

    @And("user writes event title {string} event content {string}")
    public void userWritesEventTitleEventContent(String title, String content) {
        event.enterTitle(title);
        event.enterContent(content);
    }

    @Then("user enters event {string} date {string}")
    public void userEntersEventDate(String toFrom, String date) {
        event.selectDate(toFrom,date);
    }

    @Then("user enters event {string} time {string}")
    public void userEntersEventTime(String toFrom, String time) {
        event.selectTime(toFrom,time);
    }

    @Then("user selects from dropdown {string} option {string}")
    public void userSelectsFromDropdownOption(String category, String option) {
        event.selectFromDropDown(category,option);
    }

    @And("user clicks addMore option")
    public void userClicksAddMoreOption() {
        event.clickAddMore();
    }
}
