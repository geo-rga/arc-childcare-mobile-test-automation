package com.cube.qa.framework.pages.scheduling;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class BookingErrorPage extends BasePage {

    private List<By> errorTitleLocators;
    private List<By> errorDescriptionLocators;
    private List<By> manageAppointmentsButtonLocators;
    private List<By> cancelButtonLocators;

    public BookingErrorPage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            errorTitleLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Appointment could not be booked']"));
            errorDescriptionLocators = List.of(By.xpath("//XCUIElementTypeStaticText[contains(@name, 'Please check your existing appointments')]"));
            manageAppointmentsButtonLocators = List.of(By.xpath("//XCUIElementTypeButton[@name='MANAGE APPOINTMENTS']"));
            cancelButtonLocators = List.of(By.xpath("//XCUIElementTypeButton[@name='CANCEL']"));
        } else {
            errorTitleLocators = List.of(By.xpath("//*[@text='Appointment could not be booked']"));
            errorDescriptionLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/no_results_detail']"));
            manageAppointmentsButtonLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/manage']"));
            cancelButtonLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/close']"));
        }
    }

    // Error Title
    public boolean isErrorTitleVisible() { return isVisible(errorTitleLocators); }

    // Error Description
    public boolean isErrorDescriptionVisible() { return isVisible(errorDescriptionLocators); }

    // Manage Appointments Button
    public boolean isManageAppointmentsButtonVisible() { return isVisible(manageAppointmentsButtonLocators); }
    public void tapManageAppointmentsButton() { tap(manageAppointmentsButtonLocators); }

    // Cancel Button
    public boolean isCancelButtonVisible() { return isVisible(cancelButtonLocators); }
    public void tapCancelButton() { tap(cancelButtonLocators); }
}
