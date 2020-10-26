package com.CRM24.pages.activity_stream;

import com.CRM24.util.UiUtil;
import com.CRM24.util.XpathUtil;

public class PollTab extends ActivityStreamPage{


    public void writeContent(String content){
        UiUtil.driverSwitchFrame(XpathUtil.POLL_CONTENT_BLOCK);
        UiUtil.sendTextToElement(XpathUtil.CONTENT_BOX,content);
        UiUtil.driverSwitchDefault();
    }

    public void writeQuestion(String qNum, String content){
       UiUtil.sendTextToElement(XpathUtil.GEN_POLL_QUESTION_INPUT_FORMAT,qNum,content);
    }

    public void writeAnswer(String qNum,String aNum, String content){
        UiUtil.sendTextToElement(XpathUtil.GEN_POLL_ANSWER_INPUT_FORMAT,qNum,aNum,content);
    }

    public void clickAddQuestion(){
        UiUtil.clickElement(XpathUtil.POLL_ADD_QUESTION);
    }




}
