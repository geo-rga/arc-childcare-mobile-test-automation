package tests;

import com.cube.qa.framework.utils.BaseTest;
import org.testng.annotations.Test;

public class LearnTests extends BaseTest {

    @Test(groups = {"broken"})
    public void validateLearnTabDisplay()  {
        continueAsGuest();
        learnPageFull.isSearchFieldVisible();


        learnPageFull.isStartingBabysittingBusinessVisible();

        learnPageFull.isBeingALeaderVisible();
        learnPageFull.tapBeingALeader();

        learnPageFull.isStayingSafeCategoryVisible();
        learnPageFull.tapStayingSafeCategory();

        learnPageFull.isStoppingSpreadCategoryVisible();
        learnPageFull.tapStoppingSpreadCategory();

        learnPageFull.isPickingUpHoldingVisible();
        learnPageFull.tapPickingUpHolding();

        learnPageFull.isFeedingVisible();
        learnPageFull.tapFeeding();

        learnPageFull.isDiaperingToiletingVisible();
        learnPageFull.tapDiaperingToileting();

        learnPageFull.isRoutinesVisible();
        learnPageFull.tapRoutines();

        learnPageFull.isMakingPlaytimeFunVisible();
        learnPageFull.tapMakingPlaytimeFun();

        learnPageFull.isGuidingBehaviourVisible();
        learnPageFull.tapGuidingBehaviour();

        learnPageFull.isFirstAidEmergenciesVisible();
        learnPageFull.tapFirstAidEmergencies();
    }
}
