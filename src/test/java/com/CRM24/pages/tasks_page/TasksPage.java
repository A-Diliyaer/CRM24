package com.CRM24.pages.tasks_page;

import com.CRM24.pages.base_navigation_page.BasePage;
import com.CRM24.util.UiUtil;
import com.CRM24.util.XpathUtil;
import com.github.javafaker.Faker;


import java.util.*;

public class TasksPage extends BasePage {

    public String getPageTitle(){
        return UiUtil.getTextFromElement(XpathUtil.TASKS_PAGE_TITLE);
    }

    public void clickColName(String colName){
        UiUtil.clickElement(XpathUtil.GEN_TASKS_TABLE_COLUMN_FORMAT,colName);
    }

    public void waitForTableLoad(){
        UiUtil.waitForElementRefresh(XpathUtil.TASKS_TABLE_LOADER_CIRCLE);
    }

    public  List<String> getColumnData(String sortType){
        return   UiUtil.getListOfTextFromElements(XpathUtil.GEN_TASKS_TABLE_DATA_BY_COLUMN_NAME,
                                                 sortType.split(" ")[0]);
    }

    public boolean isSorted(String sortType){
        List<String> colData = getColumnData(sortType);
        List<String> copyData = new ArrayList<>(colData);

        if (sortType.split(" ")[1].equals("ASC")) colData.sort(Comparator.naturalOrder());
        else colData.sort(Comparator.reverseOrder());
        System.out.println("colData = " + colData);
        System.out.println("copyData = " + copyData);
        return colData.equals(copyData);
    }

    public void setTaskName(){
        UiUtil.clickElement(XpathUtil.TASKS_QUICK_TASK_BTN);
        Faker faker = new Faker();
        UiUtil.sendTextToElement(XpathUtil.TASKS_QUICK_TASK_INPUTS,"New task",faker.name().title());
    }

    public void saveTask(){
        UiUtil.clickElement(XpathUtil.TASKS_QUICK_TASKS_CONFIRM,"save");
    }

    public void cancelTask(){
        UiUtil.clickElement(XpathUtil.TASKS_QUICK_TASKS_CONFIRM,"cancel");
    }


}
