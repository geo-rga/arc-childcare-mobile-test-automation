package com.cube.qa.framework.pages.scheduling;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class DonationTypePage extends BasePage {

    private List<By> bloodTitleLocators;
    private List<By> bloodDescriptionLocators;
    private List<By> bloodEligibilityLocators;

    private List<By> powerRedTitleLocators;
    private List<By> powerRedDescriptionLocators;
    private List<By> powerRedEligibilityLocators;

    private List<By> plateletsTitleLocators;
    private List<By> plateletsDescriptionLocators;
    private List<By> plateletsEligibilityLocators;

    private List<By> abPlasmaTitleLocators;
    private List<By> abPlasmaDescriptionLocators;
    private List<By> abPlasmaEligibilityLocators;

    private List<By> sponsorCodeButtonLocators;
    private List<By> sponsorCodeInputFieldLocators;
    private List<By> sponsorCodeModalTitleLocators;
    private List<By> sponsorCodeModalCancelButtonLocators;
    private List<By> sponsorCodeModalDoneButtonLocators;
    private List<By> sponsorCodeAppliedLabelLocators;
    private List<By> sponsorCodeEditButtonLocators;
    private List<By> sponsorCodeWhatIsThisButtonLocators;

    private List<By> sponsorCodeNotFoundTitleLocators;
    private List<By> sponsorCodeNotFoundDescriptionLocators;
    private List<By> tryAgainButtonLocators;
    private List<By> sponsorCodeInfoTitleLocators;
    private List<By> sponsorCodeInfoDescriptionLocators;

    public DonationTypePage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            bloodTitleLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Blood.']")
            );
            bloodDescriptionLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='The most common type of donation.']")
            );
            bloodEligibilityLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='You can donate now']")
            );

            powerRedTitleLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Power Red.']")
            );
            powerRedDescriptionLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name=\"Best if you're type O or RH- negative.\"]")
            );
            powerRedEligibilityLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='You can donate now']")
            );

            plateletsTitleLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Platelets.']")
            );
            plateletsDescriptionLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Only available at select centers.']")
            );
            plateletsEligibilityLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='You can donate now']")
            );

            abPlasmaTitleLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='AB Plasma.']")
            );
            abPlasmaDescriptionLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Only available at select centers. Donor must be AB Blood type.']")
            );
            abPlasmaEligibilityLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='You can donate now']")
            );
            sponsorCodeButtonLocators = List.of(By.xpath("//XCUIElementTypeButton[@name='USE SPONSOR CODE']"));
            sponsorCodeInputFieldLocators = List.of(By.xpath("//XCUIElementTypeTextField"));
            sponsorCodeModalTitleLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Sponsor Code']"));
            sponsorCodeModalCancelButtonLocators = List.of(By.xpath("//XCUIElementTypeButton[@name='Cancel']"));
            sponsorCodeModalDoneButtonLocators = List.of(By.xpath("//XCUIElementTypeButton[@name='Done']"));
            sponsorCodeAppliedLabelLocators = List.of(By.xpath("//XCUIElementTypeStaticText[contains(@name, 'Sponsor Code Applied')]"));
            sponsorCodeEditButtonLocators = List.of(By.xpath("//XCUIElementTypeButton[@name='EDIT']"));
            sponsorCodeNotFoundTitleLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Sponsor Code Not Found']"));
            sponsorCodeNotFoundDescriptionLocators = List.of(By.xpath("//XCUIElementTypeStaticText[contains(@name, 'The code you entered could not be found')]"));
            tryAgainButtonLocators = List.of(By.xpath("//XCUIElementTypeButton[@name='TRY AGAIN']"));
            sponsorCodeInfoTitleLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='What is a sponsor code?']"));
            sponsorCodeInfoDescriptionLocators = List.of(By.xpath("//XCUIElementTypeStaticText[contains(@name, 'The sponsor code is a unique word')]"));
            sponsorCodeWhatIsThisButtonLocators = List.of(By.xpath("//XCUIElementTypeButton[@name='What is this?']"));
        } else {
            bloodTitleLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_title' and @text='Blood']")
            );
            bloodDescriptionLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_body' and @text='The most common type of donation.']")
            );
            bloodEligibilityLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/eligible_date' and @text='You can donate now']")
            );

            powerRedTitleLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_title' and @text='Power Red']")
            );
            powerRedDescriptionLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_body' and @text=\"Best if you're type O or RH- negative.\"]")
            );
            powerRedEligibilityLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/eligible_date' and @text='You can donate now']")
            );

            plateletsTitleLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_title' and @text='Platelets']")
            );
            plateletsDescriptionLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_body' and @text='Only available at select centers.']")
            );
            plateletsEligibilityLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/eligible_date' and @text='You can donate now']")
            );

            abPlasmaTitleLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_title' and @text='AB Plasma']")
            );
            abPlasmaDescriptionLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_body' and @text='Only available at select centers. Donor must be AB Blood type.']")
            );
            abPlasmaEligibilityLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.blood:id/eligible_date' and @text='You can donate now']")
            );
            sponsorCodeButtonLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/sponsor_code']"));
            sponsorCodeInputFieldLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/sponsor_code']"));
            sponsorCodeModalTitleLocators = List.of(By.xpath("//*[@resource-id='android:id/alertTitle' and @text='Sponsor Code']"));
            sponsorCodeModalCancelButtonLocators = List.of(By.xpath("//*[@resource-id='android:id/button2' and @text='CANCEL']"));
            sponsorCodeModalDoneButtonLocators = List.of(By.xpath("//*[@resource-id='android:id/button1' and @text='DONE']"));
            sponsorCodeAppliedLabelLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/snackbar_title' and @text='Sponsor Code Applied']"));
            sponsorCodeEditButtonLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/button_neutral' and @text='EDIT']"));
            sponsorCodeNotFoundTitleLocators = List.of(By.xpath("//*[@class='android.widget.TextView' and @text='Sponsor Code Not Found']"));
            sponsorCodeNotFoundDescriptionLocators = List.of(By.xpath("//*[contains(@text, 'The code you entered could not be found')]"));
            tryAgainButtonLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/close' and @text='TRY AGAIN']"));

            sponsorCodeInfoTitleLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/title' and @text='What is a sponsor code?']"));
            sponsorCodeInfoDescriptionLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/description' and contains(@text, 'The sponsor code is a unique word')]"));
            sponsorCodeWhatIsThisButtonLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/more_info']"));

        }
    }

    // Blood Option
    public boolean isBloodTitleVisible() { return isVisible(bloodTitleLocators); }
    public boolean isBloodDescriptionVisible() { return isVisible(bloodDescriptionLocators); }
    public boolean isBloodEligibilityVisible() { return isVisible(bloodEligibilityLocators); }
    public void tapBloodTitle() { tap(bloodTitleLocators); }

    // Power Red Option
    public boolean isPowerRedTitleVisible() { return isVisible(powerRedTitleLocators); }
    public boolean isPowerRedDescriptionVisible() { return isVisible(powerRedDescriptionLocators); }
    public boolean isPowerRedEligibilityVisible() { return isVisible(powerRedEligibilityLocators); }
    public void tapPowerRedTitle() { tap(powerRedTitleLocators); }

    // Platelets Option
    public boolean isPlateletsTitleVisible() { return isVisible(plateletsTitleLocators); }
    public boolean isPlateletsDescriptionVisible() { return isVisible(plateletsDescriptionLocators); }
    public boolean isPlateletsEligibilityVisible() { return isVisible(plateletsEligibilityLocators); }
    public void tapPlateletsTitle() { tap(plateletsTitleLocators); }

    // AB Plasma Option
    public boolean isAbPlasmaTitleVisible() { return isVisible(abPlasmaTitleLocators); }
    public boolean isAbPlasmaDescriptionVisible() { return isVisible(abPlasmaDescriptionLocators); }
    public boolean isAbPlasmaEligibilityVisible() { return isVisible(abPlasmaEligibilityLocators); }
    public void tapAbPlasmaTitle() { tap(abPlasmaTitleLocators); }

    // Sponsor Code Button
    public boolean isSponsorCodeButtonVisible() { return isVisible(sponsorCodeButtonLocators); }
    public void tapSponsorCodeButton() { tap(sponsorCodeButtonLocators); }

    // Sponsor Code Input Field
    public boolean isSponsorCodeInputFieldVisible() { return isVisible(sponsorCodeInputFieldLocators); }
    public void enterSponsorCode(String code) { enterText(sponsorCodeInputFieldLocators, code); }

    // Sponsor Code Modal Title
    public boolean isSponsorCodeModalTitleVisible() { return isVisible(sponsorCodeModalTitleLocators); }

    // Sponsor Code Modal Cancel Button
    public boolean isSponsorCodeModalCancelButtonVisible() { return isVisible(sponsorCodeModalCancelButtonLocators); }
    public void tapSponsorCodeModalCancelButton() { tap(sponsorCodeModalCancelButtonLocators); }

    // Sponsor Code Modal Done Button
    public boolean isSponsorCodeModalDoneButtonVisible() { return isVisible(sponsorCodeModalDoneButtonLocators); }
    public void tapSponsorCodeModalDoneButton() { tap(sponsorCodeModalDoneButtonLocators); }

    // Sponsor Code Applied Label
    public boolean isSponsorCodeAppliedLabelVisible() { return isVisible(sponsorCodeAppliedLabelLocators); }

    // Sponsor Code Edit Button
    public boolean isSponsorCodeEditButtonVisible() { return isVisible(sponsorCodeEditButtonLocators); }
    public void tapSponsorCodeEditButton() { tap(sponsorCodeEditButtonLocators); }

    // Sponsor Code Not Found Title
    public boolean isSponsorCodeNotFoundTitleVisible() { return isVisible(sponsorCodeNotFoundTitleLocators); }

    // Sponsor Code Not Found Description
    public boolean isSponsorCodeNotFoundDescriptionVisible() { return isVisible(sponsorCodeNotFoundDescriptionLocators); }

    // Try Again Button
    public boolean isTryAgainButtonVisible() { return isVisible(tryAgainButtonLocators); }
    public void tapTryAgainButton() { tap(tryAgainButtonLocators); }

    // What is a Sponsor Code? Title
    public boolean isSponsorCodeInfoTitleVisible() { return isVisible(sponsorCodeInfoTitleLocators); }

    // What is a Sponsor Code? Description
    public boolean isSponsorCodeInfoDescriptionVisible() { return isVisible(sponsorCodeInfoDescriptionLocators); }

    // Sponsor Code What Is This Button
    public boolean isSponsorCodeWhatIsThisButtonVisible() { return isVisible(sponsorCodeWhatIsThisButtonLocators); }
    public void tapSponsorCodeWhatIsThisButton() { tap(sponsorCodeWhatIsThisButtonLocators); }
}
