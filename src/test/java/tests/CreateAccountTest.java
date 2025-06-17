package tests;
import com.cube.qa.framework.testdata.loader.UserDataLoader;
import com.cube.qa.framework.testdata.model.User;
import com.cube.qa.framework.utils.BaseTest;
import org.testng.annotations.Test;
import com.cube.qa.framework.utils.HelperFunctions;

public class CreateAccountTest extends BaseTest {

    // Email address tests
    @Test(groups = {"regression"})
    public void validateDisplayCreateAccountEmail() {
        welcomePage.tapCreateAccountButton();
        createAccountEmailPage.isEmailTitleVisible();
        createAccountEmailPage.isEmailInputVisible();
        createAccountEmailPage.isContinueButtonVisible();
        createAccountEmailPage.isHelpTextVisible();
        createAccountEmailPage.isHelpSubtextVisible();
    }

    // Name tests
    @Test(groups = {"regression"})
    public void validateDisplayCreateAccountName() {
        welcomePage.tapCreateAccountButton();
        createAccountEmailPage.enterEmail(HelperFunctions.generateRandomEmail());
        createAccountEmailPage.tapContinueButton();
        createAccountNamePage.isNameTitleVisible();
        createAccountNamePage.isFirstNameInputVisible();
        createAccountNamePage.isLastNameInputVisible();
        createAccountNamePage.isContinueButtonVisible();
        createAccountNamePage.isHelpTextVisible();
    }

    // Create account - DOB tests
    @Test(groups = {"regression"})
    public void validateDisplayCreateAccountDob() {
        // Preconditions
        welcomePage.tapCreateAccountButton();
        createAccountEmailPage.enterEmail(HelperFunctions.generateRandomEmail());
        createAccountEmailPage.tapContinueButton();
        createAccountNamePage.enterFirstName("John");
        createAccountNamePage.enterLastName("Smith");
        createAccountNamePage.tapContinueButton();

        // Expected
        createAccountDobPage.isDobTitleVisible();
        createAccountDobPage.isDobInputFieldVisible();
        createAccountDobPage.isContinueButtonVisible();
        createAccountDobPage.isWhyDoYouNeedToKnowThisButtonVisible();
    }

    // Create account - Zip Code tests
    @Test(groups = {"regression"})
    public void validateDisplayCreateAccountZipCode() {
        // Preconditions
        welcomePage.tapCreateAccountButton();
        createAccountEmailPage.enterEmail(HelperFunctions.generateRandomEmail());
        createAccountEmailPage.tapContinueButton();
        createAccountNamePage.enterFirstName(HelperFunctions.generateRandomFirstName());
        createAccountNamePage.enterLastName(HelperFunctions.generateRandomLastName());
        createAccountNamePage.tapContinueButton();

        if(isIOS()) {
            iosHelpersPage.enterDobDate("May", "4", "2001");
        } else {
            createAccountDobPage.tapDobInputField();
            androidHelpersPage.setDateAndroid(16);
        }

        createAccountDobPage.tapContinueButton();

        // Expected
        createAccountZipCodePage.isZipCodeTitleVisible();
        createAccountZipCodePage.isZipCodeInputFieldVisible();
        createAccountZipCodePage.isContinueButtonVisible();
        createAccountZipCodePage.isZipCodeHelpTextVisible();
   }

    // Create account - Username tests
    @Test(groups = {"regression"})
    public void validateDisplayCreateAccountUsername() {
        // Preconditions
        welcomePage.tapCreateAccountButton();
        createAccountEmailPage.enterEmail(HelperFunctions.generateRandomEmail());
        createAccountEmailPage.tapContinueButton();
        createAccountNamePage.enterFirstName(HelperFunctions.generateRandomFirstName());
        createAccountNamePage.enterLastName(HelperFunctions.generateRandomLastName());
        createAccountNamePage.tapContinueButton();

        if(isIOS()) {
            iosHelpersPage.enterDobDate("May", "4", "2001");
        } else {
            createAccountDobPage.tapDobInputField();
            androidHelpersPage.setDateAndroid(16);
        }

        createAccountDobPage.tapContinueButton();

        createAccountZipCodePage.enterZipCode("90211");
        createAccountZipCodePage.tapContinueButton();

        // Expected
        createAccountUsernamePage.isUsernameTitleVisible();
        createAccountUsernamePage.isUsernameInputFieldVisible();
        createAccountUsernamePage.isUsernameRequirementTextVisible();
        createAccountUsernamePage.isContinueButtonVisible();
        createAccountUsernamePage.isLoginHelpTextVisible();
        createAccountUsernamePage.isLoginNowButtonVisible();
    }

    // Create account - Password tests
    @Test(groups = {"regression"})
    public void validateDisplayCreateAccountPassword() {
        // Preconditions
        welcomePage.tapCreateAccountButton();
        createAccountEmailPage.enterEmail(HelperFunctions.generateRandomEmail());
        createAccountEmailPage.tapContinueButton();
        createAccountNamePage.enterFirstName(HelperFunctions.generateRandomFirstName());
        createAccountNamePage.enterLastName(HelperFunctions.generateRandomLastName());
        createAccountNamePage.tapContinueButton();

        if(isIOS()) {
            iosHelpersPage.enterDobDate("May", "4", "2001");
        } else {
            createAccountDobPage.tapDobInputField();
            androidHelpersPage.setDateAndroid(16);
        }

        createAccountDobPage.tapContinueButton();

        createAccountZipCodePage.enterZipCode("90211");
        createAccountZipCodePage.tapContinueButton();
        createAccountUsernamePage.enterUsername(HelperFunctions.generateRandomUsername());
        createAccountUsernamePage.tapContinueButton();

        // Expected
        createAccountPasswordPage.isPasswordTitleVisible();
        createAccountPasswordPage.isPasswordInputFieldVisible();
        createAccountPasswordPage.isContinueButtonVisible();
        createAccountPasswordPage.isPasswordRequirementTextVisible();
    }

    // Create account - Donor Id
    @Test(groups = {"regression"})
    public void validateDisplayDoYouHaveADonorId() {
        // Preconditions
        welcomePage.tapCreateAccountButton();
        createAccountEmailPage.enterEmail(HelperFunctions.generateRandomEmail());
        createAccountEmailPage.tapContinueButton();
        createAccountNamePage.enterFirstName(HelperFunctions.generateRandomFirstName());
        createAccountNamePage.enterLastName(HelperFunctions.generateRandomLastName());
        createAccountNamePage.tapContinueButton();

        if(isIOS()) {
            iosHelpersPage.enterDobDate("May", "4", "2001");
        } else {
            createAccountDobPage.tapDobInputField();
            androidHelpersPage.setDateAndroid(16);
        }

        createAccountDobPage.tapContinueButton();

        createAccountZipCodePage.enterZipCode("90211");
        createAccountZipCodePage.tapContinueButton();
        createAccountUsernamePage.enterUsername(HelperFunctions.generateRandomUsername());
        createAccountUsernamePage.tapContinueButton();
        createAccountPasswordPage.enterPassword(HelperFunctions.generatePassword());
        createAccountPasswordPage.tapContinueButton();

        // Expected
        createAccountDoYouHaveADonorIdPage.isDonorIdTitleVisible();
        createAccountDoYouHaveADonorIdPage.isYesDonorIdButtonVisible();
        createAccountDoYouHaveADonorIdPage.isNoDonorIdButtonVisible();
        createAccountDoYouHaveADonorIdPage.isDonorIdHelperTextVisible();
    }

    @Test(groups = {"regression"})
    public void validateDisplayWhatIsYourDonorId() {
        // Preconditions
        welcomePage.tapCreateAccountButton();
        createAccountEmailPage.enterEmail(HelperFunctions.generateRandomEmail());
        createAccountEmailPage.tapContinueButton();
        createAccountNamePage.enterFirstName(HelperFunctions.generateRandomFirstName());
        createAccountNamePage.enterLastName(HelperFunctions.generateRandomLastName());
        createAccountNamePage.tapContinueButton();

        if(isIOS()) {
            iosHelpersPage.enterDobDate("May", "4", "2001");
        } else {
            createAccountDobPage.tapDobInputField();
            androidHelpersPage.setDateAndroid(16);
        }

        createAccountDobPage.tapContinueButton();

        createAccountZipCodePage.enterZipCode("90211");
        createAccountZipCodePage.tapContinueButton();
        createAccountUsernamePage.enterUsername(HelperFunctions.generateRandomUsername());
        createAccountUsernamePage.tapContinueButton();
        createAccountPasswordPage.enterPassword(HelperFunctions.generatePassword());
        createAccountPasswordPage.tapContinueButton();
        createAccountDoYouHaveADonorIdPage.tapYesDonorIdButton();

        // Expected
        createAccountWhatsYourDonorIdPage.isDonorIdTitleVisible();
        createAccountWhatsYourDonorIdPage.isDonorIdInputFieldVisible();
        createAccountWhatsYourDonorIdPage.isDonorIdHelpTextVisible();
        createAccountWhatsYourDonorIdPage.isContinueButtonVisible();
        createAccountWhatsYourDonorIdPage.isContinueWithoutDonorIdButtonVisible();
    }

    @Test(groups = {"smoke"})
    public void verifyUsersCanCreateAnAccount() {
        String generatedEmail = HelperFunctions.generateRandomEmail();

        // Preconditions
        welcomePage.tapCreateAccountButton();
        createAccountEmailPage.enterEmail(generatedEmail);
        createAccountEmailPage.tapContinueButton();
        createAccountNamePage.enterFirstName(HelperFunctions.generateRandomFirstName());
        createAccountNamePage.enterLastName(HelperFunctions.generateRandomLastName());
        createAccountNamePage.tapContinueButton();

        if(isIOS()) {
            iosHelpersPage.enterDobDate("May", "4", "2001");
        } else {
            createAccountDobPage.tapDobInputField();
            androidHelpersPage.setDateAndroid(16);
        }

        createAccountDobPage.tapContinueButton();

        createAccountZipCodePage.enterZipCode("90211");
        createAccountZipCodePage.tapContinueButton();

        createAccountUsernamePage.enterUsername(HelperFunctions.generateRandomUsername());
        createAccountUsernamePage.tapContinueButton();

        createAccountPasswordPage.enterPassword(HelperFunctions.generatePassword());
        createAccountPasswordPage.tapContinueButton();

        createAccountDoYouHaveADonorIdPage.tapNoDonorIdButton();
        biometricPermissionsPage.tapNotNowButton();

        if (isIOS()) {
            dismissPermissions();
            dismissPermissions();
        } else {
            acceptPermissions();
            acceptPermissions();
        }

        profileTabMenuItems.isDynamicTextVisible(generatedEmail);
    }

}
