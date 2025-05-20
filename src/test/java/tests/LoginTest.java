package tests;

import com.cube.qa.arcblood.testdata.loader.UserDataLoader;
import com.cube.qa.arcblood.testdata.model.User;
import com.cube.qa.arcblood.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testWelcomeLoginButtonAppears() {
        System.out.println("Running on platform: " + config.getPlatform());
        // framework will throw "welcomeLoginLocators not displayed" if not found
        loginPage.isWelcomeLoginButtonVisible();
    }

    @Test
    public void testLoginButtonClickable() {
        System.out.println("Running test to verify login button is clickable on platform: "
                + config.getPlatform());
        loginPage.startLogInFlow();
        // framework will throw "usernameFieldLocators not displayed" if not found
        loginPage.isUsernameFieldVisible();
    }

    @Test
    public void logInUserWithoutDonations() {
        User user = UserDataLoader.findUser(u -> !u.hasDonations);

        loginPage.startLogInFlow();
        loginPage.enterUsername(user.username);
        loginPage.enterPassword(user.password);
        loginPage.tapLoginButton();
        // framework will throw "biometricNotNow not displayed" if not found
        loginPage.skipBiometricSetUp();
        // framework will throw "bookAnotherLikeThis not displayed" if not found
        loginPage.isBookAnotherLikeThisVisible();
    }

    @Test
    public void logInUserWithDonations() {
        User user = UserDataLoader.findUser(u -> u.hasDonations);
        loginPage.startLogInFlow();
        loginPage.enterUsername("PETER");
        loginPage.enterPassword(user.password);
        loginPage.tapLoginButton();
        loginPage.skipBiometricSetUp();
        loginPage.isBookAnotherLikeThisVisible();
    }

    @Test
    public void testFailMessage() {
        // force a failure here so we can see the message
        Assert.assertTrue(false, "💥 THIS is my custom assertion message!");
        // rest of your test…
    }
}
