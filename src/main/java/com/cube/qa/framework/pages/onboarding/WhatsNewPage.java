package com.cube.qa.framework.pages;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class WhatsNewPage extends BasePage {

    private List<By> headerTitleLocators;
    private List<By> learnFeatureTitleLocators;
    private List<By> learnFeatureBodyLocators;
    private List<By> quizFeatureTitleLocators;
    private List<By> quizFeatureBodyLocators;
    private List<By> achievementsFeatureTitleLocators;
    private List<By> achievementsFeatureBodyLocators;
    private List<By> recordsFeatureTitleLocators;
    private List<By> recordsFeatureBodyLocators;
    private List<By> continueButtonLocators;

    public WhatsNewPage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            headerTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Welcome to the Child Care App']")
            );
            learnFeatureTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Learn Essential Skills ']")
            );
            learnFeatureBodyLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Access a variety of caregiving and first aid knowledge!']")
            );
            quizFeatureTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Take Quizzes']")
            );
            quizFeatureBodyLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Refresh your knowledge with quick quizzes.']")
            );
            achievementsFeatureTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Earn Achievements']")
            );
            achievementsFeatureBodyLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Share your accomplishments with others! ']")
            );
            recordsFeatureTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Records']")
            );
            recordsFeatureBodyLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Manage important details for the children in your care.']")
            );
            continueButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Continue']")
            );
        } else {
            headerTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/text_title']")
            );
            learnFeatureTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/item_learn']//*[@resource-id='com.cube.arc.childcare:id/text_feature_title']")
            );
            learnFeatureBodyLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/item_learn']//*[@resource-id='com.cube.arc.childcare:id/text_feature_body']")
            );
            quizFeatureTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/item_quizzes']//*[@resource-id='com.cube.arc.childcare:id/text_feature_title']")
            );
            quizFeatureBodyLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/item_quizzes']//*[@resource-id='com.cube.arc.childcare:id/text_feature_body']")
            );
            achievementsFeatureTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/item_achievements']//*[@resource-id='com.cube.arc.childcare:id/text_feature_title']")
            );
            achievementsFeatureBodyLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/item_achievements']//*[@resource-id='com.cube.arc.childcare:id/text_feature_body']")
            );
            recordsFeatureTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/item_records']//*[@resource-id='com.cube.arc.childcare:id/text_feature_title']")
            );
            recordsFeatureBodyLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/item_records']//*[@resource-id='com.cube.arc.childcare:id/text_feature_body']")
            );
            continueButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/button_continue']")
            );
        }
    }

    // Header
    public boolean isHeaderTitleVisible() {
        return isVisible(headerTitleLocators);
    }

    // Learn Feature
    public boolean isLearnFeatureTitleVisible() {
        return isVisible(learnFeatureTitleLocators);
    }
    public boolean hasLearnFeatureBodyText(String text) {
        return hasText(learnFeatureBodyLocators, text);
    }

    // Quiz Feature
    public boolean isQuizFeatureTitleVisible() {
        return isVisible(quizFeatureTitleLocators);
    }
    public boolean hasQuizFeatureBodyText(String text) {
        return hasText(quizFeatureBodyLocators, text);
    }

    // Achievements Feature
    public boolean isAchievementsFeatureTitleVisible() {
        return isVisible(achievementsFeatureTitleLocators);
    }
    public boolean hasAchievementsFeatureBodyText(String text) {
        return hasText(achievementsFeatureBodyLocators, text);
    }

    // Records Feature
    public boolean isRecordsFeatureTitleVisible() {
        return isVisible(recordsFeatureTitleLocators);
    }
    public boolean hasRecordsFeatureBodyText(String text) {
        return hasText(recordsFeatureBodyLocators, text);
    }

    // Continue Button
    public boolean isContinueButtonVisible() {
        return isVisible(continueButtonLocators);
    }
    public void tapContinueButton() {
        tap(continueButtonLocators);
    }
} 
