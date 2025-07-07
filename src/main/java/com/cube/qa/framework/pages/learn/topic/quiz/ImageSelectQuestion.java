package com.cube.qa.framework.pages.learn.topic.quiz;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;

import java.util.List;

public class ImageSelectQuestion extends BasePage {

    private List<By> questionTitleLocators;
    private List<By> answerInstructionLocators;
    private List<By> imageOption1Locators;
    private List<By> imageOption2Locators;
    private List<By> imageOption3Locators;
    private List<By> imageOption4Locators;
    private List<By> selectionCountLocators;
    private List<By> checkButtonLocators;
    private List<By> quizProgressLocators;
    private List<By> quizCloseButtonLocators;
    private List<By> quizStepTextLocators;

    public ImageSelectQuestion(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            questionTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name=\"Before posting on social media, you must consider what you might convey to a potential client. Which post best conveys a fun yet responsible person?\"]")
            );
            answerInstructionLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Choose the correct answer']")
            );
            imageOption1Locators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Sofa Parkour']")
            );
            imageOption2Locators = List.of(
                By.xpath("//XCUIElementTypeButton[@name=\"It's party time!\"]")
            );
            imageOption3Locators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Shredding the trails']")
            );
            imageOption4Locators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Lazy Weekend']")
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
                By.xpath("//XCUIElementTypeStaticText[@name='3 of 3']")
            );

        } else {
            questionTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title']")
            );
            answerInstructionLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/hint']")
            );
            imageOption1Locators = List.of(
                By.xpath("//*[@content-desc='Sofa Parkour, _QUIZ_QUESTION_ACCESSIBILITYHINT_NOT_SELECTED']")
            );
            imageOption2Locators = List.of(
                By.xpath("//*[@content-desc=\"It's party time!, _QUIZ_QUESTION_ACCESSIBILITYHINT_NOT_SELECTED\"]")
            );
            imageOption3Locators = List.of(
                By.xpath("//*[@content-desc='Shredding the trails, _QUIZ_QUESTION_ACCESSIBILITYHINT_NOT_SELECTED']")
            );
            imageOption4Locators = List.of(
                By.xpath("//*[@content-desc='Lazy Weekend, _QUIZ_QUESTION_ACCESSIBILITYHINT_NOT_SELECTED']")
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
                By.xpath("//android.widget.TextView[@text='3 of 3']")
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

    // Image Option 1
    public boolean isImageOption1Visible() {
        return isVisible(imageOption1Locators);
    }
    public void tapImageOption1() {
        tap(imageOption1Locators);
    }

    // Image Option 2
    public boolean isImageOption2Visible() {
        return isVisible(imageOption2Locators);
    }
    public void tapImageOption2() {
        tap(imageOption2Locators);
    }

    // Image Option 3
    public boolean isImageOption3Visible() {
        return isVisible(imageOption3Locators);
    }
    public void tapImageOption3() {
        tap(imageOption3Locators);
    }

    // Image Option 4
    public boolean isImageOption4Visible() {
        return isVisible(imageOption4Locators);
    }
    public void tapImageOption4() {
        tap(imageOption4Locators);
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
