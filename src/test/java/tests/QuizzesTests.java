package tests;

import com.cube.qa.framework.utils.BaseTest;
import org.testng.annotations.Test;

public class QuizzesTests extends BaseTest {

    @Test(groups = {"smoke"})
    public void textQuestionCorrectTC18970() {
        continueAsGuest();
        learnTopics.tapExpectationsTopic();
        learnTopicDetail.scrollToFirstVisibleAdditionalResourcesHeader();
        learnTopicDetail.tapQuizCard();
        quizReadyPopUp.tapConfirmButton();
        textSelectQuestion.tapAnswerOption2();
        textSelectQuestion.tapCheckButton();
        textSelectCorrect.isCorrectMessageVisible();
    }

    @Test(groups = {"wip"})
    public void imageQuestionCorrectTC18970() {
        continueAsGuest();
        learnTopics.tapExpectationsTopic();
        learnTopicDetail.scrollToFirstVisibleAdditionalResourcesHeader();
        learnTopicDetail.tapQuizCard();
        quizReadyPopUp.tapConfirmButton();
        textSelectQuestion.tapAnswerOption2();
        textSelectQuestion.tapCheckButton();
        textSelectCorrect.tapNextButton();
        textSelectQuestion.tapAnswerOption4();
        textSelectQuestion.tapCheckButton();
        textSelectCorrect.tapNextButton();
        imageSelectQuestion.tapImageOption3();
        imageSelectQuestion.tapCheckButton();
        imageSelectCorrect.isCorrectMessageVisible();
    }


}
