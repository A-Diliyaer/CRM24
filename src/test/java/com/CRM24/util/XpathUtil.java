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
    public static final String CONTENT_BOX = "//body";
    public static final String GEN_ADD_CONTACT = "//a[.='Add more']";
    /**
     * Activity Stream Message tab xpath format
     */
    public static final String GEN_ACTIVITY_STREAM_TAB_FORMAT = "//div[@id='feed-add-post-form-tab']/span[.='%s']";
    public static final String GEN_MSG_TAB_POST_BTN_FORMAT = "//div[contains(@class,'form-wrap')]//span[contains(@title,'%s')]";
    public static final String MSG_tAB_RECORD_VIDEO_BTN = "//div[contains(@class,'form-wrap')]//span[.='Record Video']";
    public static final String MSG_TAB_UPLOAD_LOCAL_FILE = "//input[@name='bxu_files[]']";
    public static final String MSG_TAB_SELECT_FROM_DRIVE = "//div[@class='feed-add-post-form-wrap']//span[.='Select document from Bitrix24']";
    public static final String MSG_TAB_FILE_RECENT = "//div[@id='DiskFileDialog']//span[.='Recent items']";
    public static final String MSG_TAB_FILE_ITEM = "//div[@id='DiskFileDialog']//a[.='%s.txt']";
    public static final String MSG_TAB_FILE_SELECT_BTN = "//div[@id='DiskFileDialog']//span[.='Select document']";
    public static final String MSG_TAB_ATTACHED_FILE = "//span[@title='Click to insert file']";
    public static final String GEN_ALL_TAB_SEND_BTN = "//button[@id='blog-submit-button-save']";
    public static final String MSG_TAB_CONTENT_FRAME = "//iframe[@class='bx-editor-iframe']";
    public static final String GEN_DESTINATION_POPUP_FORMAT = "//div[@id='BXSocNetLogDestination']//a[contains(.,'%s')]";
    public static final String GEN_DESTINATION_ITEM = "//span[@id='feed-add-post-destination-item']";
    public static final String POPUP_WINDOW_CLOSE = "//div[contains(@id,'BXSocNetLogDestination')]//span[@class='popup-window-close-icon']";
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
    public static final String TASK_TAB_TITLE_BLOCK = "//input[@data-bx-id='task-edit-title']";
    public static final String TASK_TAB_TITLE_PRIORITY = "//input[@data-bx-id='task-edit-priority-cb']";
    public static final String TASK_TAB_CONTENT_FRAME = "//iframe[@class='bx-editor-iframe'][ancestor::*[contains(@*,'task')]]";
    public static final String GEN_TASK_TAB_ROLE_FORMAT = "//div[span[.='%s']]//a[%s(contains(.,'Add more'))]";
    public static final String TASK_TAB_ADDITIONAL_EDIT = "//div[@data-bx-id='task-edit-additional-header']";
    public static final String TASK_TAB_ROLE_CANCEL_SELECTION = "//div[span[.='%s']]//span[@title='Cancel selection']";
    public static final String GEN_TASK_CREATE_ROLE_FORMAT = "//span[@class='task-dashed-link-inner'][.='%s']";
    public static final String TASK_MULTI_ROLE_POPUP_MSG = "//div[@id='TASK_EDIT_MULTIPLE_RESPONSIBLES']";
    public static final String TASK_DEADLINE_INPUT_BOX = "//span[@data-bx-id='dateplanmanager-deadline']";
    public static final String CALENDAR_POPUP_HEADER_YEAR = "//a[@class='bx-calendar-top-year']";
    public static final String CALENDAR_POPUP_HEADER_MONTH = "//a[@class='bx-calendar-top-month']";
    public static final String CALENDAR_POPUP_MONTH_CONTENT = "//div[@class='bx-calendar-month-content']/span[.='%s']";
    public static final String CALENDAR_POPUP_MONTH_CONTENT_BOX = "//div[@class='bx-calendar-month-popup']";
    public static final String CALENDAR_POPUP_YEAR_CONTENT_BOX = "//div[@class='bx-calendar-year-popup']";
    public static final String CALENDAR_POPUP_YEAR_CONTENT = "//div[@class='bx-calendar-year-content']/span[.='%s']";
    public static final String CALENDAR_POPUP_DAY_CONTENT = "//a[@class='bx-calendar-cell'][.='%s']";
    public static final String CALENDAR_POPUP_AMPM = "//span[@class='bx-calendar-AM-PM-text']";
    public static final String CALENDAR_POPUP_TIME_HR_INPUT = "//input[@class='bx-calendar-form-input'][1]";
    public static final String CALENDAR_POPUP_TIME_MIN_INPUT = "//input[@class='bx-calendar-form-input'][2]";
    public static final String CALENDAR_POPUP_TIME_SELECT_BTN = "//a[@data-action='submit']";
    public static final String TASK_MULTI_ROLE_POPUP_CLOSE = "//div[contains(@id,'MULTIPLE_RESPONSIBLES')]//span";
    public static final String GEN_TASK_TAB_CHECKBOX_FORMAT = "//input[@type='checkbox'][parent::label[contains(.,'%s')]]";
    public static final String TASK_REPETATION_AREA = "//div[contains(@id,'replication')]";
    public static final String GEN_TASK_REPEAT_TERMS_FORMAT = "//span[contains(@class,'js-id-replication-period-type')][.='%s']";
    public static final String TASK_REPEAT_ACTIVE_TERM = "//div[contains(@class,'task-replication-panel')]/div[not(contains(@class,'nodisplay'))]";
    public static final String TASK_REPEAT_ACTIVE_TEXT_INPUT = "//input[contains(@class,'%s')][@type='text']";
    public static final String TASK_REPEAT_ACTIVE_RADIO_INPUT = "//input[@value=%s][@type='radio']";
    public static final String TASK_REPEAT_ACTIVE_CHECKBOX_INPUT = "//input[parent::label[contains(.,'%s')]][@type='checkbox']";
    public static final String TASK_REPEAT_ACTIVE_SELECT_FORMAT = "//select[contains(@class,'%s')]"; //" " or "-num"
    public static final String TASK_REPEAT_READONLY_INPUT_FORMAT = "//div[@class='task-options-field']/div[label[.='%s']]/span[1]";
    public static final String TASK_REPEAT_REPEAT_UNTIL_RADIO_BUTTON = "//div[contains(@class,'task-options-field-left')]/input[following-sibling::span[label[.='%s']]]";
    public static final String TASK_REPEAT_REPEAT_UNTIL_END_DATE_INPUT = "//div[contains(@class,'task-options-field-left')]/span[contains(@class,'end-date')]/input[@readonly='readonly']";
    public static final String TASK_REPEAT_REPEAT_UNTIL_ITERATIONS_INPUT = "//div[contains(@class,'task-options-field-left')]/span[following-sibling::span[label[.='iterations']]]/input";
    public static final String TASK_PLANNED_TIME_FORMAT = "//input[contains(@class,'%s task-options-inp')]";
    public static final String TASK_REMINDER_BOX = "//span[.='Add reminder']";
    public static final String TASK_REMINDER_CALENDAR_BOX = "//span[@data-bx-id='form-date']/input";
    public static final String TASK_REMINDER_ASSIGNEE = "//select[@data-bx-id='form-change-recipient']";
    public static final String TASK_REMINDER_SEND_FORMAT = "//a[@title='Send %s message']";
    public static final String TASK_REMIDNER_ADD_BTN = "//button[@data-bx-id='form-submit']";
    public static final String TASK_REMINDER_CLOSE_POPUP = "//div[contains(@id,'reminder')]//span[@class='popup-window-close-icon']";
    public static final String TASK_PREVIOUS_TASK_SEARCH_BOX = "//input[contains(@name,'fb_task_input')]";
    public static final String GEN_ADDITIONAL_TASKS_ADD_FORMAT = "//div[span[.='%s']]//span/span[contains(.,'Add')]";
    public static final String GEN_ADDITIONAL_TASK_POPUP_LIST_FORMAT = "//div[.='%s']/parent::div[contains(@id,'%s')]";
    public static final String TASK_ADDITIONAL_TASK_POPUP_BTN_FORMAT = "//div[contains(@id,'%s')]//span[.='%s']";
    public static final String TASK_ADD_TAGS_BOX = "//div[@id='task-tags-popup']//input";
    public static final String TASK_ADD_TAGS_TO_LIST = "//div[@id='task-tags-popup']//div[@title='Add New Tags']";
    public static final String TASK_NEW_TAGS_LIST_ITEM = "//div[@id='task-tags-popup']//input[following-sibling::label[.='%s']]";
    public static final String TASK_TAGS_POPUP_BTN_FORMAT = "//div[@id='task-tags-popup']//span[.='%s']";
    public static final String TASK_SEND_BTN = "//button[@id='blog-submit-button-save']";
    public static final String TASK_SENT_CONFIRMATION_POPUP = "//div[@class='feed-create-task-popup-title']";
    /**
     * Activity Stream Event tab xpath format
     */
    public static final String EVENT_TITLE_BLOCK = "//div[@class='feed-event']//input[@placeholder='Event name']";
    public static final String EVENT_CONTENT_BLOCK = "//div[@class='feed-event']//iframe";
    public static final String GEN_EVENT_POST_BTN_FORMAT = "//span[contains(@title,'%s')][ancestor::*[contains(@*,'event')]]";
    public static final String GEN_EVENT_START_END_FORMAT = "//span[contains(@class,'event-from-to')]//input[contains(@name,'%s')]";
    public static final String GEN_EVENT_CLOCK_POPUP = "//div[@class='bx-clock-div']";
    public static final String EVENT_CLOCK_HOUR_MINUTE_FORMAT = "//div[contains(@id,'event_%s')]//input[@title='%s']";
    public static final String EVENT_CLOCK_SET_TIME_FORMAT = "//div[contains(@id,'event_%s')]//input[@value='Set Time']";
    public static final String EVENT_CLOCK_AMPM_FORMAT = "//div[contains(@id,'event_%s')]//span[@class='bxc-am-pm']";
    public static final String EVENT_CLOCK_HR_MIN_ARM_FORMAT = "//img[@class='bxc-%s-arr-cont bxc-iconkit-a']";
    public static final String EVENT_ADDITIONAL_MORE_BTN = "//div[@id='feed-cal-additional']/span";
    public static final String GEN_EVENT_SELECT_DROPDOWN_FORMAT = "//td[label[.='%s']]/following-sibling::td/select";
    /**
     * Activity Stream PolL tab xpath format
     */
    public static final String POLL_TAB_TITLE_BLOCK = "//input[@id='POST_TITLE']";
    public static final String POLL_CONTENT_BLOCK = "//iframe[@class='bx-editor-iframe']";
    public static final String GEN_POLL_QUESTION_INPUT_FORMAT = "//li[@class='vote-question'][%s]//input[contains(@placeholder,'Question')]";
   public static final String GEN_POLL_ANSWER_INPUT_FORMAT = "//li[@class='vote-question'][%s]//input[contains(@placeholder,'Answer  %s')]";
    public static final String GEN_POLL_Q_A_CHECKBOX_FORMAT = "//li[@class='vote-question'][%s]//input[@type='checkbox']";
    public static final String POLL_ADD_QUESTION = "//a[.='Add question']";
    /**
     * Activity Stream Feed log
     */
    public static final String ACTIVITY_NEW_FEED = "//div[@id='log_internal_container']/div[@class='feed-wrap']/div[1]";
    public static final String ACTIVITY_NEW_FEED_USER = ACTIVITY_NEW_FEED+"//a[@class='user-name']";
    public static final String ACTIVITY_FEED_DESTINATION = ACTIVITY_NEW_FEED+"//span[@class='feed-add-post-destination-cont']/*";
    public static final String ACTIVITY_FEED_TIME_STAMP = ACTIVITY_NEW_FEED+"//div[@class='feed-post-time-wrap']";
    public static final String ACTIVITY_FEED_ATTACHED_LINK = ACTIVITY_NEW_FEED+"//div[contains(@class,'contentview')]//a[.='%s']";
    public static final String ACTIVITY_FEED_CONTENT_ANY_ELEMENT = ACTIVITY_NEW_FEED+"//div[contains(@class,'contentview')]//*[.='%s']";
    public static final String ACTIVITY_FEED_CONTENT_IFRAME = ACTIVITY_NEW_FEED+"//iframe";
    public static final String ACTIVITY_FEED_ATTACHED_FILE = ACTIVITY_NEW_FEED+"//div[@class='feed-com-files']//a";
    public static final String ACTIVITY_FEED_ATTACHED_PHOTO = ACTIVITY_NEW_FEED+"//div[@class='feed-com-files']//img";
    public static final String ACTIVITY_FEED_ATTACHED_VOTE = ACTIVITY_NEW_FEED+"//form[@class='vote-form']";
    public static final String ACTIVITY_FEED_ATTACHED_TASK = ACTIVITY_NEW_FEED+"//div[@class='feed-task-info-block']//a";
    public static final String ACTIVITY_FEED_INFORMER = ACTIVITY_NEW_FEED+"//div[@class='feed-post-informers-cont']//a[.='%s']";
    public static final String ACTIVITY_FEED_INFORMER_VIEW = ACTIVITY_NEW_FEED+"//div[@class='feed-post-informers-cont']//span[contains(@id,'view')]";
    public static final String ACTIVITY_FEED_INFORMER_POPUP_MENU = "//div[@class='menu-popup-items'][ancestor::div[contains(@id,'blog-post')]]";
    public static final String ACTIVITY_FEED_INFORMER_VIEW_LIST = "//span[@class='bx-contentview-popup']/a[.='%s']";
    public static final String ACTIVITY_FEED_COMMENT_FRAME = ACTIVITY_NEW_FEED+"//iframe[@class='bx-editor-iframe']";
    public static final String ACTIVITY_FEED_POST_BTN_FORMAT = "//div[@id='log_internal_container']//span[contains(@title,'%s')]";
    public static final String ACTIVITY_FEED_RECORD_VIDEO_BTN = "//div[@id='log_internal_container']//span[contains(.,'Record Video')]";
    public static final String ACTIVITY_FEED_COMMENT_SEND_BTN = "//div[@id='log_internal_container']//button[.='Send']";
    public static final String ACTIVITY_FEED_SEARCH_FILTER = "//div[contains(@id,'popup-window-content-LIVEFEED_search')]//span[.='%s']";
    public static final String ACTIVITY_FEED_SEARCH_FILTER_FIELD = "//div[contains(@id,'popup-window-content-LIVEFEED_search')]//div[span[.='%s']]/div";
    public static final String ACTIVITY_FEED_FILTER_SEARCH_BTN = "//div[contains(@id,'popup-window-content-LIVEFEED_search')]//button";
    public static final String ACTIVITY_FEED_FILTER_RESET_BTN = ACTIVITY_FEED_FILTER_SEARCH_BTN+"/following-sibling::span";
    public static final String NEW_FEED_ATTACHED_FILE = "//a[.='%s']";
    public static final String NEW_FEED_ATTACHED_IMG = "//*[@data-bx-title='%s']";
    public static final String ACTIVITY_NEW_FEED_TO = "//div[@class='feed-item-wrap'][1]//span[@class='feed-add-post-destination-cont']";
    public static final String NEW_FEED_ATTACHED_LINK = "//div[@class='feed-item-wrap'][1]//a[@href='https://%s']";
    public static final String NEW_FEED_ATTACHED_VIDEO_FRAME = "//div[@class='feed-item-wrap'][1]//iframe";
    public static final String NEW_FEED_ATTACHED_QUOTE = "//div[@class='feed-item-wrap'][1]//div[@title='Quote']";
    public static final String NEW_FEED_ATTACHED_MENTION = "//div[@class='feed-item-wrap'][1]//span/a[.='%s']";
    public static final String NEW_FEED_ATTACHED_TAG = "//div[@class='feed-item-wrap'][1]//a[@bx-tag-value='%s']";
    public static final String NEW_FEED_MSG_TITLE = "//div[@class='feed-item-wrap'][1]//a[@class='feed-post-title']";
    public static final String FEED_LOADER = "//div[@class='feed-loader-container livefeed-show-loader']";
    public static final String LIVE_FEED_SEARCH = "//input[@id='LIVEFEED_search']";
    /**
     * Activity Stream Side Bar xpath format
     */
    public static final String SIDE_BAR_COMPANY_PULSE = "//div[@id='sidebar']//*[.='Company Pulse']";
    public static final String SIDE_BAR_ANNOUNCEMENT_LINK = "//div[@id='sidebar']//*[contains(.,'Announcements')]//a";
    public static final String SIDE_BAR_ANNOUNCEMENT_MARK_AS_READ = "//div[@id='sidebar']//*[.='Mark as read']";
    public static final String SIDE_BAR_ANNOUNCEMENT_NAV_FORMAT = "//div[@id='sidebar']//*[contains(@id,'%s')]";
    public static final String SIDE_BAR_ADD_NEW_TASK_EVENT_FORMAT = "//div[@id='sidebar']//*[contains(.,'%s')]/a";
    public static final String GEN_SIDE_BAR_LINKS_FORMAT = "//div[@id='sidebar']//a[contains(.,'%s')]";
    public static final String GEN_SIDE_BAR_POPULAR_BIRTHDAY_LIST = "//div[@id='sidebar']/div[contains(.,'%s')]/a";
    public static final String SIDE_BAR_UPCOMING_EVENTS_LIST = "//div[@id='sidebar']/div[contains(.,'Upcoming Events')]/div[2]/a";
    /**
     * Tasks
     */
    public static final String TASKS_PAGE_TITLE = "//span[@id='pagetitle']";
    public static final String GEN_TASKS_TABLE_COLUMN_FORMAT = "//div[contains(@class,'main-grid-fade')]//th[contains(.,'%s')]";
    public static final String TASKS_TABLE_LOADER_CIRCLE = "//div[@class='main-grid-loader-container']//*[contains(@class,'circle')]";
    public static final String GEN_TASKS_TABLE_DATA_BY_COLUMN = "//table[@class='main-grid-table']//td[%s]";
    public static final String GEN_TASKS_TABLE_DATA_BY_COLUMN_NAME = "//table[@class='main-grid-table']//td[count(//div[contains(@class,'main-grid-fade')]//th[.='ID']/preceding-sibling::th)+1]";
    public static final String GEN_TASKS_HEADER_LINKS_FORMAT = "//a[@class='main-buttons-item-link'][contains(.,'%s')]";
    public static final String TASKS_MAIN_UI_FILTER_SEARCH = "//input[@class='main-ui-filter-search-filter']";
    public static final String TASK_TABLE_ALL_TASKS_LIST = "//table[@class='main-grid-table']//tbody//td[3]//a";
    public static final String GEN_TASK_KANBAN_COLUMN_ITEMS = "//div[@class='main-kanban-grid']/div[contains(.,'%s')]//div[@class='main-kanban-item']";
    public static final String TASKS_POPUP_IFRAME = "//iframe[@class='side-panel-iframe']";
    public static final String TASKS_POPUP_ADD_NEW = "//div[@class='tasks-iframe-header']//a";
    public static final String TASKS_POPUP_USER_LINK = "//div[@class='task-detail-sidebar-content']/div[contains(.,'%s')]//a[contains(@class,'user-name')]";
    public static final String TASKS_SEARCH_FILTER_SIDE_BAR = "//div[@class='main-ui-filter-sidebar']//span[.='%s']";
    public static final String TASKS_SEARCH_FILTER_FIELD = "//div[@class='main-ui-filter-field-container']//div[span[.='%s']]/div";
    public static final String TASKS_SEARCH_FILTER_ROLE_SELECT = "//div[@class='popup-select-content']/div[.='%s']";
    public static final String TASKS_SEARCH_FILTER_FIELD_CONTROL ="//div[@class='main-ui-filter-field-add']/span[.='%s']";
    public static final String TASKS_SEARCH_FILTER_FIELD_BTNS = "//div[@class='main-ui-filter-field-button-inner']/*[contains(.,'%s')]";
    public static final String TASKS_QUICK_TASK_BTN = "//button[@title='Create quick task']";
    public static final String TASKS_QUICK_TASK_INPUTS = "//form[@id='task-new-item-form']//input[@placeholder='%s']";
    public static final String TASKS_QUICK_TASKS_CONFIRM = "//form[@id='task-new-item-form']//span[contains(@id,'%s')]";
    /**
     * Calendar - Events
     * SEARCH FILTER SAME WITH TASKS
     * CALENDAR BLOCK SAME
     */
    public static final String CALENDAR_SEARCH_BOX = "//div[@class='page-header']//input";
    public static final String CALENDAR_HEADER_LINKS = "//div[@class='page-header']//a[contains(.,'%s')]";
    public static final String CALENDAR_HEADER_BTNS = "//div[@class='page-header']//button[contains(.,'%s')]";
    public static final String CALENDAR_VIEW_ITEM = "//div[@class='page-header']//span[.='%s']";
    public static final String CALENDAR_NAVIGATION = "//div[@class='calendar-top-block']//span[@class='calendar-navigation-%s']";
    public static final String CALENDAR_VIEW_EVENT_TASK_FORMAT = "//div[contains(@class,'calendar-%s-view')]//span[.='%s']";
    public static final String CALENDAR_DAY_VIEW_HOUR_ANIMATE = "//div[@class='calendar-day-view']//div[contains(@class,'hours-animate')]/div[.='%s']";
    public static final String CALENDAR_DAY_VIEW_NEW_EVENT_POPUP_INPUTS = "//div[@class='calendar-add-popup-main-slide']//input[@placeholder='%s']";
    public static final String CALENDAR_DAY_VIEW_NEW_EVENT_POPUP_COMPLETE_FORM = "//div[@class='calendar-add-popup-main-slide']//span[.='Complete form']";
    public static final String CALENDAR_WEEK_VIEW_DAY_FORMAT = "//div[@data-bx-calendar-timeline-day='%s']";
    public static final String CALENDAR_WEEK_VIEW_HOUR_LINE = "//div[contains(@class,'calendar-week-view')]//div[.='%s']";
    public static final String CALENDAR_MONTH_VIEW_DAY_FORMAT = "//div[@data-bx-calendar-month-day='%s']";
    public static final String CALENDAR_LIST_VIEW_DAY_ITEMS = "//div[@class='calendar-timeline-stream-day'][contains(.,'%s')]//div[@class='calendar-timeline-stream-content-event']";
    /**
     * Chat and Calls
     */
    public static final String MESSENGER_CURRENT_USER = "//div[@class='bx-desktop-appearance-menu']//a";
    public static final String MESSENGER_DESKTOP_TABS = "//div[@class='bx-desktop-appearance-tab']/div[contains(@title,'%s')]";
    public static final String MESSENGER_SEARCH_INPUT = "//div[contains(@class,'bx-messenger-box-contact')]//input";
    public static final String MESSENGER_SEARCH_INPUT_CLOSE = "//div[contains(@class,'bx-messenger-box-contact')]//a";
    public static final String MESSENGER_CONTACTS_LIST = "//div[contains(@class,' bx-messenger-recent-wrap')]/span";
    public static final String MESSENGER_MESSAGEBOX_TOP_LINKS = "//div[contains(@class,'bx-messenger-context-user')]/a[.='%s']";
    public static final String MESSENGER_MESSAGEBODY_ALL_MESSAGE = "//div[contains(@class,'bx-messenger-body-wrap')]/div[@data-type]";
    public static final String MESSENGER_MESSAGE_TEXTAREA = "//div[@class='bx-messenger-textarea']/textarea";
    public static final String MESSENGER_MESSAGE_TEXTAREA_ICONS = "//div[@class='bx-messenger-textarea-icons']/div[@title='%s']";
    public static final String MESSENGER_MESSAGE_EMOJI_SELECT = "//span[@class='bx-messenger-smile-gallery-set']/img[@title='%s']";
    public static final String MESSENGER_NOTIFICATION_ALL_LINK = "//span[@class='bx-notifier-item-content']//a[.='%s']";
    /**
     * Employess
     */
    public static final String EMPLOYEES_TOP_MENU_TAB = "//div[@id='top_menu_id_company']//a[contains(.,'%s')]";
    public static final String EMPLOYEES_DEPT_STRUCTURE_LINKS = "//table[@id='bx_str_level1_table']//a[contains(.,'%s')]";
    public static final String EMPLOYEES_DEPT_MANAGER_LINK = "//a[@class='department-manager-name-link']";
    public static final String EMPLOYESS_DEPT_EMPLOYEE_LINK = "//table[@id='employee-table']//a[@class='%s']";
    public static final String EMPLOYESS_PROFILE_MENU_BTN = "//div[@class='profile-menu-info']/span";
    public static final String EMPLOEES_PROFILE_MENU_POPUP = "//div[@id='menu-popup-user-menu-profile']//span[.='%s']";
    public static final String EMPLOYEES_PROFILE_MENU_ITEMS = "//div[@id='profile-menu-filter']/a[.='%s']";
    public static final String EMPLOYEES_USR_PROFILE_BLOCK_LINKS = "//div[contains(@class,'user-profile-block')]//a[contains(.,'%s')]";
}