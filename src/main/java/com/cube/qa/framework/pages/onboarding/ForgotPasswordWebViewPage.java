package com.cube.qa.framework.pages.onboarding;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class ForgotPasswordWebViewPage extends BasePage {

    private List<By> webViewLocators;
    private List<By> backButtonLocators;
    private List<By> forwardButtonLocators;
    private List<By> closeButtonLocators;

    public ForgotPasswordWebViewPage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            webViewLocators = List.of(
                By.xpath("//XCUIElementTypeWebView")
            );
            backButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='_GENERAL_BACK_ACCESSIBILITY_HINT']")
            );
            forwardButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='_GENERAL_FORWARD_ACCESSIBILITY_HINT']")
            );
            closeButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='navigationBarClose']")
            );
        } else {
            webViewLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/web_view']")
            );
            backButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/back_button']")
            );
            forwardButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/forward_button']")
            );
            closeButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/close_button']")
            );
        }
    }

    public boolean isWebViewVisible() {
        return isVisible(webViewLocators);
    }
    public boolean isBackButtonVisible() {
        return isVisible(backButtonLocators);
    }
    public void tapBackButton() {
        tap(backButtonLocators);
    }
    public boolean isForwardButtonVisible() {
        return isVisible(forwardButtonLocators);
    }
    public void tapForwardButton() {
        tap(forwardButtonLocators);
    }
    public boolean isCloseButtonVisible() {
        return isVisible(closeButtonLocators);
    }
    public void tapCloseButton() {
        tap(closeButtonLocators);
    }
}
