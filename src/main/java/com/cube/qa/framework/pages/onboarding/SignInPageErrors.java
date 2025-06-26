package com.cube.qa.framework.pages.onboarding;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class SignInPageErrors extends BasePage {

    private List<By> emailErrorMessageLocators;
    private List<By> passwordErrorMessageLocators;

    public SignInPageErrors(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            emailErrorMessageLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Email is invalid']")
            );
            passwordErrorMessageLocators = List.of(); // Not shown in iOS XML
        } else {
            emailErrorMessageLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/header_error_message' and @text='Email is invalid']")
            );
            passwordErrorMessageLocators = List.of(); // Not shown in Android XML
        }
    }

    // Email Error Message
    public boolean isEmailErrorVisible() {
        return isVisible(emailErrorMessageLocators);
    }

    // Password Error Message (if ever becomes visible in future)
    public boolean isPasswordErrorVisible() {
        return isVisible(passwordErrorMessageLocators);
    }
} 
