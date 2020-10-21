package com.CRM24.pages.activity_stream;

import com.CRM24.pages.base_navigation_page.AbstractPageBase;
import com.CRM24.util.UiUtil;
import com.CRM24.util.XpathUtil;

public class ActivityStreamPage extends AbstractPageBase {

    public void clickTab(String tab) {
        UiUtil.clickElement(XpathUtil.GEN_ACTIVITY_STREAM_TAB_FORMAT, tab);
    }

    public void writeMsg(String msg){
        UiUtil.driverSwitchFrame(XpathUtil.MSG_TAB_CONTENT_FRAME);
        UiUtil.sendTextToElement(XpathUtil.MSG_TAB_CONTENT_BOX,msg);
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
        UiUtil.clickElement(XpathUtil.MSG_TAB_SEND_BTN);
    }

    public boolean checkAttachedFileInNewFeed(String file){
        if (file.contains("txt")) {
            return UiUtil.elementDisplayed(UiUtil.add(XpathUtil.ACTIVITY_NEW_FEED,XpathUtil.NEW_FEED_ATTACHED_FILE),file);
        }else if (file.contains("PNG")){
            return UiUtil.elementDisplayed(UiUtil.add(XpathUtil.ACTIVITY_NEW_FEED,XpathUtil.NEW_FEED_ATTACHED_IMG),file);
        }
        return false;
    }

    public void clickDestinationBox(){
        UiUtil.clickElement(XpathUtil.MSG_TAB_ADD_DESTINATION);
    }

    public void clickDestinationSubTab(String tab){
        UiUtil.clickElement(XpathUtil.GEN_MSG_DESTINATION_POPUP_FORMAT,tab);
    }

    public void selectEmployee(String employee){
        UiUtil.clickElement(XpathUtil.GEN_MSG_DESTINATION_POPUP_FORMAT,employee);
    }

    public boolean selectedEmployeelisted(String employee){
        return UiUtil.getTextFromElement(XpathUtil.MSG_DESTINATION_ITEM).contains(employee);
    }

    public void deselectAllEmployee(){
        UiUtil.clickElement(XpathUtil.GEN_MSG_DESTINATION_POPUP_FORMAT,"All employees");
    }

    public String getNewFeedDestination(){
        UiUtil.getTextFromElement(XpathUtil.ACTIVITY_NEW_FEED_TO);
        return UiUtil.getTextFromElement(XpathUtil.ACTIVITY_NEW_FEED_TO);
    }

    public void closePopup(){
        UiUtil.clickElement(XpathUtil.MSG_DESTINATION_POPUP_CLOSE);
    }

    public void inputField(String input, String field){
        UiUtil.sendTextToElement(XpathUtil.GEN_ADMIN_DIALOG_INPUT_FORMAT,field,input);
    }

    public void clickLinkBtn(String action){
        UiUtil.clickElement(XpathUtil.GEN_ADMIN_DIALOG_SAVE_CANCEL_FORMAT,action);
    }

    public void clickLinkInFeed(String url){
        UiUtil.getParentWindow();
        UiUtil.clickElement(XpathUtil.NEW_FEED_ATTACHED_LINK,url);
    }

    public boolean verifyLink(String url){
        UiUtil.switchToChildWindow();
        return UiUtil.getCurrentUrl().contains(url);
    }

    public String getVideoTitle(){
        UiUtil.driverSwitchFrame(XpathUtil.NEW_FEED_ATTACHED_VIDEO_FRAME);
        return UiUtil.getTitle();
    }

    public boolean insertVideoDisplayed(){
        return UiUtil.get_webElement(XpathUtil.ADMIN_DIAOLOG_VIDEO_FRAME).isDisplayed();
    }

    public void enterQuote(String quote){
        UiUtil.driverSwitchFrame(XpathUtil.MSG_TAB_CONTENT_FRAME);
        UiUtil.sendTextToElement(XpathUtil.MSG_TAB_QUOTE_BLOCK,quote);
        UiUtil.driverSwitchDefault();
    }

    public String getQuoteText(){
        UiUtil.getTextFromElement(XpathUtil.NEW_FEED_ATTACHED_QUOTE);
        return UiUtil.getTextFromElement(XpathUtil.NEW_FEED_ATTACHED_QUOTE);
    }

    public boolean mentionDisplayed(String mention){
        return UiUtil.get_webElement(XpathUtil.NEW_FEED_ATTACHED_MENTION,mention).isDisplayed();
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
}
