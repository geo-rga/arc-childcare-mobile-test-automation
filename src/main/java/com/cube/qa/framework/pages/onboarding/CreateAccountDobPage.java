package com.cube.qa.framework.pages.onboarding;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class CreateAccountDobPage extends BasePage {

    private List<By> dobTitleLocators;
    private List<By> dobInputFieldLocators;
    private List<By> continueButtonLocators;
    private List<By> whyDoYouNeedToKnowThisButtonLocators;
    private List<By> whyPopupTitleLocators;
    private List<By> whyPopupTextLocators;
    private List<By> gotItButtonLocators;
    private List<By> ageRestrictionTitleLocators;
    private List<By> ageRestrictionTextLocators;
    private List<By> checkPolicyLinkLocators;

    public CreateAccountDobPage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            dobTitleLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name=\"What’s your date of birth?\"]")
            );
            dobInputFieldLocators = List.of(
                    By.xpath("//XCUIElementTypeTextField[@value='" + getExpectedDobValueIOS() + "']")
            );
            continueButtonLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='CONTINUE']")
            );
            whyDoYouNeedToKnowThisButtonLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Why do you need to know this?']")
            );
            whyPopupTitleLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Why do you need to know my date of birth?']")
            );
            whyPopupTextLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[contains(@name,'You must be at least 16 years old')]")
            );
            gotItButtonLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Got it!']")
            );
            ageRestrictionTitleLocators = List.of();
            ageRestrictionTextLocators = List.of();
            checkPolicyLinkLocators = List.of();
        } else {
            dobTitleLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/textView']")
            );
            dobInputFieldLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/dob']")
            );
            continueButtonLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/continue_button']")
            );
            whyDoYouNeedToKnowThisButtonLocators = List.of(
                    By.xpath("//*[@text='Why do you need to know this?']")
            );
            whyPopupTitleLocators = List.of(
                    By.xpath("//*[@text='Why do you need to know my date of birth?']")
            );
            whyPopupTextLocators = List.of(
                    By.xpath("//*[contains(@text, 'You must be at least 16 years old')]")
            );
            gotItButtonLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/action_okay']")
            );
            ageRestrictionTitleLocators = List.of(
                    By.xpath("//*[@text='Age Restriction']")
            );
            ageRestrictionTextLocators = List.of(
                    By.xpath("//*[contains(@text, 'you do not meet the minimum age requirement')]")
            );
            checkPolicyLinkLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/check_policy_link']")
            );
        }
    }

    // Utility for getting expected DOB value on iOS (Today minus 16 years)
    public String getExpectedDobValueIOS() {
        LocalDate date = LocalDate.now().minusYears(16);
        return date.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy"));
    }

    // DOB Title
    public boolean isDobTitleVisible() {
        return isVisible(dobTitleLocators);
    }

    // DOB Input
    public boolean isDobInputFieldVisible() {
        return isVisible(dobInputFieldLocators);
    }
    public void tapDobInputField() {
        tap(dobInputFieldLocators);
    }

    // Continue Button
    public boolean isContinueButtonVisible() {
        return isVisible(continueButtonLocators);
    }
    public void tapContinueButton() {
        tap(continueButtonLocators);
    }

    // Why Do You Need To Know This Button
    public boolean isWhyDoYouNeedToKnowThisButtonVisible() {
        return isVisible(whyDoYouNeedToKnowThisButtonLocators);
    }
    public void tapWhyDoYouNeedToKnowThisButton() {
        tap(whyDoYouNeedToKnowThisButtonLocators);
    }

    // Why Popup
    public boolean isWhyPopupTitleVisible() {
        return isVisible(whyPopupTitleLocators);
    }
    public boolean isWhyPopupTextVisible() {
        return isVisible(whyPopupTextLocators);
    }
    public boolean isGotItButtonVisible() {
        return isVisible(gotItButtonLocators);
    }
    public void tapGotItButton() {
        tap(gotItButtonLocators);
    }

    // Age Restriction
    public boolean isAgeRestrictionTitleVisible() {
        return isVisible(ageRestrictionTitleLocators);
    }
    public boolean isAgeRestrictionTextVisible() {
        return isVisible(ageRestrictionTextLocators);
    }
    public boolean isCheckPolicyLinkVisible() {
        return isVisible(checkPolicyLinkLocators);
    }
    public void tapCheckPolicyLink() {
        tap(checkPolicyLinkLocators);
    }

}
