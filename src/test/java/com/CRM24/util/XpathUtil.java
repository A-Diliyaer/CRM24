package com.CRM24.util;

public class XpathUtil {
    /**
     * Base Navigation: Menu, Header, Messenger xpath format
     */
    public static final String GEN_MENU_ITEM_FORMAT = "//a[@title='%s']";
    public static final String GEN_MENU_ITEM_EDITICON_FORMAT = "//a[@title='%s']/preceding-sibling::span[contains(@class,'editable')]";
    public static final String GEN_HEADER_ITEM_FORMAT = "//div[@id='header-inner']//div[contains(@class,'%s')]";
    public static final String GEN_MSG_BAR_FORMAT = "//div[@id='bx-im-bar']//div[contains(@id,'%s')]";
    public static final String GEN_SITEMAP_FORMAT = "//a[@class='sitemap-section-%s'][.='%s']";
    public static final String HOMEPAGE = "//li[contains(@class,'active')]";
    public static final String GEN_MENU_EDITOPTION_FORMAT = "//div[contains(@style,'absolute; display: block')]//span[.='%s']";
    public static final String GEN_CLOCK_STAT_BTN_FORMAT = "//span[.='%s']";
    public static final String GEN_CLOCK_SUBMIT_BTN_FORMAT = "//span[contains(@class,'%s')]";
    public static final String GEN_CLOCK_DAILY_INPUT_FORMAT = "//input[contains(@class,'tm-popup-%s-form')]";
    public static final String CLOCK_EVENT_START_TIME = "//input[contains(@class,'tm-popup-event-start')]";
    public static final String CLOCK_EVENT_END_TIME = "//input[contains(@class,'tm-popup-event-end')]";
    public static final String CLOCK_POPUP_HR_MIN_FORMAT = "//input[@title='%s']";
    public static final String CLOCK_POPUP_AM_PM = "//span[@class='bxc-am-pm']";
    public static final String CLOCK_POPUP_SELECT_BTN = "//div[@id='clock_selector_popup']//span[.='Select']";
    /**
     * Activity Stream Message tab xpath format
     */
    public static final String GEN_ACTIVITY_STREAM_TAB_FORMAT = "//div[@id='feed-add-post-form-tab']/span[.='%s']";
    public static final String GEN_MSG_TAB_POST_BTN_FORMAT = "//div[contains(@class,'form-wrap')]//span[contains(@title,'%s')]";
    public static final String MSG_tAB_RECORD_VIDEO_BTN = "//div[contains(@class,'form-wrap')]//span[.='Record Video']";
    public static final String MSG_TAB_UPLOAD_LOCAL_FILE = "//input[@name='bxu_files[]']";
    public static final String MSG_TAB_ATTACHED_FILE = "//span[@title='Click to insert file']";
    public static final String MSG_TAB_SEND_BTN = "//button[@id='blog-submit-button-save']";
    public static final String MSG_TAB_CONTENT_FRAME = "//iframe[@class='bx-editor-iframe']";
    public static final String MSG_TAB_CONTENT_BOX = "//body";
    public static final String MSG_TAB_ADD_DESTINATION = "//a[.='Add more']";
    public static final String GEN_MSG_DESTINATION_POPUP_FORMAT = "//div[@id='BXSocNetLogDestination']//a[contains(.,'%s')]";
    public static final String MSG_DESTINATION_ITEM = "//span[@id='feed-add-post-destination-item']";
    public static final String MSG_DESTINATION_POPUP_CLOSE = "//span[@class='popup-window-close-icon']";
    public static final String GEN_ADMIN_DIALOG_INPUT_FORMAT = "//input[contains(@placeholder,'%s')]";
    public static final String GEN_ADMIN_DIALOG_SAVE_CANCEL_FORMAT = "//div[contains(@style,'display: block')]//input[@value='%s']";
    public static final String ADMIN_DIAOLOG_VIDEO_FRAME = "//div[@class='bx-core-adm-dialog-content']//iframe";
    public static final String MSG_TAB_QUOTE_BLOCK = "//blockquote";
    public static final String MSG_TAB_TAG_INPUT_BOX = "//div[@id='bx-post-tag-popup']//input";
    public static final String MSG_TAB_TAG_ADD_BTN = "//div[@id='bx-post-tag-popup']//span";
    public static final String GEN_MSG_TAB_VIDEOMSG_POPUP_BTN = "//div[@id='bx-popup-videomessage-popup']//span[.='%s']";
    public static final String MSG_TAB_VIDEO_ERROR_MSG = "//div[@id='bx-popup-videomessage-popup']//div[.='Cannot access your camera and microphone.']";
    public static final String MSG_TAB_VISUAL_EDITOR = "//span[@class='bxhtmled-top-bar-wrap']";
    public static final String GEN_MSG_TAB_EDITOR_TOOLS_FORMAT = "//span[@class='bxhtmled-top-bar-wrap']/span[@title='%s']";
    public static final String MSG_TAB_CONTENT_TITLE = "//input[@id='POST_TITLE']";
    /**
     * Activity Stream Task tab xpath format
     */

    /**
     * Activity Stream Feed log
     */
    public static final String ACTIVITY_NEW_FEED = "//div[@class='feed-item-wrap'][1]";
    public static final String NEW_FEED_ATTACHED_FILE = "//a[.='%s']";
    public static final String NEW_FEED_ATTACHED_IMG = "//*[@data-bx-title='%s']";
    public static final String ACTIVITY_NEW_FEED_TO = "//div[@class='feed-item-wrap'][1]//span[@class='feed-add-post-destination-cont']";
    public static final String NEW_FEED_ATTACHED_LINK = "//div[@class='feed-item-wrap'][1]//a[@href='https://%s']";
    public static final String NEW_FEED_ATTACHED_VIDEO_FRAME = "//div[@class='feed-item-wrap'][1]//iframe";
    public static final String NEW_FEED_ATTACHED_QUOTE = "//div[@class='feed-item-wrap'][1]//div[@title='Quote']";
    public static final String NEW_FEED_ATTACHED_MENTION = "//div[@class='feed-item-wrap'][1]//span/a[.='%s']";
    public static final String NEW_FEED_ATTACHED_TAG = "//div[@class='feed-item-wrap'][1]//a[@bx-tag-value='%s']";
    public static final String NEW_FEED_MSG_TITLE = "//div[@class='feed-item-wrap'][1]//a[@class='feed-post-title']";




}