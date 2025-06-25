package tests;

import com.cube.qa.framework.utils.BaseTest;
import org.testng.annotations.Test;

public class WelcomeTest extends BaseTest {

    @Test(groups = {"smoke"})
    public void validateWelcomePageDisplayTC23753() {
        welcomePage.isTitleTextVisible();
        welcomePage.isSubtitleTextVisible();
        welcomePage.isSignInButtonVisible();
        welcomePage.isContinueAsGuestButtonVisible();
    }
}
