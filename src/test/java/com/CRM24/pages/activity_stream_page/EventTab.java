package com.CRM24.pages.activity_stream_page;

import com.CRM24.util.BrowserUtils;
import com.CRM24.util.UiUtil;
import com.CRM24.util.XpathUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EventTab extends ActivityStreamPage{


    public void enterTitle(String title){
        UiUtil.sendTextToElement(XpathUtil.EVENT_TITLE_BLOCK,title);
    }

    public void enterContent(String content){
        UiUtil.driverSwitchFrame(XpathUtil.EVENT_CONTENT_BLOCK);
        UiUtil.sendTextToElement(XpathUtil.CONTENT_BOX,content);
        UiUtil.driverSwitchDefault();
    }

    public void selectDate(String toFrom, String date){
        if (toFrom.equals("start")) toFrom = "DATE_FROM";
        if (toFrom.equals("end")) toFrom = "DATE_TO";
        UiUtil.clickElement(XpathUtil.GEN_EVENT_START_END_FORMAT,toFrom);
        calendarPopup(date);

    }

    public void selectTime(String toFrom, String time){
        if (toFrom.equals("start")) toFrom = "TIME_FROM";
        if (toFrom.equals("end")) toFrom = "TIME_TO";

        UiUtil.clickElement(XpathUtil.GEN_EVENT_START_END_FORMAT,toFrom);
        BrowserUtils.wait(1);
        clockPopup(toFrom,time);
        BrowserUtils.wait(1);
    }

    public void clockPopup(String toFrom,String time){
        String hr = time.split(":")[0];
        String min = time.split(":")[1].split(" ")[0];
        String ampm = time.split(":")[1].split(" ")[1];

        if (toFrom.equals("TIME_FROM")) toFrom="from";
        if (toFrom.equals("TIME_TO")) toFrom="to";
        UiUtil.sendTextToElement(XpathUtil.EVENT_CLOCK_HOUR_MINUTE_FORMAT,toFrom,"Hours",hr);
        BrowserUtils.wait(1);
        UiUtil.sendTextToElement(XpathUtil.EVENT_CLOCK_HOUR_MINUTE_FORMAT,toFrom,"Minutes",min);
        BrowserUtils.wait(1);

        if (!UiUtil.getTextFromElement(XpathUtil.EVENT_CLOCK_AMPM_FORMAT,toFrom).equals(ampm)){
            UiUtil.clickElement(XpathUtil.EVENT_CLOCK_AMPM_FORMAT,toFrom);
            BrowserUtils.wait(1);
        }
        UiUtil.clickElement(XpathUtil.EVENT_CLOCK_SET_TIME_FORMAT,toFrom);
        BrowserUtils.wait(1);
    }

    public void calendarPopup(String date){
        String[] dateArr = date.split(" ");
        if (!UiUtil.getTextFromElement(XpathUtil.CALENDAR_POPUP_HEADER_YEAR).equals(dateArr[2])){
            BrowserUtils.wait(1);
            UiUtil.clickElement(XpathUtil.CALENDAR_POPUP_HEADER_YEAR);
            BrowserUtils.wait(1);
            UiUtil.clickElement(XpathUtil.CALENDAR_POPUP_YEAR_CONTENT,dateArr[2]);
            BrowserUtils.wait(1);
        }
        if (!UiUtil.getTextFromElement(XpathUtil.CALENDAR_POPUP_HEADER_MONTH).equals(dateArr[0])){
            UiUtil.clickElement(XpathUtil.CALENDAR_POPUP_HEADER_MONTH);
            BrowserUtils.wait(1);
            UiUtil.clickElement(XpathUtil.CALENDAR_POPUP_MONTH_CONTENT,dateArr[0]);
            BrowserUtils.wait(1);
        }
        UiUtil.clickElement(XpathUtil.CALENDAR_POPUP_DAY_CONTENT,dateArr[1]);
        BrowserUtils.wait(1);
    }

    public void clickAddMore(){
        UiUtil.clickElement(XpathUtil.EVENT_ADDITIONAL_MORE_BTN);
        BrowserUtils.wait(1);
    }

    public void selectFromDropDown(String category, String option) {
            BrowserUtils.scrollTo(UiUtil.get_webElement(XpathUtil.GEN_EVENT_SELECT_DROPDOWN_FORMAT, category));
        BrowserUtils.wait(1);
            Select select = new Select(UiUtil.get_webElement(
                    XpathUtil.GEN_EVENT_SELECT_DROPDOWN_FORMAT, category));
            UiUtil.clickElement(XpathUtil.GEN_EVENT_SELECT_DROPDOWN_FORMAT, category);
        BrowserUtils.wait(1);
            select.selectByVisibleText(option);
    }

}
