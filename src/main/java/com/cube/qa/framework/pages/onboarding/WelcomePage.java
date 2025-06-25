package com.cube.qa.framework.pages.onboarding;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class WelcomePage extends BasePage {

    private List<By> titleTextLocators;
    private List<By> subtitleTextLocators;
    private List<By> signInButtonLocators;
    private List<By> continueAsGuestButtonLocators;

    public WelcomePage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            titleTextLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Child Care']")
            );
            subtitleTextLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Simple and Safe Care']")
            );
            signInButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Sign in']")
            );
            continueAsGuestButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Continue As Guest']")
            );

        } else {
            titleTextLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/text_title']")
            );
            subtitleTextLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/text_subtitle']")
            );
            signInButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/cta_sign_in']")
            );
            continueAsGuestButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/cta_guest']")
            );
        }
    }

    // Title Text
    public boolean isTitleTextVisible() {
        return isVisible(titleTextLocators);
    }
    public boolean hasTitleText(String text) {
        return hasText(titleTextLocators, text);
    }

    // Subtitle Text
    public boolean isSubtitleTextVisible() {
        return isVisible(subtitleTextLocators);
    }
    public boolean hasSubtitleText(String text) {
        return hasText(subtitleTextLocators, text);
    }

    // Sign In Button
    public boolean isSignInButtonVisible() {
        return isVisible(signInButtonLocators);
    }
    public void tapSignInButton() {
        tap(signInButtonLocators);
    }

    // Continue As Guest Button
    public boolean isContinueAsGuestButtonVisible() {
        return isVisible(continueAsGuestButtonLocators);
    }
    public void tapContinueAsGuestButton() {
        tap(continueAsGuestButtonLocators);
    }
} 
