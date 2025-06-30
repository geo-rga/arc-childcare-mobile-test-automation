package com.cube.qa.framework.pages.learn.topic.lesson;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class LessonPageThree extends BasePage {

    private List<By> paragraphTitleLocators;
    private List<By> paragraphDescriptionLocators;
    private List<By> closeButtonLocators;

    public LessonPageThree(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            paragraphTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Assessing Your Skills']")
            );
            paragraphDescriptionLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[contains(@name,'To become a safe and successful babysitter, assess your skills and strengths')]")
            );
            closeButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='navigationBarDismiss']")
            );
        } else {
            paragraphTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/paragraph_title' and @text='Assessing Your Skills']")
            );
            paragraphDescriptionLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/paragraph_description' and contains(@text,'To become a safe and successful babysitter, assess your skills and strengths')]")
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
