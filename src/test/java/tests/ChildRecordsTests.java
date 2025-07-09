package tests;

import com.cube.qa.framework.utils.BaseTest;
import org.testng.annotations.Test;

public class ChildRecordsTests extends BaseTest {

    @Test(groups = {"wip"})
    public void userCanAddRecordTC19014(){
        continueAsGuest();
        bottomNavBar.tapRecordsTab();
    }

    @Test(groups = {"wip2"})
    public void userCannotAddEmptyRecordTC19015(){
        continueAsGuest();
        bottomNavBar.tapRecordsTab();
    }
}
