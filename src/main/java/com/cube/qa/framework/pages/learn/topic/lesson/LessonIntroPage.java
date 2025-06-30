package com.cube.qa.framework.pages.learn.topic.lesson;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class LessonIntroPage extends BasePage {

    private List<By> lessonTitleLocators;
    private List<By> lessonSubtitleLocators;
    private List<By> startButtonLocators;

    public LessonIntroPage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            lessonTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Lesson: Expectations, Skills and Qualifications']")
            );
            lessonSubtitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='  ']")
            );
            startButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Start']")
            );
        } else {
            lessonTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title' and @text='Expectations, Skills and Qualifications']")
            );
            lessonSubtitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/subtitle' and @text='  ']")
            );
            startButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/start_button' and @text='START']")
            );
        }
    }

    // Lesson Title
    public boolean isLessonTitleVisible() {
        return isVisible(lessonTitleLocators);
    }
    public void scrollToFirstVisibleLessonTitle() {
        scrollToFirstVisible(lessonTitleLocators);
    }

    // Lesson Subtitle
    public boolean isLessonSubtitleVisible() {
        return isVisible(lessonSubtitleLocators);
    }
    public void scrollToFirstVisibleLessonSubtitle() {
        scrollToFirstVisible(lessonSubtitleLocators);
    }

    // Start Button
    public boolean isStartButtonVisible() {
        return isVisible(startButtonLocators);
    }
    public void tapStartButton() {
        tap(startButtonLocators);
    }
    public void scrollToFirstVisibleStartButton() {
        scrollToFirstVisible(startButtonLocators);
    }
}
