package com.cube.qa.framework.pages.learn.topic.lesson;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class LessonSuccess extends BasePage {

    private List<By> successTitleLocators;
    private List<By> successSubtitleLocators;
    private List<By> takeQuizButtonLocators;
    private List<By> backToTopicButtonLocators;

    public LessonSuccess(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            successTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Lesson Complete!']")
            );
            successSubtitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[contains(@name,'You have completed the')]")
            );
            takeQuizButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='TAKE QUIZ']")
            );
            backToTopicButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='BACK TO TOPIC PAGE']")
            );
        } else {
            successTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title' and @text='Lesson Complete!']")
            );
            successSubtitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/subtitle' and contains(@text,'You have completed the')]")
            );
            takeQuizButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/next_button' and @text='TAKE QUIZ']")
            );
            backToTopicButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/back_button' and @text='BACK TO TOPIC PAGE']")
            );
        }
    }

    // Success Title
    public boolean isSuccessTitleVisible() {
        return isVisible(successTitleLocators);
    }
    public void scrollToFirstVisibleSuccessTitle() {
        scrollToFirstVisible(successTitleLocators);
    }

    // Success Subtitle
    public boolean isSuccessSubtitleVisible() {
        return isVisible(successSubtitleLocators);
    }
    public void scrollToFirstVisibleSuccessSubtitle() {
        scrollToFirstVisible(successSubtitleLocators);
    }

    // Take Quiz Button
    public boolean isTakeQuizButtonVisible() {
        return isVisible(takeQuizButtonLocators);
    }
    public void tapTakeQuizButton() {
        waitForSeconds(1);
        tap(takeQuizButtonLocators);
    }
    public void scrollToFirstVisibleTakeQuizButton() {
        scrollToFirstVisible(takeQuizButtonLocators);
    }

    // Back to Topic Page Button
    public boolean isBackToTopicButtonVisible() {
        return isVisible(backToTopicButtonLocators);
    }
    public void tapBackToTopicButton() {
        waitForSeconds(1);
        tap(backToTopicButtonLocators);
    }
    public void scrollToFirstVisibleBackToTopicButton() {
        scrollToFirstVisible(backToTopicButtonLocators);
    }
}
