package com.cube.qa.framework.pages.learn.foryou;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class PersonalisationCompletePage extends BasePage {

    private List<By> completionTitleLocators;
    private List<By> completionMessageLocators;
    private List<By> doneButtonLocators;
    private List<By> takeMeToMyPageButtonLocators;
    private List<By> backToLearnButtonLocators;

    public PersonalisationCompletePage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            completionTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='We’ve got all we need']")
            );
            completionMessageLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[contains(@name, 'Based on your answers')]")
            );
            doneButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Done']")
            );
            takeMeToMyPageButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Take me to my page']")
            );
            backToLearnButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='BACK TO LEARN']")
            );
        } else {
            completionTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title' and @text='We’ve got all we need']")
            );
            completionMessageLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/subtitle']")
            );
            doneButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/done']")
            );
            takeMeToMyPageButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/cta_to_my_page']")
            );
            backToLearnButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/cta_to_learn']")
            );
        }
    }

    // Completion Title
    public boolean isCompletionTitleVisible() {
        return isVisible(completionTitleLocators);
    }
    public boolean hasCompletionTitleText(String text) {
        return hasText(completionTitleLocators, text);
    }

    // Completion Message
    public boolean isCompletionMessageVisible() {
        return isVisible(completionMessageLocators);
    }
    public boolean hasCompletionMessageText(String text) {
        return hasText(completionMessageLocators, text);
    }

    // Done Button
    public boolean isDoneButtonVisible() {
        return isVisible(doneButtonLocators);
    }
    public void tapDoneButton() {
        tap(doneButtonLocators);
    }

    // Take Me to My Page Button
    public boolean isTakeMeToMyPageButtonVisible() {
        return isVisible(takeMeToMyPageButtonLocators);
    }
    public void tapTakeMeToMyPageButton() {
        tap(takeMeToMyPageButtonLocators);
    }

    // Back to Learn Button
    public boolean isBackToLearnButtonVisible() {
        return isVisible(backToLearnButtonLocators);
    }
    public void tapBackToLearnButton() {
        tap(backToLearnButtonLocators);
    }
}
