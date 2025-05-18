package com.cube.qa.arcblood.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;

import java.time.Duration;


public class LoginPage extends BasePage {

    private final List<By> welcomeLoginLocators;
    private final List<By> usernameFieldLocators;
    private final List<By> passwordFieldLocators;
    private final List<By> loginButtonLocators;

    public LoginPage(AppiumDriver driver, String platform) {
        super(driver); // Pass driver to BasePage

        if (platform.equalsIgnoreCase("ios")) {
            welcomeLoginLocators = Arrays.asList(
                    By.name("LOG IN"),
                    By.xpath("//XCUIElementTypeButton[@name=\"LOG IN\"]")
            );
            usernameFieldLocators = Arrays.asList(
                    By.xpath("//XCUIElementTypeTextField[@name=\"Username field\"]")
            );
            passwordFieldLocators = Arrays.asList(
                    By.xpath("//XCUIElementTypeTextField[@name=\"Password field\"]")
            );
            loginButtonLocators = Arrays.asList(
                    By.xpath("//XCUIElementTypeButton[@name=\"CONTINUE\"]")
            );
        } else { // TODO: Android locators here
            welcomeLoginLocators = Arrays.asList(
                    By.id("com.cube.arc.blood:id/log_in"),
                    By.xpath("//android.widget.Button[@text='LOG IN']")
            );
            usernameFieldLocators = Arrays.asList(
                    By.id("com.cube.arc.blood:id/username")
            );
            passwordFieldLocators = Arrays.asList(
                    By.id("com.cube.arc.blood:id/password")
            );
            loginButtonLocators = Arrays.asList(
                    By.id("com.cube.arc.blood:id/continue_button")
            );
        }
    }

    public void startLogInFlow() {
        waitForVisibility(welcomeLoginLocators).click();
    }

    public boolean isWelcomeLoginButtonVisible() {
        return waitForVisibility(welcomeLoginLocators).isDisplayed();
    }

    // Username
    public void enterUsername(String username) {
        waitForVisibility(usernameFieldLocators).sendKeys(username);
    }

    public boolean isUsernameFieldVisible() {
        return waitForVisibility(usernameFieldLocators).isDisplayed();
    }

    public void enterPassword(String password) {
        waitForVisibility(passwordFieldLocators).sendKeys(password);
    }

    public void tapLoginButton() {
        waitForVisibility(loginButtonLocators).click();
    }
}

