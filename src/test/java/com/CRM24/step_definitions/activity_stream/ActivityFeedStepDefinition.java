package com.CRM24.step_definitions.activity_stream;

import com.CRM24.pages.activity_stream.ActivityStreamPage;
import com.CRM24.util.UiUtil;
import com.CRM24.util.XpathUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ActivityFeedStepDefinition {

    ActivityStreamPage activityStream = new ActivityStreamPage();

    @And("user clicks {string} tab under Activity Stream")
    public void userClicksTabUnderActivityStream(String tab) {
        activityStream.clickTab(tab);
    }

    @Then("new feed should display with the {string}")
    public void newFeedShouldDisplayWithThe(String file) {
        Assert.assertTrue("file not found",activityStream.checkAttachedFileInNewFeed(file));
    }

    @Then("new feed should be addressed to employee {string}")
    public void newFeedShouldBeAddressedToEmployee(String employee) {
        Assert.assertTrue(activityStream.getNewFeedDestination().contains(employee));
    }

    @When("user clicks attached link {string} in new feed")
    public void userClicksAttachedLinkInNewFeed(String url) {
        activityStream.clickLinkInFeed(url);
    }

    @Then("new window should load with given link {string}")
    public void newWindowShouldLoadWithGivenLink(String url) {
        Assert.assertTrue(activityStream.verifyLink(url));
    }

    @Then("user verify attached video title {string}")
    public void userVerifyAttachedVideoTitle(String title) {
        Assert.assertTrue("title does not match",activityStream.getVideoTitle().contains(title));
    }

    @Then("user verifies attached quote text {string}")
    public void userVerifiesAttachedQuoteText(String quote) {
        Assert.assertEquals(activityStream.getQuoteText(), quote);
    }

    @Then("user verify mention {string}")
    public void userVerifyMention(String mention) {
        Assert.assertTrue(activityStream.mentionDisplayed(mention));
    }

    @Then("user verify attached tag {string} on new feed")
    public void userVerifyAttachedTagOnNewFeed(String tag) {
        Assert.assertEquals(UiUtil.getTextFromElement(XpathUtil.NEW_FEED_ATTACHED_TAG,tag),tag);
    }

    @Then("user verify text format")
    public void userVerifyTextFormat() {
    }

    @Then("user verify new feed message title {string}")
    public void userVerifyNewFeedMessageTitle(String title) {
        Assert.assertEquals(activityStream.getNewFeedMsgTitle(),title);
    }
}
