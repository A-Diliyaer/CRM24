package com.CRM24.pages.activity_stream_page;

import com.CRM24.util.BrowserUtils;
import com.CRM24.util.UiUtil;
import com.CRM24.util.XpathUtil;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class TaskTab extends ActivityStreamPage {

    public void setTaskTitle(String title){
        UiUtil.sendTextToElement(XpathUtil.TASK_TAB_TITLE_BLOCK,title);
    }

    public void setTaskContent(String content){
        UiUtil.driverSwitchFrame(XpathUtil.TASK_TAB_CONTENT_FRAME);
        UiUtil.sendTextToElement(XpathUtil.CONTENT_BOX,content);
        UiUtil.driverSwitchDefault();
    }

    public void setTaskPriority(){
        UiUtil.clickElement(XpathUtil.TASK_TAB_TITLE_PRIORITY);
    }

    public void assignEmployeeToRole(String role, String employee){
        String isNot = "";
        if (!role.equals("Responsible person")) {
            createRoleOptions(role);
            isNot="not";
        }
        UiUtil.clickElement(XpathUtil.GEN_TASK_TAB_ROLE_FORMAT,role,isNot);
        UiUtil.clickElement(XpathUtil.GEN_DESTINATION_POPUP_FORMAT,employee);
        UiUtil.clickElement(XpathUtil.POPUP_WINDOW_CLOSE);
    }

    public void createRoleOptions(String role){
        UiUtil.clickElement(XpathUtil.GEN_TASK_CREATE_ROLE_FORMAT,role);
    }

    public void cancelRoleSelection(String role){
        UiUtil.clickElement(XpathUtil.TASK_TAB_ROLE_CANCEL_SELECTION,role);
    }

    public void selectDateAndTime(String deadline){
        selectDate(deadline.split("-")[0]);
        selectTime(deadline.split("-")[1]);
    }

    public void selectDate(String date){
        if (!UiUtil.getTextFromElement(XpathUtil.CALENDAR_POPUP_HEADER_YEAR).equals(date.split(" ")[2])){
            UiUtil.clickElement(XpathUtil.CALENDAR_POPUP_HEADER_YEAR);
            BrowserUtils.wait(1);
            UiUtil.clickElement(XpathUtil.CALENDAR_POPUP_YEAR_CONTENT,date.split(" ")[2]);
        }
        if (!UiUtil.getTextFromElement(XpathUtil.CALENDAR_POPUP_HEADER_MONTH).equals(date.split(" ")[0])){
            UiUtil.clickElement(XpathUtil.CALENDAR_POPUP_HEADER_MONTH);
            BrowserUtils.wait(1);
            UiUtil.clickElement(XpathUtil.CALENDAR_POPUP_MONTH_CONTENT,date.split(" ")[0]);
        }
        UiUtil.clickElement(XpathUtil.CALENDAR_POPUP_DAY_CONTENT,date.split(" ")[1]);
    }

    public void selectTime(String time){
        UiUtil.sendTextToElement(XpathUtil.CALENDAR_POPUP_TIME_HR_INPUT,time.split(" ")[0]);
        UiUtil.sendTextToElement(XpathUtil.CALENDAR_POPUP_TIME_MIN_INPUT,time.split(" ")[1]);
        if (!UiUtil.getTextFromElement(XpathUtil.CALENDAR_POPUP_AMPM).equals(time.split(" ")[2])){
            UiUtil.clickElement(XpathUtil.CALENDAR_POPUP_AMPM);
        }
        UiUtil.clickElement(XpathUtil.CALENDAR_POPUP_TIME_SELECT_BTN);
    }

    public void clickDeadlineBox(){
        UiUtil.clickElement(XpathUtil.TASK_DEADLINE_INPUT_BOX);
    }

    public void clickMoreOptions(){
        UiUtil.clickElement(XpathUtil.TASK_TAB_ADDITIONAL_EDIT);
    }

    public void clickAdd(String module){
        UiUtil.clickElement(XpathUtil.GEN_ADDITIONAL_TASKS_ADD_FORMAT,module);
    }

    public void selectCheckBox(String name){
        UiUtil.clickElement(XpathUtil.GEN_TASK_TAB_CHECKBOX_FORMAT,name);
        wait.until(ExpectedConditions.visibilityOf(UiUtil.get_webElement(XpathUtil.TASK_REPETATION_AREA)));
    }

    public void enterTaskHourAndMinute(String hr, String min){
        UiUtil.sendTextToElement(XpathUtil.TASK_PLANNED_TIME_FORMAT,"hour",hr);
        UiUtil.sendTextToElement(XpathUtil.TASK_PLANNED_TIME_FORMAT,"minute",min);
    }

    public void addReminder(String date){
        UiUtil.clickElement(XpathUtil.TASK_REMINDER_BOX);
        UiUtil.clickElement(XpathUtil.TASK_REMINDER_CALENDAR_BOX);
        selectDateAndTime(date);
    }

    public void selectAssignee(String assignee){
        Select select = new Select(UiUtil.get_webElement(XpathUtil.TASK_REMINDER_ASSIGNEE));
        select.selectByVisibleText(assignee);
    }

    public void selectReminderType(String type){
        UiUtil.clickElement(XpathUtil.TASK_REMINDER_SEND_FORMAT,type);
        clickReminderAdd();
    }

    public void clickReminderAdd(){
        UiUtil.clickElement(XpathUtil.TASK_REMIDNER_ADD_BTN);
    }

    public void selectTaskTypeAndTask(String type, String task){
        BrowserUtils.scrollTo(UiUtil.get_webElement(XpathUtil.GEN_ADDITIONAL_TASKS_ADD_FORMAT,type));
        UiUtil.clickElement(XpathUtil.GEN_ADDITIONAL_TASKS_ADD_FORMAT,type);
        if (type.equals("Subtask of")) type="parent";
        if (type.equals("Dependent tasks")) type="son";
        if (type.equals("Gantt")) type="fb";
        UiUtil.clickElement(XpathUtil.GEN_ADDITIONAL_TASK_POPUP_LIST_FORMAT,task,type);
        UiUtil.clickElement(XpathUtil.TASK_ADDITIONAL_TASK_POPUP_BTN_FORMAT,type,"Select");
    }

    public String submitTaskAndConfirm(){
        UiUtil.clickElement(XpathUtil.TASK_SEND_BTN);
        return UiUtil.getTextFromElement(XpathUtil.TASK_SENT_CONFIRMATION_POPUP);
    }

    public void selectRepeatTerm(String term){
        UiUtil.clickElement(XpathUtil.GEN_TASK_REPEAT_TERMS_FORMAT,term);
    }

    public void enterTaskRepeatTextInput(String format, String num){
        UiUtil.sendTextToElement(UiUtil.add(XpathUtil.
                TASK_REPEAT_ACTIVE_TERM,XpathUtil.TASK_REPEAT_ACTIVE_TEXT_INPUT),format,num
        );
    }

    public void selectDropdownAndOption(String selectBox, String option){
        Select select = new Select(UiUtil.get_webElement(
                UiUtil.add(XpathUtil.TASK_REPEAT_ACTIVE_TERM,XpathUtil.TASK_REPEAT_ACTIVE_SELECT_FORMAT),selectBox
        ));
        select.selectByVisibleText(option);
    }

    public void clickReadOnlyInputBox(String type){
        UiUtil.clickElement(XpathUtil.TASK_REPEAT_READONLY_INPUT_FORMAT,type);
    }
}
