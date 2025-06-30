package com.cube.qa.framework.pages.learn.topic.lesson;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class LessonOverlay extends BasePage {

    private List<By> overlayMessageLocators;
    private List<By> closeButtonLocators;

    public LessonOverlay(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            overlayMessageLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Swipe left and right to view lesson cards']")
            );
            closeButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='navigationBarDismiss']")
            );
        } else {
            overlayMessageLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/tutorial_title' and @text='Swipe left and right to view lesson cards']")
            );
            closeButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/close_button']")
            );
        }
    }

    // Overlay Message
    public boolean isOverlayMessageVisible() {
        return isVisible(overlayMessageLocators);
    }
    public void tapDismissOverlay(){tap(overlayMessageLocators);}
    public void scrollToFirstVisibleOverlayMessage() {
        scrollToFirstVisible(overlayMessageLocators);
    }

    // Close Button
    public boolean isCloseButtonVisible() {
        return isVisible(closeButtonLocators);
    }
    public void tapCloseButton() {
        tap(closeButtonLocators);
    }
    public void scrollToFirstVisibleCloseButton() {
        scrollToFirstVisible(closeButtonLocators);
    }
}
