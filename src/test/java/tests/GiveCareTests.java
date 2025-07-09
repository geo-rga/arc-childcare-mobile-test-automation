package tests;

import com.cube.qa.framework.utils.BaseTest;
import org.testng.annotations.Test;

public class GiveCareTests extends BaseTest {

    @Test(groups = {"wip"})
    public void userCanCall911TC23803(){
        continueAsGuest();
        bottomNavBar.tapGiveCareTab();
        giveCareTab.isCall911ButtonVisible();
        giveCareTab.tapCall911Button();
        if (isIOS()){
            giveCareCall.isCallConfirmationAlertVisible();
            giveCareCall.dismissCallConfirmationAlert();
        } else if (isAndroid()){
            giveCareCall.isDialedNumberFieldVisible();
            giveCareCall.hasDialedNumberText("911");
        }
    }

}
