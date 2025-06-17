package com.cube.qa.framework.pages.scheduling;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class TimePage extends BasePage {

    private List<By> anytimeTitleLocators;
    private List<By> anytimeDescriptionLocators;
    private List<By> morningTitleLocators;
    private List<By> morningDescriptionLocators;
    private List<By> afternoonTitleLocators;
    private List<By> afternoonDescriptionLocators;
    private List<By> eveningTitleLocators;
    private List<By> eveningDescriptionLocators;
    private List<By> specificTimeTitleLocators;
    private List<By> specificTimeValueLocators;
    private List<By> cancelButtonLocators;

    public TimePage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            anytimeTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Anytime']")
            );
            anytimeDescriptionLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='5:00 AM to 10:00 PM']")
            );
            morningTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Morning']")
            );
            morningDescriptionLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='5:00 AM to 12:00 PM']")
            );
            afternoonTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Afternoon']")
            );
            afternoonDescriptionLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='12:00 PM to 4:00 PM']")
            );
            eveningTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Evening']")
            );
            eveningDescriptionLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='4:00 PM to 10:00 PM']")
            );
            specificTimeTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Specific Time']")
            );
            specificTimeValueLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Select Time']")
            );
            cancelButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Cancel']")
            );

        } else {
            anytimeTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/appointment_time_all_day']//*[@resource-id='com.cube.arc.blood:id/cell_title']")
            );
            anytimeDescriptionLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/appointment_time_all_day']//*[@resource-id='com.cube.arc.blood:id/cell_body']")
            );
            morningTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/appointment_time_morning']//*[@resource-id='com.cube.arc.blood:id/cell_title']")
            );
            morningDescriptionLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/appointment_time_morning']//*[@resource-id='com.cube.arc.blood:id/cell_body']")
            );
            afternoonTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/appointment_time_afternoon']//*[@resource-id='com.cube.arc.blood:id/cell_title']")
            );
            afternoonDescriptionLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/appointment_time_afternoon']//*[@resource-id='com.cube.arc.blood:id/cell_body']")
            );
            eveningTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/appointment_time_evening']//*[@resource-id='com.cube.arc.blood:id/cell_title']")
            );
            eveningDescriptionLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/appointment_time_evening']//*[@resource-id='com.cube.arc.blood:id/cell_body']")
            );
            specificTimeTitleLocators = List.of(
                By.xpath("//android.widget.TextView[@text='Specific Time']")
            );
            specificTimeValueLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/specific_time']")
            );
            cancelButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/cancel_action']")
            );
        }
    }

    // Anytime
    public boolean isAnytimeTitleVisible() { return isVisible(anytimeTitleLocators); }
    public boolean hasAnytimeTitleText(String text) { return hasText(anytimeTitleLocators, text); }
    public boolean isAnytimeDescriptionVisible() { return isVisible(anytimeDescriptionLocators); }
    public boolean hasAnytimeDescriptionText(String text) { return hasText(anytimeDescriptionLocators, text); }
    public void tapAnytimeOption() { tap(anytimeTitleLocators); }

    // Morning
    public boolean isMorningTitleVisible() { return isVisible(morningTitleLocators); }
    public boolean hasMorningTitleText(String text) { return hasText(morningTitleLocators, text); }
    public boolean isMorningDescriptionVisible() { return isVisible(morningDescriptionLocators); }
    public boolean hasMorningDescriptionText(String text) { return hasText(morningDescriptionLocators, text); }
    public void tapMorningOption() { tap(morningTitleLocators); }

    // Afternoon
    public boolean isAfternoonTitleVisible() { return isVisible(afternoonTitleLocators); }
    public boolean hasAfternoonTitleText(String text) { return hasText(afternoonTitleLocators, text); }
    public boolean isAfternoonDescriptionVisible() { return isVisible(afternoonDescriptionLocators); }
    public boolean hasAfternoonDescriptionText(String text) { return hasText(afternoonDescriptionLocators, text); }
    public void tapAfternoonOption() { tap(afternoonTitleLocators); }

    // Evening
    public boolean isEveningTitleVisible() { return isVisible(eveningTitleLocators); }
    public boolean hasEveningTitleText(String text) { return hasText(eveningTitleLocators, text); }
    public boolean isEveningDescriptionVisible() { return isVisible(eveningDescriptionLocators); }
    public boolean hasEveningDescriptionText(String text) { return hasText(eveningDescriptionLocators, text); }
    public void tapEveningOption() { tap(eveningTitleLocators); }

    // Specific Time
    public boolean isSpecificTimeTitleVisible() { return isVisible(specificTimeTitleLocators); }
    public boolean hasSpecificTimeTitleText(String text) { return hasText(specificTimeTitleLocators, text); }
    public boolean isSpecificTimeValueVisible() { return isVisible(specificTimeValueLocators); }
    public boolean hasSpecificTimeValueText(String text) { return hasText(specificTimeValueLocators, text); }
    public void tapSpecificTimeValue() { tap(specificTimeValueLocators); }

    // Cancel Button
    public boolean isCancelButtonVisible() { return isVisible(cancelButtonLocators); }
    public void tapCancelButton() { tap(cancelButtonLocators); }
}
