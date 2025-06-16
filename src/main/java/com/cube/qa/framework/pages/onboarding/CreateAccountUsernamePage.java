
package com.cube.qa.framework.pages.onboarding;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;

import java.util.List;

public class CreateAccountUsernamePage extends BasePage {

    private List<By> usernameTitleLocators;
    private List<By> usernameInputFieldLocators;
    private List<By> usernameRequirementTextLocators;
    private List<By> continueButtonLocators;
    private List<By> loginHelpTextLocators;
    private List<By> loginNowButtonLocators;

    public CreateAccountUsernamePage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            usernameTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Choose a Username']")
            );
            usernameInputFieldLocators = List.of(
                By.xpath("//XCUIElementTypeTextField[@value='Username']")
            );
            usernameRequirementTextLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Usernames must be at least six characters and should not contain an asterisk.']")
            );
            continueButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='CONTINUE']")
            );
            loginHelpTextLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Already have a redcrossblood.org username?']")
            );
            loginNowButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Log In']")
            );
        } else {
            usernameTitleLocators = List.of(
                By.xpath("//*[@text='Choose a Username']")
            );
            usernameInputFieldLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/username']")
            );
            usernameRequirementTextLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/subtext_username']")
            );
            continueButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/continue_button']")
            );
            loginHelpTextLocators = List.of(
                By.xpath("//*[@text='Already have a redcrossblood.org username?']")
            );
            loginNowButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/nav_to_landing']")
            );
        }
    }

    // Username Title
    public boolean isUsernameTitleVisible() {
        return isVisible(usernameTitleLocators);
    }

    // Username Input Field
    public boolean isUsernameInputFieldVisible() {
        return isVisible(usernameInputFieldLocators);
    }
    public void enterUsername(String username) {
        enterText(usernameInputFieldLocators, username);
    }
    public void clearUsername() {
        clear(usernameInputFieldLocators);
    }

    // Username Requirement Text
    public boolean isUsernameRequirementTextVisible() {
        return isVisible(usernameRequirementTextLocators);
    }

    // Continue Button
    public boolean isContinueButtonVisible() {
        return isVisible(continueButtonLocators);
    }
    public void tapContinueButton() {
        tap(continueButtonLocators);
    }

    // Login Help Text
    public boolean isLoginHelpTextVisible() {
        return isVisible(loginHelpTextLocators);
    }

    // Login Now Button
    public boolean isLoginNowButtonVisible() {
        return isVisible(loginNowButtonLocators);
    }
    public void tapLoginNowButton() {
        tap(loginNowButtonLocators);
    }
}
