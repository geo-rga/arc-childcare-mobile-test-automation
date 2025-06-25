package com.cube.qa.framework.pages.onboarding;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class TermsOfServicePage extends BasePage {

    private List<By> screenTitleLocators;
    private List<By> dismissButtonLocators;
    private List<By> headerTextLocators;
    private List<By> bodyTextLocators;
    private List<By> privacyPolicyTextLocators;
    private List<By> acceptAndContinueButtonLocators;

    public TermsOfServicePage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            screenTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Terms of Service']")
            );
            dismissButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='_GENERAL_DISMISS']")
            );
            headerTextLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Please Review Our Terms']")
            );
            bodyTextLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[contains(@name,'American Red Cross does not provide medical advice')]")
            );
            privacyPolicyTextLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[contains(@name,'Privacy Policy')]")
            );
            acceptAndContinueButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Accept and Continue']")
            );

        } else {
            screenTitleLocators = List.of(
                By.xpath("//*[@text='Terms of Service']")
            );
            dismissButtonLocators = List.of(); // Not present on Android
            headerTextLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/text_title']")
            );
            bodyTextLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/text_body']")
            );
            privacyPolicyTextLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/text_privacy']")
            );
            acceptAndContinueButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/button_accept']")
            );
        }
    }

    // Screen Title
    public boolean isScreenTitleVisible() {
        return isVisible(screenTitleLocators);
    }

    // Dismiss Button (iOS only)
    public boolean isDismissButtonVisible() {
        return isVisible(dismissButtonLocators);
    }
    public void tapDismissButton() {
        tap(dismissButtonLocators);
    }

    // Header Text
    public boolean isHeaderTextVisible() {
        return isVisible(headerTextLocators);
    }
    public boolean hasHeaderText(String text) {
        return hasText(headerTextLocators, text);
    }

    // Body Text
    public boolean isBodyTextVisible() {
        return isVisible(bodyTextLocators);
    }
    public boolean hasBodyText(String text) {
        return hasText(bodyTextLocators, text);
    }

    // Privacy Policy Text
    public boolean isPrivacyPolicyTextVisible() {
        return isVisible(privacyPolicyTextLocators);
    }
    public boolean hasPrivacyPolicyText(String text) {
        return hasText(privacyPolicyTextLocators, text);
    }

    // Accept and Continue Button
    public boolean isAcceptAndContinueButtonVisible() {
        return isVisible(acceptAndContinueButtonLocators);
    }
    public void tapAcceptAndContinueButton() {
        tap(acceptAndContinueButtonLocators);
    }
} 
