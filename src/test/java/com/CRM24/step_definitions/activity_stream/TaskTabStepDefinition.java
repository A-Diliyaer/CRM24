package com.CRM24.step_definitions.activity_stream;

import com.CRM24.pages.activity_stream.TaskTab;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaskTabStepDefinition {

    TaskTab task = new TaskTab();

    @When("user writes task title {string} and task content {string}")
    public void userWritesTaskAndTaskContent(String title, String content) {
        task.setTaskTitle(title);
        task.setTaskContent(content);
    }

    @And("user sets task to high priority")
    public void userSetsTaskToHighPriority() {
        task.setTaskPriority();
    }


    @Then("user assigns role {string} to employee {string}")
    public void userAssignsTo(String role, String employee) {
        task.assignEmployeeToRole(role,employee);
    }

    @Then("user sets deadline to {string}")
    public void userSetsDeadlineTo(String deadline) {
        task.clickDeadlineBox();
        task.setDeadLine(deadline);
    }

    @Then("user clicks more option button")
    public void userClicksMoreOptionButton() {
        task.clickMoreOptions();
    }

    @Then("user clicks add {string}")
    public void userClicksAdd(String arg0) {

    }

    @And("user selects checkbox {string}")
    public void userSelectsCheckbox(String arg0) {

    }

    @And("user enters task planned time {string}hrs {string}mins")
    public void userEntersTaskPlannedTimeHrsMins(String hr, String min) {

    }

    @Then("user adds calendar reminder for {string}")
    public void userAddsCalendarReminderFor(String date) {

    }

    @Then("user selects reminder assignee {string}")
    public void userSelectsReminderAssignee(String assignee) {

    }

    @Then("user selects reminder type {string} message")
    public void userSelectsReminderTypeMessage(String type) {

    }

    @Then("user adds previous task {string}")
    public void userAddsPreviousTask(String task) {

    }

    @Then("user adds {string} with task number {string}")
    public void userAddsWithTaskNumber(String type, String taskNum) {

    }
}
