package com.cube.qa.framework.pages.onboarding;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;

import java.util.List;

public class CreateAccountDoYouHaveADonorIdPage extends BasePage {

    private List<By> donorIdTitleLocators;
    private List<By> yesDonorIdButtonLocators;
    private List<By> noDonorIdButtonLocators;
    private List<By> donorIdHelperTextLocators;
    private List<By> creatingAccountTextLocators;

    public CreateAccountDoYouHaveADonorIdPage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            donorIdTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Do you have a Donor ID?']")
            );
            yesDonorIdButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='YES - I HAVE A DONOR ID']")
            );
            noDonorIdButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name=\"NO - I DON'T HAVE A DONOR ID\"]")
            );
            donorIdHelperTextLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[contains(@name,'You can still create an account')]")
            );
            creatingAccountTextLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Creating Account...']")
            );
        } else {
            donorIdTitleLocators = List.of(
                By.xpath("//*[@text='Do you have a Donor ID?']")
            );
            yesDonorIdButtonLocators = List.of(
                By.xpath("//*[@text='YES - I HAVE A DONOR ID']")
            );
            noDonorIdButtonLocators = List.of(
                By.xpath("//*[@text=\"NO - I DON'T HAVE A DONOR ID\"]")
            );
            donorIdHelperTextLocators = List.of(
                By.xpath("//*[contains(@text,'You can still create an account')]")
            );
            creatingAccountTextLocators = List.of(
                By.xpath("//*[@text='Creating Account...']")
            );
        }
    }

    // Donor ID Title
    public boolean isDonorIdTitleVisible() {
        return isVisible(donorIdTitleLocators);
    }

    // Yes Button
    public boolean isYesDonorIdButtonVisible() {
        return isVisible(yesDonorIdButtonLocators);
    }
    public void tapYesDonorIdButton() {
        tap(yesDonorIdButtonLocators);
    }

    // No Button
    public boolean isNoDonorIdButtonVisible() {
        return isVisible(noDonorIdButtonLocators);
    }
    public void tapNoDonorIdButton() {
        tap(noDonorIdButtonLocators);
    }

    // Helper Text
    public boolean isDonorIdHelperTextVisible() {
        return isVisible(donorIdHelperTextLocators);
    }

    // Creating Account Text
    public boolean isCreatingAccountTextVisible() {
        return isVisible(creatingAccountTextLocators);
    }
}