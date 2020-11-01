package com.CRM24.step_definitions.activity_stream;

import com.CRM24.pages.activity_stream_page.TaskTab;
import com.CRM24.util.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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
        task.selectDateAndTime(deadline);
    }

    @Then("user clicks more option button")
    public void userClicksMoreOptionButton() {
        task.clickMoreOptions();
    }

    @And("user selects checkbox {string}")
    public void userSelectsCheckbox(String arg0) {
        task.selectCheckBox(arg0);
    }

    @And("user enters task planned time {string}hrs {string}mins")
    public void userEntersTaskPlannedTimeHrsMins(String hr, String min) {
        task.enterTaskHourAndMinute(hr,min);
    }

    @Then("user adds calendar reminder for {string}")
    public void userAddsCalendarReminderFor(String date) {
        task.addReminder(date);
    }

    @Then("user selects reminder assignee {string}")
    public void userSelectsReminderAssignee(String assignee) {
        task.selectAssignee(assignee);
    }

    @Then("user selects reminder type {string} message")
    public void userSelectsReminderTypeMessage(String type) {
        task.selectReminderType(type);
    }


    @Then("user submits task and verifies confirmation message {string}")
    public void userSubmitsTaskAndVerifiesConfirmationMessage(String msg) {
        Assert.assertEquals(task.submitTaskAndConfirm(),msg);

    }

    @Then("user selects task type {string} and attaches task {string}")
    public void userSelectsTaskTypeAndAttachesTask(String type, String task) {
        this.task.selectTaskTypeAndTask(type,task);

    }
}
