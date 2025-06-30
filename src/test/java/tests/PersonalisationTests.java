package tests;

import com.cube.qa.framework.utils.BaseTest;
import org.testng.annotations.Test;

public class PersonalisationTests extends BaseTest {

    @Test(groups = {"wip"})
    public void personalisationCompleteScreenTC23776(){
        continueAsGuest();
        learnPageFull.tapForYouIncompleteCard();
        personalizedJourneyPage.tapBeginButton();
        userTypeQuestionPage.tapOtherOption();
        userTypeQuestionPage.tapNextButton();
        skillSelectionPage.tapSkillStartingBusiness();
        skillSelectionPage.tapSkillBeingLeader();
        skillSelectionPage.tapNextButton();
        personalisationCompletePage.isDoneButtonVisible();
        personalisationCompletePage.isCompletionTitleVisible();
        personalisationCompletePage.isCompletionMessageVisible();
        personalisationCompletePage.isTakeMeToMyPageButtonVisible();
        personalisationCompletePage.isBackToLearnButtonVisible();
    }
}
