package tests;

import com.cube.qa.framework.pages.BasePage;
import com.cube.qa.framework.utils.BaseTest;
import org.testng.annotations.Test;

public class TopicTests extends BaseTest {

    @Test(groups = {"smoke"})
    public void viewTopicTC18919(){
        continueAsGuest();
        learnTopics.tapExpectationsTopic();
        learnTopicDetail.isTopicTitleVisible();
    }

    @Test(groups = {"smoke"})
    public void validateTopicDetailTC18920(){
        continueAsGuest();
        learnTopics.tapExpectationsTopic();
        learnTopicDetail.isOverviewTitleVisible();
        learnTopicDetail.isOverviewBodyVisible();
        learnTopicDetail.scrollToFirstVisibleLessonsHeader();
        learnTopicDetail.isLessonsHeaderVisible();
        learnTopicDetail.isLessonCardTitleVisible();
        learnTopicDetail.scrollToFirstVisibleLessonCardDuration();
        learnTopicDetail.isLessonCardDurationVisible();
        learnTopicDetail.scrollToFirstVisibleQuizHeader();
        learnTopicDetail.isQuizHeaderVisible();
        learnTopicDetail.isQuizTitleVisible();
        learnTopicDetail.isQuizSubtitleVisible();
        learnTopicDetail.isQuizDurationVisible();
        learnTopicDetail.scrollToFirstVisibleAdditionalResourcesHeader();
        learnTopicDetail.isAdditionalResourcesHeaderVisible();
        learnTopicDetail.isAdditionalResourceLinkVisible();
    }

    @Test(groups = {"wip"})
    public void completeLessonTC18937(){
        continueAsGuest();
        learnTopics.tapExpectationsTopic();
        learnTopicDetail.scrollToFirstVisibleLessonCardTitle();
        learnTopicDetail.tapLessonCardTitle();
        lessonIntroPage.tapStartButton();
        lessonOverlay.tapDismissOverlay();
    }

}
