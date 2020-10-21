package com.CRM24.pages.base_navigation_page;

import com.CRM24.util.Driver;
import com.CRM24.util.UiUtil;
import com.CRM24.util.XpathUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPageBase {

    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver,5);

    public AbstractPageBase() {
        PageFactory.initElements(driver, this);
    }

    /**
     * click any menu items (left column)
     * @param item
     */
    public void click_menu(String item){
        UiUtil.clickElement(XpathUtil.GEN_MENU_ITEM_FORMAT,item);
    }

    /**
     * click any header items (top)
     * @param item
     */
    public void click_header(String item){
        UiUtil.clickElement(XpathUtil.GEN_HEADER_ITEM_FORMAT,item);
    }

    /**
     * click any msg bar items (right column)
     * @param item
     */
    public void click_msg_bar(String item){
        UiUtil.clickElement(XpathUtil.GEN_MSG_BAR_FORMAT,item);
    }

    /**
     * drag menu items to new location
     * @param from
     * @param to
     */
    public void drag_menu(String from, String to){
        UiUtil.dragAndDropElement(UiUtil.get_webElement(XpathUtil.GEN_MENU_ITEM_FORMAT,from),
                UiUtil.get_webElement(XpathUtil.GEN_MENU_ITEM_FORMAT,to));
    }

    /**
     * click sitemap items
     * @param section  title / item
     * @param select   all options on the sitemap menu
     */
    public void click_siteMap(String section,String select){
        UiUtil.clickElement(XpathUtil.GEN_SITEMAP_FORMAT,section,select);
    }

    public String get_homepage() {
        return UiUtil.getTextFromElement(XpathUtil.HOMEPAGE);
    }
}