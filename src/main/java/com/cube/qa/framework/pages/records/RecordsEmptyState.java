package com.cube.qa.framework.pages.records;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;

import java.util.List;

public class RecordsEmptyState extends BasePage {

    private List<By> recordsTitleLocators;
    private List<By> getStartedTitleLocators;
    private List<By> getStartedSubtitleLocators;
    private List<By> addChildRecordButtonLocators;
    private List<By> privacyMessageLocators;
    private List<By> moreButtonLocators;

    public RecordsEmptyState(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            recordsTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Records']")
            );
            getStartedTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Get Started.']")
            );
            getStartedSubtitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[contains(@name,'You don\'t have any child records')]")
            );
            addChildRecordButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Add Child Record']")
            );
            privacyMessageLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[contains(@name,'Information about your child')]")
            );
            moreButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='More']")
            );
        } else {
            recordsTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/empty_header' and @text='Child Records']")
            );
            getStartedTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/get_started_title' and @text='Get Started.']")
            );
            getStartedSubtitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/get_started_subtitle' and contains(@text,'You don\'t have any child records')]")
            );
            addChildRecordButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/create_child_record_btn' and @text='ADD CHILD RECORD']")
            );
            privacyMessageLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/warning_banner' and contains(@text,'Information about your child')]")
            );
            moreButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/more_btn']")
            );
        }
    }

    // Records Title
    public boolean isRecordsTitleVisible() {
        return isVisible(recordsTitleLocators);
    }

    // Get Started Title
    public boolean isGetStartedTitleVisible() {
        return isVisible(getStartedTitleLocators);
    }

    // Get Started Subtitle
    public boolean isGetStartedSubtitleVisible() {
        return isVisible(getStartedSubtitleLocators);
    }

    // Add Child Record Button
    public boolean isAddChildRecordButtonVisible() {
        return isVisible(addChildRecordButtonLocators);
    }
    public void tapAddChildRecordButton() {
        tap(addChildRecordButtonLocators);
    }

    // Privacy Message
    public boolean isPrivacyMessageVisible() {
        return isVisible(privacyMessageLocators);
    }

    // More Button
    public boolean isMoreButtonVisible() {
        return isVisible(moreButtonLocators);
    }
    public void tapMoreButton() {
        tap(moreButtonLocators);
    }
}
