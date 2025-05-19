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

        Assert.assertTrue(
                loginPage.isWelcomeLoginButtonVisible(),
                "The welcome login button should be visible on app launch."
        );
    }

    @Test
    public void testLoginButtonClickable() {
        System.out.println("Running test to verify login button is clickable on platform: " + config.getPlatform());

        loginPage.startLogInFlow();

        Assert.assertTrue(
                loginPage.isUsernameFieldVisible(),
                "The log in button should be clickable from the welcome view."
        );
    }

    @Test
    public void logInUserWithoutDonations() {
        User user = UserDataLoader.findUser(u -> u.hasDonations);

        loginPage.startLogInFlow();
        loginPage.enterUsername(user.username);
        loginPage.enterPassword(user.password);
        loginPage.tapLoginButton();
        loginPage.skipBiometricSetUp();

        Assert.assertTrue(
                loginPage.isBookAnotherLikeThisVisible(),
                "Book another like this should be visible on profile tab"
        );
    }

    @Test
    public void logInUserWithDonations() {
        User user = UserDataLoader.findUser(u -> !u.hasDonations);

        loginPage.startLogInFlow();
        loginPage.enterUsername(user.username);
        loginPage.enterPassword(user.password);
        loginPage.tapLoginButton();
        loginPage.skipBiometricSetUp();

        Assert.assertTrue(
                loginPage.isBookAnotherLikeThisVisible(),
                "Book another like this should be visible on profile tab"
        );
    }
}
