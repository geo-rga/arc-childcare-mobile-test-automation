package com.cube.qa.framework.pages.scheduling;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class DriveResultsPage extends BasePage {

    private List<By> refineButtonLocators;
    private List<By> listTabLocators;
    private List<By> mapTabLocators;
    private List<By> recommendedLabelLocators;
    private List<By> sortedByDistanceLabelLocators;
    private List<By> seeTimesButtonLocators;
    private List<By> giveBloodButtonLocators;
    private List<By> givePowerRedButtonLocators;
    private List<By> givePlateletsButtonLocators;
    private List<By> giveABPlasmaButtonLocators;

    public DriveResultsPage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            refineButtonLocators = List.of(By.xpath("//XCUIElementTypeButton[@name='Refine']"));
            listTabLocators = List.of(By.xpath("//XCUIElementTypeButton[@name='List']"));
            mapTabLocators = List.of(By.xpath("//XCUIElementTypeButton[@name='Map']"));
            recommendedLabelLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Recommended Appointment:']"));
            sortedByDistanceLabelLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Sorted by Distance']"));
            seeTimesButtonLocators = List.of(By.xpath("//XCUIElementTypeButton[@name='See Times']"));
            giveBloodButtonLocators = List.of(By.xpath("//XCUIElementTypeButton[contains(@name, 'Give Blood')]"));
            givePowerRedButtonLocators = List.of(By.xpath("//XCUIElementTypeButton[contains(@name, 'Give Power Red')]"));
            givePlateletsButtonLocators = List.of(By.xpath("//XCUIElementTypeButton[contains(@name, 'Give Platelets')]"));
            giveABPlasmaButtonLocators = List.of(By.xpath("//XCUIElementTypeButton[contains(@name, 'Give AB Plasma')]"));
        } else {
            refineButtonLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/action_filter']"));
            listTabLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/tab_list']"));
            mapTabLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/tab_map']"));
            recommendedLabelLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/recommended_header']"));
            sortedByDistanceLabelLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/appointment_header']"));
            seeTimesButtonLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/see_times_collapsible']"));
            giveBloodButtonLocators = List.of(By.xpath("//*[contains(@text, 'Give Blood') or @resource-id='com.cube.arc.blood:id/text_donation_type']"));
            givePowerRedButtonLocators = List.of(By.xpath("//*[contains(@text, 'Give Power Red') or @resource-id='com.cube.arc.blood:id/text_donation_type']"));
            givePlateletsButtonLocators = List.of(By.xpath("//*[contains(@text, 'Give Platelets') or @resource-id='com.cube.arc.blood:id/text_donation_type']"));
            giveABPlasmaButtonLocators = List.of(By.xpath("//*[contains(@text, 'Give AB Plasma') or @resource-id='com.cube.arc.blood:id/text_donation_type']"));
        }
    }

    // Refine Button
    public boolean isRefineButtonVisible() { return isVisible(refineButtonLocators); }
    public void tapRefineButton() { tap(refineButtonLocators); }

    // List Tab
    public boolean isListTabVisible() { return isVisible(listTabLocators); }
    public void tapListTab() { tap(listTabLocators); }

    // Map Tab
    public boolean isMapTabVisible() { return isVisible(mapTabLocators); }
    public void tapMapTab() { tap(mapTabLocators); }

    // Recommended Label
    public boolean isRecommendedLabelVisible() { return isVisible(recommendedLabelLocators); }

    // Sorted By Distance Label
    public boolean isSortedByDistanceLabelVisible() { return isVisible(sortedByDistanceLabelLocators); }

    // See Times Button
    public boolean isSeeTimesButtonVisible() { return isVisible(seeTimesButtonLocators); }
    public void tapSeeTimesButton() { tap(seeTimesButtonLocators); }

    // Give Blood
    public boolean isGiveBloodButtonVisible() { return isVisible(giveBloodButtonLocators); }
    public void tapGiveBloodButton() {
        waitForSeconds(3);
        tap(giveBloodButtonLocators);
    }

    // Give Power Red
    public boolean isGivePowerRedButtonVisible() { return isVisible(givePowerRedButtonLocators); }
    public void tapGivePowerRedButton() {
        waitForSeconds(3);
        tap(givePowerRedButtonLocators);
    }

    // Give Platelets
    public boolean isGivePlateletsButtonVisible() { return isVisible(givePlateletsButtonLocators); }
    public void tapGivePlateletsButton() {
        waitForSeconds(3);
        tap(givePlateletsButtonLocators);
    }

    // Give AB Plasma
    public boolean isGiveABPlasmaButtonVisible() { return isVisible(giveABPlasmaButtonLocators); }
    public void tapGiveABPlasmaButton() {
        waitForSeconds(3);
        tap(giveABPlasmaButtonLocators);
    }
}
