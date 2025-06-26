package tests;

import com.cube.qa.framework.utils.BaseTest;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest {

    @Test(groups = {"smoke"})
    public void validateSignInPageTC23762(){
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
    public void logInToAppTC23762(){
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
    public void validateNotificationPermissionsTC23754(){
        welcomePage.tapContinueAsGuestButton();
        permissionsPage.isPermissionTitleVisible();
        permissionsPage.isPermissionBodyVisible();
        permissionsPage.isEnablePermissionsButtonVisible();
        permissionsPage.isSkipButtonVisible();
    }

    @Test(groups = {"smoke"})
    public void skipPermissionsTC23757(){
        welcomePage.tapContinueAsGuestButton();
        permissionsPage.tapSkipButton();
        termsOfServicePage.isHeaderTextVisible();
    }

    @Test(groups = {"smoke"})
    public void validateTermsOfServiceTC23759(){
        welcomePage.tapContinueAsGuestButton();
        permissionsPage.tapSkipButton();
        termsOfServicePage.isHeaderTextVisible();
        termsOfServicePage.isAcceptAndContinueButtonVisible();
        termsOfServicePage.isBodyTextVisible();
        termsOfServicePage.isPrivacyPolicyTextVisible();
    }

    @Test(groups = {"smoke"})
    public void acceptTermsOfServiceTC23761(){
        welcomePage.tapContinueAsGuestButton();
        permissionsPage.tapSkipButton();
        termsOfServicePage.tapAcceptAndContinueButton();
        whatsNewPage.isHeaderTitleVisible();
    }

    @Test(groups = {"smoke"})
    public void validateWhatsNewPageTC18910(){
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

    @Test(groups = {"smoke"})
    public void completeGuestFlowTC18911(){
        welcomePage.tapContinueAsGuestButton();
        permissionsPage.tapSkipButton();
        termsOfServicePage.tapAcceptAndContinueButton();
        whatsNewPage.tapContinueButton();
    }

    @Test(groups = {"additional"})
    public void completeLoginFlow(){
        welcomePage.tapSignInButton();
        login("3sc.test100@gmail.com.prod", "hello1234");
        permissionsPage.tapSkipButton();
        termsOfServicePage.tapAcceptAndContinueButton();
        whatsNewPage.tapContinueButton();
    }

    @Test(groups = {"smoke"})
    public void invalidPasswordTestTC23766(){
        welcomePage.tapSignInButton();
        login("3sc.test100@gmail.com.prod", "hello4321");
        signInPage.isLoginFailedTitleVisible();
        signInPage.isLoginFailedMessageVisible();
        signInPage.isLoginFailedActionButtonVisible();
        signInPage.tapLoginFailedActionButton();
    }

    @Test(groups = {"wip"})
    public void invalidEmailTestTC23765(){
        welcomePage.tapSignInButton();
        login("testing@testuser.com", "hello1234");
        signInPage.isLoginFailedTitleVisible();
        signInPage.isLoginFailedMessageVisible();
        signInPage.isLoginFailedActionButtonVisible();
        signInPage.tapLoginFailedActionButton();
    }

    @Test(groups = {"new"})
    public void accessForgotPasswordTC23767(){

    }

    @Test(groups = {"new"})
    public void accessLearnMoreTC23768(){

    }

    @Test(groups = {"new"})
    public void invalidEmailFormatTC23764(){

    }

}
