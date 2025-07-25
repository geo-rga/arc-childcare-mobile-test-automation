package tests;

import com.cube.qa.framework.utils.BaseTest;

import org.testng.annotations.Test;

public class ChildRecordsTests extends BaseTest {

    @Test(groups = {"smoke"})
    public void userCanAddRecordTC19014(){
        continueAsGuest();
        bottomNavBar.tapRecordsTab();
        recordsEmptyState.tapAddChildRecordButton();
        recordInputScreen.enterName("test");
        recordInputScreen.tapCreateButton();
        singleRecordAddedState.isProfileNameVisible();
    }

    @Test(groups = {"smoke"})
    public void userCannotAddEmptyRecordTC19015(){
        continueAsGuest();
        openChildRecordsInput();
        recordInputScreen.isCreateButtonDisabled();
    }

    @Test(groups = {"smoke"})
    public void validateAvatarDisplayTC19017(){
        continueAsGuest();
        openChildRecordsInput();
        recordInputScreen.tapAddAvatarButton();
        avatarModal.tapAvatarOption1();
        avatarModal.tapSaveButton();
        recordInputScreen.isRandomizeAvatarButtonVisible();
        recordInputScreen.isRemoveAvatarButtonVisible();
    }
    @Test(groups = {"smoke"})
    public void userCanAddContactTC19034(){
        continueAsGuest();
        openChildRecordsInput();
        recordInputScreen.wait(2);
        recordInputScreen.scrollToFirstVisibleAddContactButton();
        recordInputScreen.tapAddContactButton();
        addContact.enterName("John Doe");
        addContact.enterRelationship("Uncle");
        addContact.enterPhoneNumber("00000000000");
        addContact.enterEmail("testing@3sidedcube.com");
        addContact.enterNotes("Example notes");
        addContact.tapSaveButton();
        recordInputScreen.wait(2);
        recordInputScreen.isEmergencyContactHeaderVisible();
        recordInputScreen.isEmergencyContactNameVisible();
        recordInputScreen.isEmergencyContactPhoneVisible();
    }
    @Test(groups = {"smoke"})
    public void userCanAddAllergyTC19050(){
        continueAsGuest();
        openChildRecordsInput();
        recordInputScreen.scrollToFirstVisibleAddAllergiesButton();
        recordInputScreen.tapAddAllergiesButton();
        addAllergies.enterAllergy("Sample allergy");
        addAllergies.enterSymptoms("Sample symptoms");
        addAllergies.enterTreatment("Sample treatment");
        addAllergies.enterNotes("Example notes");
        addAllergies.tapSaveButton();
        recordInputScreen.wait(2);
        recordInputScreen.isAllergiesHeaderVisible();
        recordInputScreen.isAllergyTitleVisible();
        recordInputScreen.isAllergySubtitleVisible();
    }

    @Test(groups = {"smoke"})
    public void userCanEditRecordInformationTC19058(){
        continueAsGuest();
        openChildRecordsInput();
        addChildRecord();
        singleRecordAddedState.isProfileNameVisible();
        singleRecordAddedState.tapProfileChevron();
        recordInputScreen.wait(2);
        addChildRecordAvatar();
        recordInputScreen.enterName("Billy");
//        FIXME: Date of birth on iOS
//        setDateOfBirth();
//        recordInputScreen.enterDateOfBirth("01/01/2020");
        editCustomRecordContact(
                "Dan",
                "Stepdad",
                "00110202030",
                "testing+1@3sidedcube.com",
                "Edited Notes"
        );
        editCustomRecordMedication(
                "Medication",
                "100mg",
                "Every 4 hours",
                "Edited Notes"
        );
        editCustomRecordAllergy(
                "Allergy",
                "Swelling",
                "Medication",
                "Edited Notes"
        );
        recordInputScreen.enterNotes("Edited Notes");
        recordInputScreen.tapCreateButton();
    }

    @Test(groups = {"wip"})
    public void userCanDeleteRecordTC19064(){
        continueAsGuest();
        openChildRecordsInput();
        addChildRecord();
        singleRecordAddedState.isProfileNameVisible();
        singleRecordAddedState.tapProfileChevron();
        recordInputScreen.wait(2);
        recordInputScreen.scrollToFirstVisibleDeleteRecordButton();
        recordInputScreen.tapDeleteRecordButton();
        recordInputScreen.wait(2);
        recordInputScreen.isRecordDeleteAlertCancelVisible();
        recordInputScreen.isRecordDeleteAlertDeleteVisible();
        recordInputScreen.tapRecordDeleteAlertDeleteButton();
        recordInputScreen.wait(2);
        recordsEmptyState.isAddChildRecordButtonVisible();
    }

}
