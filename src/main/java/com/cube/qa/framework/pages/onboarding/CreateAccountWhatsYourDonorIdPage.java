package com.cube.qa.framework.pages.onboarding;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;

import java.util.List;

public class CreateAccountWhatsYourDonorIdPage extends BasePage {

    private List<By> donorIdTitleLocators;
    private List<By> donorIdInputFieldLocators;
    private List<By> donorIdHelpTextLocators;
    private List<By> continueButtonLocators;
    private List<By> continueWithoutDonorIdButtonLocators;

    public CreateAccountWhatsYourDonorIdPage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            donorIdTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name=\"What's your Donor ID?\"]")
            );
            donorIdInputFieldLocators = List.of(
                By.xpath("//XCUIElementTypeTextField[@value='From your Blood Donor ID card']")
            );
            donorIdHelpTextLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[contains(@name,\"Enter Donor ID in caps\")]")
            );
            continueButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='CONTINUE']")
            );
            continueWithoutDonorIdButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Continue without Donor ID']")
            );
        } else {
            donorIdTitleLocators = List.of(
                By.xpath("//*[@text=\"What's your Donor ID?\"]")
            );
            donorIdInputFieldLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/donor_id']")
            );
            donorIdHelpTextLocators = List.of(
                By.xpath("//*[contains(@text,'Enter Donor ID in caps')]")
            );
            continueButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/continue_button']")
            );
            continueWithoutDonorIdButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/no_donor_id_text_view']")
            );
        }
    }

    // Donor ID Title
    public boolean isDonorIdTitleVisible() {
        return isVisible(donorIdTitleLocators);
    }

    // Donor ID Input Field
    public boolean isDonorIdInputFieldVisible() {
        return isVisible(donorIdInputFieldLocators);
    }
    public void enterDonorId(String text) {
        enterText(donorIdInputFieldLocators, text);
    }
    public void clearDonorIdInput() {
        clear(donorIdInputFieldLocators);
    }

    // Donor ID Help Text
    public boolean isDonorIdHelpTextVisible() {
        return isVisible(donorIdHelpTextLocators);
    }

    // Continue Button
    public boolean isContinueButtonVisible() {
        return isVisible(continueButtonLocators);
    }
    public void tapContinueButton() {
        tap(continueButtonLocators);
    }

    // Continue Without Donor ID Button
    public boolean isContinueWithoutDonorIdButtonVisible() {
        return isVisible(continueWithoutDonorIdButtonLocators);
    }
    public void tapContinueWithoutDonorIdButton() {
        tap(continueWithoutDonorIdButtonLocators);
    }
}
