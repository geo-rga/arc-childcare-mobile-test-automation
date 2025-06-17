
package com.cube.qa.framework.pages.scheduling;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class SmartSchedulingPage extends BasePage {

    private List<By> screenTitleLocators;
    private List<By> smartSchedulingTitleLocators;
    private List<By> smartSchedulingBodyLocators;
    private List<By> startOverTitleLocators;
    private List<By> startOverBodyLocators;
    private List<By> helpTextLocators;

    public SmartSchedulingPage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            screenTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Smart Scheduling']")
            );
            smartSchedulingTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Smart Scheduling']")
            );
            smartSchedulingBodyLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Schedule based on your most recent appointment.']")
            );
            startOverTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Start over']")
            );
            startOverBodyLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Schedule using new search criteria.']")
            );
            helpTextLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Smart scheduling searches based on your most recent donation type and location.']")
            );
        } else {
            screenTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/toolbar']/*[@text='Smart Scheduling']")
            );
            smartSchedulingTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_title' and @text='Smart Scheduling']")
            );
            smartSchedulingBodyLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_body' and @text='Schedule based on your most recent appointment.']")
            );
            startOverTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_title' and @text='Start over']")
            );
            startOverBodyLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_body' and @text='Schedule using new search criteria.']")
            );
            helpTextLocators = List.of(
                By.xpath("//*[@text='Smart scheduling searches based on your most recent donation type and location.']")
            );
        }
    }

    // Screen Title
    public boolean isScreenTitleVisible() {
        return isVisible(screenTitleLocators);
    }

    // Smart Scheduling Cell
    public boolean isSmartSchedulingTitleVisible() {
        return isVisible(smartSchedulingTitleLocators);
    }
    public boolean isSmartSchedulingBodyVisible() {
        return isVisible(smartSchedulingBodyLocators);
    }
    public void tapSmartScheduling() {
        tap(smartSchedulingTitleLocators);
    }

    // Start Over Cell
    public boolean isStartOverTitleVisible() {
        return isVisible(startOverTitleLocators);
    }
    public boolean isStartOverBodyVisible() {
        return isVisible(startOverBodyLocators);
    }
    public void tapStartOver() {
        tap(startOverTitleLocators);
    }

    // Help Text
    public boolean isHelpTextVisible() {
        return isVisible(helpTextLocators);
    }
}
