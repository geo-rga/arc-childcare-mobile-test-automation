package com.cube.qa.framework.pages.learn.topic.lesson;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class LessonPageTwo extends BasePage {

    private List<By> paragraphTitleLocators;
    private List<By> paragraphDescriptionLocators;
    private List<By> closeButtonLocators;

    public LessonPageTwo(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            paragraphTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Checking In']")
            );
            paragraphDescriptionLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[contains(@name,'Start by understanding your limits and setting clear boundaries')]")
            );
            closeButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='navigationBarDismiss']")
            );
        } else {
            paragraphTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/paragraph_title' and @text='Checking In']")
            );
            paragraphDescriptionLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/paragraph_description' and contains(@text,'Start by understanding your limits and setting clear boundaries')]")
            );
            closeButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/close_button']")
            );
        }
    }

    // Paragraph Title
    public boolean isParagraphTitleVisible() {
        return isVisible(paragraphTitleLocators);
    }
    public void scrollToFirstVisibleParagraphTitle() {
        scrollToFirstVisible(paragraphTitleLocators);
    }

    // Paragraph Description
    public boolean isParagraphDescriptionVisible() {
        return isVisible(paragraphDescriptionLocators);
    }
    public void scrollToFirstVisibleParagraphDescription() {
        scrollToFirstVisible(paragraphDescriptionLocators);
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
