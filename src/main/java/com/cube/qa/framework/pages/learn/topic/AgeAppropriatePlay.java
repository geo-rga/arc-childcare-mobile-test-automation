package com.cube.qa.framework.pages.learn.topic;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;

import java.util.List;

public class AgeAppropriatePlay extends BasePage {

    private List<By> titleLocators;
    private List<By> overviewHeaderLocators;
    private List<By> overviewBodyLocators;
    private List<By> lessonsHeaderLocators;
    private List<By> quizCardLocators;
    private List<By> quizHeaderLocators;
    private List<By> quizTitleLocators;
    private List<By> quizSubtitleLocators;
    private List<By> quizDurationLocators;
    private List<By> additionalResourcesHeaderLocators;
    private List<By> resourceLinkLocators;
    private List<By> quizReadyTitleLocators;
    private List<By> quizReadyMessageLocators;
    private List<By> cancelButtonLocators;
    private List<By> confirmButtonLocators;


    public AgeAppropriatePlay(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            titleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Age-Appropriate Play']")
            );
            overviewHeaderLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Overview']")
            );
            overviewBodyLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[contains(@name,'Selecting the right toys')]")
            );
            lessonsHeaderLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Lessons']")
            );
            quizCardLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Test your knowledge, Ready to take the quiz?, 2 minutes']")
            );
            quizHeaderLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Quiz']")
            );
            quizTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Test your knowledge']")
            );
            quizSubtitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Ready to take the quiz?']")
            );
            quizDurationLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='2 minutes']")
            );
            additionalResourcesHeaderLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[contains(@name,'Additional Resources')]")
            );
            resourceLinkLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Babysitting Classes & Child Care Courses']")
            );
            quizReadyTitleLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Ready to take the quiz?']")
            );
            quizReadyMessageLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[contains(@name,'You haven’t completed all the lessons')]")
            );
            cancelButtonLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Cancel']")
            );
            confirmButtonLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Yes, I’m ready']")
            );
        } else {
            titleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title' and @text='Age-Appropriate Play']")
            );
            overviewHeaderLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/overview_title' and @text='Overview']")
            );
            overviewBodyLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/overview_body']")
            );
            lessonsHeaderLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/lessons_title' and @text='Lessons']")
            );
            quizCardLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/main_card'")
            );
            quizHeaderLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title' and @text='Quiz']")
            );
            quizTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/card_title' and @text='Test your knowledge']")
            );
            quizSubtitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/card_subtitle' and @text='Ready to take the quiz?']")
            );
            quizDurationLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/card_duration']")
            );
            additionalResourcesHeaderLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/text_section_name' and contains(@text,'Additional Resources')]")
            );
            resourceLinkLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/chevron_link_title' and contains(@text,'Babysitting Classes')]")
            );
            quizReadyTitleLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/alertTitle' and @text='Ready to take the quiz?']")
            );
            quizReadyMessageLocators = List.of(
                    By.xpath("//*[@resource-id='android:id/message' and contains(@text,'You haven’t completed all the lessons')]")
            );
            cancelButtonLocators = List.of(
                    By.xpath("//*[@resource-id='android:id/button2' and @text='CANCEL']")
            );
            confirmButtonLocators = List.of(
                    By.xpath("//*[@resource-id='android:id/button1' and @text='YES, I’M READY']")
            );
        }
    }

    // Title
    public boolean isTitleVisible() {
        return isVisible(titleLocators);
    }

    // Overview
    public boolean isOverviewHeaderVisible() {
        return isVisible(overviewHeaderLocators);
    }
    public boolean isOverviewBodyVisible() {
        return isVisible(overviewBodyLocators);
    }

    // Lessons
    public boolean isLessonsHeaderVisible() {
        return isVisible(lessonsHeaderLocators);
    }

    // Quiz Section
    public boolean isQuizHeaderVisible() {
        return isVisible(quizHeaderLocators);
    }
    public boolean isQuizTitleVisible() {
        return isVisible(quizTitleLocators);
    }
    public boolean isQuizSubtitleVisible() {
        return isVisible(quizSubtitleLocators);
    }
    public boolean isQuizDurationVisible() {
        return isVisible(quizDurationLocators);
    }

    // Quiz Card
    public boolean isQuizCardVisible() {
        return isVisible(quizCardLocators);
    }
    public void tapQuizCard() {
        waitForSeconds(1);
        tap(quizCardLocators);
    }
    public void scrollToFirstVisibleQuizCard() {
        scrollToFirstVisible(quizCardLocators);
    }

    // Additional Resources
    public boolean isAdditionalResourcesHeaderVisible() {
        return isVisible(additionalResourcesHeaderLocators);
    }
    public boolean isResourceLinkVisible() {
        return isVisible(resourceLinkLocators);
    }

    public void scrollToFirstVisibleAdditionalResourcesHeader() {
        scrollToFirstVisible(additionalResourcesHeaderLocators);
    }

    // Quiz Ready Title
    public boolean isQuizReadyTitleVisible() {
        return isVisible(quizReadyTitleLocators);
    }

    // Quiz Ready Message
    public boolean isQuizReadyMessageVisible() {
        return isVisible(quizReadyMessageLocators);
    }

    // Cancel Button
    public boolean isCancelButtonVisible() {
        return isVisible(cancelButtonLocators);
    }
    public void tapCancelButton() {
        tap(cancelButtonLocators);
    }

    // Confirm Button
    public boolean isConfirmButtonVisible() {
        return isVisible(confirmButtonLocators);
    }
    public void tapConfirmButton() {
        tap(confirmButtonLocators);
    }
}
