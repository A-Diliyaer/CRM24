package com.CRM24.pages.activity_stream_page;

import com.CRM24.util.UiUtil;
import com.CRM24.util.XpathUtil;

import java.util.Arrays;

public class MessageTab extends ActivityStreamPage {

    public void writeMsg(String msg){
        UiUtil.driverSwitchFrame(XpathUtil.MSG_TAB_CONTENT_FRAME);
        UiUtil.sendTextToElement(XpathUtil.CONTENT_BOX,msg);
        UiUtil.driverSwitchDefault();
    }

    public void clickPostBtn(String btn) {
        if (btn.equalsIgnoreCase("Record Video")) {
            UiUtil.clickElement(XpathUtil.MSG_tAB_RECORD_VIDEO_BTN, btn);
        } else {
            UiUtil.clickElement(XpathUtil.GEN_MSG_TAB_POST_BTN_FORMAT, btn);
        }
    }

    public void uploadLocalFile(String address){
        UiUtil.sendTextToElement(UiUtil.get_webElement(XpathUtil.MSG_TAB_UPLOAD_LOCAL_FILE),address);
    }

    public boolean attachedFileDisplayed(String file){
        return UiUtil.elementDisplayed(XpathUtil.MSG_TAB_ATTACHED_FILE,file);
    }

    public void sendMsg(){
        UiUtil.clickElement(XpathUtil.GEN_ALL_TAB_SEND_BTN);
    }

    public void clickDestinationBox(){
        UiUtil.clickElement(XpathUtil.GEN_ADD_CONTACT);
    }

    public void clickDestinationSubTab(String tab){
        UiUtil.clickElement(XpathUtil.GEN_DESTINATION_POPUP_FORMAT,tab);
    }

    public void selectEmployee(String employee){
        UiUtil.clickElement(XpathUtil.GEN_DESTINATION_POPUP_FORMAT,employee);
    }

    public boolean selectedEmployeelisted(String employee){
        return UiUtil.getTextFromElement(XpathUtil.GEN_DESTINATION_ITEM).contains(employee);
    }

    public void deselectAllEmployee(){
        UiUtil.clickElement(XpathUtil.GEN_DESTINATION_POPUP_FORMAT,"All employees");
    }

    public void closePopup(){
        UiUtil.clickElement(XpathUtil.POPUP_WINDOW_CLOSE);
    }

    public void inputField(String input, String field){
        UiUtil.sendTextToElement(XpathUtil.GEN_ADMIN_DIALOG_INPUT_FORMAT,field,input);
    }

    public void clickLinkBtn(String action){
        UiUtil.clickElement(XpathUtil.GEN_ADMIN_DIALOG_SAVE_CANCEL_FORMAT,action);
    }

    public boolean insertVideoDisplayed(){
        return UiUtil.get_webElement(XpathUtil.ADMIN_DIAOLOG_VIDEO_FRAME).isDisplayed();
    }

    public void enterQuote(String quote){
        UiUtil.driverSwitchFrame(XpathUtil.MSG_TAB_CONTENT_FRAME);
        UiUtil.sendTextToElement(XpathUtil.MSG_TAB_QUOTE_BLOCK,quote);
        UiUtil.driverSwitchDefault();
    }

    public void addTag(String tag){
        UiUtil.sendTextToElement(XpathUtil.MSG_TAB_TAG_INPUT_BOX,tag);
        UiUtil.clickElement(XpathUtil.MSG_TAB_TAG_ADD_BTN);
    }

    public void clickVideoMsgAllowBtn(){
        UiUtil.clickElement(XpathUtil.GEN_MSG_TAB_VIDEOMSG_POPUP_BTN,"Allow");
    }

    public void clickVideoMsgCloseBtn(){
        UiUtil.clickElement(XpathUtil.GEN_MSG_TAB_VIDEOMSG_POPUP_BTN,"Close");
    }

    public boolean popUpErrorMsgDisplayed(){
        return UiUtil.elementDisplayed(XpathUtil.MSG_TAB_VIDEO_ERROR_MSG);
    }

    public void selectTextFormat(String format){
        Arrays.stream(format.split(",")).map(String::trim).forEach(each->UiUtil.clickElement(
                XpathUtil.GEN_MSG_TAB_EDITOR_TOOLS_FORMAT,each));
    }

    public void writeTitle(String title){
        UiUtil.sendTextToElement(XpathUtil.MSG_TAB_CONTENT_TITLE,title);
    }

}
