package com.cube.qa.framework.pages.learn.topic.lesson;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class LessonPageFive extends BasePage {

    private List<By> paragraphTitleLocators;
    private List<By> paragraphDescriptionLocators;
    private List<By> doneButtonLocators;

    public LessonPageFive(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            paragraphTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Client Expectations']")
            );
            paragraphDescriptionLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[contains(@name,'Some clients might want to know a bit more about you')]")
            );
            doneButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='DONE']")
            );
        } else {
            paragraphTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/paragraph_title' and @text='Client Expectations']")
            );
            paragraphDescriptionLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/paragraph_description' and contains(@text,'Some clients might want to know a bit more about you')]")
            );
            doneButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/done_button' and @text='DONE']")
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

    // Done Button
    public boolean isDoneButtonVisible() {
        return isVisible(doneButtonLocators);
    }
    public void tapDoneButton() {
        tap(doneButtonLocators);
    }
    public void scrollToFirstVisibleDoneButton() {
        scrollToFirstVisible(doneButtonLocators);
    }
}
