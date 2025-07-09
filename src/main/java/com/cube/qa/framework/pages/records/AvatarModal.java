package com.cube.qa.framework.pages.records;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class AvatarModal extends BasePage {

    private List<By> closeButtonLocators;
    private List<By> chooseAvatarHeaderLocators;
    private List<By> avatarOption1Locators;
    private List<By> avatarOption2Locators;
    private List<By> avatarOption3Locators;
    private List<By> avatarOption4Locators;
    private List<By> avatarOption5Locators;
    private List<By> avatarOption6Locators;
    private List<By> avatarOption7Locators;
    private List<By> avatarOption8Locators;
    private List<By> saveButtonLocators;

    public AvatarModal(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            closeButtonLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Close']")
            );
            chooseAvatarHeaderLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Choose an avatar']")
            );
            avatarOption1Locators = List.of(By.xpath("//XCUIElementTypeImage[@name='Features/Records/Avatars/Bear']"));
            avatarOption2Locators = List.of(By.xpath("//XCUIElementTypeImage[@name='Features/Records/Avatars/seal']"));
            avatarOption3Locators = List.of(By.xpath("//XCUIElementTypeImage[@name='Features/Records/Avatars/Cat']"));
            avatarOption4Locators = List.of(By.xpath("//XCUIElementTypeImage[@name='Features/Records/Avatars/panda']"));
            avatarOption5Locators = List.of(By.xpath("//XCUIElementTypeImage[@name='Features/Records/Avatars/duck']"));
            avatarOption6Locators = List.of(By.xpath("//XCUIElementTypeImage[@name='Features/Records/Avatars/lion']"));
            avatarOption7Locators = List.of(By.xpath("//XCUIElementTypeImage[@name='Features/Records/Avatars/monkey']"));
            avatarOption8Locators = List.of(By.xpath("//XCUIElementTypeImage[@name='Features/Records/Avatars/dog']"));
            saveButtonLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Save']")
            );

        } else {
            closeButtonLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/close_btn']")
            );
            chooseAvatarHeaderLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/choose_avatar_header']")
            );
            avatarOption1Locators = List.of(By.xpath("(//*[@resource-id='com.cube.arc.childcare:id/ic_avatar'])[1]"));
            avatarOption2Locators = List.of(By.xpath("(//*[@resource-id='com.cube.arc.childcare:id/ic_avatar'])[2]"));
            avatarOption3Locators = List.of(By.xpath("(//*[@resource-id='com.cube.arc.childcare:id/ic_avatar'])[3]"));
            avatarOption4Locators = List.of(By.xpath("(//*[@resource-id='com.cube.arc.childcare:id/ic_avatar'])[4]"));
            avatarOption5Locators = List.of(By.xpath("(//*[@resource-id='com.cube.arc.childcare:id/ic_avatar'])[5]"));
            avatarOption6Locators = List.of(By.xpath("(//*[@resource-id='com.cube.arc.childcare:id/ic_avatar'])[6]"));
            avatarOption7Locators = List.of(By.xpath("(//*[@resource-id='com.cube.arc.childcare:id/ic_avatar'])[7]"));
            avatarOption8Locators = List.of(By.xpath("(//*[@resource-id='com.cube.arc.childcare:id/ic_avatar'])[8]"));
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
        waitForSeconds(2);
    }

    // Choose Avatar Header
    public boolean isChooseAvatarHeaderVisible() {
        return isVisible(chooseAvatarHeaderLocators);
    }
    public boolean hasChooseAvatarHeaderText(String text) {
        return hasText(chooseAvatarHeaderLocators, text);
    }

    // Avatar Options
    public boolean isAvatarOption1Visible() {
        return isVisible(avatarOption1Locators);
    }
    public void tapAvatarOption1() {
        tap(avatarOption1Locators);
        waitForSeconds(2);
    }
    public boolean isAvatarOption2Visible() {
        return isVisible(avatarOption2Locators);
    }
    public void tapAvatarOption2() {
        tap(avatarOption2Locators);
        waitForSeconds(2);
    }
    public boolean isAvatarOption3Visible() {
        return isVisible(avatarOption3Locators);
    }
    public void tapAvatarOption3() {
        tap(avatarOption3Locators);
        waitForSeconds(2);
    }
    public boolean isAvatarOption4Visible() {
        return isVisible(avatarOption4Locators);
    }
    public void tapAvatarOption4() {
        tap(avatarOption4Locators);
        waitForSeconds(2);
    }
    public boolean isAvatarOption5Visible() {
        return isVisible(avatarOption5Locators);
    }
    public void tapAvatarOption5() {
        tap(avatarOption5Locators);
        waitForSeconds(2);
    }
    public boolean isAvatarOption6Visible() {
        return isVisible(avatarOption6Locators);
    }
    public void tapAvatarOption6() {
        tap(avatarOption6Locators);
        waitForSeconds(2);
    }
    public boolean isAvatarOption7Visible() {
        return isVisible(avatarOption7Locators);
    }
    public void tapAvatarOption7() {
        tap(avatarOption7Locators);
        waitForSeconds(2);
    }
    public boolean isAvatarOption8Visible() {
        return isVisible(avatarOption8Locators);
    }
    public void tapAvatarOption8() {
        tap(avatarOption8Locators);
        waitForSeconds(2);
    }

    // Save Button
    public boolean isSaveButtonVisible() {
        return isVisible(saveButtonLocators);
    }
    public void tapSaveButton() {
        tap(saveButtonLocators);
        waitForSeconds(2);
    }
}
