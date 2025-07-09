package com.cube.qa.framework.pages.givecare;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.NoAlertPresentException;
import java.util.List;

public class GiveCareCall extends BasePage {

    private List<By> androidDialedNumberFieldLocators;
    private List<By> androidDialButtonLocators;

    public GiveCareCall(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("android")) {
            androidDialedNumberFieldLocators = List.of(
                    By.xpath("//*[@resource-id='com.google.android.dialer:id/digits' and @text='911']")
            );
            androidDialButtonLocators = List.of(
                    By.xpath("//*[@resource-id='com.google.android.dialer:id/dialpad_voice_call_button']")
            );
        }
    }

    // iOS System Alert - Call Confirmation
    public boolean isCallConfirmationAlertVisible() {
        try {
            String alertText = driver.switchTo().alert().getText();
            return alertText != null && alertText.contains("Call 911");
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public String getCallConfirmationAlertText() {
        try {
            return driver.switchTo().alert().getText();
        } catch (NoAlertPresentException e) {
            return null;
        }
    }

    public void acceptCallConfirmationAlert() {
        try {
            driver.switchTo().alert().accept();
        } catch (NoAlertPresentException e) {
            // No alert to accept
        }
    }

    public void dismissCallConfirmationAlert() {
        try {
            driver.switchTo().alert().dismiss();
        } catch (NoAlertPresentException e) {
            // No alert to dismiss
        }
    }

    // Android Dial Pad
    public boolean isDialedNumberFieldVisible() {
        return isVisible(androidDialedNumberFieldLocators);
    }
    public boolean hasDialedNumberText(String text) {
        return hasText(androidDialedNumberFieldLocators, text);
    }
    public boolean isDialButtonVisible() {
        return isVisible(androidDialButtonLocators);
    }
    public void tapDialButton() {
        tap(androidDialButtonLocators);
    }
} 
