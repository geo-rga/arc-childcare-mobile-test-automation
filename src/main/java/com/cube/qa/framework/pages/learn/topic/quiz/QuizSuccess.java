package com.cube.qa.framework.pages.learn.topic.quiz;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;

import java.util.List;

public class QuizSuccess extends BasePage {

    private List<By> congratulationsTitleLocators;
    private List<By> descriptionTextLocators;
    private List<By> shareButtonLocators;
    private List<By> doneButtonLocators;

    public QuizSuccess(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            congratulationsTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Congratulations!']")
            );
            descriptionTextLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='You passed the Expectations, Skills and Qualifications test and unlocked the corresponding badge.']")
            );
            shareButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='SHARE ACHIEVEMENT']")
            );
            doneButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Done']")
            );

        } else {
            congratulationsTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/badge_title' and @text='Congratulations!']")
            );
            descriptionTextLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/win_description']")
            );
            shareButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/share']")
            );
            doneButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/done']")
            );
        }
    }

    // Congratulations Title
    public boolean isCongratulationsTitleVisible() {
        return isVisible(congratulationsTitleLocators);
    }

    // Description Text
    public boolean isDescriptionTextVisible() {
        return isVisible(descriptionTextLocators);
    }

    // Share Button
    public boolean isShareButtonVisible() {
        return isVisible(shareButtonLocators);
    }
    public void tapShareButton() {
        waitForSeconds(1);
        tap(shareButtonLocators);
    }

    // Done Button
    public boolean isDoneButtonVisible() {
        return isVisible(doneButtonLocators);
    }
    public void tapDoneButton() {
        waitForSeconds(1);
        tap(doneButtonLocators);
    }
}
