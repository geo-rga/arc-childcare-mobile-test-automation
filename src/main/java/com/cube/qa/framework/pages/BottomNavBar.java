package com.cube.qa.framework.pages;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class BottomNavBar extends BasePage {

    private List<By> learnTabLocators;
    private List<By> giveCareTabLocators;
    private List<By> recordsTabLocators;
    private List<By> profileTabLocators;

    public BottomNavBar(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            learnTabLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Learn']")
            );
            giveCareTabLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Give Care']")
            );
            recordsTabLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Records']")
            );
            profileTabLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Profile']")
            );

        } else {
            learnTabLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/navigation_learn']")
            );
            giveCareTabLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/navigation_give_care']")
            );
            recordsTabLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/navigation_records']")
            );
            profileTabLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/navigation_profile']")
            );
        }
    }

    // Learn Tab
    public boolean isLearnTabVisible() {
        return isVisible(learnTabLocators);
    }
    public void tapLearnTab() {
        tap(learnTabLocators);
    }

    // Give Care Tab
    public boolean isGiveCareTabVisible() {
        return isVisible(giveCareTabLocators);
    }
    public void tapGiveCareTab() {
        tap(giveCareTabLocators);
    }

    // Records Tab
    public boolean isRecordsTabVisible() {
        return isVisible(recordsTabLocators);
    }
    public void tapRecordsTab() {
        tap(recordsTabLocators);
    }

    // Profile Tab
    public boolean isProfileTabVisible() {
        return isVisible(profileTabLocators);
    }
    public void tapProfileTab() {
        tap(profileTabLocators);
    }
} 
