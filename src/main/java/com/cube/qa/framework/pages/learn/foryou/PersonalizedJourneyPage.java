package com.cube.qa.framework.pages;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class PersonalizedJourneyPage extends BasePage {

    private List<By> journeyTitleLocators;
    private List<By> journeySubtitleLocators;
    private List<By> beginButtonLocators;

    public PersonalizedJourneyPage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            journeyTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Welcome to Your Personalized Journey!']")
            );
            journeySubtitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name=\"We've crafted a personalized journey to tailor your experience and make it truly unique. We'll be asking a few questions to customize your learning experience, and don't worry—there are no wrong answers.\"]")
            );
            beginButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Begin']")
            );
        } else {
            journeyTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/tv_title']")
            );
            journeySubtitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/tv_description']")
            );
            beginButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/cta_begin']")
            );
        }
    }

    // Journey Title
    public boolean isJourneyTitleVisible() {
        return isVisible(journeyTitleLocators);
    }
    public boolean hasJourneyTitleText(String text) {
        return hasText(journeyTitleLocators, text);
    }

    // Journey Subtitle
    public boolean isJourneySubtitleVisible() {
        return isVisible(journeySubtitleLocators);
    }
    public boolean hasJourneySubtitleText(String text) {
        return hasText(journeySubtitleLocators, text);
    }

    // Begin Button
    public boolean isBeginButtonVisible() {
        return isVisible(beginButtonLocators);
    }
    public void tapBeginButton() {
        tap(beginButtonLocators);
    }
}
