package com.cube.qa.arcblood.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.util.List;

public class LoginPage extends BasePage {

    private final List<By> welcomeLoginLocators;
    private final List<By> usernameFieldLocators;
    private final List<By> passwordFieldLocators;
    private final List<By> loginButtonLocators;
    private final List<By> biometricNotNow;
    private final List<By> bookAnotherLikeThis;

    public LoginPage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            welcomeLoginLocators = List.of(
                    By.name("LOG IN"),
                    By.xpath("//XCUIElementTypeButton[@name=\"LOG IN\"]")
            );
            usernameFieldLocators = List.of(
                    By.xpath("//XCUIElementTypeTextField[@name=\"Username field\"]")
            );
            passwordFieldLocators = List.of(
                    By.xpath("//XCUIElementTypeSecureTextField[@name=\"Password field\"]")
            );
            loginButtonLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name=\"CONTINUE\"]")
            );
            biometricNotNow = List.of(
                    By.xpath("//XCUIElementTypeButton[@name=\"Not now\"]")
            );
            bookAnotherLikeThis = List.of(
                    By.xpath("//XCUIElementTypeButton[@name=\"BOOK ANOTHER LIKE THIS\"]")
            );
        } else {
            welcomeLoginLocators = List.of(
                    By.id("com.cube.arc.blood:id/log_in"),
                    By.xpath("//android.widget.Button[@text='LOG IN']")
            );
            usernameFieldLocators = List.of(
                    By.id("com.cube.arc.blood:id/username")
            );
            passwordFieldLocators = List.of(
                    By.id("com.cube.arc.blood:id/password")
            );
            loginButtonLocators = List.of(
                    By.id("com.cube.arc.blood:id/continue_button")
            );
            biometricNotNow = List.of(
                    By.id("com.cube.arc.blood:id/not_now")
            );
            bookAnotherLikeThis = List.of(
                    By.xpath("//android.widget.Button[@text='BOOK ANOTHER LIKE THIS']")
            );
        }
    }

    public void startLogInFlow() {
        tap(welcomeLoginLocators);
    }

    public boolean isWelcomeLoginButtonVisible() {
        return isVisible(welcomeLoginLocators);
    }

    public void enterUsername(String username) {
        enterText(usernameFieldLocators, username);
    }

    public boolean isUsernameFieldVisible() {
        return isVisible(usernameFieldLocators);
    }

    public void enterPassword(String password) {
        enterText(passwordFieldLocators, password);
    }

    public void tapLoginButton() {
        tap(loginButtonLocators);
    }

    public void skipBiometricSetUp() {
        tap(biometricNotNow);
    }

    public boolean isBookAnotherLikeThisVisible() {
        return isVisible(bookAnotherLikeThis);
    }
}
