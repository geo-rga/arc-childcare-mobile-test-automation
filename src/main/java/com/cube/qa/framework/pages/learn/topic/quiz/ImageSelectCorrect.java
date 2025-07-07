package com.cube.qa.framework.pages.learn.topic.quiz;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;

import java.util.List;

public class ImageSelectCorrect extends BasePage {

    private List<By> correctMessageLocators;
    private List<By> finishButtonLocators;
    private List<By> closeButtonLocators;

    public ImageSelectCorrect(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            correctMessageLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='CORRECT!']")
            );
            finishButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Finish']")
            );
            closeButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='_GENERAL_DISMISS']")
            );

        } else {
            correctMessageLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title' and @text='CORRECT!']")
            );
            finishButtonLocators = List.of(
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

    // Finish Button
    public boolean isFinishButtonVisible() {
        return isVisible(finishButtonLocators);
    }
    public void tapFinishButton() {
        tap(finishButtonLocators);
    }

    // Close Button
    public boolean isCloseButtonVisible() {
        return isVisible(closeButtonLocators);
    }
    public void tapCloseButton() {
        tap(closeButtonLocators);
    }
} 
