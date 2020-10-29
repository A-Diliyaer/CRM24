package com.CRM24.step_definitions.activity_stream;

import com.CRM24.pages.activity_stream_page.MessageTab;
import com.CRM24.util.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MessageTabStepDefinition {

    MessageTab msgTab = new MessageTab();

    @And("^user clicks on post button (.*)$")
    public void userClicksOnPostButton(String btn) {
        msgTab.clickPostBtn(btn);
    }

    @When("user uploads local file {string}")
    public void userUploadsLocalFile(String address) {
        msgTab.uploadLocalFile(address);
    }

    @And("{string} should display under attached files")
    public void shouldDisplayUnderAttachedFiles(String file) {
        Assert.assertTrue("file is not found", msgTab.attachedFileDisplayed(file));
    }

    @When("user clicks send button")
    public void userClicksSendButton() {
        msgTab.sendMsg();
        BrowserUtils.wait(3);
    }

    @When("user writes {string} in content box")
    public void userWritesInContentBox(String msg) {
        msgTab.writeMsg(msg);
    }


    @And("user adds employee {string} from tab {string}")
    public void userAddsEmployeeFromTab(String employee, String tab) {
        msgTab.clickDestinationBox();
        msgTab.deselectAllEmployee();
        msgTab.clickDestinationSubTab(tab);
        msgTab.selectEmployee(employee);
        msgTab.closePopup();
    }

    @And("employee {string} should appear in the destination box")
    public void employeeShouldAppearInTheDestinationBox(String employee) {
        Assert.assertTrue(msgTab.selectedEmployeelisted(employee));
    }

    @And("user inputs {string} into {string} field")
    public void userInputsIntoField(String input, String field) {
        msgTab.inputField(input,field);
    }

    @And("user clicks link {string}")
    public void userClicksLink(String action) {
        msgTab.clickLinkBtn(action);
    }

    @And("user verify video selected successfully")
    public void userVerifyVideoSelectedSuccessfully() {
        Assert.assertTrue(msgTab.insertVideoDisplayed());
    }

    @And("user enters text {string} into QuoteBlock")
    public void userEntersTextIntoQuoteBlock(String quote) {
        msgTab.enterQuote(quote);
    }

    @And("user adds mention {string} from tab {string}")
    public void userAddsMentionFromTab(String mention, String tab) {
        msgTab.clickDestinationSubTab(tab);
        msgTab.selectEmployee(mention);
    }

    @And("user adds tag {string}")
    public void userAddsTag(String tag) {
        msgTab.addTag(tag);
    }


    @And("user allows permission")
    public void userAllowsPermission() {
        msgTab.clickVideoMsgAllowBtn();
    }

    @Then("user verify error message")
    public void userVerifyErrorMessage() {
        Assert.assertTrue(msgTab.popUpErrorMsgDisplayed());
        msgTab.clickVideoMsgCloseBtn();
    }

    @And("^user selects text format (.*)$")
    public void userSelectsTextFormat(String format) {
        msgTab.selectTextFormat(format);
    }

    @And("user writes {string} in title block")
    public void userWritesInTitleBlock(String title) {
        msgTab.writeTitle(title);
    }



}
