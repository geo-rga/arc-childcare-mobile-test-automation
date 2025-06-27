package com.cube.qa.framework.pages.learn.foryou;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class UserTypeQuestionPage extends BasePage {

    private List<By> questionTitleLocators;
    private List<By> questionSubtitleLocators;
    private List<By> babysitterOptionLocators;
    private List<By> relativeOptionLocators;
    private List<By> otherOptionLocators;
    private List<By> nextButtonLocators;
    private List<By> selectionCounterLocators;

    public UserTypeQuestionPage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            questionTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Which of the following best describes you?']")
            );
            questionSubtitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Select one answer']")
            );
            babysitterOptionLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Babysitter']")
            );
            relativeOptionLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Relative']")
            );
            otherOptionLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Other']")
            );
            nextButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Next']")
            );
            selectionCounterLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='0 of 1 Selected']")
            );
        } else {
            questionTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/tv_question']")
            );
            questionSubtitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/tv_description']")
            );
            babysitterOptionLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/option1']")
            );
            relativeOptionLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/option2']")
            );
            otherOptionLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/option3']")
            );
            nextButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/cta_next']")
            );
            selectionCounterLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/tv_selection_counter']")
            );
        }
    }

    // Question Title
    public boolean isQuestionTitleVisible() {
        return isVisible(questionTitleLocators);
    }
    public boolean hasQuestionTitleText(String text) {
        return hasText(questionTitleLocators, text);
    }

    // Question Subtitle
    public boolean isQuestionSubtitleVisible() {
        return isVisible(questionSubtitleLocators);
    }
    public boolean hasQuestionSubtitleText(String text) {
        return hasText(questionSubtitleLocators, text);
    }

    // Babysitter Option
    public boolean isBabysitterOptionVisible() {
        return isVisible(babysitterOptionLocators);
    }
    public void tapBabysitterOption() {
        tap(babysitterOptionLocators);
    }

    // Relative Option
    public boolean isRelativeOptionVisible() {
        return isVisible(relativeOptionLocators);
    }
    public void tapRelativeOption() {
        tap(relativeOptionLocators);
    }

    // Other Option
    public boolean isOtherOptionVisible() {
        return isVisible(otherOptionLocators);
    }
    public void tapOtherOption() {
        tap(otherOptionLocators);
    }

    // Next Button
    public boolean isNextButtonVisible() {
        return isVisible(nextButtonLocators);
    }
    public void tapNextButton() {
        tap(nextButtonLocators);
    }

    // Selection Counter
    public boolean isSelectionCounterVisible() {
        return isVisible(selectionCounterLocators);
    }
    public boolean hasSelectionCounterText(String text) {
        return hasText(selectionCounterLocators, text);
    }
}
