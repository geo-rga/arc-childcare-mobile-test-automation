package com.cube.qa.framework.pages.onboarding;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class PermissionsPage extends BasePage {

    private List<By> screenTitleLocators;
    private List<By> skipButtonLocators;
    private List<By> permissionTitleLocators;
    private List<By> permissionBodyLocators;
    private List<By> footerTextLocators;
    private List<By> enablePermissionsButtonLocators;

    public PermissionsPage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            screenTitleLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Permissions']")
            );
            skipButtonLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Skip']")
            );
            permissionTitleLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Enable Notification Permissions']")
            );
            permissionBodyLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Child Care app will remind you to maintain your app streak.']")
            );
            footerTextLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Tap below and select ‘allow’ for the best app experience.']")
            );
            enablePermissionsButtonLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Enable Permissions']")
            );
        } else {
            screenTitleLocators = List.of(
                    By.xpath("//*[@text='Permissions']")
            );
            skipButtonLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/skip']")
            );
            permissionTitleLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/text_permission_title']")
            );
            permissionBodyLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/text_permission_body']")
            );
            footerTextLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/text_permission_footer']")
            );
            enablePermissionsButtonLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/button_enable_permissions']")
            );
        }
    }

    // Screen Title
    public boolean isScreenTitleVisible() {
        return isVisible(screenTitleLocators);
    }

    // Skip Button
    public boolean isSkipButtonVisible() {
        return isVisible(skipButtonLocators);
    }
    public void tapSkipButton() {
        tap(skipButtonLocators);
    }

    // Permission Title
    public boolean isPermissionTitleVisible() {
        return isVisible(permissionTitleLocators);
    }
    public boolean hasPermissionTitleText(String text) {
        return hasText(permissionTitleLocators, text);
    }

    // Permission Body
    public boolean isPermissionBodyVisible() {
        return isVisible(permissionBodyLocators);
    }
    public boolean hasPermissionBodyText(String text) {
        return hasText(permissionBodyLocators, text);
    }

    // Footer Text
    public boolean isFooterTextVisible() {
        return isVisible(footerTextLocators);
    }
    public boolean hasFooterText(String text) {
        return hasText(footerTextLocators, text);
    }

    // Enable Permissions Button
    public boolean isEnablePermissionsButtonVisible() {
        return isVisible(enablePermissionsButtonLocators);
    }
    public void tapEnablePermissionsButton() {
        tap(enablePermissionsButtonLocators);
    }
}
