package com.cube.qa.framework.pages.onboarding;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;

import java.util.List;

public class CreateAccountPasswordPage extends BasePage {

    private List<By> passwordTitleLocators;
    private List<By> passwordInputFieldLocators;
    private List<By> passwordRequirementTextLocators;
    private List<By> continueButtonLocators;

    public CreateAccountPasswordPage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            passwordTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Choose a Password']")
            );
            passwordInputFieldLocators = List.of(
                By.xpath("//XCUIElementTypeSecureTextField[@value='Password']")
            );
            passwordRequirementTextLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[contains(@name, 'Passwords must be at least')]")
            );
            continueButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='CONTINUE']")
            );
        } else {
            passwordTitleLocators = List.of(
                By.xpath("//*[@text='Choose a Password']")
            );
            passwordInputFieldLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/password']")
            );
            passwordRequirementTextLocators = List.of(
                By.xpath("//*[contains(@text, 'Passwords must be at least')]")
            );
            continueButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/continue_button']")
            );
        }
    }

    // Password Title
    public boolean isPasswordTitleVisible() {
        return isVisible(passwordTitleLocators);
    }

    // Password Input
    public boolean isPasswordInputFieldVisible() {
        return isVisible(passwordInputFieldLocators);
    }
    public void enterPassword(String password) {
        enterText(passwordInputFieldLocators, password);
    }
    public void clearPassword() {
        clear(passwordInputFieldLocators);
    }

    // Password Requirements
    public boolean isPasswordRequirementTextVisible() {
        return isVisible(passwordRequirementTextLocators);
    }

    // Continue Button
    public boolean isContinueButtonVisible() {
        return isVisible(continueButtonLocators);
    }
    public void tapContinueButton() {
        tap(continueButtonLocators);
    }
}