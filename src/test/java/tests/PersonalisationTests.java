package tests;

import com.cube.qa.framework.utils.BaseTest;
import org.testng.annotations.Test;

public class PersonalisationTests extends BaseTest {

    @Test(groups = {"smoke"})
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

    @Test(groups = {"smoke"})
    public void validateSelectedTopicsTC23784() {
        continueAsGuest();
        completeForYouShowPage();
        forYouPage.isForYouTitleVisible();
        forYouPage.isTryNewTopicTitleVisible();
        forYouPage.isExpectationsTopicVisible();
        forYouPage.isLeadershipTopicVisible();
        forYouPage.isSafetyTopicVisible();
        forYouPage.isGermControlTopicVisible();
    }

    @Test(groups = {"smoke"})
    public void startQuizFromForYouTC23792() {
        continueAsGuest();
        completeForYouShowPage();
        forYouPage.scrollToQuizTitle();
        forYouPage.isJumpToQuizTitleVisible();
        forYouPage.tapQuizExpectationsTopic();
        personalisedQuiz.isQuizTitleVisible();
        personalisedQuiz.isCheckButtonVisible();
    }
}
