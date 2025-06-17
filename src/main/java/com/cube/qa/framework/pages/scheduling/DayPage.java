package com.cube.qa.framework.pages.scheduling;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class DayPage extends BasePage {

    private List<By> dayTitleLocators;
    private List<By> todayTitleLocators;
    private List<By> next14DaysTitleLocators;
    private List<By> customTimeFrameLabelLocators;
    private List<By> startDateFieldLocators;
    private List<By> endDateFieldLocators;
    private List<By> cancelButtonLocators;

    public DayPage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            dayTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Day']")
            );
            todayTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Today']")
            );
            next14DaysTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Next 14 days']")
            );
            customTimeFrameLabelLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Or select a custom time frame.']")
            );
            startDateFieldLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Start']")
            );
            endDateFieldLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='End']")
            );
            cancelButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Cancel']")
            );

        } else {
            dayTitleLocators = List.of(
                By.xpath("//android.widget.TextView[@text='Day']")
            );
            todayTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/today']//*[@resource-id='com.cube.arc.blood:id/date_title' and @text='Today']")
            );
            next14DaysTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/next_week']//*[@resource-id='com.cube.arc.blood:id/date_title' and @text='Next 14 days']")
            );
            customTimeFrameLabelLocators = List.of(
                By.xpath("//android.widget.TextView[@text='Or select a custom time frame.']")
            );
            startDateFieldLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/start_appointment_date_container']")
            );
            endDateFieldLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/end_appointment_date_container']")
            );
            cancelButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/cancel_action']")
            );
        }
    }

    // Day Title
    public boolean isDayTitleVisible() {
        return isVisible(dayTitleLocators);
    }
    public boolean hasDayTitleText(String text) {
        return hasText(dayTitleLocators, text);
    }

    // Today Title
    public boolean isTodayTitleVisible() {
        return isVisible(todayTitleLocators);
    }
    public boolean hasTodayTitleText(String text) {
        return hasText(todayTitleLocators, text);
    }
    public void tapToday() {
        tap(todayTitleLocators);
    }

    // Next 14 Days Title
    public boolean isNext14DaysTitleVisible() {
        return isVisible(next14DaysTitleLocators);
    }
    public boolean hasNext14DaysTitleText(String text) {
        return hasText(next14DaysTitleLocators, text);
    }
    public void tapNext14Days() {
        tap(next14DaysTitleLocators);
    }

    // Custom Time Frame Label
    public boolean isCustomTimeFrameLabelVisible() {
        return isVisible(customTimeFrameLabelLocators);
    }
    public boolean hasCustomTimeFrameLabelText(String text) {
        return hasText(customTimeFrameLabelLocators, text);
    }

    // Start Date Field
    public boolean isStartDateFieldVisible() {
        return isVisible(startDateFieldLocators);
    }
    public void tapStartDateField() {
        tap(startDateFieldLocators);
    }

    // End Date Field
    public boolean isEndDateFieldVisible() {
        return isVisible(endDateFieldLocators);
    }
    public void tapEndDateField() {
        tap(endDateFieldLocators);
    }

    // Cancel Button
    public boolean isCancelButtonVisible() {
        return isVisible(cancelButtonLocators);
    }
    public void tapCancelButton() {
        tap(cancelButtonLocators);
    }
}
