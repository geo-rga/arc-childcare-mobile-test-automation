package tests;

import com.cube.qa.arcblood.testdata.loader.UserDataLoader;
import com.cube.qa.arcblood.testdata.model.User;
import com.cube.qa.arcblood.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WelcomeScreenTest extends BaseTest {

    @Test
    public void validateDisplayOfWelcomeScreen() {
        welcomePage.isAppTitleVisible();
        welcomePage.isScheduleNewAppointmentButtonVisible();
        welcomePage.isCreateAccountButtonVisible();
        welcomePage.isLogInButtonVisible();
        welcomePage.isHelpButtonVisible();
    }




}
