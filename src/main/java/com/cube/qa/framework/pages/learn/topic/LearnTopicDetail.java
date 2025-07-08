package com.cube.qa.framework.pages.learn.topic;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class LearnTopicDetail extends BasePage {

    private List<By> topicTitleLocators;
    private List<By> overviewTitleLocators;
    private List<By> overviewBodyLocators;
    private List<By> lessonsHeaderLocators;
    private List<By> lessonCardTitleLocators;
    private List<By> lessonCardDurationLocators;
    private List<By> lessonCardLocators;
    private List<By> quizHeaderLocators;
    private List<By> quizTitleLocators;
    private List<By> quizSubtitleLocators;
    private List<By> quizDurationLocators;
    private List<By> quizCardLocators;
    private List<By> additionalResourcesHeaderLocators;
    private List<By> additionalResourceLinkLocators;

    public LearnTopicDetail(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            topicTitleLocators = List.of(
                    By.xpath("//XCUIElementTypeNavigationBar[@name='Expectations, Skills and Qualifications']")
            );
            overviewTitleLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Overview']")
            );
            overviewBodyLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[contains(@name,'Starting a babysitting business')]")
            );
            lessonsHeaderLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Lessons']")
            );
            lessonCardTitleLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Expectations, Skills and Qualifications']")
            );
            lessonCardDurationLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='5 minutes']")
            );
            lessonCardLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name=\"Expectations, Skills and Qualifications,   , 5 minutes\"]")
            );
            quizHeaderLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Quiz']")
            );
            quizTitleLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Test your knowledge']")
            );
            quizCardLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Test your knowledge, Ready to take the quiz?, 4 minutes']")
            );
            quizSubtitleLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Ready to take the quiz?']")
            );
            quizDurationLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='4 minutes']")
            );
            additionalResourcesHeaderLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Additional Resources ']")
            );
            additionalResourceLinkLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Babysitting Classes & Child Care Courses']")
            );

        } else {
            topicTitleLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/toolbar']//android.widget.TextView[@text='Expectations, Skills and Qualifications']")
            );
            overviewTitleLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/overview_title' and @text='Overview']")
            );
            overviewBodyLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/overview_body' and contains(@text,'Starting a babysitting business')]")
            );
            lessonsHeaderLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/lessons_title' and @text='Lessons']")
            );
            lessonCardTitleLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title' and @text='Expectations, Skills and Qualifications']")
            );
            lessonCardDurationLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/duration' and @text='5 minutes']")
            );
            lessonCardLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/spotlight_container']")
            );
            quizHeaderLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title' and @text='Quiz']")
            );
            quizTitleLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/card_title' and @text='Test your knowledge']")
            );
            quizCardLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/main_card']")
            );
            quizSubtitleLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/card_subtitle' and @text='Ready to take the quiz?']")
            );
            quizDurationLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/card_duration' and @text='4 minutes']")
            );
            additionalResourcesHeaderLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/text_section_name' and @text='Additional Resources ']")
            );
            additionalResourceLinkLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/chevron_link_title' and @text='Babysitting Classes & Child Care Courses']")
            );
        }
    }

    // Topic Title
    public boolean isTopicTitleVisible() {
        return isVisible(topicTitleLocators);
    }
    public void scrollToFirstVisibleTopicTitle() {
        scrollToFirstVisible(topicTitleLocators);
    }

    // Overview Title
    public boolean isOverviewTitleVisible() {
        return isVisible(overviewTitleLocators);
    }
    public void scrollToFirstVisibleOverviewTitle() {
        scrollToFirstVisible(overviewTitleLocators);
    }

    // Overview Body
    public boolean isOverviewBodyVisible() {
        return isVisible(overviewBodyLocators);
    }
    public void scrollToFirstVisibleOverviewBody() {
        scrollToFirstVisible(overviewBodyLocators);
    }

    // Lessons Header
    public boolean isLessonsHeaderVisible() {
        return isVisible(lessonsHeaderLocators);
    }
    public void scrollToFirstVisibleLessonsHeader() {
        scrollToFirstVisible(lessonsHeaderLocators);
    }

    // Lesson Card Title
    public boolean isLessonCardTitleVisible() {
        return isVisible(lessonCardTitleLocators);
    }
    public void tapLessonCardTitle() {
        waitForSeconds(1);
        tap(lessonCardTitleLocators);
    }
    public void scrollToFirstVisibleLessonCardTitle() {
        scrollToFirstVisible(lessonCardTitleLocators);
    }

    // Lesson Card
    public boolean isLessonCardVisible() {
        return isVisible(lessonCardLocators);
    }
    public void tapLessonCard() {
        waitForSeconds(1);
        tap(lessonCardLocators);
    }
    public void scrollToFirstVisibleLessonCard() {
        scrollToFirstVisible(lessonCardLocators);
    }

    // Lesson Card Duration
    public boolean isLessonCardDurationVisible() {
        return isVisible(lessonCardDurationLocators);
    }
    public void scrollToFirstVisibleLessonCardDuration() {
        scrollToFirstVisible(lessonCardDurationLocators);
    }

    // Quiz Header
    public boolean isQuizHeaderVisible() {
        return isVisible(quizHeaderLocators);
    }
    public void scrollToFirstVisibleQuizHeader() {
        scrollToFirstVisible(quizHeaderLocators);
    }

    // Quiz Title
    public boolean isQuizTitleVisible() {
        return isVisible(quizTitleLocators);
    }
    public void tapQuizTitle() {
        waitForSeconds(1);
        tap(quizTitleLocators);
    }
    public void scrollToFirstVisibleQuizTitle() {
        scrollToFirstVisible(quizTitleLocators);
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

    // Quiz Subtitle
    public boolean isQuizSubtitleVisible() {
        return isVisible(quizSubtitleLocators);
    }
    public void scrollToFirstVisibleQuizSubtitle() {
        scrollToFirstVisible(quizSubtitleLocators);
    }

    // Quiz Duration
    public boolean isQuizDurationVisible() {
        return isVisible(quizDurationLocators);
    }
    public void scrollToFirstVisibleQuizDuration() {
        scrollToFirstVisible(quizDurationLocators);
    }

    // Additional Resources Header
    public boolean isAdditionalResourcesHeaderVisible() {
        return isVisible(additionalResourcesHeaderLocators);
    }
    public void scrollToFirstVisibleAdditionalResourcesHeader() {
        scrollToFirstVisible(additionalResourcesHeaderLocators);
    }

    // Additional Resource Link
    public boolean isAdditionalResourceLinkVisible() {
        return isVisible(additionalResourceLinkLocators);
    }
    public void tapAdditionalResourceLink() {
        waitForSeconds(1);
        tap(additionalResourceLinkLocators);
    }
    public void scrollToFirstVisibleAdditionalResourceLink() {
        scrollToFirstVisible(additionalResourceLinkLocators);
    }
}
