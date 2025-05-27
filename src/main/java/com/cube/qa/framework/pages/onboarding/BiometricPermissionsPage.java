package com.cube.qa.framework.pages.onboarding;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class BiometricPermissionsPage extends BasePage {

    private List<By> titleLocators;
    private List<By> benefitOneLocators;
    private List<By> benefitTwoLocators;
    private List<By> enablePermissionsButtonLocators;
    private List<By> notNowButtonLocators;

    public BiometricPermissionsPage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            titleLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Enable permissions for biometric login']")
            );
            benefitOneLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='You can use Biometrics for fast and secure access to your App.']")
            );
            benefitTwoLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name=\"You won’t need to enter your password after setting it up.\"]")
            );
            enablePermissionsButtonLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Enable permissions']")
            );
            notNowButtonLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Not now']")
            );
        } else {
            titleLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/biometrics_title']")
            );
            benefitOneLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/biometric_benefit_one']")
            );
            benefitTwoLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/biometric_benefit_two']")
            );
            enablePermissionsButtonLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/enable_biometrics_button']")
            );
            notNowButtonLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/not_now']")
            );
        }
    }

    // Title
    public boolean isTitleVisible() {
        return isVisible(titleLocators);
    }
    public boolean hasTitleText(String text) {
        return hasText(titleLocators, text);
    }

    // Benefit One
    public boolean isBenefitOneVisible() {
        return isVisible(benefitOneLocators);
    }
    public boolean hasBenefitOneText(String text) {
        return hasText(benefitOneLocators, text);
    }

    // Benefit Two
    public boolean isBenefitTwoVisible() {
        return isVisible(benefitTwoLocators);
    }
    public boolean hasBenefitTwoText(String text) {
        return hasText(benefitTwoLocators, text);
    }

    // Enable Permissions Button
    public boolean isEnablePermissionsButtonVisible() {
        return isVisible(enablePermissionsButtonLocators);
    }
    public void tapEnablePermissionsButton() {
        tap(enablePermissionsButtonLocators);
    }

    // Not Now Button
    public boolean isNotNowButtonVisible() {
        return isVisible(notNowButtonLocators);
    }
    public void tapNotNowButton() {
        tap(notNowButtonLocators);
    }
}
