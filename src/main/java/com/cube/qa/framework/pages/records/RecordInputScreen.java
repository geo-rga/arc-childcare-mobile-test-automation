package com.cube.qa.framework.pages.records;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;

import java.util.List;

public class RecordInputScreen extends BasePage {

    private List<By> createRecordTitleLocators;
    private List<By> addAvatarButtonLocators;
    private List<By> nameInputFieldLocators;
    private List<By> dobInputFieldLocators;
    private List<By> familyNameInputFieldLocators;
    private List<By> addContactButtonLocators;
    private List<By> addMedicationButtonLocators;
    private List<By> addAllergiesButtonLocators;
    private List<By> notesInputFieldLocators;
    private List<By> privacyMessageLocators;
    private List<By> createButtonLocators;
    private List<By> avatarTitleLocators;
    private List<By> avatarImageLocators;
    private List<By> randomizeAvatarButtonLocators;
    private List<By> removeAvatarButtonLocators;

    public RecordInputScreen(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            createRecordTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Create Record']")
            );
            addAvatarButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Add Avatar']")
            );
            nameInputFieldLocators = List.of(
                By.xpath("//XCUIElementTypeTextField[preceding-sibling::XCUIElementTypeStaticText[@name='Enter name']]")
            );
            dobInputFieldLocators = List.of(
                By.xpath("//XCUIElementTypeDatePicker//XCUIElementTypeButton[@name='Date Picker']")
            );
            familyNameInputFieldLocators = List.of(
                By.xpath("//XCUIElementTypeTextField[preceding-sibling::XCUIElementTypeStaticText[@name='Enter family name']]")
            );
            addContactButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Add Contact']")
            );
            addMedicationButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Add Medication']")
            );
            addAllergiesButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Add Allergies']")
            );
            notesInputFieldLocators = List.of(
                By.xpath("//XCUIElementTypeTextField[preceding-sibling::XCUIElementTypeStaticText[@name='Enter notes']]")
            );
            privacyMessageLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[contains(@name,'Information about your child')]")
            );
            createButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Create']")
            );
            avatarTitleLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Choose an avatar']")
            );
            avatarImageLocators = List.of(
                    By.xpath("//XCUIElementTypeImage[@name='Features/Records/Avatars/Bear']")
            );
            randomizeAvatarButtonLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Randomize Avatar']")
            );
            removeAvatarButtonLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Remove Avatar']")
            );
        } else {
            createRecordTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/toolbar']//android.widget.TextView[@text='Create Record']")
            );
            addAvatarButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/choose_avatar_btn']")
            );
            nameInputFieldLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/profile_name_inputfield']//android.widget.EditText")
            );
            dobInputFieldLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/profile_age_inputfield']//android.widget.EditText")
            );
            familyNameInputFieldLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/input_family_name']")
            );
            addContactButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/add_contact_btn']")
            );
            addMedicationButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/add_medication_btn']")
            );
            addAllergiesButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/add_allergies_btn']")
            );
            notesInputFieldLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/profile_notes_inputfield']//android.widget.EditText")
            );
            privacyMessageLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/warning_banner']")
            );
            createButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/update_childrecord_btn']")
            );
            avatarTitleLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/header_avatar']")
            );
            avatarImageLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/profile_avatar']")
            );
            randomizeAvatarButtonLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/choose_avatar_btn']")
            );
            removeAvatarButtonLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/remove_avatar_btn']")
            );
        }
    }

    public boolean isCreateRecordTitleVisible() {
        return isVisible(createRecordTitleLocators);
    }

    public void tapAddAvatarButton() {
        tap(addAvatarButtonLocators);
        waitForSeconds(2);
    }

    public void enterName(String name) {
        clear(nameInputFieldLocators);
        enterText(nameInputFieldLocators, name);
    }

    public void enterDateOfBirth(String dob) {
        clear(dobInputFieldLocators);
        enterText(dobInputFieldLocators, dob);
    }

    public void enterFamilyName(String familyName) {
        clear(familyNameInputFieldLocators);
        enterText(familyNameInputFieldLocators, familyName);
    }

    public void scrollToFirstVisibleAddContactButton() {
        waitForSeconds(2);
        scrollToFirstVisible(addContactButtonLocators);
        waitForSeconds(2);
    }

    public void tapAddContactButton() {
        tap(addContactButtonLocators);
        waitForSeconds(2);
    }

    public void scrollToFirstVisibleAddMedicationButton() {
        scrollToFirstVisible(addMedicationButtonLocators);
        waitForSeconds(2);
    }

    public void tapAddMedicationButton() {
        tap(addMedicationButtonLocators);
    }


    public void scrollToFirstVisibleAddAllergiesButton() {
        scrollToFirstVisible(addAllergiesButtonLocators);
        waitForSeconds(2);
    }
    public void tapAddAllergiesButton() {
        tap(addAllergiesButtonLocators);
    }

    public void enterNotes(String notes) {
        clear(notesInputFieldLocators);
        enterText(notesInputFieldLocators, notes);
    }

    public void tapCreateButton() {
        tap(createButtonLocators);
        waitForSeconds(2);
    }

    public boolean isCreateButtonDisabled() {
        return !isEnabled(createButtonLocators);
    }

    // Avatar Title
    public boolean isAvatarTitleVisible() {
        return isVisible(avatarTitleLocators);
    }

    // Avatar Image
    public boolean isAvatarImageVisible() {
        return isVisible(avatarImageLocators);
    }

    // Randomize Avatar Button
    public boolean isRandomizeAvatarButtonVisible() {
        return isVisible(randomizeAvatarButtonLocators);
    }
    public void tapRandomizeAvatarButton() {
        tap(randomizeAvatarButtonLocators);
        waitForSeconds(2);
    }

    // Remove Avatar Button
    public boolean isRemoveAvatarButtonVisible() {
        return isVisible(removeAvatarButtonLocators);
    }
    public void tapRemoveAvatarButton() {
        tap(removeAvatarButtonLocators);
        waitForSeconds(2);
    }

    public void wait(int waitInt){
        waitForSeconds(waitInt);
    }
}
