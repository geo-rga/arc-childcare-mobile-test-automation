package com.cube.qa.framework.pages.deviceHelpers;

import com.cube.qa.framework.pages.BasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

public class IOSHelpersPage extends BasePage {

    private String month;
    private String day;
    private String year;
    private String dobYear;

    private List<By> monthLocators;
    private List<By> dayLocators;
    private List<By> yearLocators;
    private List<By> dobYearLocators;

    public IOSHelpersPage(AppiumDriver driver) {
        super(driver);

        this.month = LocalDate.now().getMonth().name().charAt(0) + LocalDate.now().getMonth().name().substring(1).toLowerCase();
        this.day = String.valueOf(LocalDate.now().getDayOfMonth());
        this.year = String.valueOf(LocalDate.now().getYear());
        this.dobYear = String.valueOf(LocalDate.now().minusYears(16).getYear());

        setLocators();
    }

    private void setLocators() {
        monthLocators = List.of(
                By.xpath("//XCUIElementTypePickerWheel[@value='" + month + "']")
        );
        dayLocators = List.of(
                By.xpath("//XCUIElementTypePickerWheel[@value='" + day + "']")
        );
        yearLocators = List.of(
                By.xpath("//XCUIElementTypePickerWheel[@value='" + year + "']")
        );
        dobYearLocators = List.of(
                By.xpath("//XCUIElementTypePickerWheel[@value='" + dobYear + "']")
        );
    }

    // General Date Picker
    public void enterMonth(String newMonth) {
        enterText(monthLocators, newMonth);
        this.month = newMonth;
        setLocators();
    }

    public void enterDay(String newDay) {
        enterText(dayLocators, newDay);
        this.day = newDay;
        setLocators();
    }

    public void enterYear(String newYear) {
        enterText(yearLocators, newYear);
        this.year = newYear;
        setLocators();
    }

    public void enterDate(String month, String day, String year) {
        enterMonth(month);
        enterDay(day);
        enterYear(year);
    }

    // DOB-specific Picker
    public void enterDobYear(String year) {
        enterText(dobYearLocators, year);
        this.dobYear = year;
        setLocators();
    }

    public void enterDobDate(String month, String day, String year) {
        enterMonth(month);
        enterDay(day);
        enterDobYear(year);
    }

    // Location & Notification Permissions (System Alerts)
    // FIXME: For some reason when this is used for location permissions it will just tap on the "precise location" toggle
    public void acceptIOSAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();
            System.out.println("✅ Accepted iOS system alert.");
        } catch (TimeoutException e) {
            System.out.println("⚠️ No iOS system alert appeared to accept.");
        }
    }

    public void dismissIOSAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().dismiss();
            System.out.println("❌ Dismissed iOS system alert.");
        } catch (TimeoutException e) {
            System.out.println("⚠️ No iOS system alert appeared to dismiss.");
        }
    }
}
