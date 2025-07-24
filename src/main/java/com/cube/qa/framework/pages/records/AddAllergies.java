package com.cube.qa.framework.pages.records;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class AddAllergies extends BasePage {

    private List<By> backButtonLocators;
    private List<By> allergyFieldLocators;
    private List<By> symptomsFieldLocators;
    private List<By> treatmentFieldLocators;
    private List<By> notesFieldLocators;
    private List<By> saveButtonLocators;

    public AddAllergies(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            backButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='_GENERAL_DISMISS']")
            );
            allergyFieldLocators = List.of(
                By.xpath("(//XCUIElementTypeTextField)[1]")
            );
            symptomsFieldLocators = List.of(
                By.xpath("(//XCUIElementTypeTextField)[2]")
            );
            treatmentFieldLocators = List.of(
                By.xpath("(//XCUIElementTypeTextField)[3]")
            );
            notesFieldLocators = List.of(
                By.xpath("(//XCUIElementTypeTextField)[4]")
            );
            saveButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Save' or @name=\"Update\"]")
            );

        } else {
            backButtonLocators = List.of(
                By.xpath("//android.widget.ImageButton")
            );
            allergyFieldLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/input_allergy']//*[@resource-id='com.cube.arc.childcare:id/input']")
            );
            symptomsFieldLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/input_symptoms']//*[@resource-id='com.cube.arc.childcare:id/input']")
            );
            treatmentFieldLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/input_treatment']//*[@resource-id='com.cube.arc.childcare:id/input']")
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

    // Allergy Field
    public boolean isAllergyFieldVisible() {
        return isVisible(allergyFieldLocators);
    }
    public void enterAllergy(String allergy) {
        enterText(allergyFieldLocators, allergy);
    }

    // Symptoms Field
    public boolean isSymptomsFieldVisible() {
        return isVisible(symptomsFieldLocators);
    }
    public void enterSymptoms(String symptoms) {
        scrollToFirstVisible(symptomsFieldLocators);
        enterText(symptomsFieldLocators, symptoms);
    }

    // Treatment Field
    public boolean isTreatmentFieldVisible() {
        return isVisible(treatmentFieldLocators);
    }
    public void enterTreatment(String treatment) {
        scrollToFirstVisible(treatmentFieldLocators);
        enterText(treatmentFieldLocators, treatment);
    }

    // Notes Field
    public boolean isNotesFieldVisible() {
        return isVisible(notesFieldLocators);
    }
    public void enterNotes(String notes) {
        scrollToFirstVisible(notesFieldLocators);
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