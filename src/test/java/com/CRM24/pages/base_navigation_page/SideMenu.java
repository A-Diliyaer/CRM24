package com.CRM24.pages.base_navigation_page;

import com.CRM24.util.BrowserUtils;
import com.CRM24.util.UiUtil;
import com.CRM24.util.XpathUtil;

public class SideMenu extends BasePage {

    public void clickMenu(String item){
        UiUtil.clickElement(XpathUtil.GEN_MENU_ITEM_FORMAT,item);
    }
    public void hover_item_edit(String item){
        UiUtil.moveToElement(XpathUtil.GEN_MENU_ITEM_FORMAT,item);
    }

    public void click_menu_edit(String item){
        UiUtil.clickElement(XpathUtil.GEN_MENU_ITEM_EDITICON_FORMAT,item);

    }

    public void click_edit_option(String option){
        UiUtil.clickElement(XpathUtil.GEN_MENU_EDITOPTION_FORMAT,option);
        BrowserUtils.wait(1);
    }
}
