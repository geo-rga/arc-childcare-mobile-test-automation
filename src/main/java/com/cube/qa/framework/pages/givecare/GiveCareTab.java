package com.cube.qa.framework.pages.givecare;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class GiveCareTab extends BasePage {

    private List<By> moreButtonLocators;
    private List<By> headerTitleLocators;
    private List<By> call911ButtonLocators;
    private List<By> emergencyNumberTitleLocators;
    private List<By> emergencyServicesTitleLocators;
    private List<By> emergencyServicesSubtitleLocators;
    private List<By> firstTopicButtonLocators;

    public GiveCareTab(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            moreButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='More']")
            );
            headerTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Give Care']")
            );
            call911ButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Call 911']")
            );
            emergencyNumberTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Emergency Number']")
            );
            emergencyServicesTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Emergency Services']")
            );
            emergencyServicesSubtitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Call this number if emergency services are required.']")
            );
            firstTopicButtonLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Cardiac Arrest (CPR/AED)']")
            );

        } else {
            moreButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/more_btn']")
            );
            headerTitleLocators = List.of(
                By.xpath("//android.widget.TextView[@text='Give Care']")
            );
            call911ButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/call_911_btn']")
            );
            emergencyNumberTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/emergency_number_title']")
            );
            emergencyServicesTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/emergency_services_title']")
            );
            emergencyServicesSubtitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/emergency_services_subtitle']")
            );
            firstTopicButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/chevron_link_title' and @text='Cardiac Arrest (CPR/AED)']")
            );
        }
    }

    // More Button
    public boolean isMoreButtonVisible() {
        return isVisible(moreButtonLocators);
    }
    public void tapMoreButton() {
        tap(moreButtonLocators);
    }

    // Header Title
    public boolean isHeaderTitleVisible() {
        return isVisible(headerTitleLocators);
    }
    public boolean hasHeaderTitleText(String text) {
        return hasText(headerTitleLocators, text);
    }

    // Call 911 Button
    public boolean isCall911ButtonVisible() {
        return isVisible(call911ButtonLocators);
    }
    public void tapCall911Button() {
        tap(call911ButtonLocators);
    }

    // Emergency Number Title
    public boolean isEmergencyNumberTitleVisible() {
        return isVisible(emergencyNumberTitleLocators);
    }

    // Emergency Services Title
    public boolean isEmergencyServicesTitleVisible() {
        return isVisible(emergencyServicesTitleLocators);
    }

    // Emergency Services Subtitle
    public boolean isEmergencyServicesSubtitleVisible() {
        return isVisible(emergencyServicesSubtitleLocators);
    }

    // First Topic Button
    public boolean isFirstTopicButtonVisible() {
        return isVisible(firstTopicButtonLocators);
    }
    public void tapFirstTopicButton() {
        tap(firstTopicButtonLocators);
    }
} 
