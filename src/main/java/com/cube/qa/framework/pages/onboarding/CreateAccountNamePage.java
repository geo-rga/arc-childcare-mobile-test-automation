package com.cube.qa.framework.pages.onboarding;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;

import java.util.List;

public class CreateAccountNamePage extends BasePage {

    private List<By> nameTitleLocators;
    private List<By> firstNameInputLocators;
    private List<By> lastNameInputLocators;
    private List<By> continueButtonLocators;
    private List<By> helpTextLocators;
    private List<By> firstNameErrorLocators;
    private List<By> lastNameErrorLocators;

    public CreateAccountNamePage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            nameTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name=\"What's your name?\"]")
            );
            firstNameInputLocators = List.of(
                    By.xpath("//XCUIElementTypeTextField[@value='First Name']")
            );
            lastNameInputLocators = List.of(
                    By.xpath("//XCUIElementTypeTextField[@value='Last Name']")
            );
            continueButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='CONTINUE']")
            );
            helpTextLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Enter your full first name as it appears on official documents.']")
            );
            firstNameErrorLocators = List.of();
            lastNameErrorLocators = List.of();

        } else {
            nameTitleLocators = List.of(
                By.xpath("//*[@text=\"What's your name?\"]")
            );
            firstNameInputLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/first_name']")
            );
            lastNameInputLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/last_name']")
            );
            continueButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/continue_button']")
            );
            helpTextLocators = List.of(
                By.xpath("//*[@text='Enter your full first name as it appears on official documents.']")
            );
            firstNameErrorLocators = List.of(
                By.xpath("//*[@text='Invalid first name']")
            );
            lastNameErrorLocators = List.of(
                By.xpath("//*[@text='Invalid last name']")
            );
        }
    }

    // Name Title
    public boolean isNameTitleVisible() {
        return isVisible(nameTitleLocators);
    }

    // First Name Input
    public boolean isFirstNameInputVisible() {
        return isVisible(firstNameInputLocators);
    }
    public void enterFirstName(String text) {
        enterText(firstNameInputLocators, text);
    }
    public void clearFirstName() {
        clear(firstNameInputLocators);
    }

    // Last Name Input
    public boolean isLastNameInputVisible() {
        return isVisible(lastNameInputLocators);
    }
    public void enterLastName(String text) {
        enterText(lastNameInputLocators, text);
    }
    public void clearLastName() {
        clear(lastNameInputLocators);
    }

    // Continue Button
    public boolean isContinueButtonVisible() {
        return isVisible(continueButtonLocators);
    }
    public void tapContinueButton() {
        tap(continueButtonLocators);
    }

    // Help Text
    public boolean isHelpTextVisible() {
        return isVisible(helpTextLocators);
    }

    // First Name Error
    public boolean isFirstNameErrorVisible() {
        return isVisible(firstNameErrorLocators);
    }

    // Last Name Error
    public boolean isLastNameErrorVisible() {
        return isVisible(lastNameErrorLocators);
    }
}
