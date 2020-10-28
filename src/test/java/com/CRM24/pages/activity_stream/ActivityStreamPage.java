package com.CRM24.pages.activity_stream;

import com.CRM24.pages.base_navigation_page.AbstractPageBase;
import com.CRM24.util.UiUtil;
import com.CRM24.util.XpathUtil;

public class ActivityStreamPage extends AbstractPageBase {

    public void clickTab(String tab) {
        UiUtil.clickElement(XpathUtil.GEN_ACTIVITY_STREAM_TAB_FORMAT, tab);
    }

    public boolean checkAttachedFileInNewFeed(String file){
        if (file.contains("txt")) {
            return UiUtil.elementDisplayed(UiUtil.add(XpathUtil.ACTIVITY_NEW_FEED,XpathUtil.NEW_FEED_ATTACHED_FILE),file);
        }else if (file.contains("PNG")){
            return UiUtil.elementDisplayed(UiUtil.add(XpathUtil.ACTIVITY_NEW_FEED,XpathUtil.NEW_FEED_ATTACHED_IMG),file);
        }
        return false;
    }

    public String getNewFeedDestination(){
        UiUtil.getTextFromElement(XpathUtil.ACTIVITY_NEW_FEED_TO);
        return UiUtil.getTextFromElement(XpathUtil.ACTIVITY_NEW_FEED_TO);
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

    public boolean mentionDisplayed(String mention){
        return UiUtil.get_webElement(XpathUtil.NEW_FEED_ATTACHED_MENTION,mention).isDisplayed();
    }

    public String getQuoteText(){
        UiUtil.getTextFromElement(XpathUtil.NEW_FEED_ATTACHED_QUOTE);
        return UiUtil.getTextFromElement(XpathUtil.NEW_FEED_ATTACHED_QUOTE);
    }

    public String getNewFeedMsgTitle(){
        return UiUtil.getTextFromElement(UiUtil.getStaleElement(XpathUtil.NEW_FEED_MSG_TITLE));
    }
}
