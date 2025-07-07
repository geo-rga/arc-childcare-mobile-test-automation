package com.cube.qa.framework.pages.learn.topic.quiz;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;

import java.util.List;

public class TextSelectCorrect extends BasePage {

    private List<By> correctMessageLocators;
    private List<By> nextButtonLocators;
    private List<By> closeButtonLocators;

    public TextSelectCorrect(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            correctMessageLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='CORRECT!']")
            );
            nextButtonLocators = List.of(
                By.xpath("(//XCUIElementTypeButton[@name=\"Next\"])[2]")
            );
            closeButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='_GENERAL_DISMISS']")
            );

        } else {
            correctMessageLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title' and @text='CORRECT!']")
            );
            nextButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/next_btn']")
            );
            closeButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/close_button']")
            );
        }
    }

    // Correct Message
    public boolean isCorrectMessageVisible() {
        return isVisible(correctMessageLocators);
    }

    // Next Button
    public boolean isNextButtonVisible() {
        return isVisible(nextButtonLocators);
    }
    public void tapNextButton() {
        waitForSeconds(1);
        tap(nextButtonLocators);
    }

    // Close Button
    public boolean isCloseButtonVisible() {
        return isVisible(closeButtonLocators);
    }
    public void tapCloseButton() {
        tap(closeButtonLocators);
    }
} 
