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

    @Test(groups = {"smoke"})
    public void logInToApp(){
        welcomePage.tapSignInButton();
        signInPage.enterEmail("3sc.test100@gmail.com.prod");
        if(isIOS()){
            signInPage.enterPassword("hello1234\n");
        } else {
            signInPage.enterPassword("hello1234");
        }
        signInPage.tapContinueButton();
        permissionsPage.isPermissionTitleVisible();
    }

    @Test(groups = {"smoke"})
    public void validateNotificationPermissions(){
        welcomePage.tapContinueAsGuestButton();
        permissionsPage.isPermissionTitleVisible();
        permissionsPage.isPermissionBodyVisible();
        permissionsPage.isEnablePermissionsButtonVisible();
        permissionsPage.isSkipButtonVisible();
    }

    @Test(groups = {"smoke"})
    public void skipPermissions(){
        welcomePage.tapContinueAsGuestButton();
        permissionsPage.tapSkipButton();
        termsOfServicePage.isHeaderTextVisible();
    }

    @Test(groups = {"smoke"})
    public void validateTermsOfService(){
        welcomePage.tapContinueAsGuestButton();
        permissionsPage.tapSkipButton();
        termsOfServicePage.isHeaderTextVisible();
        termsOfServicePage.isAcceptAndContinueButtonVisible();
        termsOfServicePage.isBodyTextVisible();
        termsOfServicePage.isPrivacyPolicyTextVisible();
    }

    @Test(groups = {"smoke"})
    public void acceptTermsOfService(){
        welcomePage.tapContinueAsGuestButton();
        permissionsPage.tapSkipButton();
        termsOfServicePage.tapAcceptAndContinueButton();
        whatsNewPage.isHeaderTitleVisible();
    }

    @Test(groups = {"wip"})
    public void validateWhatsNewPage(){
        welcomePage.tapContinueAsGuestButton();
        permissionsPage.tapSkipButton();
        termsOfServicePage.tapAcceptAndContinueButton();
        whatsNewPage.isHeaderTitleVisible();
        whatsNewPage.isLearnFeatureTitleVisible();
        whatsNewPage.isQuizFeatureTitleVisible();
        whatsNewPage.isAchievementsFeatureTitleVisible();
        whatsNewPage.isRecordsFeatureTitleVisible();
        whatsNewPage.isContinueButtonVisible();

    }

}
