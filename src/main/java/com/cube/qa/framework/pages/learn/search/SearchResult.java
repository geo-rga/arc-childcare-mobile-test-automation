package com.cube.qa.framework.pages.learn.search;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class SearchResult extends BasePage {

    private List<By> pageTitleLocators;
    private List<By> overviewTitleLocators;
    private List<By> overviewBodyLocators;
    private List<By> lessonsTitleLocators;
    private List<By> lessonCardTitleLocators;
    private List<By> lessonCardDurationLocators;

    public SearchResult(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            pageTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Leadership Skills']")
            );
            overviewTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Overview']")
            );
            overviewBodyLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[contains(@value, 'Develop your leadership abilities')]")
            );
            lessonsTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Lessons']")
            );
            lessonCardTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Building Your Leadership Skills']")
            );
            lessonCardDurationLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='3 minutes']")
            );

        } else {
            pageTitleLocators = List.of(
                By.xpath("//android.widget.TextView[@text='Leadership Skills']")
            );
            overviewTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/overview_title']")
            );
            overviewBodyLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/overview_body']")
            );
            lessonsTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/lessons_title']")
            );
            lessonCardTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title']")
            );
            lessonCardDurationLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/duration']")
            );
        }
    }

    // Page Title
    public boolean isPageTitleVisible() {
        return isVisible(pageTitleLocators);
    }
    public boolean hasPageTitleText(String text) {
        return hasText(pageTitleLocators, text);
    }

    // Overview Title
    public boolean isOverviewTitleVisible() {
        return isVisible(overviewTitleLocators);
    }
    public boolean hasOverviewTitleText(String text) {
        return hasText(overviewTitleLocators, text);
    }

    // Overview Body
    public boolean isOverviewBodyVisible() {
        return isVisible(overviewBodyLocators);
    }
    public boolean hasOverviewBodyText(String text) {
        return hasText(overviewBodyLocators, text);
    }

    // Lessons Title
    public boolean isLessonsTitleVisible() {
        return isVisible(lessonsTitleLocators);
    }
    public boolean hasLessonsTitleText(String text) {
        return hasText(lessonsTitleLocators, text);
    }

    // Lesson Card Title
    public boolean isLessonCardTitleVisible() {
        return isVisible(lessonCardTitleLocators);
    }
    public boolean hasLessonCardTitleText(String text) {
        return hasText(lessonCardTitleLocators, text);
    }

    // Lesson Card Duration
    public boolean isLessonCardDurationVisible() {
        return isVisible(lessonCardDurationLocators);
    }
    public boolean hasLessonCardDurationText(String text) {
        return hasText(lessonCardDurationLocators, text);
    }
} 
