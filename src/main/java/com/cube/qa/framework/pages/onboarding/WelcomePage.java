package com.cube.qa.framework.pages.onboarding;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import java.util.List;
import com.cube.qa.framework.pages.BasePage;

public class WelcomePage extends BasePage {

    private List<By> arcLogoLocators;
    private List<By> appTitleLocators;
    private List<By> storyTextLocators;
    private List<By> scheduleAppointmentButtonLocators;
    private List<By> createAccountButtonLocators;
    private List<By> logInButtonLocators;
    private List<By> helpLinkLocators;

    public WelcomePage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            arcLogoLocators = List.of(
                    By.xpath("//XCUIElementTypeImage[@name='arcLogo']")
            );
            appTitleLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Blood Donor']")
            );
            storyTextLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Tymia relies on regular blood transfusions as  treatment for sickle cell disease.']")
            );
            scheduleAppointmentButtonLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='SCHEDULE NEW APPOINTMENT']")
            );
            createAccountButtonLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='CREATE ACCOUNT']")
            );
            logInButtonLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='LOG IN']")
            );
            helpLinkLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Help with Sign Up or Log In']")
            );
        } else {
            arcLogoLocators = List.of(
                    By.id("com.cube.arc.blood:id/arc_logo")
            );
            appTitleLocators = List.of(
                    By.id("com.cube.arc.blood:id/app_title")
            );
            storyTextLocators = List.of(
                    By.id("com.cube.arc.blood:id/story_text")
            );
            scheduleAppointmentButtonLocators = List.of(
                    By.id("com.cube.arc.blood:id/schedule")
            );
            createAccountButtonLocators = List.of(
                    By.id("com.cube.arc.blood:id/sign_up")
            );
            logInButtonLocators = List.of(
                    By.id("com.cube.arc.blood:id/log_in")
            );
            helpLinkLocators = List.of(
                    By.id("com.cube.arc.blood:id/learn_more")
            );
        }
    }

    // ARC Logo
    public boolean isArcLogoVisible() {
        return isVisible(arcLogoLocators);
    }

    // App Title
    public boolean isAppTitleVisible() {
        return isVisible(appTitleLocators);
    }

    public boolean hasAppTitleText(String text) {
        return hasText(appTitleLocators, text);
    }

    // Story Text
    public boolean isStoryTextVisible() {
        return isVisible(storyTextLocators);
    }

    public boolean hasStoryText(String text) {
        return hasText(storyTextLocators, text);
    }

    // Schedule Appointment Button
    public boolean isScheduleAppointmentButtonVisible() {
        return isVisible(scheduleAppointmentButtonLocators);
    }

    public void tapScheduleAppointmentButton() {
        tap(scheduleAppointmentButtonLocators);
    }

    // Create Account Button
    public boolean isCreateAccountButtonVisible() {
        return isVisible(createAccountButtonLocators);
    }

    public void tapCreateAccountButton() {
        tap(createAccountButtonLocators);
    }

    // Log In Button
    public boolean isLogInButtonVisible() {
        return isVisible(logInButtonLocators);
    }

    public void tapLogInButton() {
        tap(logInButtonLocators);
    }

    // Help Link
    public boolean isHelpLinkVisible() {
        return isVisible(helpLinkLocators);
    }

    public void tapHelpLink() {
        tap(helpLinkLocators);
    }
}
