package tests;

import com.cube.qa.framework.utils.BaseTest;
import org.testng.annotations.Test;

public class WelcomeScreenTest extends BaseTest {

    @Test
    public void validateDisplayOfWelcomeScreen() {
        welcomePage.isAppTitleVisible();
        welcomePage.isScheduleAppointmentButtonVisible();
        welcomePage.isCreateAccountButtonVisible();
        welcomePage.isLogInButtonVisible();
        welcomePage.isHelpLinkVisible();
    }




}
