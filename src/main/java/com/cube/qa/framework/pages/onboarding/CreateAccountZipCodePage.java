
package com.cube.qa.framework.pages.onboarding;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;

import java.util.List;

public class CreateAccountZipCodePage extends BasePage {

    private List<By> zipCodeTitleLocators;
    private List<By> zipCodeInputFieldLocators;
    private List<By> continueButtonLocators;
    private List<By> zipCodeHelpTextLocators;
    private List<By> invalidZipCodeErrorLocators;

    public CreateAccountZipCodePage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            zipCodeTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name=\"What's your ZIP code?\"]")
            );
            zipCodeInputFieldLocators = List.of(
                By.xpath("//XCUIElementTypeTextField[@value='ZIP code']")
            );
            continueButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='CONTINUE']")
            );
            zipCodeHelpTextLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[contains(@name,\"If you’re an existing donor\")]")
            );
            invalidZipCodeErrorLocators = List.of();
        } else {
            zipCodeTitleLocators = List.of(
                By.xpath("//*[@text=\"What's your ZIP code?\"]")
            );
            zipCodeInputFieldLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/postal_code']")
            );
            continueButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.blood:id/continue_button']")
            );
            zipCodeHelpTextLocators = List.of(
                By.xpath("//*[contains(@text,\"If you’re an existing donor\")]")
            );
            invalidZipCodeErrorLocators = List.of(
                By.xpath("//*[contains(@text,\"The ZIP code you have entered is not valid\")]")
            );
        }
    }

    // ZIP Code Title
    public boolean isZipCodeTitleVisible() {
        return isVisible(zipCodeTitleLocators);
    }

    // ZIP Code Input
    public boolean isZipCodeInputFieldVisible() {
        return isVisible(zipCodeInputFieldLocators);
    }
    public void enterZipCode(String text) {
        enterText(zipCodeInputFieldLocators, text);
    }
    public void clearZipCode() {
        clear(zipCodeInputFieldLocators);
    }

    // Continue Button
    public boolean isContinueButtonVisible() {
        return isVisible(continueButtonLocators);
    }
    public void tapContinueButton() {
        tap(continueButtonLocators);
    }

    // Help Text
    public boolean isZipCodeHelpTextVisible() {
        return isVisible(zipCodeHelpTextLocators);
    }

    // Invalid ZIP Code Error
    public boolean isInvalidZipCodeErrorVisible() {
        return isVisible(invalidZipCodeErrorLocators);
    }
}
