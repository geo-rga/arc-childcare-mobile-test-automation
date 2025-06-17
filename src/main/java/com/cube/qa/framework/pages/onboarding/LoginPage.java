package com.cube.qa.framework.pages.onboarding;

import com.cube.qa.framework.pages.BasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import java.util.List;

public class LoginPage extends BasePage {

    // Locators
    private List<By> welcomeTitleLocators;
    private List<By> usernameFieldLocators;
    private List<By> passwordFieldLocators;
    private List<By> continueButtonLocators;
    private List<By> forgotPasswordButtonLocators;
    private List<By> invalidLoginTitleLocators;
    private List<By> invalidLoginMessageLocators;
    private List<By> tryAgainButtonLocators;
    private List<By> helpButtonLocators;
    private List<By> invalidPasswordToastLocators;

    public LoginPage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            welcomeTitleLocators = List.of(
                    By.name("Welcome back")
            );
            usernameFieldLocators = List.of(
                    By.name("Username field")
            );
            passwordFieldLocators = List.of(
                    By.name("Password field")
            );
            continueButtonLocators = List.of(
                    By.name("CONTINUE")
            );
            forgotPasswordButtonLocators = List.of(
                    By.name("Forgot your username/password?")
            );
            invalidLoginTitleLocators = List.of(
                    By.name("Username or password incorrect")
            );
            invalidLoginMessageLocators = List.of(
                    By.name("Either your username or password, or the combination of both was incorrect.")
            );
            tryAgainButtonLocators = List.of(
                    By.name("Try Again")
            );
            helpButtonLocators = List.of(
                    By.name("Help")
            );
            invalidPasswordToastLocators = List.of(); // Not available in iOS

        } else {
            welcomeTitleLocators = List.of(
                    By.id("com.cube.arc.blood:id/title")
            );
            usernameFieldLocators = List.of(
                    By.id("com.cube.arc.blood:id/username")
            );
            passwordFieldLocators = List.of(
                    By.id("com.cube.arc.blood:id/password")
            );
            continueButtonLocators = List.of(
                    By.id("com.cube.arc.blood:id/continue_button")
            );
            forgotPasswordButtonLocators = List.of(
                    By.id("com.cube.arc.blood:id/forgot")
            );
            invalidLoginTitleLocators = List.of(
                    By.id("android:id/alertTitle")
            );
            invalidLoginMessageLocators = List.of(
                    By.id("android:id/message")
            );
            tryAgainButtonLocators = List.of(
                    By.id("android:id/button2")
            );
            helpButtonLocators = List.of(
                    By.id("android:id/button1")
            );
            invalidPasswordToastLocators = List.of(
                    By.xpath("//*[@text='Password is invalid and it must be between 6 and 46 characters long']")
            );
        }
    }

    // Welcome Title
    public boolean isWelcomeTitleVisible() {
        return isVisible(welcomeTitleLocators);
    }

    // Username Field
    public boolean isUsernameFieldVisible() {
        return isVisible(usernameFieldLocators);
    }
    public void enterUsername(String username) {
        enterText(usernameFieldLocators, username);
    }
    public void clearUsernameField() {
        clear(usernameFieldLocators);
    }

    // Password Field
    public boolean isPasswordFieldVisible() {
        return isVisible(passwordFieldLocators);
    }
    public void enterPassword(String password) {
        enterText(passwordFieldLocators, password);
    }
    public void clearPasswordField() {
        clear(passwordFieldLocators);
    }

    // Continue Button
    public boolean isContinueButtonVisible() {
        return isVisible(continueButtonLocators);
    }
    public void tapContinueButton() {
        tap(continueButtonLocators);
    }

    // Forgot Password
    public boolean isForgotPasswordButtonVisible() {
        return isVisible(forgotPasswordButtonLocators);
    }
    public void tapForgotPasswordButton() {
        tap(forgotPasswordButtonLocators);
    }

    // Invalid Login Alert Title
    public boolean isInvalidLoginTitleVisible() {
        return isVisible(invalidLoginTitleLocators);
    }
    public boolean hasInvalidLoginTitleText(String text) {
        return hasText(invalidLoginTitleLocators, text);
    }

    // Invalid Login Alert Message
    public boolean isInvalidLoginMessageVisible() {
        return isVisible(invalidLoginMessageLocators);
    }
    public boolean hasInvalidLoginMessageText(String text) {
        return hasText(invalidLoginMessageLocators, text);
    }

    // Try Again Button
    public boolean isTryAgainButtonVisible() {
        return isVisible(tryAgainButtonLocators);
    }
    public boolean isTryAgainNotVisible() { return isInvisible(tryAgainButtonLocators); }
    public void tapTryAgainButton() {
        tap(tryAgainButtonLocators);
    }

    // Help Button
    public boolean isHelpButtonVisible() {
        return isVisible(helpButtonLocators);
    }
    public void tapHelpButton() {
        tap(helpButtonLocators);
    }

    // Password Error Toast
    public boolean isInvalidPasswordToastVisible() {
        return isVisible(invalidPasswordToastLocators);
    }
    public boolean hasInvalidPasswordToastText(String text) {
        return hasText(invalidPasswordToastLocators, text);
    }
}
