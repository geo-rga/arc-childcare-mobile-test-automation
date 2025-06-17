package com.cube.qa.framework.pages;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class DonationTypePage extends BasePage {

    private List<By> bloodTitleLocators;
    private List<By> bloodDescriptionLocators;
    private List<By> bloodEligibilityLocators;

    private List<By> powerRedTitleLocators;
    private List<By> powerRedDescriptionLocators;
    private List<By> powerRedEligibilityLocators;

    private List<By> plateletsTitleLocators;
    private List<By> plateletsDescriptionLocators;
    private List<By> plateletsEligibilityLocators;

    private List<By> abPlasmaTitleLocators;
    private List<By> abPlasmaDescriptionLocators;
    private List<By> abPlasmaEligibilityLocators;

    public DonationTypePage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            bloodTitleLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Blood.']")
            );
            bloodDescriptionLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='The most common type of donation.']")
            );
            bloodEligibilityLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='You can donate now']")
            );

            powerRedTitleLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Power Red.']")
            );
            powerRedDescriptionLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name=\"Best if you're type O or RH- negative.\"]")
            );
            powerRedEligibilityLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='You can donate now']")
            );

            plateletsTitleLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Platelets.']")
            );
            plateletsDescriptionLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Only available at select centers.']")
            );
            plateletsEligibilityLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='You can donate now']")
            );

            abPlasmaTitleLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='AB Plasma.']")
            );
            abPlasmaDescriptionLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Only available at select centers. Donor must be AB Blood type.']")
            );
            abPlasmaEligibilityLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='You can donate now']")
            );

        } else {
            bloodTitleLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_title' and @text='Blood']")
            );
            bloodDescriptionLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_body' and @text='The most common type of donation.']")
            );
            bloodEligibilityLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/eligible_date' and @text='You can donate now']")
            );

            powerRedTitleLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_title' and @text='Power Red']")
            );
            powerRedDescriptionLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_body' and @text=\"Best if you're type O or RH- negative.\"]")
            );
            powerRedEligibilityLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/eligible_date' and @text='You can donate now']")
            );

            plateletsTitleLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_title' and @text='Platelets']")
            );
            plateletsDescriptionLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_body' and @text='Only available at select centers.']")
            );
            plateletsEligibilityLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/eligible_date' and @text='You can donate now']")
            );

            abPlasmaTitleLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_title' and @text='AB Plasma']")
            );
            abPlasmaDescriptionLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_body' and @text='Only available at select centers. Donor must be AB Blood type.']")
            );
            abPlasmaEligibilityLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/eligible_date' and @text='You can donate now']")
            );
        }
    }

    // Blood Option
    public boolean isBloodTitleVisible() { return isVisible(bloodTitleLocators); }
    public boolean isBloodDescriptionVisible() { return isVisible(bloodDescriptionLocators); }
    public boolean isBloodEligibilityVisible() { return isVisible(bloodEligibilityLocators); }
    public void tapBloodTitle() { tap(bloodTitleLocators); }

    // Power Red Option
    public boolean isPowerRedTitleVisible() { return isVisible(powerRedTitleLocators); }
    public boolean isPowerRedDescriptionVisible() { return isVisible(powerRedDescriptionLocators); }
    public boolean isPowerRedEligibilityVisible() { return isVisible(powerRedEligibilityLocators); }
    public void tapPowerRedTitle() { tap(powerRedTitleLocators); }

    // Platelets Option
    public boolean isPlateletsTitleVisible() { return isVisible(plateletsTitleLocators); }
    public boolean isPlateletsDescriptionVisible() { return isVisible(plateletsDescriptionLocators); }
    public boolean isPlateletsEligibilityVisible() { return isVisible(plateletsEligibilityLocators); }
    public void tapPlateletsTitle() { tap(plateletsTitleLocators); }

    // AB Plasma Option
    public boolean isAbPlasmaTitleVisible() { return isVisible(abPlasmaTitleLocators); }
    public boolean isAbPlasmaDescriptionVisible() { return isVisible(abPlasmaDescriptionLocators); }
    public boolean isAbPlasmaEligibilityVisible() { return isVisible(abPlasmaEligibilityLocators); }
    public void tapAbPlasmaTitle() { tap(abPlasmaTitleLocators); }
}
