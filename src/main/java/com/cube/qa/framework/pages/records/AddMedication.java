package com.cube.qa.framework.pages.records;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class AddMedication extends BasePage {

    private List<By> backButtonLocators;
    private List<By> medicationNameFieldLocators;
    private List<By> dosageFieldLocators;
    private List<By> frequencyFieldLocators;
    private List<By> notesFieldLocators;
    private List<By> saveButtonLocators;

    public AddMedication(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            backButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='_GENERAL_DISMISS']")
            );
            medicationNameFieldLocators = List.of(
                By.xpath("(//XCUIElementTypeTextField)[1]")
            );
            dosageFieldLocators = List.of(
                By.xpath("(//XCUIElementTypeTextField)[2]")
            );
            frequencyFieldLocators = List.of(
                By.xpath("(//XCUIElementTypeTextField)[3]")
            );
            notesFieldLocators = List.of(
                By.xpath("(//XCUIElementTypeTextField)[4]")
            );
            saveButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Save']")
            );

        } else {
            backButtonLocators = List.of(
                By.xpath("//android.widget.ImageButton")
            );
            medicationNameFieldLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/input_medication']//*[@resource-id='com.cube.arc.childcare:id/input']")
            );
            dosageFieldLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/input_dosage']//*[@resource-id='com.cube.arc.childcare:id/input']")
            );
            frequencyFieldLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/input_frequency']//*[@resource-id='com.cube.arc.childcare:id/input']")
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

    // Medication Name
    public boolean isMedicationNameFieldVisible() {
        return isVisible(medicationNameFieldLocators);
    }
    public void enterMedicationName(String name) {
        enterText(medicationNameFieldLocators, name);
    }

    // Dosage Field
    public boolean isDosageFieldVisible() {
        return isVisible(dosageFieldLocators);
    }
    public void enterDosage(String dosage) {
        enterText(dosageFieldLocators, dosage);
    }

    // Frequency Field
    public boolean isFrequencyFieldVisible() {
        return isVisible(frequencyFieldLocators);
    }
    public void enterFrequency(String frequency) {
        enterText(frequencyFieldLocators, frequency);
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
