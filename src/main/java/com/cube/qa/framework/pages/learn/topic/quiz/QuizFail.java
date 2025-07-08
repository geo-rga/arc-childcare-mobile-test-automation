package com.cube.qa.framework.pages.learn.topic.quiz;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;

import java.util.List;

public class QuizFail extends BasePage {

    private List<By> failTitleLocators;
    private List<By> failSubtitleLocators;
    private List<By> quizScoreLocators;
    private List<By> quizScoreLabelLocators;
    private List<By> retryButtonLocators;
    private List<By> doneButtonLocators;

    public QuizFail(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            failTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Keep Trying!']")
            );
            failSubtitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name=\"You'll get that achievement. Here are your results:\"]")
            );
            quizScoreLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='67%']")
            );
            quizScoreLabelLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Quiz Score']")
            );
            retryButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Retry Quiz']")
            );
            doneButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Done']")
            );
        } else {
            failTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title' and @text='Keep Trying!']")
            );
            failSubtitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/subtitle']")
            );
            quizScoreLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/quiz_score']")
            );
            quizScoreLabelLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/quiz_score_title']")
            );
            retryButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/retake']")
            );
            doneButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/done']")
            );
        }
    }

    // Fail Title
    public boolean isFailTitleVisible() {
        return isVisible(failTitleLocators);
    }

    // Fail Subtitle
    public boolean isFailSubtitleVisible() {
        return isVisible(failSubtitleLocators);
    }

    // Quiz Score
    public boolean isQuizScoreVisible() {
        return isVisible(quizScoreLocators);
    }

    // Quiz Score Label
    public boolean isQuizScoreLabelVisible() {
        return isVisible(quizScoreLabelLocators);
    }

    // Retry Button
    public boolean isRetryButtonVisible() {
        return isVisible(retryButtonLocators);
    }
    public void tapRetryButton() {
        waitForSeconds(1);
        tap(retryButtonLocators);
    }

    // Done Button
    public boolean isDoneButtonVisible() {
        return isVisible(doneButtonLocators);
    }
    public void tapDoneButton() {
        waitForSeconds(1);
        tap(doneButtonLocators);
    }
}
