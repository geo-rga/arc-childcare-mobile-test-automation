package tests;

import com.cube.qa.framework.utils.BaseTest;
import io.appium.java_client.HasOnScreenKeyboard;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest {

    @Test(groups = {"smoke"})
    public void validateSignInPage(){
        welcomePage.tapSignInButton();
        signInPage.isScreenTitleVisible();
        signInPage.isScreenSubtitleVisible();
        signInPage.isEmailInputFieldVisible();
        signInPage.isPasswordInputFieldVisible();
        signInPage.isContinueButtonVisible();
        signInPage.isForgotPasswordButtonVisible();
        signInPage.isLearnMoreDescriptionVisible();
        signInPage.isLearnMoreTitleVisible();
    }

    @Test(groups = {"wip"})
    public void logInToApp(){
        welcomePage.tapSignInButton();
        signInPage.enterEmail("3sc.test100@gmail.com.prod");
        signInPage.enterPassword("hello1234\n");
        signInPage.tapContinueButton();
        permissionsPage.isPermissionTitleVisible();
    }

}
