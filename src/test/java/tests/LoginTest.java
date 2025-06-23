package tests;

import com.cube.qa.framework.testdata.loader.UserDataLoader;
import com.cube.qa.framework.testdata.model.User;
import com.cube.qa.framework.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

// Create a new test class file in the directory for each area of the app
public class LoginTest extends BaseTest {

    @Test(groups = {"login", "smoke", "wip"})
    public void verifyUsersCanLogIntoApp() {
        // groups: Add feature, smoke / regression to the groups. Keep this simple.
        // Use "wip" for work in progress (limit what you are currently working on so we don't have a growing list of "wip" cases)

        // Descriptive name for test function above
        // Add test functionality in here

        // Example tests
        // welcomePage.tapLogInButton();
        // loginPage.enterUsername("MyUser");
        // loginPage.enterPassword("MyPassword");
        // loginPage.tapContinueButton();
        // loginPage.tapTryAgainButton();
        // loginPage.isTryAgainNotVisible();
    }

}
