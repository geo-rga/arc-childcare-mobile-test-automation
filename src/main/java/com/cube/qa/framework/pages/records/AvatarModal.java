package com.cube.qa.framework.pages.records;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class AvatarModal extends BasePage {

    private List<By> closeButtonLocators;
    private List<By> avatarTitleLocators;
    private List<By> avatar1Locators;
    private List<By> avatar2Locators;
    private List<By> avatar3Locators;
    private List<By> avatar4Locators;
    private List<By> avatar5Locators;
    private List<By> saveButtonLocators;

    public AvatarModal(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            closeButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Close']")
            );
            avatarTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Choose an avatar']")
            );
            avatar1Locators = List.of(
                By.xpath("//XCUIElementTypeImage[@name='Features/Records/Avatars/Avatar_1']")
            );
            avatar2Locators = List.of(
                By.xpath("//XCUIElementTypeImage[@name='Features/Records/Avatars/Avatar_2']")
            );
            avatar3Locators = List.of(
                By.xpath("//XCUIElementTypeImage[@name='Features/Records/Avatars/Avatar_3']")
            );
            avatar4Locators = List.of(
                By.xpath("//XCUIElementTypeImage[@name='Features/Records/Avatars/Avatar_4']")
            );
            avatar5Locators = List.of(
                By.xpath("//XCUIElementTypeImage[@name='Features/Records/Avatars/Avatar_5']")
            );
            saveButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Save']")
            );
        } else {
            closeButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/close_btn']")
            );
            avatarTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/choose_avatar_header']")
            );
            avatar1Locators = List.of(
                By.xpath("(//*[@resource-id='com.cube.arc.childcare:id/ic_avatar'])[1]")
            );
            avatar2Locators = List.of(
                By.xpath("(//*[@resource-id='com.cube.arc.childcare:id/ic_avatar'])[2]")
            );
            avatar3Locators = List.of(
                By.xpath("(//*[@resource-id='com.cube.arc.childcare:id/ic_avatar'])[3]")
            );
            avatar4Locators = List.of(
                By.xpath("(//*[@resource-id='com.cube.arc.childcare:id/ic_avatar'])[4]")
            );
            avatar5Locators = List.of(
                By.xpath("(//*[@resource-id='com.cube.arc.childcare:id/ic_avatar'])[5]")
            );
            saveButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/save_btn']")
            );
        }
    }

    // Close Button
    public boolean isCloseButtonVisible() {
        return isVisible(closeButtonLocators);
    }
    public void tapCloseButton() {
        tap(closeButtonLocators);
    }

    // Avatar Title
    public boolean isAvatarTitleVisible() {
        return isVisible(avatarTitleLocators);
    }

    // Avatars
    public boolean isAvatar1Visible() {
        return isVisible(avatar1Locators);
    }
    public void tapAvatar1() {
        tap(avatar1Locators);
    }

    public boolean isAvatar2Visible() {
        return isVisible(avatar2Locators);
    }
    public void tapAvatar2() {
        tap(avatar2Locators);
    }

    public boolean isAvatar3Visible() {
        return isVisible(avatar3Locators);
    }
    public void tapAvatar3() {
        tap(avatar3Locators);
    }

    public boolean isAvatar4Visible() {
        return isVisible(avatar4Locators);
    }
    public void tapAvatar4() {
        tap(avatar4Locators);
    }

    public boolean isAvatar5Visible() {
        return isVisible(avatar5Locators);
    }
    public void tapAvatar5() {
        tap(avatar5Locators);
    }

    // Save Button
    public boolean isSaveButtonVisible() {
        return isVisible(saveButtonLocators);
    }
    public boolean isSaveButtonDisabled() {
        return !isEnabled(saveButtonLocators);
    }
    public void tapSaveButton() {
        tap(saveButtonLocators);
    }
}
