package com.CRM24.pages.base_navigation_page;

import com.CRM24.util.BrowserUtils;
import com.CRM24.util.UiUtil;
import com.CRM24.util.XpathUtil;

public class Header extends BasePage {

    public void clickClock(String status){
        UiUtil.clickElement(XpathUtil.GEN_CLOCK_STAT_BTN_FORMAT,status);
    }
    public void enterTaskOrEvent(String input, String type){
        BrowserUtils.wait(3);
        UiUtil.sendTextToElement(UiUtil.get_webElement(XpathUtil.GEN_CLOCK_DAILY_INPUT_FORMAT,type),input);
    }

    public void submitTaskOrEvent(String type){
        BrowserUtils.wait(3);
        UiUtil.clickElement(XpathUtil.GEN_CLOCK_SUBMIT_BTN_FORMAT,type);
    }

    public void enterEventStartEndTime(String start, String end){
        BrowserUtils.wait(3);
        UiUtil.clickElement(XpathUtil.CLOCK_EVENT_START_TIME);
        BrowserUtils.wait(3);
        enterTimePopupClock(start);
        BrowserUtils.wait(3);
        enterTimePopupClock(end);
    }

    public void enterTimePopupClock(String time){
        String[] timeArr = time.split(":");
        BrowserUtils.wait(3);
        UiUtil.sendTextToElement(UiUtil.get_webElement(XpathUtil.CLOCK_POPUP_HR_MIN_FORMAT,"Hours"),timeArr[0]);
        BrowserUtils.wait(3);
        UiUtil.sendTextToElement(UiUtil.get_webElement(XpathUtil.CLOCK_POPUP_HR_MIN_FORMAT,"Minutes"),
                timeArr[1].split(" ")[0]);
        BrowserUtils.wait(3);
        if (!UiUtil.getTextFromElement(XpathUtil.CLOCK_POPUP_AM_PM).equals(timeArr[1].split(" ")[1])){
            UiUtil.clickElement(XpathUtil.CLOCK_POPUP_AM_PM);
        }
        BrowserUtils.wait(3);
        UiUtil.clickElement(XpathUtil.CLOCK_POPUP_SELECT_BTN);
    }
}
