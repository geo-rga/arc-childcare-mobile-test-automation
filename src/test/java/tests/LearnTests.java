package tests;

import com.cube.qa.framework.utils.BaseTest;
import org.testng.annotations.Test;

public class LearnTests extends BaseTest {

    @Test(groups = {"wip"})
    public void validateLearnTabDisplay(){
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
