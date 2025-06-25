package com.cube.qa.framework.pages.onboarding;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class SignInPage extends BasePage {

    private List<By> screenTitleLocators;
    private List<By> screenSubtitleLocators;
    private List<By> emailInputFieldLocators;
    private List<By> passwordInputFieldLocators;
    private List<By> continueButtonLocators;
    private List<By> forgotPasswordButtonLocators;
    private List<By> learnMoreTitleLocators;
    private List<By> learnMoreDescriptionLocators;
    private List<By> loginFailedTitleLocators;
    private List<By> loginFailedMessageLocators;
    private List<By> loginFailedRetryButtonLocators;
    private List<By> loginFailedOkayButtonLocators;
    private List<By> loginFailedActionButtonLocators;

    public SignInPage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            screenTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name=\"Sign in With Your Red Cross  Learning Center Account email address and password.\"]")
            );
            screenSubtitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name=\"This is the email address and password used when logging into the Red Cross Learning Center to access online only and blended learning courses.\"]")
            );
            emailInputFieldLocators = List.of(
                By.xpath("//XCUIElementTypeTextField")
            );
            passwordInputFieldLocators = List.of(
                By.xpath("//XCUIElementTypeSecureTextField")
            );
            continueButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Continue']")
            );
            forgotPasswordButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Forgot Your Password?']")
            );
            learnMoreTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Learn More on Red Cross Learning Center Accounts and Sign In']")
            );
            learnMoreDescriptionLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Find out more about how to get a Red Cross Learning Center account to start viewing your certificates and courses in the app.']")
            );
            loginFailedTitleLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Login Failed']")
            );
            loginFailedMessageLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Please check your account details and try again']")
            );
            loginFailedActionButtonLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Okay']")
            );

        } else {
            screenTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/tv_title']")
            );
            screenSubtitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/tv_subtitle']")
            );
            emailInputFieldLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/input_email']//android.widget.EditText")
            );
            passwordInputFieldLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/input_password']//android.widget.EditText")
            );
            continueButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/cta_sign_in']")
            );
            forgotPasswordButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/cta_forgot_password']")
            );
            learnMoreTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/tv_learn_more_title']")
            );
            learnMoreDescriptionLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/tv_learn_more_description']")
            );
            loginFailedTitleLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/alertTitle']")
            );
            loginFailedMessageLocators = List.of(
                    By.xpath("//*[@resource-id='android:id/message']")
            );
            loginFailedActionButtonLocators = List.of(
                    By.xpath("//*[@resource-id='android:id/button1']")
            );
        }
    }

    // Screen Title
    public boolean isScreenTitleVisible() {
        return isVisible(screenTitleLocators);
    }
    public boolean hasScreenTitleText(String text) {
        return hasText(screenTitleLocators, text);
    }

    // Screen Subtitle
    public boolean isScreenSubtitleVisible() {
        return isVisible(screenSubtitleLocators);
    }
    public boolean hasScreenSubtitleText(String text) {
        return hasText(screenSubtitleLocators, text);
    }

    // Email Input
    public boolean isEmailInputFieldVisible() {
        return isVisible(emailInputFieldLocators);
    }
    public void enterEmail(String email) {
        enterText(emailInputFieldLocators, email);
    }
    public void clearEmail() {
        clear(emailInputFieldLocators);
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

    // Continue Button
    public boolean isContinueButtonVisible() {
        return isVisible(continueButtonLocators);
    }
    public void tapContinueButton() {
        tap(continueButtonLocators);
    }

    // Forgot Password Button
    public boolean isForgotPasswordButtonVisible() {
        return isVisible(forgotPasswordButtonLocators);
    }
    public void tapForgotPasswordButton() {
        tap(forgotPasswordButtonLocators);
    }

    // Learn More Title
    public boolean isLearnMoreTitleVisible() {
        return isVisible(learnMoreTitleLocators);
    }
    public boolean hasLearnMoreTitleText(String text) {
        return hasText(learnMoreTitleLocators, text);
    }

    // Learn More Description
    public boolean isLearnMoreDescriptionVisible() {
        return isVisible(learnMoreDescriptionLocators);
    }
    public boolean hasLearnMoreDescriptionText(String text) {
        return hasText(learnMoreDescriptionLocators, text);
    }

    // Login Failed Alert
    public boolean isLoginFailedTitleVisible() {
        return isVisible(loginFailedTitleLocators);
    }
    public boolean isLoginFailedMessageVisible() {
        return isVisible(loginFailedMessageLocators);
    }
    public boolean isLoginFailedActionButtonVisible() {
        return isVisible(loginFailedActionButtonLocators);
    }
    public void tapLoginFailedActionButton() {
        tap(loginFailedActionButtonLocators);
    }
}
