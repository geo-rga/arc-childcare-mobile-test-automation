package com.cube.qa.framework.pages.records;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class AddContact extends BasePage {

    private List<By> backButtonLocators;
    private List<By> nameFieldLocators;
    private List<By> relationshipFieldLocators;
    private List<By> phoneNumberFieldLocators;
    private List<By> emailFieldLocators;
    private List<By> notesFieldLocators;
    private List<By> saveButtonLocators;

    public AddContact(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            backButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='_GENERAL_DISMISS']")
            );
            nameFieldLocators = List.of(
                By.xpath("(//XCUIElementTypeTextField)[1]")
            );
            relationshipFieldLocators = List.of(
                By.xpath("(//XCUIElementTypeTextField)[2]")
            );
            phoneNumberFieldLocators = List.of(
                By.xpath("(//XCUIElementTypeTextField)[3]")
            );
            emailFieldLocators = List.of(
                By.xpath("(//XCUIElementTypeTextField)[4]")
            );
            notesFieldLocators = List.of(
                By.xpath("(//XCUIElementTypeTextField)[5]")
            );
            saveButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Save']")
            );

        } else {
            backButtonLocators = List.of(
                By.xpath("//android.widget.ImageButton")
            );
            nameFieldLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/input_name']//*[@resource-id='com.cube.arc.childcare:id/input']")
            );
            relationshipFieldLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/input_relationship']//*[@resource-id='com.cube.arc.childcare:id/input']")
            );
            phoneNumberFieldLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/input_phone']//*[@resource-id='com.cube.arc.childcare:id/input']")
            );
            emailFieldLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/input_email']//*[@resource-id='com.cube.arc.childcare:id/input']")
            );
            notesFieldLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/input_notes']//*[@resource-id='com.cube.arc.childcare:id/input']")
            );
            saveButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/save_btn']")
            );
        }
    }

    // Back Button
    public boolean isBackButtonVisible() {
        return isVisible(backButtonLocators);
    }
    public void tapBackButton() {
        tap(backButtonLocators);
    }

    // Name Field
    public boolean isNameFieldVisible() {
        return isVisible(nameFieldLocators);
    }
    public void enterName(String name) {
        enterText(nameFieldLocators, name);
    }

    // Relationship Field
    public boolean isRelationshipFieldVisible() {
        return isVisible(relationshipFieldLocators);
    }
    public void enterRelationship(String relationship) {
        enterText(relationshipFieldLocators, relationship);
    }

    // Phone Number Field
    public boolean isPhoneNumberFieldVisible() {
        return isVisible(phoneNumberFieldLocators);
    }
    public void enterPhoneNumber(String phoneNumber) {
        enterText(phoneNumberFieldLocators, phoneNumber);
    }

    // Email Field
    public boolean isEmailFieldVisible() {
        return isVisible(emailFieldLocators);
    }
    public void enterEmail(String email) {
        enterText(emailFieldLocators, email);
    }

    // Notes Field
    public boolean isNotesFieldVisible() {
        return isVisible(notesFieldLocators);
    }
    public void enterNotes(String notes) {
        enterText(notesFieldLocators, notes);
    }

    // Save Button
    public boolean isSaveButtonVisible() {
        return isVisible(saveButtonLocators);
    }
    public void tapSaveButton() {
        tap(saveButtonLocators);
    }
}
