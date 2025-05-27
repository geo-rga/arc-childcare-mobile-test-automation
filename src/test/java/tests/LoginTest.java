package tests;

import com.cube.qa.framework.testdata.loader.UserDataLoader;
import com.cube.qa.framework.testdata.model.User;
import com.cube.qa.framework.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testWelcomeLoginButtonAppears() {
        System.out.println("Running on platform: " + config.getPlatform());
        // framework will throw "welcomeLoginLocators not displayed" if not found
        welcomePage.isLogInButtonVisible();
    }

    @Test
    public void testLoginButtonClickable() {
        System.out.println("Running test to verify login button is clickable on platform: "
                + config.getPlatform());
        welcomePage.tapLogInButton();
        // framework will throw "usernameFieldLocators not displayed" if not found
        loginPage.isUsernameFieldVisible();
    }

    @Test
    public void logInUserWithoutDonations() {
        User user = UserDataLoader.findUser(u -> !u.hasDonations);

        welcomePage.tapLogInButton();
        loginPage.enterUsername(user.username);
        loginPage.enterPassword(user.password);
        loginPage.tapContinueButton();
        // framework will throw "bookAnotherLikeThis not displayed" if not found
    }

    @Test
    public void verifyTESTFAILS() {
        User user = UserDataLoader.findUser(u -> u.hasDonations);
        welcomePage.tapLogInButton();
        loginPage.enterUsername("PETER");
        loginPage.enterPassword(user.password);
        loginPage.tapContinueButton();
        biometricPermissionsPage.isBenefitOneVisible();
    }

    @Test
    public void testFailMessage() {
        // force a failure here so we can see the message
        Assert.assertTrue(false, "💥 THIS is my custom assertion message!");
        // rest of your test…
    }

    @Test
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

    @Test
    public void verifyUsersCanViewSettings() {
        User user = UserDataLoader.findUser(u -> !u.hasDonations);
        welcomePage.tapLogInButton();
        loginPage.enterUsername(user.username);
        loginPage.enterPassword(user.password);
        loginPage.tapContinueButton();
        biometricPermissionsPage.tapNotNowButton();
        menuItems.scrollToAndTapSettings();
        biometricPermissionsPage.isNotNowButtonVisible();
    }
}
