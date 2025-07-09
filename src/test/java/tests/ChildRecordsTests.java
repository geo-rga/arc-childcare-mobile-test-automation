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
        bottomNavBar.tapRecordsTab();
        recordsEmptyState.tapAddChildRecordButton();
        recordInputScreen.isCreateButtonDisabled();
    }

    @Test(groups = {"wip"})
    public void validateAvatarDisplayTC19017(){
        continueAsGuest();
        bottomNavBar.tapRecordsTab();
        recordsEmptyState.tapAddChildRecordButton();
        recordInputScreen.tapAddAvatarButton();
        avatarModal.tapAvatarOption1();
        avatarModal.tapSaveButton();
        recordInputScreen.isRandomizeAvatarButtonVisible();
        recordInputScreen.isRemoveAvatarButtonVisible();
    }
}
