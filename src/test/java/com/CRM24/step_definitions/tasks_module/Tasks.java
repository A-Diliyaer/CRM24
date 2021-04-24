package com.CRM24.step_definitions.tasks_module;

import com.CRM24.pages.tasks_page.TasksPage;
import com.CRM24.util.GlobalDataUtil;
import io.cucumber.java.en.Given;

public class Tasks {

    TasksPage task = new TasksPage();
    GlobalDataUtil globalData = new GlobalDataUtil();

    @Given("user creates quick task without options")
    public void userCreatesQuickTaskWithoutOptions() {
        task.setTaskName();
        task.saveTask();
    }
}
