package com.CRM24.step_definitions.activity_stream;

import com.CRM24.pages.activity_stream_page.PollTab;
import com.CRM24.util.GlobalDataUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class PollTabStepDefinition {

    PollTab poll = new PollTab();
    GlobalDataUtil currentQuestion = new GlobalDataUtil();

    @And("user writes poll content {string}")
    public void userWritesPollContent(String content) {
        poll.writeContent(content);
    }

    @Then("user enters question {string} content {string}")
    public void userEntersQuestionContent(String num, String question) {
        currentQuestion.setQuestionNum(num);
        poll.writeQuestion(num,question);
    }

    @And("user enters answer {string} content {string}")
    public void userEntersAnswerContent(String num, String answer) {
        poll.writeAnswer(currentQuestion.getQuestionNum(),num,answer);
    }

    @And("user adds another question")
    public void userAddsAnotherQuestion() {
        poll.clickAddQuestion();
    }
}
