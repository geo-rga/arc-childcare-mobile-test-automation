package com.cube.qa.framework.pages.onboarding;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class HelpLoggingInPage extends BasePage {

    private List<By> screenTitleLocators;
    private List<By> sectionTitleLocators;
    private List<By> descriptionTextLocators;
    private List<By> recoverUsernameButtonLocators;
    private List<By> recoverPasswordButtonLocators;
    private List<By> findMyCertificateButtonLocators;
    private List<By> dismissButtonLocators;

    public HelpLoggingInPage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            screenTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Need Help Logging In']")
            );
            sectionTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Accounts and Sign In']")
            );
            descriptionTextLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[contains(@name, 'Signing into the American Red Cross')]")
            );
            recoverUsernameButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Recover Your User Name']")
            );
            recoverPasswordButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Recover Your Password']")
            );
            findMyCertificateButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Find My Certificate']")
            );
            dismissButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='_GENERAL_DISMISS']")
            );
        } else {
            screenTitleLocators = List.of(
                By.xpath("//*[@text='Need Help Logging In']")
            );
            sectionTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/text_section_name' and @text='Accounts and Sign In']")
            );
            descriptionTextLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/paragraph_title' and contains(@text, 'Signing into the American Red Cross')]")
            );
            recoverUsernameButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/chevron_link_title' and @text='Recover Your User Name']")
            );
            recoverPasswordButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/chevron_link_title' and @text='Recover Your Password']")
            );
            findMyCertificateButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/chevron_link_title' and @text='Find My Certificate']")
            );
            dismissButtonLocators = List.of(); // No dismiss button on Android
        }
    }

    public boolean isScreenTitleVisible() {
        return isVisible(screenTitleLocators);
    }
    public boolean isSectionTitleVisible() {
        return isVisible(sectionTitleLocators);
    }
    public boolean isDescriptionTextVisible() {
        return isVisible(descriptionTextLocators);
    }
    public boolean isRecoverUsernameButtonVisible() {
        return isVisible(recoverUsernameButtonLocators);
    }
    public void tapRecoverUsernameButton() {
        tap(recoverUsernameButtonLocators);
    }
    public boolean isRecoverPasswordButtonVisible() {
        return isVisible(recoverPasswordButtonLocators);
    }
    public void tapRecoverPasswordButton() {
        tap(recoverPasswordButtonLocators);
    }
    public boolean isFindMyCertificateButtonVisible() {
        return isVisible(findMyCertificateButtonLocators);
    }
    public void tapFindMyCertificateButton() {
        tap(findMyCertificateButtonLocators);
    }
    public boolean isDismissButtonVisible() {
        return isVisible(dismissButtonLocators);
    }
    public void tapDismissButton() {
        tap(dismissButtonLocators);
    }
}
