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
        task.setDeadLine(deadline);
    }
}
