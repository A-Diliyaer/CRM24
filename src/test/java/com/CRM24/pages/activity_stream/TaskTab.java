package com.CRM24.pages.activity_stream;

import com.CRM24.util.UiUtil;
import com.CRM24.util.XpathUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
        String index = "1";
        if (!role.equals("Responsible person")) {
            createRoleOptions(role);
            index="2";
        }
        UiUtil.clickElement(XpathUtil.GEN_TASK_TAB_ROLE_FORMAT,role,index);
        UiUtil.clickElement(XpathUtil.GEN_DESTINATION_POPUP_FORMAT,employee);
        UiUtil.clickElement(XpathUtil.POPUP_WINDOW_CLOSE);
        if (UiUtil.elementDisplayed(XpathUtil.TASK_MULTI_ROLE_POPUP_MSG)) {
            UiUtil.clickElement(XpathUtil.TASK_MULTI_ROLE_POPUP_CLOSE);
        }
    }

    public void createRoleOptions(String role){
        UiUtil.clickElement(XpathUtil.GEN_TASK_CREATE_ROLE_FORMAT,role);
    }

    public void cancelRoleSelection(String role){
        UiUtil.clickElement(XpathUtil.TASK_TAB_ROLE_CANCEL_SELECTION,role);
    }

    public void setDeadLine(String deadline){
        UiUtil.clickElement(XpathUtil.TASK_DEADLINE_INPUT_BOX);
        String[] date = deadline.split("-")[0].split(" ");
        String[] time = deadline.split("-")[1].split(" ");
        if (!UiUtil.getTextFromElement(XpathUtil.CALENDAR_POPUP_HEADER_YEAR).equals(date[0])){
            UiUtil.clickElement(XpathUtil.CALENDAR_POPUP_HEADER_YEAR);
            UiUtil.clickElement(XpathUtil.CALENDAR_POPUP_YEAR_CONTENT,date[2]);
        }
        if (!UiUtil.getTextFromElement(XpathUtil.CALENDAR_POPUP_HEADER_MONTH).equals(date[0])){
            UiUtil.clickElement(XpathUtil.CALENDAR_POPUP_HEADER_MONTH);
            UiUtil.clickElement(XpathUtil.CALENDAR_POPUP_MONTH_CONTENT,date[0]);
        }
        UiUtil.clickElement(XpathUtil.CALENDAR_POPUP_DAY_CONTENT,date[1]);
        UiUtil.sendTextToElement(XpathUtil.CALENDAR_POPUP_TIME_HR_INPUT,time[0]);
        UiUtil.sendTextToElement(XpathUtil.CALENDAR_POPUP_TIME_MIN_INPUT,time[1]);
        if (!UiUtil.getTextFromElement(XpathUtil.CALENDAR_POPUP_AMPM).equals(time[2])){
            UiUtil.clickElement(XpathUtil.CALENDAR_POPUP_AMPM);
        }
        UiUtil.clickElement(XpathUtil.CALENDAR_POPUP_TIME_SELECT_BTN);
    }

}
