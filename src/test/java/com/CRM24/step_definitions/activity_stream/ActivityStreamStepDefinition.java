package com.CRM24.step_definitions.activity_stream;

import com.CRM24.pages.activity_stream.ActivityStreamPage;
import com.CRM24.util.GlobalDataUtil;
import com.CRM24.util.UiUtil;
import com.CRM24.util.XpathUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ActivityStreamStepDefinition {

    ActivityStreamPage activityStream = new ActivityStreamPage();
    GlobalDataUtil activeTab  = new GlobalDataUtil();

    @And("user clicks {string} tab under Activity Stream")
    public void userClicksTabUnderActivityStream(String tab) {
        activityStream.clickTab(tab);
    }

    @And("^user clicks on post button (.*)$")
    public void userClicksOnPostButton(String btn) {
        activityStream.clickPostBtn(btn);
    }


    @When("user uploads local file {string}")
    public void userUploadsLocalFile(String address) {
        activityStream.uploadLocalFile(address);
    }

    @And("{string} should display under attached files")
    public void shouldDisplayUnderAttachedFiles(String file) {
        Assert.assertTrue("file is not found", activityStream.attachedFileDisplayed(file));
        
    }

    @When("user clicks send button")
    public void userClicksSendButton() {
        activityStream.sendMsg();
    }


    @Then("new feed should display with the {string}")
    public void newFeedShouldDisplayWithThe(String file) {
        Assert.assertTrue("file not found",activityStream.checkAttachedFileInNewFeed(file));
    }

    @When("user writes {string} in content box")
    public void userWritesInContentBox(String msg) {
        activityStream.writeMsg(msg);
    }


    @And("user adds employee {string} from tab {string}")
    public void userAddsEmployeeFromTab(String employee, String tab) {
        activityStream.clickDestinationBox();
        activityStream.deselectAllEmployee();
        activityStream.clickDestinationSubTab(tab);
        activityStream.selectEmployee(employee);
        activityStream.closePopup();
    }

    @And("employee {string} should appear in the destination box")
    public void employeeShouldAppearInTheDestinationBox(String employee) {
        Assert.assertTrue(activityStream.selectedEmployeelisted(employee));
    }

    @Then("new feed should be addressed to employee {string}")
    public void newFeedShouldBeAddressedToEmployee(String employee) {
        Assert.assertTrue(activityStream.getNewFeedDestination().contains(employee));
    }

    @And("user inputs {string} into {string} field")
    public void userInputsIntoField(String input, String field) {
        activityStream.inputField(input,field);
    }

    @When("user clicks attached link {string} in new feed")
    public void userClicksAttachedLinkInNewFeed(String url) {
        activityStream.clickLinkInFeed(url);
    }

    @Then("new window should load with given link {string}")
    public void newWindowShouldLoadWithGivenLink(String url) {
        Assert.assertTrue(activityStream.verifyLink(url));
    }

    @And("user clicks link {string}")
    public void userClicksLink(String action) {
        activityStream.clickLinkBtn(action);
    }

    @Then("user verify attached video title {string}")
    public void userVerifyAttachedVideoTitle(String title) {
        Assert.assertTrue("title does not match",activityStream.getVideoTitle().contains(title));
    }

    @And("user verify video selected successfully")
    public void userVerifyVideoSelectedSuccessfully() {
        Assert.assertTrue(activityStream.insertVideoDisplayed());
    }

    @And("user enters text {string} into QuoteBlock")
    public void userEntersTextIntoQuoteBlock(String quote) {
        activityStream.enterQuote(quote);
    }

    @Then("user verifies attached quote text {string}")
    public void userVerifiesAttachedQuoteText(String quote) {
        Assert.assertEquals(activityStream.getQuoteText(), quote);
    }

    @Then("user verify mention {string}")
    public void userVerifyMention(String mention) {
        Assert.assertTrue(activityStream.mentionDisplayed(mention));
    }

    @And("user adds mention {string} from tab {string}")
    public void userAddsMentionFromTab(String mention, String tab) {
        activityStream.clickDestinationSubTab(tab);
        activityStream.selectEmployee(mention);
    }

    @And("user adds tag {string}")
    public void userAddsTag(String tag) {
        activityStream.addTag(tag);
    }

    @Then("user verify attached tag {string} on new feed")
    public void userVerifyAttachedTagOnNewFeed(String tag) {
        Assert.assertEquals(UiUtil.getTextFromElement(XpathUtil.NEW_FEED_ATTACHED_TAG,tag),tag);
    }

    @And("user allows permission")
    public void userAllowsPermission() {
        activityStream.clickVideoMsgAllowBtn();
    }

    @Then("user verify error message")
    public void userVerifyErrorMessage() {
        Assert.assertTrue(activityStream.popUpErrorMsgDisplayed());
        activityStream.clickVideoMsgCloseBtn();
    }

    @And("^user selects text format (.*)$")
    public void userSelectsTextFormat(String format) {
        activityStream.selectTextFormat(format);
    }

    @Then("user verify text format")
    public void userVerifyTextFormat() {

    }

    @And("user writes {string} in title block")
    public void userWritesInTitleBlock(String title) {
        activeTab.setMsgTitle(title);
        activityStream.writeTitle(title);
    }

    @Then("user verify new feed message title")
    public void userVerifyNewFeedMessageTitle() {
        Assert.assertEquals(activityStream.getNewFeedMsgTitle(),activeTab.getMsgTitle());
    }
}
