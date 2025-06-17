package com.cube.qa.framework.pages.scheduling;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class ConfirmAppointmentPage extends BasePage {

    private List<By> confirmAppointmentTitleLocators;
    private List<By> confirmButtonLocators;
    private List<By> cancelButtonLocators;

    public ConfirmAppointmentPage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            confirmAppointmentTitleLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Confirm Appointment']"));
            confirmButtonLocators = List.of(By.xpath("//XCUIElementTypeButton[@name='CONFIRM']"));
            cancelButtonLocators = List.of(By.xpath("//XCUIElementTypeButton[@name='Cancel']"));
        } else {
            confirmAppointmentTitleLocators = List.of(By.xpath("//*[@text='Confirm Appointment']"));
            confirmButtonLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/confirm']"));
            cancelButtonLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/cancel_action']"));
        }
    }

    // Confirm Appointment Title
    public boolean isConfirmAppointmentTitleVisible() {
        return isVisible(confirmAppointmentTitleLocators);
    }

    // Confirm Button
    public boolean isConfirmButtonVisible() {
        return isVisible(confirmButtonLocators);
    }
    public void tapConfirmButton() {
        tap(confirmButtonLocators);
    }

    // Cancel Button
    public boolean isCancelButtonVisible() {
        return isVisible(cancelButtonLocators);
    }
    public void tapCancelButton() {
        tap(cancelButtonLocators);
    }
}
