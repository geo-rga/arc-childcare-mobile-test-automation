package com.cube.qa.framework.pages.learn.topic.quiz;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;

import java.util.List;

public class TextSelectQuestion extends BasePage {

    private List<By> questionTitleLocators;
    private List<By> answerInstructionLocators;
    private List<By> answerOption1Locators;
    private List<By> answerOption2Locators;
    private List<By> answerOption3Locators;
    private List<By> answerOption4Locators;
    private List<By> selectionCountLocators;
    private List<By> checkButtonLocators;
    private List<By> quizProgressLocators;
    private List<By> quizCloseButtonLocators;
    private List<By> quizStepTextLocators;

    public TextSelectQuestion(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            questionTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name=\"You are asked to babysit for a family with two young children for an entire Saturday. You have only babysat one child at a time before and have never worked a full day. What should you do?\"]")
            );
            answerInstructionLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Choose the correct answer']")
            );
            answerOption1Locators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Accept the job and figure it out as you go.']")
            );
            answerOption2Locators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Let the client know your experience level and discuss whether it’s a good fit.']")
            );
            answerOption3Locators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='After the clients leave, ask a friend to come over and help you.']")
            );
            answerOption4Locators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Decline all jobs that are outside your experience. ']")
            );
            selectionCountLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='0 of 1 selected']")
            );
            checkButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Check']")
            );
            quizProgressLocators = List.of();
            quizCloseButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Close']")
            );
            quizStepTextLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='1 of 3']")
            );

        } else {
            questionTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title']")
            );
            answerInstructionLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/hint']")
            );
            answerOption1Locators = List.of(
                By.xpath("(//*[@resource-id='com.cube.arc.childcare:id/title'])[2]")
            );
            answerOption2Locators = List.of(
                By.xpath("(//*[@resource-id='com.cube.arc.childcare:id/title'])[3]")
            );
            answerOption3Locators = List.of(
                By.xpath("(//*[@resource-id='com.cube.arc.childcare:id/title'])[4]")
            );
            answerOption4Locators = List.of(
                By.xpath("(//*[@resource-id='com.cube.arc.childcare:id/title'])[5]")
            );
            selectionCountLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/text_answers_selected']")
            );
            checkButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/button_next']")
            );
            quizProgressLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/progress_quiz']")
            );
            quizCloseButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/close']")
            );
            quizStepTextLocators = List.of(
                By.xpath("//android.widget.TextView[@text='1 of 3']")
            );
        }
    }

    // Question Title
    public boolean isQuestionTitleVisible() {
        return isVisible(questionTitleLocators);
    }

    // Answer Instruction
    public boolean isAnswerInstructionVisible() {
        return isVisible(answerInstructionLocators);
    }

    // Answer Option 1
    public boolean isAnswerOption1Visible() {
        return isVisible(answerOption1Locators);
    }
    public void tapAnswerOption1() {
        tap(answerOption1Locators);
    }

    // Answer Option 2
    public boolean isAnswerOption2Visible() {
        return isVisible(answerOption2Locators);
    }
    public void tapAnswerOption2() {
        tap(answerOption2Locators);
    }

    // Answer Option 3
    public boolean isAnswerOption3Visible() {
        return isVisible(answerOption3Locators);
    }
    public void tapAnswerOption3() {
        tap(answerOption3Locators);
    }

    // Answer Option 4
    public boolean isAnswerOption4Visible() {
        return isVisible(answerOption4Locators);
    }
    public void tapAnswerOption4() {
        tap(answerOption4Locators);
    }

    // Selection Count
    public boolean isSelectionCountVisible() {
        return isVisible(selectionCountLocators);
    }

    // Check Button
    public boolean isCheckButtonVisible() {
        return isVisible(checkButtonLocators);
    }
    public void tapCheckButton() {
        tap(checkButtonLocators);
    }

    // Quiz Progress Bar
    public boolean isQuizProgressVisible() {
        return isVisible(quizProgressLocators);
    }

    // Quiz Close Button
    public boolean isQuizCloseButtonVisible() {
        return isVisible(quizCloseButtonLocators);
    }
    public void tapQuizCloseButton() {
        tap(quizCloseButtonLocators);
    }

    // Quiz Step Text
    public boolean isQuizStepTextVisible() {
        return isVisible(quizStepTextLocators);
    }
} 
