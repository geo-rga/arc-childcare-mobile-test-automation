package com.cube.qa.framework.pages.learn.topic.quiz;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;

import java.util.List;

public class AgeAppropriatePlayQuiz extends BasePage {

    private List<By> quizHeaderLocators;
    private List<By> quizQuestionLocators;
    private List<By> answerOption1Locators;
    private List<By> answerOption2Locators;
    private List<By> answerOption3Locators;
    private List<By> answerOption4Locators;
    private List<By> selectionCountLocators;
    private List<By> checkButtonLocators;
    private List<By> quizProgressLocators;
    private List<By> quizCloseButtonLocators;
    private List<By> correctMessageLocators;
    private List<By> nextButtonLocators;
    private List<By> dismissButtonLocators;
    private List<By> incorrectMessageLocators;
    private List<By> encouragementMessageLocators;

    public AgeAppropriatePlayQuiz(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            quizHeaderLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Fill in the blank']")
            );
            quizQuestionLocators = List.of(
                By.xpath("//XCUIElementTypeOther[@name='It is crucial to choose a toy, game or activity that blank.']")
            );
            answerOption1Locators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='is safe and age-appropriate']")
            );
            answerOption2Locators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='requires minimal supervision']")
            );
            answerOption3Locators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='is popular among your friends']")
            );
            answerOption4Locators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='does not promote physical activity']")
            );
            selectionCountLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[contains(@name,'selected')]")
            );
            checkButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Check']")
            );
            quizProgressLocators = List.of();
            quizCloseButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Close']")
            );
            correctMessageLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='CORRECT!']")
            );
            nextButtonLocators = List.of(
                    By.xpath("(//XCUIElementTypeButton[@name=\"Next\"])[2]")
            );
            dismissButtonLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='_GENERAL_DISMISS']")
            );
            incorrectMessageLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='INCORRECT']")
            );
            encouragementMessageLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name=\"Keep going, you'll get it next time!\"]")
            );
        } else {
            quizHeaderLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/text_hint' and @text='Fill in the blank']")
            );
            quizQuestionLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title' and contains(@text,'It is crucial to choose')]")
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
            correctMessageLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title' and @text='CORRECT!']")
            );
            nextButtonLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/next_btn']")
            );
            dismissButtonLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/close_button']")
            );
            incorrectMessageLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title' and @text='INCORRECT']")
            );
            encouragementMessageLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/body' and contains(@text,'Keep going')]")
            );
        }
    }

    // Quiz Header
    public boolean isQuizHeaderVisible() {
        return isVisible(quizHeaderLocators);
    }

    // Quiz Question
    public boolean isQuizQuestionVisible() {
        return isVisible(quizQuestionLocators);
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
        waitForSeconds(1);
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
        waitForSeconds(1);
        tap(quizCloseButtonLocators);
    }

    // Correct Message
    public boolean isCorrectMessageVisible() {
        return isVisible(correctMessageLocators);
    }

    // Next Button
    public boolean isNextQuestionButtonVisible() {
        return isVisible(nextButtonLocators);
    }
    public void tapNextQuestionButton() {
        waitForSeconds(1);
        tap(nextButtonLocators);
    }

    // Dismiss Button
    public boolean isDismissMessageButtonVisible() {
        return isVisible(dismissButtonLocators);
    }
    public void tapDismissMessageButton() {
        waitForSeconds(1);
        tap(dismissButtonLocators);
    }
    // Incorrect Message
    public boolean isIncorrectMessageVisible() {
        return isVisible(incorrectMessageLocators);
    }

    // Encouragement Message
    public boolean isEncouragementMessageVisible() {
        return isVisible(encouragementMessageLocators);
    }
}
