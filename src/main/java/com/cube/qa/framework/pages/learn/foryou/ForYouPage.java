package com.cube.qa.framework.pages.learn.foryou;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class ForYouPage extends BasePage {

    private List<By> forYouTitleLocators;
    private List<By> welcomeTitleLocators;
    private List<By> welcomeSubtitleLocators;
    private List<By> tryNewTopicTitleLocators;
    private List<By> expectationsTopicLocators;
    private List<By> leadershipTopicLocators;
    private List<By> safetyTopicLocators;
    private List<By> germControlTopicLocators;
    private List<By> jumpToQuizTitleLocators;
    private List<By> quizExpectationsTopicLocators;
    private List<By> quizLeadershipTopicLocators;

    public ForYouPage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            forYouTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='For You']")
            );
            welcomeTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Welcome to Your Personalized Journey!']")
            );
            welcomeSubtitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[contains(@name, 'Here, you\'ll discover')]")
            );
            tryNewTopicTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Try a New Topic']")
            );
            expectationsTopicLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Expectations, Skills and Qualifications'][2]")
            );
            leadershipTopicLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Leadership Skills'][2]")
            );
            safetyTopicLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='A+ Safety: Inside ']")
            );
            germControlTopicLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Germ Control ']")
            );
            jumpToQuizTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Jump into a new quiz']")
            );
            quizExpectationsTopicLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Expectations, Skills and Qualifications'][2]")
            );
            quizLeadershipTopicLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Leadership Skills'][2]")
            );

        } else {
            forYouTitleLocators = List.of(
                By.xpath("//*[@text='For You']")
            );
            welcomeTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title' and @text='Welcome to Your Personalized Journey!']")
            );
            welcomeSubtitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/subtitle']")
            );
            tryNewTopicTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title' and @text='Try a New Topic']")
            );
            expectationsTopicLocators = List.of(
                By.xpath("//*[@content-desc='Expectations, Skills and Qualifications. Incomplete']")
            );
            leadershipTopicLocators = List.of(
                By.xpath("//*[@content-desc='Leadership Skills. Incomplete']")
            );
            safetyTopicLocators = List.of(
                By.xpath("//*[@content-desc='A+ Safety: Inside . Incomplete']")
            );
            germControlTopicLocators = List.of(
                By.xpath("//*[@content-desc='Germ Control . Incomplete']")
            );
            jumpToQuizTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title' and @text='Jump into a new quiz']")
            );
            quizExpectationsTopicLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title' and @text='Expectations, Skills and Qualifications']")
            );
            quizLeadershipTopicLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title' and @text='Leadership Skills']")
            );
        }
    }

    // For You Title
    public boolean isForYouTitleVisible() {
        return isVisible(forYouTitleLocators);
    }

    // Welcome Title
    public boolean isWelcomeTitleVisible() {
        return isVisible(welcomeTitleLocators);
    }
    public boolean hasWelcomeTitleText(String text) {
        return hasText(welcomeTitleLocators, text);
    }

    // Welcome Subtitle
    public boolean isWelcomeSubtitleVisible() {
        return isVisible(welcomeSubtitleLocators);
    }
    public boolean hasWelcomeSubtitleText(String text) {
        return hasText(welcomeSubtitleLocators, text);
    }

    // Try a New Topic Title
    public boolean isTryNewTopicTitleVisible() {
        return isVisible(tryNewTopicTitleLocators);
    }
    public boolean hasTryNewTopicTitleText(String text) {
        return hasText(tryNewTopicTitleLocators, text);
    }

    // Expectations Topic
    public boolean isExpectationsTopicVisible() {
        return isVisible(expectationsTopicLocators);
    }
    public void tapExpectationsTopic() {
        tap(expectationsTopicLocators);
    }

    // Leadership Topic
    public boolean isLeadershipTopicVisible() {
        return isVisible(leadershipTopicLocators);
    }
    public void tapLeadershipTopic() {
        tap(leadershipTopicLocators);
    }

    // Safety Topic
    public boolean isSafetyTopicVisible() {
        return isVisible(safetyTopicLocators);
    }
    public void tapSafetyTopic() {
        tap(safetyTopicLocators);
    }

    // Germ Control Topic
    public boolean isGermControlTopicVisible() {
        return isVisible(germControlTopicLocators);
    }
    public void tapGermControlTopic() {
        tap(germControlTopicLocators);
    }

    // Jump into a New Quiz Title
    public boolean isJumpToQuizTitleVisible() {
        return isVisible(jumpToQuizTitleLocators);
    }
    public boolean hasJumpToQuizTitleText(String text) {
        return hasText(jumpToQuizTitleLocators, text);
    }
    public void scrollToQuizTitle() { scrollToFirstVisible(jumpToQuizTitleLocators);}

    // Quiz - Expectations Topic
    public boolean isQuizExpectationsTopicVisible() {
        return isVisible(quizExpectationsTopicLocators);
    }
    public void tapQuizExpectationsTopic() {
        tap(quizExpectationsTopicLocators);
    }

    // Quiz - Leadership Topic
    public boolean isQuizLeadershipTopicVisible() {
        return isVisible(quizLeadershipTopicLocators);
    }
    public void tapQuizLeadershipTopic() {
        tap(quizLeadershipTopicLocators);
    }
}
