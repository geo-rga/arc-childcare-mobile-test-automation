package tests;

import com.cube.qa.framework.utils.BaseTest;
import org.testng.annotations.Test;

public class LearnTests extends BaseTest {

    @Test(groups = {"wip"})
    public void validateLearnTabDisplayTC18912()  {
        // This test partially works on iOS but not on Android
        // unsure if this is related to Android identifiers but will need further debugging
        continueAsGuest();
        learnPageFull.isSearchFieldVisible();
        learnPageFull.isStartingBabysittingBusinessVisible();
        learnPageFull.isBeingALeaderVisible();
        learnPageFull.isStayingSafeCategoryVisible();
        learnPageFull.isStoppingSpreadCategoryVisible();
        learnPageFull.isPickingUpHoldingVisible();
        learnPageFull.isFeedingVisible();
        learnPageFull.isDiaperingToiletingVisible();
        learnPageFull.isRoutinesVisible();
        learnPageFull.isMakingPlaytimeFunVisible();
        learnPageFull.isGuidingBehaviourVisible();
        learnPageFull.isFirstAidEmergenciesVisible();
    }
}
