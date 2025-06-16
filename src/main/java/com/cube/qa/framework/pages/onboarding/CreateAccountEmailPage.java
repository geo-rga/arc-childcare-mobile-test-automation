package com.cube.qa.framework.pages.onboarding;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;

import java.util.List;

public class CreateAccountEmailPage extends BasePage {

    private List<By> emailTitleLocators;
    private List<By> emailInputLocators;
    private List<By> continueButtonLocators;
    private List<By> helpTextLocators;
    private List<By> helpSubtextLocators;
    private List<By> invalidEmailErrorLocators;
    private List<By> emailExistsAlertTextLocators;
    private List<By> loginWithExistingAccountTextLocators;
    private List<By> continueCreatingAccountButtonLocators;
    private List<By> loginNowButtonLocators;
    private List<By> forgotLoginDetailsButtonLocators;
    private List<By> cancelButtonLocators;

    public CreateAccountEmailPage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            emailTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name=\"What's your email?\"]")
            );
            emailInputLocators = List.of(
                By.xpath("//XCUIElementTypeTextField")
            );
            continueButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='CONTINUE']")
            );
            helpTextLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[contains(@name,\"If you’re an existing donor\")]")
            );
            helpSubtextLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[contains(@name,\"We'll send you emails\")]")
            );
            invalidEmailErrorLocators = List.of();
            emailExistsAlertTextLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name=\'Your email is already on file. Hit “Continue” to proceed creating your account.\']")
            );
            loginWithExistingAccountTextLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name=\"Or login with your existing redcrossblood.org credentials.\"]")
            );
            continueCreatingAccountButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Continue Creating Account']")
            );
            loginNowButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Login Now']")
            );
            forgotLoginDetailsButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Forgot My Login Details']")
            );
            cancelButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Cancel']")
            );
        } else {
            emailTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/email_title']")
            );
            emailInputLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/email']")
            );
            continueButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/continue_button']")
            );
            helpTextLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/help_text']")
            );
            helpSubtextLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/help_subtext']")
            );
            invalidEmailErrorLocators = List.of(
                By.xpath("//*[@text='Invalid Email']")
            );
            emailExistsAlertTextLocators = List.of(
                By.xpath("//*[contains(@text, 'Your email is already on file')]")
            );
            loginWithExistingAccountTextLocators = List.of(
                By.xpath("//*[contains(@text, 'login with your existing redcrossblood.org credentials')]")
            );
            continueCreatingAccountButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/procced']")
            );
            loginNowButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/log_in']")
            );
            forgotLoginDetailsButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/reset_password']")
            );
            cancelButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/cancel']")
            );
        }
    }

    // Email Title
    public boolean isEmailTitleVisible() {
        return isVisible(emailTitleLocators);
    }

    // Email Input
    public boolean isEmailInputVisible() {
        return isVisible(emailInputLocators);
    }
    public void enterEmail(String text) {
        enterText(emailInputLocators, text);
    }
    public void clearEmail() {
        clear(emailInputLocators);
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

    // Help Subtext
    public boolean isHelpSubtextVisible() {
        return isVisible(helpSubtextLocators);
    }

    // Invalid Email Error
    public boolean isInvalidEmailErrorVisible() {
        return isVisible(invalidEmailErrorLocators);
    }

    // Email Exists Alert Text
    public boolean isEmailExistsAlertTextVisible() {
        return isVisible(emailExistsAlertTextLocators);
    }

    // Login With Existing Account Text
    public boolean isLoginWithExistingAccountTextVisible() {
        return isVisible(loginWithExistingAccountTextLocators);
    }

    // Continue Creating Account Button
    public boolean isContinueCreatingAccountButtonVisible() {
        return isVisible(continueCreatingAccountButtonLocators);
    }
    public void tapContinueCreatingAccountButton() {
        tap(continueCreatingAccountButtonLocators);
    }

    // Login Now Button
    public boolean isLoginNowButtonVisible() {
        return isVisible(loginNowButtonLocators);
    }
    public void tapLoginNowButton() {
        tap(loginNowButtonLocators);
    }

    // Forgot Login Details Button
    public boolean isForgotLoginDetailsButtonVisible() {
        return isVisible(forgotLoginDetailsButtonLocators);
    }
    public void tapForgotLoginDetailsButton() {
        tap(forgotLoginDetailsButtonLocators);
    }

    // Cancel Button
    public boolean isCancelButtonVisible() {
        return isVisible(cancelButtonLocators);
    }
    public void tapCancelButton() {
        tap(cancelButtonLocators);
    }
}
