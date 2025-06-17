package tests;

import com.cube.qa.framework.testdata.loader.UserDataLoader;
import com.cube.qa.framework.testdata.model.User;
import com.cube.qa.framework.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(groups = {"login", "smoke"})
    public void verifyUsersCanLogIntoApp() {
        User user = UserDataLoader.findUser(u -> u.hasDonations);
        loginToApp(user.username, user.password);
    }

    @Test(groups = {"login"})
    public void verifyUsersCanAttemptToLogInAgain() {
        welcomePage.tapLogInButton();
        loginPage.enterUsername("invalidUser");
        loginPage.enterPassword("invalidPassword!");
        loginPage.tapContinueButton();
        loginPage.tapTryAgainButton();
        loginPage.isTryAgainNotVisible();
    }

    @Test(groups = {"login"})
    public void verifyUsersSeeErrorWhenEnteringIncorrectDetails() {
        welcomePage.tapLogInButton();
        loginPage.enterUsername("invalidUser");
        loginPage.enterPassword("invalidPassword!");
        loginPage.tapContinueButton();
        loginPage.isInvalidLoginTitleVisible();
        loginPage.isInvalidLoginMessageVisible();
        loginPage.isTryAgainButtonVisible();
        loginPage.isHelpButtonVisible();
    }

    @Test(groups = {"biometrics"})
    public void validateBiometricPermissionsScreen() {
        User user = UserDataLoader.findUser(u -> u.hasDonations);
        welcomePage.tapLogInButton();
        loginPage.enterUsername(user.username);
        loginPage.enterPassword(user.password);
        loginPage.tapContinueButton();
        biometricPermissionsPage.isTitleVisible();
        biometricPermissionsPage.isBenefitOneVisible();
        biometricPermissionsPage.isBenefitOneVisible();
        biometricPermissionsPage.isEnablePermissionsButtonVisible();
        biometricPermissionsPage.isNotNowButtonVisible();
    }

}
