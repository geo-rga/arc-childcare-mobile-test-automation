package com.cube.qa.framework.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.util.List;

public class WelcomePage extends BasePage {

    private final List<By> appTitle;
    private final List<By> storyText;
    private final List<By> scheduleNewAppointmentButton;
    private final List<By> createAccountButton;
    private final List<By> logInButton;
    private final List<By> helpButton;


    public WelcomePage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            // TODO: Capture iOS objects
            appTitle = List.of(


            );
            storyText = List.of(


            );
            scheduleNewAppointmentButton = List.of(

            );
            createAccountButton = List.of(

            );
            logInButton = List.of(

            );
            helpButton = List.of(

            );
        } else {
            appTitle = List.of(
                    By.id("com.cube.arc.blood:id/app_title"),
                    By.xpath("//android.widget.TextView[@resource-id=\"com.cube.arc.blood:id/app_title\"]")
            );
            storyText = List.of(
                    By.id("com.cube.arc.blood:id/story_text")
            );
            scheduleNewAppointmentButton = List.of(
                    By.id("com.cube.arc.blood:id/schedule")
            );
            createAccountButton = List.of(
                    By.id("com.cube.arc.blood:id/sign_up")
            );
            logInButton = List.of(
                    By.id("com.cube.arc.blood:id/log_in")
            );
            helpButton = List.of(
                    By.id("com.cube.arc.blood:id/learn_more")
            );
        }
    }

    // Title Actions
    public  boolean isAppTitleVisible(){
        return isVisible(appTitle);
    }

    // Schedule New Appointment Actions
    public boolean isScheduleNewAppointmentButtonVisible() {
        return isVisible(scheduleNewAppointmentButton);
    }

    public void tapScheduleNewAppointmentButton() {
        tap(scheduleNewAppointmentButton);
    }

    // Create Account Actions
    public boolean isCreateAccountButtonVisible() {
        return isVisible(createAccountButton);
    }

    public void tapCreateAccountButton() {
        tap(createAccountButton);
    }

    // Log in actions
    public boolean isLogInButtonVisible() {
        return isVisible(logInButton);
    }

    public void tapLogInButton() {
        tap(logInButton);
    }

    // Help button actions
    public boolean isHelpButtonVisible() {
        return isVisible(helpButton);
    }

    public void tapHelpButton() {
        tap(helpButton);
    }
}
