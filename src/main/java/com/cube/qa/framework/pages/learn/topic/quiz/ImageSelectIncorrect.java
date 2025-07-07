package com.cube.qa.framework.pages.learn.topic.quiz;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;

import java.util.List;

public class ImageSelectIncorrect extends BasePage {

    private List<By> incorrectMessageLocators;
    private List<By> incorrectSubtextLocators;
    private List<By> finishButtonLocators;
    private List<By> closeButtonLocators;

    public ImageSelectIncorrect(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            incorrectMessageLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='INCORRECT']")
            );
            incorrectSubtextLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Close, but not quite!']")
            );
            finishButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Finish']")
            );
            closeButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='_GENERAL_DISMISS']")
            );

        } else {
            incorrectMessageLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title' and @text='INCORRECT']")
            );
            incorrectSubtextLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/body' and @text='Close, but not quite!']")
            );
            finishButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/next_btn']")
            );
            closeButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/close_button']")
            );
        }
    }

    // Incorrect Message
    public boolean isIncorrectMessageVisible() {
        return isVisible(incorrectMessageLocators);
    }

    // Incorrect Subtext
    public boolean isIncorrectSubtextVisible() {
        return isVisible(incorrectSubtextLocators);
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