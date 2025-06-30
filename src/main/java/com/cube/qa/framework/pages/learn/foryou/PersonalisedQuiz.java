package com.cube.qa.framework.pages.learn.foryou;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class PersonalisedQuiz extends BasePage {

    private List<By> quizTitleLocators;
    private List<By> quizHintLocators;
    private List<By> quizOption1Locators;
    private List<By> quizOption2Locators;
    private List<By> quizOption3Locators;
    private List<By> quizOption4Locators;
    private List<By> selectedCountTextLocators;
    private List<By> checkButtonLocators;

    public PersonalisedQuiz(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            quizTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[contains(@name, 'babysit for a family')]")
            );
            quizHintLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Choose the correct answer']")
            );
            quizOption1Locators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Accept the job and figure it out as you go.']")
            );
            quizOption2Locators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Let the client know your experience level and discuss whether it’s a good fit.']")
            );
            quizOption3Locators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='After the clients leave, ask a friend to come over and help you.']")
            );
            quizOption4Locators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Decline all jobs that are outside your experience. ']")
            );
            selectedCountTextLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[contains(@name, 'of 1 selected')]")
            );
            checkButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Check']")
            );

        } else {
            quizTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title' and contains(@text, 'babysit for a family')]")
            );
            quizHintLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/hint' and @text='Choose the correct answer']")
            );
            quizOption1Locators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title' and @text='Accept the job and figure it out as you go.']")
            );
            quizOption2Locators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title' and @text='Let the client know your experience level and discuss whether it’s a good fit.']")
            );
            quizOption3Locators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title' and @text='After the clients leave, ask a friend to come over and help you.']")
            );
            quizOption4Locators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title' and @text='Decline all jobs that are outside your experience. ']")
            );
            selectedCountTextLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/text_answers_selected']")
            );
            checkButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/button_next']")
            );
        }
    }

    // Quiz Title
    public boolean isQuizTitleVisible() {
        return isVisible(quizTitleLocators);
    }

    // Quiz Hint
    public boolean isQuizHintVisible() {
        return isVisible(quizHintLocators);
    }

    // Option 1
    public boolean isQuizOption1Visible() {
        return isVisible(quizOption1Locators);
    }
    public void tapQuizOption1() {
        tap(quizOption1Locators);
    }

    // Option 2
    public boolean isQuizOption2Visible() {
        return isVisible(quizOption2Locators);
    }
    public void tapQuizOption2() {
        tap(quizOption2Locators);
    }

    // Option 3
    public boolean isQuizOption3Visible() {
        return isVisible(quizOption3Locators);
    }
    public void tapQuizOption3() {
        tap(quizOption3Locators);
    }

    // Option 4
    public boolean isQuizOption4Visible() {
        return isVisible(quizOption4Locators);
    }
    public void tapQuizOption4() {
        tap(quizOption4Locators);
    }

    // Selected Count
    public boolean isSelectedCountVisible() {
        return isVisible(selectedCountTextLocators);
    }
    public boolean hasSelectedCountText(String text) {
        return hasText(selectedCountTextLocators, text);
    }

    // Check Button
    public boolean isCheckButtonVisible() {
        return isVisible(checkButtonLocators);
    }
    public void tapCheckButton() {
        tap(checkButtonLocators);
    }
}
