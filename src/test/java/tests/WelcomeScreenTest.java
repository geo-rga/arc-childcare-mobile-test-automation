package tests;

import com.cube.qa.framework.utils.BaseTest;
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
