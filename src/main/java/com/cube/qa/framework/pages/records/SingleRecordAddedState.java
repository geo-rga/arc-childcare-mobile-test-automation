package com.cube.qa.framework.pages.records;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;

import java.util.List;

public class SingleRecordAddedState extends BasePage {

    private List<By> recordsHeaderLocators;
    private List<By> childRecordsTitleLocators;
    private List<By> addRecordButtonLocators;
    private List<By> profileNameLocators;
    private List<By> profileAgeLocators;
    private List<By> profileChevronLocators;
    private List<By> privacyMessageLocators;

    public SingleRecordAddedState(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            recordsHeaderLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Records']")
            );
            childRecordsTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Child Records']")
            );
            addRecordButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Features/Records/Icon/plusIcon']")
            );
            profileNameLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='test']")
            );
            profileAgeLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='--']")
            );
            profileChevronLocators = List.of(
                By.xpath("//XCUIElementTypeImage[@name='Shared/rightChevron']")
            );
            privacyMessageLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[contains(@name,'Information about your child')]")
            );
        } else {
            recordsHeaderLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/toolbar']//android.widget.TextView[@text='Records']")
            );
            childRecordsTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/header' and @text='Child Records']")
            );
            addRecordButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/plus_btn']")
            );
            profileNameLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/profile_name' and @text='test']")
            );
            profileAgeLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/profile_age' and @text='--']")
            );
            profileChevronLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/ic_chevron']")
            );
            privacyMessageLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/warning_banner']")
            );
        }
    }

    // Records Header
    public boolean isRecordsHeaderVisible() {
        return isVisible(recordsHeaderLocators);
    }
    public boolean isRecordsHeaderInvisible() {
        return isInvisible(recordsHeaderLocators);
    }

    // Child Records Title
    public boolean isChildRecordsTitleVisible() {
        return isVisible(childRecordsTitleLocators);
    }
    public boolean isChildRecordsTitleInvisible() {
        return isInvisible(childRecordsTitleLocators);
    }

    // Add Record Button
    public boolean isAddRecordButtonVisible() {
        return isVisible(addRecordButtonLocators);
    }
    public boolean isAddRecordButtonInvisible() {
        return isInvisible(addRecordButtonLocators);
    }
    public void tapAddRecordButton() {
        tap(addRecordButtonLocators);
    }

    // Profile Name
    public boolean isProfileNameVisible() {
        return isVisible(profileNameLocators);
    }
    public boolean isProfileNameInvisible() {
        return isInvisible(profileNameLocators);
    }

    // Profile Age
    public boolean isProfileAgeVisible() {
        return isVisible(profileAgeLocators);
    }
    public boolean isProfileAgeInvisible() {
        return isInvisible(profileAgeLocators);
    }

    // Profile Chevron
    public boolean isProfileChevronVisible() {
        return isVisible(profileChevronLocators);
    }
    public boolean isProfileChevronInvisible() {
        return isInvisible(profileChevronLocators);
    }

    // Privacy Message
    public boolean isPrivacyMessageVisible() {
        return isVisible(privacyMessageLocators);
    }
    public boolean isPrivacyMessageInvisible() {
        return isInvisible(privacyMessageLocators);
    }
}
